/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import com.mysql.jdbc.StringUtils;
import java.util.Random;
import java.util.regex.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sandy
 */
public class Candidate {
   

    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phone;
    private String password;
    private String verificationCode;
private Integer recruiterid;

    public Integer getRecruiterid() {
        return recruiterid;
    }

    public void setRecruiterid(Integer recruiterid) {
        this.recruiterid = recruiterid;
    }
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
    
public String  genratepass()
{
Random no= new Random();
Integer randomno=0;
while(randomno<99||randomno>9999)
{
    randomno=no.nextInt();
randomno=randomno*1000;
}
password= firstName+randomno.toString();
return password;
}
public String genratecode()
{
String code="ABCD";
return code;
}

public boolean Regvalidation()
{
if(StringUtils.isNullOrEmpty(emailId)||StringUtils.isNullOrEmpty(firstName)||StringUtils.isNullOrEmpty(phone))
{
return true;                                      
}
else return false;


}
public boolean emailvalidation()
{
String expression="^[\\w\\.]+@([\\w]+[\\.])+[A-Z]{2,4}$";
emailId= emailId.trim();
CharSequence email= emailId;
Pattern pattern=  Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
Matcher match= pattern.matcher(email);
 
 if (match.matches())
{
return false;
}
 else return  true;
}
public boolean phonevalidateion()
{
String expression="^[0-9]{10,11}$";
phone= phone.trim();
CharSequence phoneno= phone;
Pattern pattern= Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
Matcher match= pattern.matcher(phoneno);
if(match.matches())

{
return false;

}
else return  true;
}

/*public boolean namevalidation()
{
String expression="^[a-z]{0,50}$";
firstName= firstName.trim();
//JOptionPane.showMessageDialog(null, firstName);
CharSequence name= firstName;
 Pattern pattern= Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
 Matcher match= pattern.matcher(name);
 //JOptionPane.showMessageDialog(null, match);
 if(match.matches())
 {
 return false;
 }
 else return true;
}*/

//}

}
