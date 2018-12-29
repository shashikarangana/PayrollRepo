/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.model;

/**
 *
 * @author Chamil
 */
public class AllowanceTblViewDTO {
    private String employeeId;
    private String name;
    private String designation;
    private double salary;
    private double hra;
    private double vehicalAllowance;
    private double medical;
    private double total;

    public AllowanceTblViewDTO() {
    }

    public AllowanceTblViewDTO(String employeeId, String name, String designation, double salary, double hra, double vehicalAllowance, double medical, double total) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.hra = hra;
        this.vehicalAllowance = vehicalAllowance;
        this.medical = medical;
        this.total = total;
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
     * @return the hra
     */
    public double getHra() {
        return hra;
    }

    /**
     * @param hra the hra to set
     */
    public void setHra(double hra) {
        this.hra = hra;
    }

    /**
     * @return the vehicalAllowance
     */
    public double getVehicalAllowance() {
        return vehicalAllowance;
    }

    /**
     * @param vehicalAllowance the vehicalAllowance to set
     */
    public void setVehicalAllowance(double vehicalAllowance) {
        this.vehicalAllowance = vehicalAllowance;
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

    @Override
    public String toString() {
        return "AllowanceDTO1{" + "employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + ", hra=" + hra + ", vehicalAllowance=" + vehicalAllowance + ", medical=" + medical + ", total=" + total + '}';
    }
    
    
}
