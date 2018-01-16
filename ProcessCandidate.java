/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import java.io.Serializable;
import java.util.*;
/**
 *
 * @author sandy
 */
public class ProcessCandidate implements Serializable  {
    
    
  
    
    
    public Integer processID;
   private Integer candidateID;
    private Integer recruiterID;
  private Integer requirementID;
    private Date processDate;
    private String personalSchedule;
   private String telecomshedule;
 private String telecomScheduleSend;
  private String personalScheduleSend;
  
    private String personalSchedulTime;
   
    private String telecomScheduleTime;
    
    private Integer companyid;
   
   
    private String processNote;
   
    private String shortlist;
    
    private String telecomStatus;
    
    
    private String personalStatus;
    
    private Integer level;
    
    private String joiningStatus;
   
    private String offerDate;
   
    private String joiningDate;
     public Integer getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public Integer getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(Integer candidateID) {
        this.candidateID = candidateID;
    }

    public Integer getRecruiterID() {
        return recruiterID;
    }

    public void setRecruiterID(Integer recruiterID) {
        this.recruiterID = recruiterID;
    }

    public Integer getRequirementID() {
        return requirementID;
    }

    public void setRequirementID(Integer requirementID) {
        this.requirementID = requirementID;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public String getPersonalSchedule() {
        return personalSchedule;
    }

    public void setPersonalSchedule(String personalSchedule) {
        this.personalSchedule = personalSchedule;
    }

    public String getTelecomshedule() {
        return telecomshedule;
    }

    public void setTelecomshedule(String telecomshedule) {
        this.telecomshedule = telecomshedule;
    }

    public String getTelecomScheduleSend() {
        return telecomScheduleSend;
    }

    public void setTelecomScheduleSend(String telecomScheduleSend) {
        this.telecomScheduleSend = telecomScheduleSend;
    }

    public String getPersonalScheduleSend() {
        return personalScheduleSend;
    }

    public void setPersonalScheduleSend(String personalScheduleSend) {
        this.personalScheduleSend = personalScheduleSend;
    }

    public String getPersonalSchedulTime() {
        return personalSchedulTime;
    }

    public void setPersonalSchedulTime(String personalSchedulTime) {
        this.personalSchedulTime = personalSchedulTime;
    }

    public String getTelecomScheduleTime() {
        return telecomScheduleTime;
    }

    public void setTelecomScheduleTime(String telecomScheduleTime) {
        this.telecomScheduleTime = telecomScheduleTime;
    }

    public Integer getCompanyID() {
        return companyid;
    }

    public void setCompanyID(Integer companyid) {
        this.companyid = companyid;
    }

    public String getProcessNote() {
        return processNote;
    }

    public void setProcessNote(String processNote) {
        this.processNote = processNote;
    }

    public String getShortlist() {
        return shortlist;
    }

    public void setShortlist(String shortlist) {
        this.shortlist = shortlist;
    }

    public String getTelecomStatus() {
        return telecomStatus;
    }

    public void setTelecomStatus(String telecomStatus) {
        this.telecomStatus = telecomStatus;
    }

    public String getPersonalStatus() {
        return personalStatus;
    }

    public void setPersonalStatus(String personalStatus) {
        this.personalStatus = personalStatus;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getJoiningStatus() {
        return joiningStatus;
    }

    public void setJoiningStatus(String joiningStatus) {
        this.joiningStatus = joiningStatus;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

   


}
