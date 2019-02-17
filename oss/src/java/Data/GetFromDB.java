/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import DB.DB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amer$_$
 */
public class GetFromDB {
    
    
    public static List<Department> getDepartments() {
        Department d = new Department();
        List<Department> departments = new ArrayList<Department>();
        try {
            DB db = new DB();
            String sql = "SELECT * FROM department ;";
            
            ResultSet r = db.read(sql);
            while (r.next()) {
                d = new Department(r.getInt(1),r.getString(2),r.getString(3));
                departments.add(d);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return departments;
    }

    
     public static List<Service> getServices() {
        
      
       
       List<Section> sections = new ArrayList<Section>();
       List<JobTitel> jobs =new ArrayList<JobTitel>();
       List<Department> path =new ArrayList<Department>();
       List<Service> services = new ArrayList<Service>();
    
        
        JobTitel j = new JobTitel(1, "jname1");
         jobs.add(j);
         
         Section sec = new Section(2, "sname1", jobs);
         sections.add(sec);
         
         
         Department d = new Department(3, "dname1", sections);
         path.add(d);
         
         Service ser = new Service(1, "name", 1, 1.0, true, d, sec, path);
         
         services.add(ser);
        return services;
    }
  


    public static List<String> getImageDepartment() {
        List<String> image = new ArrayList<String>();
        try {
            DB db = new DB();
            String sql = "SELECT * FROM imagedepartment ;";
            
            ResultSet r = db.read(sql);
            while (r.next()) {
                String ss = r.getString(1);
                image.add(ss);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return image;
    }


}
