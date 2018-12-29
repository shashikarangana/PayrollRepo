/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.DeductionBO;
import lk.ijse.payroll.business.custom.impl.DeductionBOImpl;
import lk.ijse.payroll.model.DeductionDTO;

/**
 *
 * @author Chamil
 */
public class DeductionController {

    public static DeductionBO deductionBO=new DeductionBOImpl();
    
    public static boolean addDeduction(DeductionDTO deduction) throws Exception {
        return deductionBO.addDeduction(deduction);
    }

    public static ArrayList<DeductionDTO> getAllowance() {
        return deductionBO.getAllDeduction();
    }

    public static ArrayList<DeductionDTO> getDeductionByIdAndDate(String id, String selectDate) throws Exception {
        return deductionBO.getDeductionByIdAndDate(id, selectDate);
    }
    
    
    
}
