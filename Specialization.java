/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

/**
 *
 * @author sandy
 */
public class Specialization {

    public Integer getQualification_id() {
        return Qualification_id;
    }

    public void setQualification_id(Integer Qualification_id) {
        this.Qualification_id = Qualification_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    private Integer id;
    private String specialization;
    private Integer Qualification_id;
            
    
}
