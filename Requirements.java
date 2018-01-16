/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import com.mysql.jdbc.StringUtils;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sandy
 */
public class Requirements implements Serializable {
                             
private Integer RequiermentID;
 private  String JobDescription;
 private  float Exprience;
private String JobTitle;
private  String Qualification ;
private String Location;
 private Integer Company_Id;
 private Integer KeySkillID;
private String Budget;
 private Date Requirement_Date;
 private Date expiry;

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getBudget() {
        return Budget;
    }

    public void setBudget(String Budget) {
        this.Budget = Budget;
    }

    public Integer getCompanyID() {
        return Company_Id;
    }

    public void setCompanyID(Integer Company_Id) {
        this.Company_Id = Company_Id;
    }

    public float getExprience() {
        return Exprience;
    }

    public void setExprience(float Exprience) {
        this.Exprience = Exprience;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    public Integer getKeySkillID() {
        return KeySkillID;
    }

    public void setKeySkillID(Integer KeySkillID) {
        this.KeySkillID = KeySkillID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public Integer getRequiermentID() {
        return RequiermentID;
    }

    public void setRequiermentID(Integer RequiermentID) {
        this.RequiermentID = RequiermentID;
    }

    public Date getRequirement_Date() {
        return Requirement_Date;
    }

    public void setRequirement_Date(Date Requirement_Date) {
        this.Requirement_Date = Requirement_Date;
    }
    
                               
    
    
}
