/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.EmployeeDAO;
import lk.ijse.payroll.entity.Employee;

/**
 *
 * @author Chamil
 */
public  class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public boolean add(Employee employee) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ",
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
                employee.getOverTimeHoursRate() ) >= 0;
    }

    @Override
    public boolean update(Employee entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Employee SET EmpName=?, Designation=?, Salary=?, Address=?, ContactNo=?,  LateHoursRate=?, OtHoursRate=? WHERE Id=?", 
                entity.getName(),
                entity.getDesignation(),
                entity.getSalary(),
                entity.getAddress(),
                entity.getContactNo(),
                entity.getLateHoursRate(),
                entity.getOverTimeHoursRate(),
                entity.getId()) > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE From Employee where Id=?", id) > 0;
    }

    @Override
    public Employee search(String name) throws Exception {
        //System.out.println("))))))))11111");
        ResultSet rst = CrudUtil.executeQuery("Select * From Employee where EmpName=? ", name);
        if (rst.next()) {
            return new Employee(
                    rst.getString("Id"), 
                    rst.getString("EmpName"),
                    rst.getString("designation"),
                    rst.getDouble("salary"),
                    rst.getString("MaritalStatus"),
                    rst.getString("address"),
                    rst.getString("contactNo"),
                    rst.getString("joinDate"),
                    rst.getString("dob"),
                    rst.getString("gender"),
                    rst.getDouble("LateHoursRate"),
                    rst.getDouble("OtHoursRate"));
        } else {
            return null;
        }    
    }

    @Override
    public ArrayList<Employee> getAll() throws Exception {
         ArrayList<Employee> allEmployees = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Employee");
        while (rst.next()) {
            allEmployees.add(new Employee(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10),
                    rst.getDouble(11),
                    rst.getDouble(12)
            ));
        }
        return allEmployees;
    }

    @Override
    public Employee searchEmployeeID(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * From Employee where Id=?",id );
        if (rst.next()) {
            //System.out.println("))))))))((()");
            return new Employee(
                    rst.getString(1), 
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10),
                    rst.getDouble(11),
                    rst.getDouble(12)
            );
            
        } else {
            
            return null;
        }    
    }

    @Override
    public ArrayList<Employee> getAllByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Employee> getAllByIDandDate(String id, String date) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
