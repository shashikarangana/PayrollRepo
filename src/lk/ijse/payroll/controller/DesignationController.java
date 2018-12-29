/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.DesignationBO;
import lk.ijse.payroll.business.custom.impl.DesignationBOImpl;
import lk.ijse.payroll.model.DesignationDTO;

/**
 *
 * @author Inspiron
 */
public class DesignationController {
    public static DesignationBO designation = new DesignationBOImpl();
    
      public static ArrayList<DesignationDTO> getAllEmpDesignations()throws Exception{
        return designation.getAllEmpDesignations();
    }
      
        public static DesignationDTO getDesId(String name)throws Exception{
        return designation.getDesId(name);
    }
    
}
