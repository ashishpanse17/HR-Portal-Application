/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import com.mysql.jdbc.StringUtils;
//import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.io.File;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author sandy
 */
public class test1 implements Serializable
{
private Integer id;
private String w;
private File file;

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

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }
    
    public boolean validation( String pp)
    {
        w=pp;
    if(StringUtils.isNullOrEmpty(w))
    {
    
      return true;
    }
  
    else
    return false;
    
    }
            

    
}
