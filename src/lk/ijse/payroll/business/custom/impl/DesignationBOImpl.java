/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.DesignationBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.DesignationDAO;
import lk.ijse.payroll.entity.Designation;
import lk.ijse.payroll.model.DesignationDTO;

/**
 *
 * @author Inspiron
 */
public class DesignationBOImpl implements DesignationBO{
       private DesignationDAO designationDAO;
    
    public DesignationBOImpl(){
        this.designationDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DESIGNATION);
    }

    @Override
    public ArrayList<DesignationDTO> getAllEmpDesignations() throws Exception {
        ArrayList<Designation> designations= designationDAO.getAll();
        ArrayList<DesignationDTO> dtos = new ArrayList<>();
        for (Designation designation : designations) {
            dtos.add(new DesignationDTO(
                    designation.getId(),
                    designation.getName()));
        }
        return dtos;
    }

    @Override
    public DesignationDTO getDesId(String name) throws Exception {
        
        
        Designation des = designationDAO.search(name);
        System.out.println("IN_BOIMPL>>"+des.getId());
        return new DesignationDTO(des.getId(), des.getName());
        
           
    }
}
