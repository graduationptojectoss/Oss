/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Data.Department;
import Data.GetFromDB;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Amer$_$
 */
@ManagedBean
public class DepartmentsManage implements Serializable{
    
    Department department;
    @ManagedProperty(value = "#{sessionLists}")
    SessionLists sessionLists;
    
    
    
    String imageD;
    
    public DepartmentsManage() {
        department = new Department();
    }
    
    public void addDepartment(){
        if(department.addToDataBase()){
            sessionLists.getDepartments().add(department);
        }
        
    }

    public SessionLists getSessionLists() {
        return sessionLists;
    }

    public void setSessionLists(SessionLists sessionLists) {
        this.sessionLists = sessionLists;
    }
    
    
    
    
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public List<String> getImageDepartment(){
        return GetFromDB.getImageDepartment();
    }

    public String getImageD() {
        return imageD;
    }

    public void setImageD(String imageD) {
        this.imageD = imageD;
    }
    
    
    
    
}
