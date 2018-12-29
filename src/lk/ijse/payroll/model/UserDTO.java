/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.model;

/**
 *
 * @author Inspiron
 */
public class UserDTO {
    private String id;
    private String name;
    private String salt;

    public UserDTO() {
    }

    public UserDTO(String id, String name, String salt) {
        this.id = id;
        this.name = name;
        this.salt = salt;
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
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "id=" + id + ", name=" + name + ", salt=" + salt + '}';
    }
    
   
}
