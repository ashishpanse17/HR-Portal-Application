/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

//import com.sun.org.apache.bcel.internal.util.JavaWrapper;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.*;
import mainform.ProcessForm;

/**
 *
 * @author sandy
 */
public class DBConnection {
    
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    Statement st;
    
    public DBConnection()
    {
    connect();
    
    }
public void connect()
{
    try{
        
   
String url= "jdbc:mysql://localhost:3306/hrlabz";
String username="sandy";
String pass="hrlabz";
con=DriverManager.getConnection(url,username,pass);
     st=con.createStatement();
    }
    catch( SQLException e)
    {
   JOptionPane.showMessageDialog(null, e);
    
    }
    

}


public void SaveProcess(ProcessCandidate processp)
{
 
  
 try{ 
     if( processp.getProcessID()!=null)
     {
         JOptionPane.showMessageDialog(null, processp.getLevel());
     pstmt= con.prepareStatement("update process set Level=?,PersonalSchedule=?,PersonalSchedul_Time=?,Telecomshedule=?,TelecomSchedule_Time=?"
             + "where ProcessID=?");
    
      pstmt.setInt(1,processp.getLevel());
     pstmt.setString(2, processp.getPersonalSchedule());
     pstmt.setString(3, processp.getPersonalSchedulTime());
     pstmt.setString(4,  processp.getTelecomshedule());
     pstmt.setString(5,processp.getTelecomScheduleTime() );
        pstmt.setInt(6,processp.getProcessID());
    
     pstmt.executeUpdate();
     Refrenceid.setProcessid(processp.getProcessID());
     JOptionPane.showMessageDialog(null, "schedule success");
     }
     else
     {
   pstmt= con.prepareStatement("INSERT INTO process(Company,CandidateId,"
           + "RequirementID,RecruiterID,ProcessNote,ProcessDate) VALUES(?,?,?,?,?,?);");
pstmt.setInt(1, processp.getCompanyID());
pstmt.setInt(2, processp.getCandidateID());
pstmt.setInt(3, processp.getRequirementID());
pstmt.setInt(4,processp.getRecruiterID());
pstmt.setString(5,processp.getProcessNote());
java.sql.Date dt= new java.sql.Date(processp.getProcessDate().getTime());
pstmt.setDate(6, dt);
pstmt.execute();
 pstmt= con.prepareStatement("select Last_Insert_ID()");
  rs=pstmt.executeQuery();
 if(rs.next())
 {
 Refrenceid.setProcessid( rs.getInt("last_insert_id()"));

 }
JOptionPane.showMessageDialog(null,"Data is stored");
/*String query= "insert into process values("+processp.getProcessID()+")";    
st= con.createStatement();
st.executeUpdate(query);*/
   pstmt.close();
  rs.close();
     }
  }
  catch( SQLException e)
  {
  JOptionPane.showMessageDialog(null, e);
  }

}


public void getprocess()
{
    ProcessForm process = new ProcessForm();
    process.setVisible(true);
   java.util.Date date= new java.util.Date();
  
    java.sql.Date dt=new java.sql.Date(date.getTime());
   ArrayList companylist= new ArrayList();
    ArrayList keyskilllist= new ArrayList();
try
{
pstmt= con.prepareStatement("select DISTINCT Company,KeySkill from requirement where Requirement_date>="+"'"+dt+"'");
rs= pstmt.executeQuery();
while(rs.next())
{
   companylist.add(rs.getString("Company"));
   keyskilllist.add(rs.getString("keySkill"));
//    process.getjComboBox1().addItem();
//    process.getjComboBox2().addItem(rs.getString("keySkill"));        

}

HashSet companyset= new HashSet(companylist);
HashSet keyskillSet=new HashSet(keyskilllist);
companylist=new ArrayList(companyset);
keyskilllist=new ArrayList(keyskillSet);
for(Object ob:companylist)
{
process.getjComboBox1().addItem(ob);
}
 for(Object skill:keyskilllist)
 {
process.getjComboBox2().addItem(skill);
 }
 pstmt.close();
rs.close();
//process.getjComboBox2().add
}
catch(SQLException e)
{
  JOptionPane.showMessageDialog(null, e);
}
}
public Requirements search(Requirements requirement)
{
    try{
        String search= requirement.getJobTitle(); 
         
String sqlqurey="select JobDescription,Experience,JobTitle,qualification,Location,CompanyID,KeySkillID,Budget,Requirement_date from requirement where JobTitle="+requirement.getJobTitle()+"or Location="+requirement.getLocation();


rs=st.executeQuery(sqlqurey);
rs.next();
requirement.setJobDescription(rs.getString("JobDescription"));
requirement.setExprience(rs.getFloat("Experience"));
requirement.setJobTitle(rs.getString("JobTitle"));
//requirement.setQualification(rs.getString("Qualification"));
//requirement.setLocation(rs.getString("Location"));
//requirement.setCompanyID(rs.getInt("CompanyID"));
//requirement.setKeySkillID(rs.getInt("KeySkillID"));
//requirement.setBudget(rs.getString("Budget"));
//requirement.setRequirement_Date(rs.getDate("Requirement_Date"));



}
    catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            
            }
    return requirement;
}
public void savetest(test1 t)
{
try
{
   pstmt= con.prepareStatement("insert into test(w,file) values(?,?);");
   
  FileInputStream fis= new FileInputStream(t.getFile());

  

  pstmt.setString(1, t.getW());
  pstmt.setBlob(2, fis);
  
  pstmt.execute();
  //File file= t.getFile();

          
  JOptionPane.showMessageDialog(null,"your data is stored ");
  /*pstmt.setAsciiStream(2, fis); */
   
}catch(FileNotFoundException e)
{
JOptionPane.showMessageDialog(null,e);
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(null,e);
}

}
public void getfile()
{
test1 t= new test1();
    try
    {
    pstmt= con.prepareStatement("select w,file from test where id=6 ");
    rs=pstmt.executeQuery();
    rs.next();
  
    
    String filename= rs.getString("w");
    String []fname= filename.split(".");
   
    Blob bfile=rs.getBlob("file");
    File f=  new File("c:\\"+filename);
  FileOutputStream fos= new FileOutputStream(f);
  
    int length=(int) bfile.length();
    byte []file=bfile.getBytes(1, length);
   fos.write(file, 0, length);
   //t.setW(filename);
  Desktop dt= Desktop.getDesktop();
//dt.open(f);
//  JFileChooser fc= new JFileChooser();
//  fc.showSaveDialog(null);
  
dt.edit(f);
  //f.setExecutable(true);
   System.out.println(filename);
    }catch(SQLException e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    catch(FileNotFoundException e)
    {
     JOptionPane.showMessageDialog(null, e);
    }
    catch(IOException e)
    {
    JOptionPane.showMessageDialog(null, e);
    }


}
public void getallprocess()
{
try
{
pstmt= con.prepareStatement("select * from process");
rs= pstmt.executeQuery();
while(rs.next())
{

}
}catch( SQLException e)
{


}



}
public ProcessCandidate processdetails(int processid)
{
ProcessCandidate process= new ProcessCandidate();    
    try
    {
    pstmt=con.prepareStatement("select * from process where process.processid= "+processid);
rs= pstmt.executeQuery();
rs.next();
                                     process.setCandidateID(rs.getInt("CandidateID"));
                                     process.setRecruiterID(rs.getInt("RecruiterID"));
                     
  
    java.sql.Date dt=(rs.getDate("ProcessDate"));
       java.util.Date date= new java.util.Date(dt.getTime());
                                
                                     process.setProcessDate(date);
                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
                                     process.setTelecomshedule(rs.getString("Telecomshedule"));
                                     process.setPersonalSchedulTime(rs.getString("PersonalSchedul_Time"));
                                     process.setTelecomScheduleTime(rs.getString("TelecomSchedule_Time"));
                                     process.setCompanyID(rs.getInt("Company"));
                                     process.setShortlist(rs.getString("Shortlist"));
                                     process.setLevel(rs.getInt("Level"));
//                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
//                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
//                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
//                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
//                                     process.setPersonalSchedule(rs.getString("PersonalSchedule"));
   
                                    
                
     System.out.println(process. getCandidateID());
  System.out.println(process.getRecruiterID());
  System.out.println(process.getProcessDate());
  System.out.println(process.getLevel());
  System.out.println(process.getCompanyID());                     
            
    }
    catch(SQLException e)
            {
            JOptionPane.showMessageDialog(null, e);
            }
     return process;
    }
public List auto( String key )
{
    List list= new ArrayList();
try
{
pstmt=con.prepareStatement("select w from test where w like'"+key+"%'");
rs= pstmt.executeQuery();
if(rs!=null)
{
while(rs.next())
{
list.add(rs.getString("w"));
}

}
}catch(SQLException e)
        {
        
        
        }
return list;
}

}
