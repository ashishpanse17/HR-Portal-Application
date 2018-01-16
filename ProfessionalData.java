/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;
import com.mysql.jdbc.StringUtils;
import java.util.*;

/**
 *
 * @author sandy
 */
public class ProfessionalData {
    
    
    
    private Integer id;
    private Integer candidate_Id;
    private String totalExp;
    private Integer currentCompany_Id;
    private Integer previousCompany_Id;
    private String currentCtc;
    private String expectedCtc;
    private String noticePeriod;
    private String certification;
    private String designation;
    private String keyskillID;
    private String alternateEmail;
    private String remark;
    private Date createdDate;

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCurrentCtc() {
        return currentCtc;
    }

    public void setCurrentCtc(String currentCtc) {
        this.currentCtc = currentCtc;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExpectedCtc() {
        return expectedCtc;
    }

    public void setExpectedCtc(String expectedCtc) {
        this.expectedCtc = expectedCtc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyskillID() {
        return keyskillID;
    }

    public void setKeyskillID(String keyskillID) {
        this.keyskillID = keyskillID;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public Integer getPreviousCompany() {
        return previousCompany_Id;
    }

    public void setPreviousCompany(Integer previousCompany_Id) {
        this.previousCompany_Id = previousCompany_Id;
    }

     public Integer getcurrentCompany_Id() {
        return currentCompany_Id;
    }

    public void setcurrentCompany_Id(Integer currentCompany_Id) {
        this.currentCompany_Id = currentCompany_Id;
    }

    public Integer getcandidate_Id() {
        return candidate_Id;
    }

    public void setcandidate_Id(Integer candidate_Id) {
        this.candidate_Id = candidate_Id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(String totalExp) {
        this.totalExp = totalExp;
    }
//    public boolean professionalvalidation()
//    {
//    if(StringUtils.isNullOrEmpty(currentCompany))
//    {
//    return true;
//    }
//    else return false;
//    }
//       
    
}
