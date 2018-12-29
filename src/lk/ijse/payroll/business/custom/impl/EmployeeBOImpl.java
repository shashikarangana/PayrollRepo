/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.EmployeeBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.EmployeeDAO;
import lk.ijse.payroll.entity.Employee;
import lk.ijse.payroll.model.EmployeeDTO;

/**
 *
 * @author Chamil
 */
public class EmployeeBOImpl implements EmployeeBO{
    
    private EmployeeDAO employeeDAO;
    
    public EmployeeBOImpl(){
        this.employeeDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    }

    @Override
    public boolean addEmployee(EmployeeDTO employee) throws Exception {
        return employeeDAO.add(new Employee(
                employee.getId(),
                employee.getName(),
                employee.getDesignation(),
                employee.getSalary(),
                employee.getStatus(),
                employee.getAddress(),
                employee.getContactNo(),
                employee.getJoinDate(),
                employee.getDob(),
                employee.getGender(),
                employee.getLateHoursRate(),
                employee.getOverTimeHoursRate()
        ));
    
    }

    @Override
    public boolean deleteEmployee(String employeeID) throws Exception {
        return employeeDAO.delete(employeeID);
    }

    @Override
    public boolean updateEmployee(EmployeeDTO employee) throws Exception {
        return employeeDAO.update(new Employee(
                employee.getId(),
                employee.getName(),
                employee.getDesignation(),
                employee.getSalary(),
                employee.getAddress(),
                employee.getContactNo(),
                employee.getLateHoursRate(),
                employee.getOverTimeHoursRate()));

    }

    @Override
    public EmployeeDTO searchEmployee(String employeeName) throws Exception {
        //System.out.println("0001"+employeeName);
        Employee employee=employeeDAO.search(employeeName);
        return new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getDesignation(),
                employee.getSalary(),
                employee.getStatus(),
                employee.getAddress(),
                employee.getContactNo(),
                employee.getJoinDate(),
                employee.getDob(),
                employee.getGender(),
                employee.getLateHoursRate(),
                employee.getOverTimeHoursRate()
        );
        
    }

    @Override
    public ArrayList<EmployeeDTO> getAllEmployees() throws Exception {
        ArrayList<Employee> employees= employeeDAO.getAll();
        ArrayList<EmployeeDTO> dtos = new ArrayList<>();
        for (Employee e : employees) {
            dtos.add(new EmployeeDTO(e.getId(),
                    e.getName(),
                    e.getDesignation(),
                    e.getSalary(),
                    e.getStatus(),
                    e.getAddress(),
                    e.getContactNo(),
                    e.getJoinDate(),
                    e.getDob(),
                    e.getGender(),
                    e.getLateHoursRate(),
                    e.getOverTimeHoursRate()));
        }
        return dtos;
    }

    @Override
    public ArrayList<String> getAllEmployeeIds() throws Exception {
        ArrayList<Employee> allEmployees = employeeDAO.getAll();
        ArrayList<String> employeeIds = new ArrayList<>();
        for (Employee employee : allEmployees) {
            employeeIds.add(employee.getId());
        }
        return employeeIds;

    }

    @Override
    public ArrayList<String> getAllEmployeeNames() throws Exception {
        ArrayList<Employee> allEmployees = employeeDAO.getAll();
        ArrayList<String> employeeNames = new ArrayList<>();
        for (Employee employee : allEmployees) {
            employeeNames.add(employee.getName());
        }
        return employeeNames;

    }

    @Override
    public EmployeeDTO searchEmployeeID(String id) throws Exception {
        //System.out.println("000->"+id);
        Employee employee=employeeDAO.searchEmployeeID(id);
        return new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getDesignation(),
                employee.getSalary(),
                employee.getStatus(),
                employee.getAddress(),
                employee.getContactNo(),
                employee.getJoinDate(),
                employee.getDob(),
                employee.getGender(),
                employee.getLateHoursRate(),
                employee.getOverTimeHoursRate()
        );
    }
    
    

    
   
    
    
}
