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
public class CustomEntity {
    private String eId;
    private String name;
    private String designation;
    private double salary;
    private double hra;
    private double vehicleAllowance;
    private double medical;
    private double total;

    public CustomEntity() {
    }

    public CustomEntity(String eId, String name, String designation, double salary, double hra, double vehicleAllowance, double medical, double total) {
        this.eId = eId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.hra = hra;
        this.vehicleAllowance = vehicleAllowance;
        this.medical = medical;
        this.total = total;
    }

    /**
     * @return the eId
     */
    public String geteId() {
        return eId;
    }

    /**
     * @param eId the eId to set
     */
    public void seteId(String eId) {
        this.eId = eId;
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

    @Override
    public String toString() {
        return "CustomEntity{" + "eId=" + eId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + ", hra=" + hra + ", vehicleAllowance=" + vehicleAllowance + ", medical=" + medical + ", total=" + total + '}';
    }
    
    
}
