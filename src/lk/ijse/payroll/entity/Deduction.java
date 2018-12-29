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
public class Deduction {
    private String deductionId;
    private String employeeId;
    private double basicSalary;
    private String date;
    private double epf;
    private double welFare;
    private double insurance;
    private double total;
    private int deductStatus;

    public Deduction() {
    }

    public Deduction(String deductionId, String employeeId, double basicSalary, String date, double epf, double welFare, double insurance, double total, int deductStatus) {
        this.deductionId = deductionId;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.date = date;
        this.epf = epf;
        this.welFare = welFare;
        this.insurance = insurance;
        this.total = total;
        this.deductStatus = deductStatus;
    }

    /**
     * @return the deductionId
     */
    public String getDeductionId() {
        return deductionId;
    }

    /**
     * @param deductionId the deductionId to set
     */
    public void setDeductionId(String deductionId) {
        this.deductionId = deductionId;
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
     * @return the epf
     */
    public double getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(double epf) {
        this.epf = epf;
    }

    /**
     * @return the welFare
     */
    public double getWelFare() {
        return welFare;
    }

    /**
     * @param welFare the welFare to set
     */
    public void setWelFare(double welFare) {
        this.welFare = welFare;
    }

    /**
     * @return the insurance
     */
    public double getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(double insurance) {
        this.insurance = insurance;
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
     * @return the deductStatus
     */
    public int getDeductStatus() {
        return deductStatus;
    }

    /**
     * @param deductStatus the deductStatus to set
     */
    public void setDeductStatus(int deductStatus) {
        this.deductStatus = deductStatus;
    }

    @Override
    public String toString() {
        return "Deduction{" + "deductionId=" + deductionId + ", employeeId=" + employeeId + ", basicSalary=" + basicSalary + ", date=" + date + ", epf=" + epf + ", welFare=" + welFare + ", insurance=" + insurance + ", total=" + total + ", deductStatus=" + deductStatus + '}';
    }

   
    
}
