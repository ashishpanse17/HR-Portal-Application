/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 /*package javaclasses;
import com.mysql.jdbc.StringUtils;
//import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Detail1_1Impl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import mainform.Detail;
import mainform.ProcessDetail;
//import org.omg.CORBA.OBJECT_NOT_EXIST;

/**
 *
 * @author sandy
 */
/*public class jobportaldbconnection {
     PreparedStatement pstmt;
     Statement stmt;
    ResultSet rs;
    Connection con; 
   
    int id;
   public jobportaldbconnection()
    {
    dbconnect();    
    
    }
  public void  dbconnect()
  {
  try
  {
      String url="jdbc:mysql://192.168.1.15:3306/jobsite";
con= DriverManager.getConnection(url,"hrlabz","hrlabz");
con.createStatement();
  }catch(SQLException e)
  {
  JOptionPane.showMessageDialog(null, e);
  }
  }
  public void Saveuser(Candidate rg)
  {
  try
  {
      pstmt=con.prepareStatement("insert into users (firstName,lastName,emailId,phone,password,verificationCode,recruiterId) values(?,?,?,?,?,?,?);");
  pstmt.setString(1, rg.getFirstName());
  pstmt.setString(2, rg.getLastName());
  pstmt.setString(3, rg.getEmqailId());
  pstmt.setString(4, rg.getPhone());
  pstmt.setString(5, rg.genratepass());
  pstmt.setString(6, rg.genratecode());
  pstmt.setInt(7, rg.getRecruiterid());
  pstmt.execute();
//  System.out.println(rg.getRecruiterid()); 
  pstmt= con.prepareStatement("select Last_Insert_ID()");
  rs=pstmt.executeQuery();
 if(rs.next())
 {
 id= rs.getInt("last_insert_id()");
 }
  
 
  }catch(SQLException e) {JOptionPane.showMessageDialog(null, e);
  }
  
  
  }
  public void saveResume(uploadResume ur)
  {
  try
  {
 pstmt=con.prepareStatement("insert into candidatecv (refId,resumes) values(?,?)");
 FileInputStream fis= new FileInputStream(ur.getFile());
 pstmt.setInt(1, id);
 pstmt.setBlob(2, fis);
 pstmt.execute();
  }catch(FileNotFoundException e){
  JOptionPane.showMessageDialog(null, e);
  }
  catch(SQLException e)
  {
  JOptionPane.showMessageDialog(null, e);
  }
  }
  public void savepersonaldata(PersonalData pd)
  {
      try
      {
  pstmt= con.prepareStatement("insert into personaldata (refId,dob,gender,phone,basicQualification,"
          + "gSpecialization,gInstitute,highestQualification,pSpecialization,pInstitute,residAddress,"
          + "residPin,permAddress,permPin,maritralStatus,nationality,others,createdDate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                         pstmt.setInt(1, id);
                     pstmt.setString(2,pd.getDob());
                     pstmt.setString(3, pd.getGender());
                     pstmt.setString(4, pd.getLandPhone());
                     pstmt.setString(5,pd.getBasicQualification());
                     pstmt.setString(6,pd.getgSpecialization());
                     pstmt.setString(7, pd.getgInstitute());
                     pstmt.setString(8, pd.getHighestQualification());
                     pstmt.setString(9, pd.getpSpecialization());
                     pstmt.setString(10, pd.getpInstitute());
                     pstmt.setString(11, pd.getResidAddress());
                     pstmt.setString(12, pd.getResidPin());
                     pstmt.setString(13, pd.getPermAddress());
                     pstmt.setString(14,pd.getPermPin());
                     pstmt.setString(15, pd.getMaritralStatus());
                     pstmt.setString(16, pd.getNationality());
                     //pstmt.setString(17, pd.getLandPhone());
                     pstmt.setString(17, pd.getOthers());
               java.sql.Date date= new java.sql.Date(pd.getDate().getTime());
                     pstmt.setDate(18, date);
          pstmt.execute();
       
      }
      catch(SQLException e)
      {
      JOptionPane.showMessageDialog(null, e);
      }
      
  
  }
  
  public void SaveProfessionalinfo(ProfessionalData pf)
  {
      try
      {
  pstmt= con.prepareStatement("insert into professionaldata (refid,totalExp,currentCompany,"
          + "previousCompany,currentCTC,expectedCTC,noticePeriod,certification,designation,keyskillID,"
          + "alternateEmail,remarks,createdDate)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                         pstmt.setInt(1, id);
                         pstmt.setString(2,pf.getTotalExp());
                         pstmt.setString(3,pf.getCurrentCompany());
                         pstmt.setString(4,pf.getPreviousCompany());
                         pstmt.setString(5,pf.getCurrentCtc());
                         pstmt.setString(6,pf.getExpectedCtc());
                         pstmt.setString(7,pf.getNoticePeriod());
                         pstmt.setString(8,pf.getCertification());
                         pstmt.setString(9,pf.getDesignation());
                         pstmt.setString(10,pf.getKeyskillID());
                         pstmt.setString(11,pf.getAlternateEmail());
                         pstmt.setString(12,pf.getRemark());
                         java.sql.Date date= new java.sql.Date(pf.getCreatedDate().getTime());
                         pstmt.setDate(13,date);
      pstmt.execute();
     
      Refrenceid.setUniqeid(id);
     
      }
      catch(SQLException e)
      {JOptionPane.showMessageDialog(null, e);
      }
  }
  public String checkaviablity(String getemail)
  {
      getemail="'"+getemail+"'";
     // System.out.println(getemail);
      String emailid="" ;
      try{
  pstmt= con.prepareStatement("Select emailId from users where emailId="+getemail);
  rs=pstmt.executeQuery();
  
         rs.next();
         
          emailid=rs.getString("emailId");
          
  //System.out.println(emailid);
             
      }catch(SQLException e)
      {
      
      }
      return emailid;
  }
  public void saveRecruiter(Recruiter recruiter)
  {
  try{
  pstmt= con.prepareStatement("insert into recruiters (userName,userPassword,contact,lastName,signature)"
          + "values(?,?,?,?,?) ;");
  pstmt.setString(1, recruiter.getUsername());
  pstmt.setString(2, recruiter.getPassword());
  pstmt.setString(3, recruiter.getPhone());
  pstmt.setString(4,recruiter.getEmailid());
  pstmt.setString(5, recruiter.getSignature());
  pstmt.execute();
  con.close();
  }
  catch(SQLException e)

  {
      
      JOptionPane.showMessageDialog(null, e);
      
  }
          }
  public String  logincheck(String Username, String Pass)
  {
  Username="'"+Username+"'";
  Pass= "'"+Pass+"'";
    String name="";
   //Refrenceid rid= new Refrenceid();
  try
      {
          pstmt=con.prepareStatement("Select recruiterId,userName,userPassword from recruiters where userName="+Username+ "and userPassword= "+Pass);
    rs= pstmt.executeQuery(); 

    rs.next();
    Refrenceid.setRecruiterid(rs.getInt("recruiterId")) ;
    name= rs.getString("userName");
pstmt.close();
      }catch( SQLException e)
      {
      JOptionPane.showMessageDialog(null, "Insert correct username and password ");
      
   }
  
  return name;
   
  }
  public void getDetails()  {
  int refid= Refrenceid.getUniqeid();
 String qualification="";
   Detail detail= new Detail();
   detail.setVisible(true);
      try{
  pstmt= con.prepareStatement("select firstName,lastName,emailId,basicQualification,highestQualification,currentCompany,totalExp,currentCTC,expectedCTC,noticePeriod from users,personaldata,professionaldata where users.id="+refid+" and (personaldata.refId="+refid+" and professionaldata.refId="+refid+")") ;
     
     rs= pstmt.executeQuery();
     rs.next();
   detail.getjLabel2().setText( rs.getString("firstName"));
   detail.getjLabel3().setText(rs.getString("lastName"));
   detail.getjLabel4().setText(rs.getString("emailId"));
  // detail.getjLabel5().setText(rs.getString("phone"));
    
   qualification=rs.getString("highestQualification");
     if(StringUtils.isNullOrEmpty(qualification))
     {
      detail.getjLabel17().setText( rs.getString("basicQualification"));
     }
     else
     {
      detail.getjLabel17().setText(qualification);
     }
     detail.getjLabel7().setText(rs.getString("Currentcompany"));
     detail.getjLabel9().setText(rs.getString("totalExp"));
     detail.getjLabel11().setText(rs.getString("currentCTC"));
      detail.getjLabel13().setText( rs.getString("expectedCTC"));
      detail.getjLabel15().setText( rs.getString("noticePeriod"));
   pstmt.close();
      }catch(SQLException e )
      {
      JOptionPane.showMessageDialog(null, e);
      }
     
  }
//  public Candidatedetails Alldata()
//  {
//      Candidatedetails candiadate= new Candidatedetails();
//      try
//      {
//  pstmt= con.prepareStatement("select firstName,lastName,emailId,basicQualification,highestQualification,currentCompany,totalExp,currentCTC,expectedCTC,noticePeriod from users,personaldata,professionaldata") ;
//    rs= pstmt.executeQuery();
//    rs.next();
//      candiadate.setCandidatename(rs.getString("firstName"));
//      candiadate.setLastName(rs.getString("lastName"));
//      candiadate.setEmail(rs.getString("emailId"));
//     String  qualification=rs.getString("highestQualification");
//     if(StringUtils.isNullOrEmpty(qualification))
//     {
//      candiadate.setQualification( rs.getString("basicQualification"));
//     }
//     else
//     {
//     candiadate.setQualification(qualification);
//     }
//     
//     candiadate.setCurrentcompany(rs.getString("Currentcompany"));
//   candiadate.setTotalExprience(rs.getString("totalExp"));
//    candiadate.setCurrentCTC(rs.getString("currentCTC"));
//     candiadate.setExpectedCTC( rs.getString("expectedCTC"));
//     candiadate.setNoticeperiod( rs.getString("noticePeriod"));
//     
//      }
//      catch(SQLException e)
//      {
//        JOptionPane.showMessageDialog(null, e);
//      }
//  return candiadate;
//  }
    public void getprocess()
{
    Candidatedetails candidate= new Candidatedetails();
try
{
    pstmt= con.prepareStatement("select firstName,lastName,emailId,basicQualification,highestQualification,currentCompany,totalExp,currentCTC,expectedCTC,noticePeriod,resume from users,personaldata,professionaldata,candidatecv where users.id="+Refrenceid.uniqeid+" and (personaldata.refId="+Refrenceid.uniqeid+" and professionaldata.refId="+Refrenceid.uniqeid+"and candidatecv.refid="+Refrenceid.uniqeid+")") ;
rs=pstmt.executeQuery();
rs.next();
candidate.setCandidatename(rs.getString("firstName"));
candidate.setLastName(rs.getString("lastName"));
candidate.setCurrentcompany(rs.getString("Currentcompany"));
candidate.setTotalExprience(rs.getString("totalExp"));
String qualification=rs.getString("highestQualification");
     if(StringUtils.isNullOrEmpty(qualification))
     {
      candidate.setQualification( rs.getString("basicQualification"));
     }
     else
     {
      candidate.setQualification(qualification);
     }
   
     
     candidate.setCurrentCTC(rs.getString("currentCTC"));
    candidate.setExpectedCTC( rs.getString("expectedCTC"));
     candidate.setNoticeperiod( rs.getString("noticePeriod"));
  //Blob ablob= rs.getBlob("resume");
   
}
catch(SQLException e )
{
 JOptionPane.showMessageDialog(null, e);

}
//catch(FileNotFoundException e )
//{
//JOptionPane.showMessageDialog(null, e);
//}

}
   public Vector getallcandidate()
    {
        Vector<Vector<String>> candidatevector = new Vector<Vector<String>>();
 
        try{
        pstmt= con.prepareStatement("select firstName,lastName,emailId,basicQualification,highestQualification,currentCompany,totalExp,currentCTC,expectedCTC,noticePeriod from users,personaldata,professionaldata where users.id=personaldata.refId and users.id=professionaldata.refId");
  
    rs=pstmt.executeQuery();
    while(rs.next())
    {
      Vector<String> candidatedata = new Vector<String>();
  
candidatedata.add(rs.getString("firstName")); //Empid
candidatedata.add(rs.getString("lastName")); //name
candidatedata.add(rs.getString("emailId")); //position
String qualification=rs.getString("highestQualification");
     if(StringUtils.isNullOrEmpty(qualification))
     {
      candidatedata.add(rs.getString("basicQualification"));
     }
     else
     {
      candidatedata.add(qualification);
     }


    candidatedata.add(rs.getString("currentCompany"));
    candidatedata.add(rs.getString("totalExp"));
    candidatedata.add(rs.getString("currentCTC"));
    candidatedata.add(rs.getString("expectedCTC"));
    candidatedata.add(rs.getString("noticePeriod"));
   
    candidatevector.add(candidatedata);
   
    }
  
   
  
  }catch(SQLException e)
  {
  JOptionPane.showMessageDialog(null, e);
  }
            
   
    return candidatevector;
    
    }
    public void processedcandidate(){
      DBConnection db=new DBConnection();
     
        ProcessCandidate process= new ProcessCandidate();
        process=  db.processdetails(Refrenceid.getProcessid());
//         System.out.println(process. getCandidateID());
//  System.out.println(process.getRecruiterID());
//  System.out.println(process.getProcessDate());
//  System.out.println(process.getLevel());
//  System.out.println(process.getCompanyID());  
       ProcessDetail processdetail= new ProcessDetail();
          processdetail.setVisible(true);
       try
       {
          
                             pstmt= con.prepareStatement("select firstName from users where users.id= "+process.getCandidateID());
     
                          rs=pstmt.executeQuery();
                          rs.next();
                            processdetail.getjLabel1().setText("candidate name"); 
                            
       processdetail.getjLabel2().setText(rs.getString("firstName"));
       
        processdetail.getjLabel3().setText("processed company");
         processdetail.getjLabel4().setText(process.getCompanyID());
         processdetail.getjLabel5().setText("procesas Date");
         processdetail.getjLabel6().setText(process.getProcessDate().toString());
 
          if(process.getLevel()==2)
          {
          processdetail.getjLabel5().setText("Personal scheduledate");
           processdetail.getjLabel6().setText(process.getPersonalSchedule());
           processdetail.getjLabel7().setText("Personal Schedule Time");
          processdetail.getjLabel6().setText(process.getPersonalSchedulTime());
          }
         pstmt.close();
       }catch(SQLException e)
       {
       JOptionPane.showMessageDialog(null, e);
       } 
      
        
        
    }
}*/
