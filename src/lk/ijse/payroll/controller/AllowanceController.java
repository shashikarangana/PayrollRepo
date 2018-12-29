/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.AllowanceBO;
import lk.ijse.payroll.business.custom.impl.AllowanceBOImpl;
import lk.ijse.payroll.model.AllowanceDTO;
import lk.ijse.payroll.model.AllowanceTblViewDTO;

/**
 *
 * @author Chamil
 */
public class AllowanceController {
    public static AllowanceBO allowanceBO=new AllowanceBOImpl();
    

    public static boolean addAllowance(AllowanceDTO allowance) throws Exception {
        return allowanceBO.addAllowance(allowance);
    }

    public static ArrayList<AllowanceDTO> getAllowance() throws Exception{
        return allowanceBO.getAllAllowance();
    }

    public static ArrayList<AllowanceDTO> getAllowanceById(String id) throws Exception{
        return allowanceBO.getEmployeeAllowanceById(id);
    }
    
  public static ArrayList<AllowanceDTO> getAllowanceByIdAndDate(String id,String date) throws Exception{
        return allowanceBO.getEmployeeAllowanceByIdAndDate(id, date);
    }  
    
}
