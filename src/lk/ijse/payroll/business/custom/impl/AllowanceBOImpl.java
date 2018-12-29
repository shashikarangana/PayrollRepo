 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.business.custom.AllowanceBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.AllowanceDAO;
import lk.ijse.payroll.entity.Allowance;
import lk.ijse.payroll.model.AllowanceDTO;
import lk.ijse.payroll.model.AllowanceTblViewDTO;

/**
 *
 * @author Chamil
 */
public class AllowanceBOImpl implements AllowanceBO{
    private AllowanceDAO allowanceDAO;

    public AllowanceBOImpl() {
        this.allowanceDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ALLOWANCE);
    }

    @Override
    public boolean addAllowance(AllowanceDTO allowance) throws Exception {
        return allowanceDAO.add(new Allowance(
                allowance.getAllowanceId(),
                allowance.getEmployeeId(),
                allowance.getBasicSalary(),
                allowance.getDate(),
                allowance.getHouserentAllowance(),
                allowance.getVehicleAllowance(),
                allowance.getMedical(),
                allowance.getTotal(),
                allowance.getPayStatus()
        
        ));
     
    }
    
    @Override
    public ArrayList<AllowanceDTO> getAllAllowance()  throws Exception{
        try {
            ArrayList<Allowance> allowances= allowanceDAO.getAll();
            ArrayList<AllowanceDTO> dtos = new ArrayList<>();
            for (Allowance allowance : allowances) {
                dtos.add(new AllowanceDTO(
                        allowance.getAllowanceId(),
                        allowance.getEmployeeId(),
                        allowance.getBasicSalary(),
                        allowance.getDate(),
                        allowance.getHouserentAllowance(),
                        allowance.getVehicleAllowance(),
                        allowance.getMedical(),
                        allowance.getTotal(),
                        '0'
                ));
            }
            return dtos;
        } catch (Exception ex) {
            Logger.getLogger(AllowanceBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   

    @Override
    public ArrayList<AllowanceDTO> getEmployeeAllowanceById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AllowanceDTO> getEmployeeAllowanceByIdAndDate(String id, String date) throws Exception {
         try {
            ArrayList<Allowance> allowances= allowanceDAO.getAllByIDandDate(id, date);
            ArrayList<AllowanceDTO> dtos = new ArrayList<>();
            for (Allowance allowance : allowances) {
                dtos.add(new AllowanceDTO(
                        allowance.getAllowanceId(),
                        allowance.getEmployeeId(),
                        allowance.getBasicSalary(),
                        allowance.getDate(),
                        allowance.getHouserentAllowance(),
                        allowance.getVehicleAllowance(),
                        allowance.getMedical(),
                        allowance.getTotal(),
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
