/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.DesignationDAO;
import lk.ijse.payroll.entity.Designation;

/**
 *
 * @author Inspiron
 */
public  class DesignationDAOImpl implements DesignationDAO{

    @Override
    public ArrayList<Designation> getAll() throws Exception {
        ArrayList<Designation> allDesignations = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Designation");
        while (rst.next()) {
            allDesignations.add(new Designation(rst.getString(1),
                    rst.getString(2)));
        }
        return allDesignations;
    }

    @Override
    public Designation search(String name) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * From Designation where DesName=?", name);
        if (rst.next()) {
            return new Designation(
                    rst.getString("DesID"), 
                    rst.getString("DesName"));
        } else {
            return null;
        }  
    }

    @Override
    public boolean add(Designation entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Designation entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Designation> getAllByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Designation> getAllByIDandDate(String id, String date) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
    
}
