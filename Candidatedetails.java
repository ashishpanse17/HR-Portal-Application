/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import java.io.*;

/**
 *
 * @author sandy
 */
public class Candidatedetails {
    
    private String Candidatename;
    private String LastName;
    private String Email;
    private Integer phone;
    private String Qualification;
    private String Currentcompany;
    private String TotalExprience;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    private String CurrentCTC;
    private String ExpectedCTC;
    private String Noticeperiod;
    private int RecruiterID;
    private File file;
    public String getCandidatename() {
        return Candidatename;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setCandidatename(String Candidatename) {
        this.Candidatename = Candidatename;
    }

    public String getCurrentCTC() {
        return CurrentCTC;
    }

    public void setCurrentCTC(String CurrentCTC) {
        this.CurrentCTC = CurrentCTC;
    }

    public String getCurrentcompany() {
        return Currentcompany;
    }

    public void setCurrentcompany(String Currentcompany) {
        this.Currentcompany = Currentcompany;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getExpectedCTC() {
        return ExpectedCTC;
    }

    public void setExpectedCTC(String ExpectedCTC) {
        this.ExpectedCTC = ExpectedCTC;
    }

    public String getNoticeperiod() {
        return Noticeperiod;
    }

    public void setNoticeperiod(String Noticeperiod) {
        this.Noticeperiod = Noticeperiod;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public int getRecruiterID() {
        return RecruiterID;
    }

    public void setRecruiterID(int RecruiterID) {
        this.RecruiterID = RecruiterID;
    }

    public String getTotalExprience() {
        return TotalExprience;
    }

    public void setTotalExprience(String TotalExprience) {
        this.TotalExprience = TotalExprience;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
    
    
    
}
