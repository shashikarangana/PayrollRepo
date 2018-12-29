/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import lk.ijse.payroll.business.custom.SalaryBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.SalaryDAO;
import lk.ijse.payroll.entity.Salary;
import lk.ijse.payroll.model.SalaryDTO;

/**
 *
 * @author Chamil
 */
public class SalaryBOImpl implements SalaryBO{
    
    private SalaryDAO salaryDAO;
    
    public SalaryBOImpl(){
        this.salaryDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SALARY);

    }

    @Override
    public boolean addSalary(SalaryDTO salary) throws Exception {
        return salaryDAO.add(new Salary(
            salary.getId(),
            salary.getEmployeeId(),
            salary.getDate(),
            salary.getHraAmount(),
            salary.getVaAmount(),
            salary.getMedicalAmount(),
            salary.getOtAmount(),
            salary.getTotalAllowanceAmount(),
            salary.getEpfAmount(),
            salary.getEtfAmount(),
            salary.getWelfareAmount(),
            salary.getInsuranceAmount(),
            salary.getLateHoursAmount(),
            salary.getTotalDeductionAmount(),
            salary.getGrossSalary(),
            salary.getNetSalary(),
            salary.getBasicSalary()
        ));
    }
    
    
}
