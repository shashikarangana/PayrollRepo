/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import java.util.ArrayList;
import lk.ijse.payroll.business.SuperBO;
import lk.ijse.payroll.model.DesignationDTO;

/**
 *
 * @author Shashika
 */
public interface DesignationBO extends SuperBO{
    
    public ArrayList<DesignationDTO> getAllEmpDesignations() throws Exception;
    
    public DesignationDTO getDesId(String name) throws Exception;
}
