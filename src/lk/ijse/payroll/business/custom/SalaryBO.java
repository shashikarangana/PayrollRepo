  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import lk.ijse.payroll.business.SuperBO;
import lk.ijse.payroll.model.SalaryDTO;

/**
 *
 * @author Chamil
 */
public interface SalaryBO extends SuperBO{

    public  boolean addSalary(SalaryDTO salary)throws Exception;
    
}
