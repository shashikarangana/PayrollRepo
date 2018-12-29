 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.DeductionDAO;
import lk.ijse.payroll.entity.Deduction;

/**
 *
 * @author Chamil
 */
public  class DedcutionDAOImpl implements DeductionDAO{

    @Override
    public boolean add(Deduction entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Deduction VALUES (?,?,?,?,?,?,?,?,?) ",
                entity.getDeductionId(),
                entity.getEmployeeId(),
                entity.getBasicSalary(),
                entity.getDate(),
                entity.getEpf(),
                entity.getWelFare(),
                entity.getInsurance(),
                entity.getTotal(),
                entity.getDeductStatus()
        )>0;
    }

    @Override
    public boolean update(Deduction entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Deduction search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Deduction> getAll() throws Exception {
         ArrayList<Deduction> allDeductions = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Deduction");
        while (rst.next()) {
            allDeductions.add(new Deduction(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    '0'
            ));
        }
        return allDeductions;
    }

    @Override
    public ArrayList<Deduction> getAllByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Deduction> getAllByIDandDate(String id, String date) throws Exception {
        ArrayList<Deduction> eachEmployeeDeduction = new ArrayList<>();

         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
              //  String dateInString = "7-Jun-2013";
        Date sDate = formatter.parse(date);
        ResultSet rst = CrudUtil.executeQuery("Select * From Deduction where EmployeeId=? and "
                        + "MONTH(date) = MONTH(CURRENT_DATE()) " +
        "AND YEAR(date) = YEAR(CURRENT_DATE())",id );



         while (rst.next()) {
                    eachEmployeeDeduction.add(new Deduction(
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
                return eachEmployeeDeduction;
    }    
}


    


   