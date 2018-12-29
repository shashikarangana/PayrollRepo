/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom;

import java.util.ArrayList;
import lk.ijse.payroll.business.SuperBO;
import lk.ijse.payroll.model.AttendanceDTO;
import lk.ijse.payroll.model.DeductionDTO;

/**
 *
 * @author Chamil
 */
public interface AttendanceBO extends SuperBO{

    
    
    public boolean addAttendance(AttendanceDTO attendance) throws Exception;
    public boolean updateAttendance(AttendanceDTO attendance) throws Exception;
    public ArrayList<AttendanceDTO> getAllAttendance()throws Exception;
    public ArrayList<AttendanceDTO> getEmployeeAttendanceById(String id) throws Exception;
    public AttendanceDTO getAttendanceCount(String id) throws Exception;
    public ArrayList<AttendanceDTO> getAttendanceByIdAndDate(String id,String date)throws Exception;
    
    
}
