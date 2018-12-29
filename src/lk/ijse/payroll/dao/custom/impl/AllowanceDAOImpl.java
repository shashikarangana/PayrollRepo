/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.AllowanceDAO;
import lk.ijse.payroll.entity.Allowance;
import lk.ijse.payroll.entity.Employee;

/**
 *
 * @author Chamil
 */
public class AllowanceDAOImpl implements AllowanceDAO{

    @Override
    public boolean add(Allowance entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Allowance Values (?,?,?,?,?,?,?,?,?)",
                entity.getAllowanceId(),
                entity.getEmployeeId(),
                entity.getBasicSalary(),
                entity.getDate(),
                entity.getHouserentAllowance(),
                entity.getVehicleAllowance(),
                entity.getMedical(),
                entity.getTotal(),
                entity.getPayStatus())>0;
    }

    @Override
    public boolean update(Allowance entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Allowance search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Allowance> getAll() throws Exception {
        ArrayList<Allowance> allAllowances = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Allowance");
        while (rst.next()) {
            allAllowances.add(new Allowance(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getInt(9)
            ));
        }
        return allAllowances;
    }

    @Override
    public ArrayList<Allowance> getAllByID(String id) throws Exception {
          ArrayList<Allowance> eachEmployeeAllowance = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("Select * From Allowance where EmployeeId=? and "
                + "MONTH(date) = MONTH(CURRENT_DATE()) " +
"AND YEAR(date) = YEAR(CURRENT_DATE())",id );
        
        
    
 while (rst.next()) {
            eachEmployeeAllowance.add(new Allowance(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getInt(9)
            ));
        }
        return eachEmployeeAllowance;
    
    }

    @Override
    public ArrayList<Allowance> getAllByIDandDate(String id, String date) throws Exception {//
        ArrayList<Allowance> eachEmployeeAllowance = new ArrayList<>();
        
 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
      //  String dateInString = "7-Jun-2013";
Date sDate = formatter.parse(date);
            System.out.println(sDate);
            System.out.println(formatter.format(sDate));
            //Date x = formatter.format(sDate);

       
       // Date selectDate=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
//        ResultSet rst = CrudUtil.executeQuery("Select * From Allowance where EmployeeId=? and "
//                + "MONTH(date) = MONTH("+formatter.format(sDate)+") " +
//"AND YEAR(date) = YEAR("+formatter.format(sDate)+")",id );

        ResultSet rst = CrudUtil.executeQuery("Select * From Allowance where EmployeeId=? and "
                + "MONTH(date) = MONTH(CURRENT_DATE()) " +
"AND YEAR(date) = YEAR(CURRENT_DATE())",id );
        
        
    
 while (rst.next()) {
            eachEmployeeAllowance.add(new Allowance(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getInt(9)
            ));
        }
        return eachEmployeeAllowance;
    }
}
