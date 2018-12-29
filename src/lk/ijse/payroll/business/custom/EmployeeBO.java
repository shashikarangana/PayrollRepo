/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import java.util.ArrayList;
import lk.ijse.payroll.business.SuperBO;
import lk.ijse.payroll.model.EmployeeDTO;

/**
 *
 * @author Chamil
 */
public interface EmployeeBO extends SuperBO{
    
    public boolean addEmployee(EmployeeDTO employee) throws Exception;
    
    public boolean deleteEmployee(String employeeID) throws Exception;
    
    public boolean updateEmployee(EmployeeDTO employee) throws Exception;
    
    public EmployeeDTO searchEmployee(String employeeName) throws Exception;
    
    public EmployeeDTO searchEmployeeID(String id) throws Exception;
    
    public ArrayList<EmployeeDTO> getAllEmployees() throws Exception;
    
    public ArrayList<String> getAllEmployeeIds()throws Exception;

    public ArrayList<String> getAllEmployeeNames() throws Exception;
    
}
