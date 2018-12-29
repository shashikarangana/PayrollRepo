/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.controller.EmployeeRegisterController;
import lk.ijse.payroll.model.EmployeeDTO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Chamil
 */
public class EmployeeLoan extends javax.swing.JPanel {
    
    private String employeeName,date;

    /**
     * Creates new form EmployeeLoan
     */
    public EmployeeLoan() {
        initComponents();
        loadEmployeeNames();
        AutoCompleteDecorator.decorate(ComboBoxEmpName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEmpAtt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxEmpName = new javax.swing.JComboBox<>();
        jLabelDesignation = new javax.swing.JLabel();
        jLabelEmployeeName = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        TxtDesignation = new javax.swing.JTextField();
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelBasicSalary = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        TxtSalary = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        TxtEmployeeId = new javax.swing.JTextField();
        DatePickerAllowanceDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        LblLoan = new javax.swing.JLabel();
        TxtLoanId = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabelEmployeeName1 = new javax.swing.JLabel();
        ComboAmount = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1156, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loan Conditions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("Employee Should be Permanent.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel1.setText("Employee Should be work here since atleast Two years.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, 220));

        jLabelEmpAtt.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelEmpAtt.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmpAtt.setText(" Employee Loan");
        add(jLabelEmpAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jSeparator4.setBackground(new java.awt.Color(210, 215, 211));
        jSeparator4.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setOpaque(true);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jSeparator2.setForeground(new java.awt.Color(31, 58, 147));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 1640, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxEmpName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        ComboBoxEmpName.setForeground(new java.awt.Color(31, 58, 147));
        ComboBoxEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEmpNameActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBoxEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        jLabelDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelDesignation.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation.setText("Designation");
        jPanel2.add(jLabelDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        jLabelEmployeeName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelEmployeeName.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeName.setText("Employee Name");
        jPanel2.add(jLabelEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jSeparator21.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator21.setOpaque(true);
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, -1));

        TxtDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtDesignation.setForeground(new java.awt.Color(31, 58, 147));
        TxtDesignation.setBorder(null);
        TxtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDesignationActionPerformed(evt);
            }
        });
        jPanel2.add(TxtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 30));

        jLabelEmployeeID.setBackground(new java.awt.Color(1, 50, 67));
        jLabelEmployeeID.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelEmployeeID.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeID.setText("Employee ID");
        jPanel2.add(jLabelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 30));

        jLabelBasicSalary.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelBasicSalary.setForeground(new java.awt.Color(31, 58, 147));
        jLabelBasicSalary.setText("Basic Salary");
        jPanel2.add(jLabelBasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 90, 30));

        jSeparator20.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator20.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator20.setOpaque(true);
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 130, -1));

        TxtSalary.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtSalary.setForeground(new java.awt.Color(31, 58, 147));
        TxtSalary.setBorder(null);
        TxtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalaryActionPerformed(evt);
            }
        });
        jPanel2.add(TxtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 130, 30));

        jSeparator22.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator22.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator22.setOpaque(true);
        jPanel2.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 70, -1));

        TxtEmployeeId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtEmployeeId.setForeground(new java.awt.Color(31, 58, 147));
        TxtEmployeeId.setBorder(null);
        TxtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmployeeIdActionPerformed(evt);
            }
        });
        jPanel2.add(TxtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, 20));

        DatePickerAllowanceDate.setForeground(new java.awt.Color(31, 58, 147));
        DatePickerAllowanceDate.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        DatePickerAllowanceDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatePickerAllowanceDateActionPerformed(evt);
            }
        });
        jPanel2.add(DatePickerAllowanceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 160, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 58, 147));
        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 70, 30));

        LblLoan.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        LblLoan.setForeground(new java.awt.Color(31, 58, 147));
        LblLoan.setText("Loan Id");
        jPanel2.add(LblLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 100, 30));

        TxtLoanId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtLoanId.setForeground(new java.awt.Color(31, 58, 147));
        TxtLoanId.setBorder(null);
        TxtLoanId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLoanIdActionPerformed(evt);
            }
        });
        jPanel2.add(TxtLoanId, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 50, 30));

        jSeparator23.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator23.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator23.setOpaque(true);
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 50, -1));

        jLabelEmployeeName1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelEmployeeName1.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeName1.setText("Amount");
        jPanel2.add(jLabelEmployeeName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));

        ComboAmount.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        ComboAmount.setForeground(new java.awt.Color(31, 58, 147));
        ComboAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50000", "100000", "150000" }));
        ComboAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAmountActionPerformed(evt);
            }
        });
        jPanel2.add(ComboAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 730, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEmpNameActionPerformed
        employeeName = ComboBoxEmpName.getSelectedItem().toString();
        try {
            String empoyeeName=(String) ComboBoxEmpName.getSelectedItem();
            EmployeeDTO employee=EmployeeRegisterController.searchEmployee(empoyeeName);
            if(employee!=null){
                TxtEmployeeId.setText(employee.getId());
                TxtDesignation.setText(employee.getDesignation());
                TxtSalary.setText(""+employee.getSalary());
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAllowance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboBoxEmpNameActionPerformed

    private void TxtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalaryActionPerformed

    private void DatePickerAllowanceDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerAllowanceDateActionPerformed
       date =    ""+ new java.sql.Date(DatePickerAllowanceDate.getDate().getTime());
    }//GEN-LAST:event_DatePickerAllowanceDateActionPerformed

    private void TxtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDesignationActionPerformed

    private void TxtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmployeeIdActionPerformed

    private void TxtLoanIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLoanIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLoanIdActionPerformed

    private void ComboAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAmount;
    private javax.swing.JComboBox<String> ComboBoxEmpName;
    private org.jdesktop.swingx.JXDatePicker DatePickerAllowanceDate;
    private javax.swing.JLabel LblLoan;
    private javax.swing.JTextField TxtDesignation;
    private javax.swing.JTextField TxtEmployeeId;
    private javax.swing.JTextField TxtLoanId;
    private javax.swing.JTextField TxtSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBasicSalary;
    private javax.swing.JLabel jLabelDesignation;
    private javax.swing.JLabel jLabelEmpAtt;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelEmployeeName;
    private javax.swing.JLabel jLabelEmployeeName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    private void loadEmployeeNames() {
        try {
            ArrayList<String>employeeNames=EmployeeRegisterController.getAllEmployeeNames();
            for (String employeeName : employeeNames) {
                ComboBoxEmpName.addItem(employeeName);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}