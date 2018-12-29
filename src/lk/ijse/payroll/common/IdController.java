/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.common;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.ijse.payroll.dbconnection.DBConnection;

/**
 *
 * @author Chamil
 */
public class IdController {

    static String getLastID(String tableName, String colName) throws SQLException, ClassNotFoundException {
        String sql = "select " + colName + " from " + tableName + " order by 1 desc limit 1";
        java.sql.Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
 }
