/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.EmployeeBO;
import lk.ijse.payroll.business.custom.impl.EmployeeBOImpl;
import lk.ijse.payroll.model.EmployeeDTO;

/**
 *
 * @author Chamil
 */
public class EmployeeRegisterController {
        
    private static EmployeeBO employeeBO = new EmployeeBOImpl();
    
    public static boolean addEmployee(EmployeeDTO employee) throws Exception{
        return employeeBO.addEmployee(employee);
    }
    
    public static boolean updateEmployee(EmployeeDTO employee) throws Exception{
        return employeeBO.updateEmployee(employee);
    }
    
    public static boolean deleteEmployee(String employeeID) throws Exception{
        return employeeBO.deleteEmployee(employeeID);
    }
    
    public static ArrayList<EmployeeDTO> getAllEmployees()throws Exception{
        return employeeBO.getAllEmployees();
    }
    public static ArrayList<String> getAllEmployeeIds() throws Exception {
        return employeeBO.getAllEmployeeIds();
    }

    public static EmployeeDTO searchEmployee(String employeeName) throws Exception {
        return employeeBO.searchEmployee(employeeName);
    }
    
    public static EmployeeDTO searchEmployeeID(String id) throws Exception {
        return employeeBO.searchEmployeeID(id);
    }

    public static ArrayList<String> getAllEmployeeNames() throws Exception{
        return employeeBO.getAllEmployeeNames();
    }
    
    
}
