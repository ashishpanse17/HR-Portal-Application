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
public class uploadResume {
    private Integer id;
    private Integer candidate_Id;
    private File file;
private String  fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcandidate_Id() {
        return candidate_Id;
    }

    public void setcandidate_Id(Integer candidate_Id) {
        this.candidate_Id = candidate_Id;
    }
    
    public boolean validation()
    {
        if(file!=null)
        {
          String filename=  file.getName();
          
          if(filename.endsWith(".doc")|| filename.endsWith(".Doc") || filename.endsWith(".Doc"))
          {
           return false;
          }
          else
          {return true;}
        }
        
    else
     return true;
    
    }
}
