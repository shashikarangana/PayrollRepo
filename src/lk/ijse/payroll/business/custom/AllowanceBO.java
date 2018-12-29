/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import java.util.ArrayList;
import lk.ijse.payroll.model.AllowanceDTO;

/**
 *
 * @author Chamil
 */
public interface AllowanceBO {

    public boolean addAllowance(AllowanceDTO allowance)throws Exception;

    public ArrayList<AllowanceDTO> getAllAllowance() throws Exception;
    
    public ArrayList<AllowanceDTO> getEmployeeAllowanceById(String id) throws Exception;// for payslip
    
    public ArrayList<AllowanceDTO> getEmployeeAllowanceByIdAndDate(String id,String date) throws Exception;
    
}
