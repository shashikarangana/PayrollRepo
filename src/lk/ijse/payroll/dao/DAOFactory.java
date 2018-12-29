  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao;


import lk.ijse.payroll.business.custom.impl.DeductionBOImpl;
import lk.ijse.payroll.dao.custom.DeductionDAO;
import lk.ijse.payroll.dao.custom.impl.AllowanceDAOImpl;
import lk.ijse.payroll.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.payroll.dao.custom.impl.DedcutionDAOImpl;
import lk.ijse.payroll.dao.custom.impl.DesignationDAOImpl;
import lk.ijse.payroll.dao.custom.impl.EmployeeDAOImpl;
import lk.ijse.payroll.dao.custom.impl.SalaryDAOImpl;
import lk.ijse.payroll.entity.Salary;


/**
 *
 * @author Chamil
 */
public class DAOFactory {
    
    public enum DAOTypes{
        EMPLOYEE,DESIGNATION,ATTENDANCE, ALLOWANCE,DEDUCTION,SALARY;
        
    }

    private static DAOFactory dAOFactory;
    
    private DAOFactory(){
    
    }
     public static DAOFactory getInstance(){
        if (dAOFactory == null){
            dAOFactory = new DAOFactory();
        }
        return dAOFactory;
    }
    
    public <T extends SuperDAO> T getDAO(DAOTypes daoType){
        switch(daoType){
            case EMPLOYEE:
                return (T) new EmployeeDAOImpl();
            case DESIGNATION:
                return (T) new DesignationDAOImpl();
            case ATTENDANCE:
                return (T) new AttendanceDAOImpl();
            case ALLOWANCE:
                return (T) new AllowanceDAOImpl();
            case DEDUCTION:
                return (T) new DedcutionDAOImpl();
            case SALARY:
                return (T) new SalaryDAOImpl();
                default:
                return null;
        }
    }

   
}
