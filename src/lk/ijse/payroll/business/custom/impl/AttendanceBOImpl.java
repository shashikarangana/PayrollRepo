/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.business.custom.impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.business.custom.AttendanceBO;
import lk.ijse.payroll.dao.DAOFactory;
import lk.ijse.payroll.dao.custom.AttendanceDAO;
import lk.ijse.payroll.entity.Attendance;
import lk.ijse.payroll.model.AttendanceDTO;

/**
 *
 * @author Chamil
 */
public class AttendanceBOImpl implements AttendanceBO{
    private AttendanceDAO attendanceDAO;

    public AttendanceBOImpl() {
        this.attendanceDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ATTENDANCE);
    }

    @Override
    public boolean addAttendance(AttendanceDTO attendance) throws Exception {
        return attendanceDAO.add(new Attendance(
                attendance.getAttendanceId(),
                attendance.getEmployeeId(),
                attendance.getDayStatus(),
                attendance.getDayType(),
                attendance.getDate(),
                attendance.getOThrs(),
                attendance.getLateHrs(),
                attendance.getInTime(),
                attendance.getOutTime()

        ));
    }

    @Override
    public ArrayList<AttendanceDTO> getAllAttendance(){
        try {
            ArrayList<Attendance> attendances= attendanceDAO.getAll();
            ArrayList<AttendanceDTO> dtos = new ArrayList<>();
            for (Attendance attendance : attendances) {
                dtos.add(new AttendanceDTO(
                        attendance.getAttendanceId(),
                        attendance.getEmployeeId(),
                        attendance.getDayStatus(),
                        attendance.getDayType(),
                        attendance.getDate(),
                        attendance.getOThrs(),
                        attendance.getLateHrs(),
                        attendance.getInTime(),
                        attendance.getOutTime()
                        
                ));
            }
            return dtos;
        } catch (Exception ex) {
            Logger.getLogger(AttendanceBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<AttendanceDTO> getEmployeeAttendanceById(String id) throws Exception {
          try {
            ArrayList<Attendance> attendances= attendanceDAO.getAllByID(id);
            ArrayList<AttendanceDTO> dtos = new ArrayList<>();
            for (Attendance attendance : attendances) {
                dtos.add(new AttendanceDTO(
                        attendance.getAttendanceId(),
                        attendance.getEmployeeId(),
                        attendance.getDayStatus(),
                        attendance.getDayType(),
                        attendance.getDate(),
                        attendance.getOThrs(),
                        attendance.getLateHrs(),
                        attendance.getInTime(),
                        attendance.getOutTime()
                        
                ));
            }
            return dtos;
        } catch (Exception ex) {
            Logger.getLogger(AttendanceBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public AttendanceDTO getAttendanceCount(String id) throws Exception {
        Attendance attendance=attendanceDAO.search(id);
        AttendanceDTO attendanceDTO = new AttendanceDTO();
        attendanceDTO.setLeaveCount(attendance.getLeaveCount());
        attendanceDTO.setPresentCount(attendance.getPresentCount());
        return attendanceDTO;
    }

    @Override
    public ArrayList<AttendanceDTO> getAttendanceByIdAndDate(String id, String date) throws Exception {
       try {
            ArrayList<Attendance> attendances= attendanceDAO.getAllByIDandDate(id, date);
            ArrayList<AttendanceDTO> dtos = new ArrayList<>();
            for (Attendance attendance : attendances) {
                dtos.add(new AttendanceDTO(
                        attendance.getAttendanceId(),
                        attendance.getEmployeeId(),
                        attendance.getDayStatus(),
                        attendance.getDayType(),
                        attendance.getDate(),
                        attendance.getOThrs(),
                        attendance.getLateHrs(),
                        attendance.getInTime(),
                        attendance.getOutTime()
                        
                ));
            }
            return dtos;
        } catch (Exception ex) {
            Logger.getLogger(AttendanceBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean updateAttendance(AttendanceDTO attendance) throws Exception {
          return  attendanceDAO.update(new Attendance(
                attendance.getAttendanceId(),
                attendance.getDayStatus(),
                attendance.getDayType(),
                attendance.getOutTime()

        )); 
    }

}