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
public class Allowance {
    private String allowanceId;
    private String employeeId;
    private double basicSalary;
    private String date;
    private double houserentAllowance;
    private double vehicleAllowance;
    private double medical;
    private double total;
    private int payStatus;

    public Allowance() {
    }

    public Allowance(String allowanceId, String employeeId, double basicSalary, String date, double houserentAllowance, double vehicleAllowance, double medical, double total, int payStatus) {
        this.allowanceId = allowanceId;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.date = date;
        this.houserentAllowance = houserentAllowance;
        this.vehicleAllowance = vehicleAllowance;
        this.medical = medical;
        this.total = total;
        this.payStatus = payStatus;
    }

    /**
     * @return the allowanceId
     */
    public String getAllowanceId() {
        return allowanceId;
    }

    /**
     * @param allowanceId the allowanceId to set
     */
    public void setAllowanceId(String allowanceId) {
        this.allowanceId = allowanceId;
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
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
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
     * @return the houserentAllowance
     */
    public double getHouserentAllowance() {
        return houserentAllowance;
    }

    /**
     * @param houserentAllowance the houserentAllowance to set
     */
    public void setHouserentAllowance(double houserentAllowance) {
        this.houserentAllowance = houserentAllowance;
    }

    /**
     * @return the vehicleAllowance
     */
    public double getVehicleAllowance() {
        return vehicleAllowance;
    }

    /**
     * @param vehicleAllowance the vehicleAllowance to set
     */
    public void setVehicleAllowance(double vehicleAllowance) {
        this.vehicleAllowance = vehicleAllowance;
    }

    /**
     * @return the medical
     */
    public double getMedical() {
        return medical;
    }

    /**
     * @param medical the medical to set
     */
    public void setMedical(double medical) {
        this.medical = medical;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the payStatus
     */
    public int getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus the payStatus to set
     */
    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public String toString() {
        return "Allowance{" + "allowanceId=" + allowanceId + ", employeeId=" + employeeId + ", basicSalary=" + basicSalary + ", date=" + date + ", houserentAllowance=" + houserentAllowance + ", vehicleAllowance=" + vehicleAllowance + ", medical=" + medical + ", total=" + total + ", payStatus=" + payStatus + '}';
    }

   
}
