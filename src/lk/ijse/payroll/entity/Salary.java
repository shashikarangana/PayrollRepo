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
public class Salary {
    private String id;
    private String employeeId;
    private String date;
    private double hraAmount;
    private double vaAmount;
    private double medicalAmount;
    private double otAmount;
    private double totalAllowanceAmount;
    private double epfAmount;
    private double etfAmount;
    private double welfareAmount;
    private double insuranceAmount;
    private double lateHoursAmount;
    private double totalDeductionAmount;
    private double grossSalary;
    private double netSalary;
    private double basicSalary;

    public Salary() {
    }

    public Salary(String id, String employeeId, String date, double hraAmount, double vaAmount, double medicalAmount, double otAmount, double totalAllowanceAmount, double epfAmount, double etfAmount, double welfareAmount, double insuranceAmount, double lateHoursAmount, double totalDeductionAmount, double grossSalary, double netSalary, double basicSalary) {
        this.id = id;
        this.employeeId = employeeId;
        this.date = date;
        this.hraAmount = hraAmount;
        this.vaAmount = vaAmount;
        this.medicalAmount = medicalAmount;
        this.otAmount = otAmount;
        this.totalAllowanceAmount = totalAllowanceAmount;
        this.epfAmount = epfAmount;
        this.etfAmount = etfAmount;
        this.welfareAmount = welfareAmount;
        this.insuranceAmount = insuranceAmount;
        this.lateHoursAmount = lateHoursAmount;
        this.totalDeductionAmount = totalDeductionAmount;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.basicSalary = basicSalary;
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
     * @return the hraAmount
     */
    public double getHraAmount() {
        return hraAmount;
    }

    /**
     * @param hraAmount the hraAmount to set
     */
    public void setHraAmount(double hraAmount) {
        this.hraAmount = hraAmount;
    }

    /**
     * @return the vaAmount
     */
    public double getVaAmount() {
        return vaAmount;
    }

    /**
     * @param vaAmount the vaAmount to set
     */
    public void setVaAmount(double vaAmount) {
        this.vaAmount = vaAmount;
    }

    /**
     * @return the medicalAmount
     */
    public double getMedicalAmount() {
        return medicalAmount;
    }

    /**
     * @param medicalAmount the medicalAmount to set
     */
    public void setMedicalAmount(double medicalAmount) {
        this.medicalAmount = medicalAmount;
    }

    /**
     * @return the otAmount
     */
    public double getOtAmount() {
        return otAmount;
    }

    /**
     * @param otAmount the otAmount to set
     */
    public void setOtAmount(double otAmount) {
        this.otAmount = otAmount;
    }

    /**
     * @return the totalAllowanceAmount
     */
    public double getTotalAllowanceAmount() {
        return totalAllowanceAmount;
    }

    /**
     * @param totalAllowanceAmount the totalAllowanceAmount to set
     */
    public void setTotalAllowanceAmount(double totalAllowanceAmount) {
        this.totalAllowanceAmount = totalAllowanceAmount;
    }

    /**
     * @return the epfAmount
     */
    public double getEpfAmount() {
        return epfAmount;
    }

    /**
     * @param epfAmount the epfAmount to set
     */
    public void setEpfAmount(double epfAmount) {
        this.epfAmount = epfAmount;
    }

    /**
     * @return the etfAmount
     */
    public double getEtfAmount() {
        return etfAmount;
    }

    /**
     * @param etfAmount the etfAmount to set
     */
    public void setEtfAmount(double etfAmount) {
        this.etfAmount = etfAmount;
    }

    /**
     * @return the welfareAmount
     */
    public double getWelfareAmount() {
        return welfareAmount;
    }

    /**
     * @param welfareAmount the welfareAmount to set
     */
    public void setWelfareAmount(double welfareAmount) {
        this.welfareAmount = welfareAmount;
    }

    /**
     * @return the insuranceAmount
     */
    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * @param insuranceAmount the insuranceAmount to set
     */
    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    /**
     * @return the lateHoursAmount
     */
    public double getLateHoursAmount() {
        return lateHoursAmount;
    }

    /**
     * @param lateHoursAmount the lateHoursAmount to set
     */
    public void setLateHoursAmount(double lateHoursAmount) {
        this.lateHoursAmount = lateHoursAmount;
    }

    /**
     * @return the totalDeductionAmount
     */
    public double getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /**
     * @param totalDeductionAmount the totalDeductionAmount to set
     */
    public void setTotalDeductionAmount(double totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }

    /**
     * @return the grossSalary
     */
    public double getGrossSalary() {
        return grossSalary;
    }

    /**
     * @param grossSalary the grossSalary to set
     */
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    /**
     * @return the netSalary
     */
    public double getNetSalary() {
        return netSalary;
    }

    /**
     * @param netSalary the netSalary to set
     */
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
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

    @Override
    public String toString() {
        return "Salary{" + "id=" + id + ", employeeId=" + employeeId + ", date=" + date + ", hraAmount=" + hraAmount + ", vaAmount=" + vaAmount + ", medicalAmount=" + medicalAmount + ", otAmount=" + otAmount + ", totalAllowanceAmount=" + totalAllowanceAmount + ", epfAmount=" + epfAmount + ", etfAmount=" + etfAmount + ", welfareAmount=" + welfareAmount + ", insuranceAmount=" + insuranceAmount + ", lateHoursAmount=" + lateHoursAmount + ", totalDeductionAmount=" + totalDeductionAmount + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + ", basicSalary=" + basicSalary + '}';
    }

    
}
