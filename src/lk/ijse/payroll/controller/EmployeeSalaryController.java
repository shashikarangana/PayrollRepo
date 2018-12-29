/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import lk.ijse.payroll.business.custom.SalaryBO;
import lk.ijse.payroll.business.custom.impl.SalaryBOImpl;
import lk.ijse.payroll.model.SalaryDTO;

/**
 *
 * @author Chamil
 */
public class EmployeeSalaryController{
    public static SalaryBO salaryBO=new SalaryBOImpl();

    public static boolean addSalary(SalaryDTO salary)throws Exception{
        return salaryBO.addSalary(salary);
    }
    
    
}
