/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.business.custom.DeductionBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.DeductionDAO;
import lk.ijse.payroll.dao.custom.impl.DedcutionDAOImpl;
import lk.ijse.payroll.entity.Deduction;
import lk.ijse.payroll.model.DeductionDTO;

/**
 *
 * @author Chamil
 */
public class DeductionBOImpl implements DeductionBO{
   private DeductionDAO deductionDAO;

    public DeductionBOImpl(){
        this.deductionDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DEDUCTION);
    }

    @Override
    public boolean addDeduction(DeductionDTO deduction) throws Exception {
            return deductionDAO.add(new Deduction(
                    deduction.getDeductionId(),
                    deduction.getEmployeeId(),
                    deduction.getBasicSalary(),
                    deduction.getDate(),
                    deduction.getEpf(),
                    deduction.getWelFare(),
                    deduction.getInsurance(),
                    deduction.getTotal(),
                    '0'
            ));
        }

    @Override
    public ArrayList<DeductionDTO> getAllDeduction(){
       try {
           ArrayList<Deduction> deductions= deductionDAO.getAll();
           ArrayList<DeductionDTO> dtos = new ArrayList<>();
           for (Deduction deduction : deductions) {
               dtos.add(new DeductionDTO(
                       deduction.getDeductionId(),
                       deduction.getEmployeeId(),
                       deduction.getBasicSalary(),
                       deduction.getDate(),
                       deduction.getEpf(),
                       deduction.getWelFare(),
                       deduction.getInsurance(),
                       deduction.getTotal(),
                       '0'
               ));
           }
           return dtos;
       } catch (Exception ex) {
           Logger.getLogger(DeductionBOImpl.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
        
    }

    @Override
    public ArrayList<DeductionDTO> getDeductionByIdAndDate(String id, String selectDate) throws Exception {
        try {
            ArrayList<Deduction> deductions= deductionDAO.getAllByIDandDate(id, selectDate);
            ArrayList<DeductionDTO> dtos = new ArrayList<>();
            for (Deduction deduction : deductions) {
                dtos.add(new DeductionDTO(
                        deduction.getDeductionId(),
                        deduction.getEmployeeId(),
                        deduction.getBasicSalary(),
                        deduction.getDate(),
                        deduction.getEpf(),
                        deduction.getWelFare(),
                        deduction.getInsurance(),
                        deduction.getTotal(),
                        '0'
                ));
            }
            return dtos;
        } catch (Exception ex) {
            Logger.getLogger(AllowanceBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
