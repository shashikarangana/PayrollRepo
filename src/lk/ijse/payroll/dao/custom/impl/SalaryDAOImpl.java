/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.SalaryDAO;
import lk.ijse.payroll.entity.Salary;
//import lk.ijse.payroll.dao.custom.SalaryDAO;

/**
 *
 * @author Chamil
 */
public class SalaryDAOImpl implements SalaryDAO{

    @Override
    public boolean add(Salary salary)throws Exception{
        return CrudUtil.executeUpdate("INSERT INTO Salary VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ",
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
        )>0;
    }

    @Override
    public boolean update(Salary entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salary search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Salary> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Salary> getAllByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Salary> getAllByIDandDate(String id, String date) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //mata ara method eka at
}