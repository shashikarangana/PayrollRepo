/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom;

import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudDAO;
import lk.ijse.payroll.entity.Designation;

/**
 *
 * @author Shashika
 */
public interface DesignationDAO extends CrudDAO<Designation,String>{

    @Override
    public ArrayList<Designation> getAll() throws Exception;

    @Override
    public Designation search(String id) throws Exception;
 
}
