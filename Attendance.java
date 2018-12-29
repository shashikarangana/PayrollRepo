/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.entity;

/**
 *
 * @author Chamil
 */
public class Attendance {
    private String attendanceId;
    private String employeeId;
    private int dayStatus;//leave - 0 , precent - 1 
    private String dayType;
    private String date;
    private int OThrs,lateHrs;
    private String inTime;
    private String outTime;
  private int count;
 public Attendance() {
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
   

    public Attendance(String attendanceId, String employeeId, int dayStatus, String dayType, String date, int OThrs, int lateHrs, String inTime, String outTime) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.dayStatus = dayStatus;
        this.dayType = dayType;
        this.date = date;
        this.OThrs = OThrs;
        this.lateHrs = lateHrs;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    /**
     * @return the attendanceId
     */
    public String getAttendanceId() {
        return attendanceId;
    }

    /**
     * @param attendanceId the attendanceId to set
     */
    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the dayStatus
     */
    public int getDayStatus() {
        return dayStatus;
    }

    /**
     * @param dayStatus the dayStatus to set
     */
    public void setDayStatus(int dayStatus) {
        this.dayStatus = dayStatus;
    }

    /**
     * @return the dayType
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * @param dayType the dayType to set
     */
    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the OThrs
     */
    public int getOThrs() {
        return OThrs;
    }

    /**
     * @param OThrs the OThrs to set
     */
    public void setOThrs(int OThrs) {
        this.OThrs = OThrs;
    }

    /**
     * @return the lateHrs
     */
    public int getLateHrs() {
        return lateHrs;
    }

    /**
     * @param lateHrs the lateHrs to set
     */
    public void setLateHrs(int lateHrs) {
        this.lateHrs = lateHrs;
    }

    /**
     * @return the inTime
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * @param inTime the inTime to set
     */
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * @return the outTime
     */
    public String getOutTime() {
        return outTime;
    }

    /**
     * @param outTime the outTime to set
     */
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    

}
