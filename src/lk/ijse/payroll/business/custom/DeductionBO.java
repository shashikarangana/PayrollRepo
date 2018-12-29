/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import java.util.ArrayList;
import lk.ijse.payroll.business.SuperBO;
import lk.ijse.payroll.model.DeductionDTO;

/**
 *
 * @author Chamil
 */
public interface DeductionBO extends SuperBO{

    public boolean addDeduction(DeductionDTO deduction)throws Exception;

    public ArrayList<DeductionDTO> getAllDeduction();

    public ArrayList<DeductionDTO> getDeductionByIdAndDate(String id, String selectDate)throws Exception;
    
}
