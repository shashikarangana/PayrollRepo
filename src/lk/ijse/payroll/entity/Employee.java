/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.entity;

/**
 *
 * @author Shashika
 */
public class Employee {
    private String id;
    private String name;
    private String designation;
    private double salary;
    private String status;
    private String address;
    private String contactNo;
    private String joinDate;
    private String dob;
    private String gender;
    private double lateHoursRate;
    private double OverTimeHoursRate;

    public Employee() {
    }

    public Employee(String id, String name, String designation, double salary, String status, String address, String contactNo, String joinDate, String dob, String gender, double lateHoursRate, double OverTimeHoursRate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.status = status;
        this.address = address;
        this.contactNo = contactNo;
        this.joinDate = joinDate;
        this.dob = dob;
        this.gender = gender;
        this.lateHoursRate = lateHoursRate;
        this.OverTimeHoursRate = OverTimeHoursRate;
    }
 public Employee(String id,String name, String designation, double salary, String address, String contactNo, double lateHoursRate, double OverTimeHoursRate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
        this.contactNo = contactNo;
        this.lateHoursRate = lateHoursRate;
        this.OverTimeHoursRate = OverTimeHoursRate;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the joinDate
     */
    public String getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the lateHoursRate
     */
    public double getLateHoursRate() {
        return lateHoursRate;
    }

    /**
     * @param lateHoursRate the lateHoursRate to set
     */
    public void setLateHoursRate(double lateHoursRate) {
        this.lateHoursRate = lateHoursRate;
    }

    /**
     * @return the OverTimeHoursRate
     */
    public double getOverTimeHoursRate() {
        return OverTimeHoursRate;
    }

    /**
     * @param OverTimeHoursRate the OverTimeHoursRate to set
     */
    public void setOverTimeHoursRate(double OverTimeHoursRate) {
        this.OverTimeHoursRate = OverTimeHoursRate;
    }

    
}
