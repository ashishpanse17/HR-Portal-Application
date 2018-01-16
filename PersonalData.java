/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import java.util.*;

/**
 *
 * @author sandy
 */
public class PersonalData {

    private Integer id;                          
    private Integer candidate_Id;
                              private String dob;
                              private String gender;
                              private String phone;
                              private Integer basicQualification_Id;
                              private Integer gSpecialization_Id;
                              private Integer gInstitute_Id;
                              private Integer highestQualification_Id;
                              private Integer pSpecialization_Id;
                              private Integer pInstitute_Id;
                              private String residAddress;
                              private Integer tempPincode_Id;
                              private String permAddress;
                              private Integer permPin;
                              private String maritralStatus;
                              private String Nationality;
                              private String  landPhone;
                              private String others;
                              private Date date;
    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public Integer getBasicQualification() {
        return basicQualification_Id;
    }

    public void setBasicQualification(Integer basicQualification_Id) {
        this.basicQualification_Id = basicQualification_Id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getgInstitute() {
        return gInstitute_Id;
    }

    public void setgInstitute(Integer gInstitute_Id) {
        this.gInstitute_Id = gInstitute_Id;
    }

    public Integer getgSpecialization() {
        return gSpecialization_Id;
    }

    public void setgSpecialization(Integer gSpecialization_Id) {
        this.gSpecialization_Id = gSpecialization_Id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getHighestQualification() {
        return highestQualification_Id;
    }

    public void setHighestQualification(Integer highestQualification_Id) {
        this.highestQualification_Id = highestQualification_Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLandPhone() {
        return landPhone;
    }

    public void setLandPhone(String landPhone) {
        this.landPhone = landPhone;
    }

    public String getMaritralStatus() {
        return maritralStatus;
    }

    public void setMaritralStatus(String maritralStatus) {
        this.maritralStatus = maritralStatus;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Integer getpInstitute() {
        return pInstitute_Id;
    }

    public void setpInstitute(Integer pInstitute_Id) {
        this.pInstitute_Id = pInstitute_Id;
    }

    public Integer getpSpecialization() {
        return pSpecialization_Id;
    }

    public void setpSpecialization(Integer pSpecialization_Id) {
        this.pSpecialization_Id = pSpecialization_Id;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public Integer getPermPin() {
        return permPin;
    }

    public void setPermPin(Integer permPin) {
        this.permPin = permPin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRefId() {
        return candidate_Id;
    }

    public void setRefId(Integer candidate_Id) {
        this.candidate_Id = candidate_Id;
    }

    public String getResidAddress() {
        return residAddress;
    }

    public void setResidAddress(String residAddress) {
        this.residAddress = residAddress;
    }

    public Integer getResidPin() {
        return tempPincode_Id;
    }

    public void setResidPin(Integer tempPincode_Id) {
        this.tempPincode_Id= tempPincode_Id;
    }
    
// public boolean Personalvalidation()
// {
// if(StringUtils.isNullOrEmpty(basicQualification_Id) && StringUtils.isNullOrEmpty(highestQualification))
// {
//     return true;
//     }
//    else
// return false;
// }
                              
}
