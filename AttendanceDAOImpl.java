/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.AttendanceDAO;
import lk.ijse.payroll.entity.Attendance;

/**
 *
 * @author Chamil
 */
public  class AttendanceDAOImpl implements AttendanceDAO{

    @Override
    public boolean add(Attendance entity) throws Exception {
           return CrudUtil.executeUpdate("INSERT INTO Attendance VALUES (?,?,?,?,?,?,?,?,?) ",
                entity.getAttendanceId(),
                entity.getEmployeeId(),
                entity.getDayStatus(),
                entity.getDayType(),
                entity.getDate(),
                entity.getOThrs(),
                entity.getLateHrs(),
                entity.getInTime(),
                entity.getOutTime()
                )>0;
               
    }

    @Override
    public boolean update(Attendance entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance search(String id) throws Exception {
           ResultSet rst = CrudUtil.executeQuery("Select count(Id) as present From Attendance where DayStatus= '1' and EmpId = ?", id);
        Attendance attendance = new Attendance();
       if (rst.next()) {
           attendance.setCount(rst.getInt(0));
            return attendance;
        } else {
            return null;
        } 
    }

    @Override
    public ArrayList<Attendance> getAll() throws Exception {
        ArrayList<Attendance> allAttendance = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Attendance");
        while (rst.next()) {
            allAttendance.add(new Attendance(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6),
                    rst.getInt(7),
                    rst.getString(8),
                    rst.getString(9)
                    ));
        }
        return allAttendance;   
    }

    @Override
    public ArrayList<Attendance> getAllByID(String id) throws Exception {
               
 ArrayList<Attendance> allAttendance = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Attendance where EmployeeId=? and "
+ "MONTH(Date) = MONTH(CURRENT_DATE()) " +
"AND YEAR(Date) = YEAR(CURRENT_DATE())",id );
        while (rst.next()) {
            allAttendance.add(new Attendance(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6),
                    rst.getInt(7),
                    rst.getString(8),
                    rst.getString(9)
                    ));
        }
        return allAttendance;   
    }

    @Override
    public ArrayList<Attendance> getAllByIDandDate(String id, String date) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
