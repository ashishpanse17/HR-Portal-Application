/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import com.mysql.jdbc.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author sandy
 */
public class Recruiter {
    private Integer id;
    private String Username;
    private String Emailid;
    private String Phone;
    private String Password;
    private String Confirmpass;
    private String Signature;
    private String emailpassword;

    public String getEmailpassword() {
        return emailpassword;
    }

    public void setEmailpassword(String emailpassword) {
        this.emailpassword = emailpassword;
    }

    public String getEmailid() {                
       

        return Emailid;
    }

    public void setEmailid(String Emailid) {
        this.Emailid = Emailid;
    }

    public String getConfirmpass() {
        return Confirmpass;
    }

    public void setConfirmpass(String Confirmpass) {
        this.Confirmpass = Confirmpass;
    }

   

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public boolean validRecruiter()
    {
    if(StringUtils.isNullOrEmpty(Username)||StringUtils.isNullOrEmpty(Password)||StringUtils.isNullOrEmpty(Confirmpass))
    {
    return true;

    }
    else if(Password.equals(Confirmpass))
    {
        return false;
    }
    else
        return true;
    }
    
public boolean emailvalidation(String remail)
{

String expression="^[\\w\\.]+@([\\w]+[\\.])+[A-Z]{2,4}$";
        
        //"^[\\w\\._]+[@]?([\\w\\_\\.]+\\w+\\.)[A-Z]{2,4}$";
        //"^[\\w\\._]+[@]?([\\w\\_\\.]+\\w+\\.)[A-Z]{2,4}$";

 
remail= remail.trim();
CharSequence email=remail;

Pattern pattern=  Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
Matcher match= pattern.matcher(email);
 
if (match.matches())
{
  return true;
}
 else
 {return false;}
}   
}

