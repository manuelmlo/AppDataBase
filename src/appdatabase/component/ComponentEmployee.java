/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.component;

import appdatabase.defaulttablerender.ShopRender;
import appdatabase.entity.Employee;
import appdatabase.entity.Shop;
import appdatabase.format.MaxLenghtString;
import appdatabase.format.Values;
import appdatabase.listcellrender.ListRenderShops;
import appdatabase.listentities.ListShops;
import appdatabase.listentities.ListStaff;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Manuel
 */
public class ComponentEmployee extends javax.swing.JPanel {
    private List<Employee> listEmployee;
    private Employee employee;
    private Shop shop;
    private List<Shop> listShops;
    private int numElementEmployee;
    private int numElementShop;

    /**
     * Creates new form ComponentEmployee
     */
    public ComponentEmployee(){
        initComponents();
        this.setDefault();  
    }
    public ComponentEmployee(ListStaff listStaff){
        this();
        this.listEmployee=listStaff.getListStaff();
        
    }
    
    private void setRestrictions(){
        this.jTextFieldname.setDocument(new MaxLenghtString(new Values().MAX25));
        this.jTextFieldSurname.setDocument(new MaxLenghtString(new Values().MAX25));
        this.jTextFieldEmail.setDocument(new MaxLenghtString(new Values().MAX40));
        this.jTextFieldPhone.setDocument(new MaxLenghtString(new Values().PHONE_NAC_MAX9));
        this.jTextFieldAddress.setDocument(new MaxLenghtString(new Values().MAX40));
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ListStaff listEmployee) {
        this.listEmployee = listEmployee.getListStaff();
        this.setRestrictions();
    }

    public boolean getButtonGroup1() {
        return buttonGroupIsManager.isSelected(jRadioButtonBoss.getModel());
    }

    public void setButtonGroup1(boolean type) {
        this.buttonGroupIsManager.setSelected(jRadioButtonBoss.getModel(), type);
    }

    public Calendar getjDateChooserBornDate() {
        return jDateChooserBornDate.getCalendar();
    }

    public void setBornDate(Calendar jDateChooserBornDate) {
        this.jDateChooserBornDate.setCalendar(jDateChooserBornDate);
    }

    public String getAddress() {
        return jTextFieldAddress.getText();
    }

    public void setAddress(String Address) {
        this.jTextFieldAddress.setText(Address);
    }

    public String getEmail(){
        return jTextFieldEmail.getText();
    }

    public void setEmail(String Email) {
        this.jTextFieldEmail.setText(Email);
    }

    public String getPhone() {
        return jTextFieldPhone.getText();
    }

    public void setPhone(int Phone) {
        this.jTextFieldPhone.setText(String.valueOf(Phone));
    }

    public String getSurname() {
        return jTextFieldSurname.getText();
    }

    public void setSurname(String Surname) {
        this.jTextFieldSurname.setText(Surname);
    }

    public String getNameEmployee() {
        return jTextFieldname.getText();
    }

    public void setname(String nameEmployee) {
        this.jTextFieldname.setText(nameEmployee);
    }
    
    public JComboBox getjComboBoxListShops() {
        return jComboBoxListShops;
    }

    public void setjComboBoxListShops(JComboBox jComboBoxListShops) {
        this.jComboBoxListShops = jComboBoxListShops;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getListShop() {
        return listShops;
    }

    public void setListShop(ListShops listShop) {
        this.listShops = listShop.getListShop();
        this.jComboBoxListShops.setModel(new DefaultComboBoxModel(this.listShops.toArray()));
        this.jComboBoxListShops.setSelectedIndex(-1);
    }
    
    public void setElementEmployee(int numemployee){
        this.numElementEmployee=numemployee;
        this.employee=listEmployee.get(numemployee);
        this.setName(this.employee.getName());
        this.setSurname(this.employee.getSurname());
        this.setAddress(this.employee.getAddress());
        this.setBornDate(this.employee.getDateBorn());
        this.setEmail(this.employee.getEmail());
        this.jRadioButtonBoss.setEnabled(true);
        this.jRadioButtonEmployee.setEnabled(true);
        this.setButtonGroup1(this.employee.isIsmanager());
        this.setPhone(this.employee.getPhone());
        this.jComboBoxListShops.setSelectedIndex(-1);
        this.repaint();
    }
    
    public void setDefault(){
        this.setName("No hay un emplado selecionado");
        this.setSurname("No hay un emplado selecionado");
        this.setAddress("No hay un emplado selecionado");
        Calendar time= Calendar.getInstance();
        time.setTimeInMillis(System.currentTimeMillis());
        this.setBornDate(time);
        this.setEmail("No hay un empleado selecionado");
        this.jRadioButtonBoss.setEnabled(false);
        this.jRadioButtonEmployee.setEnabled(false);
        this.jComboBoxListShops.setRenderer(new ListRenderShops());
        this.jComboBoxListShops.setSelectedIndex(-1);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupIsManager = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxListShops = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonEmployee = new javax.swing.JRadioButton();
        jRadioButtonBoss = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserBornDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jToggleButtonSelectModify = new javax.swing.JToggleButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel8.setText("Tienda:");

        buttonGroupIsManager.add(jRadioButtonEmployee);
        jRadioButtonEmployee.setText("Empleado");

        buttonGroupIsManager.add(jRadioButtonBoss);
        jRadioButtonBoss.setText("Jefe");

        jLabel7.setText("Jefe/Empleado:");

        jLabel6.setText("E-mail:");

        jLabel5.setText("Teléfono:");

        jLabel4.setText("Dirección:");

        jLabel3.setText("Fecha de Nacimiento:");

        jLabel2.setText("Apellidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldname)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldSurname)
                        .addComponent(jLabel3)
                        .addComponent(jDateChooserBornDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldAddress)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldPhone)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxListShops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonBoss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonEmployee)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserBornDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBoss)
                    .addComponent(jRadioButtonEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxListShops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jToggleButtonSelectModify.setText("Consultar");
        jToggleButtonSelectModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSelectModifyActionPerformed(evt);
            }
        });

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButtonSelectModify, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete)
                    .addComponent(jToggleButtonSelectModify))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonSelectModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSelectModifyActionPerformed
        if(jToggleButtonSelectModify.isSelected()){
            this.actionModify();
        }else{

            this.actionSelect();

        }
    }//GEN-LAST:event_jToggleButtonSelectModifyActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        listEmployee.add(numElementEmployee, employee);
        listEmployee.remove(numElementEmployee+1);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        this.listEmployee.remove(this.numElementEmployee);
        this.setDefault();
    }//GEN-LAST:event_jButtonDeleteActionPerformed
        private void actionSelect(){
        jToggleButtonSelectModify.setText("Consultar");
        jToggleButtonSelectModify.setSelected(false);
        this.jButtonSave.setEnabled(false);
        this.jButtonDelete.setEnabled(true);
    }
    private void actionModify(){
        jToggleButtonSelectModify.setText("Modificar");
        jToggleButtonSelectModify.setSelected(true);
        this.jButtonSave.setEnabled(true);
        this.jButtonDelete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupIsManager;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxListShops;
    private com.toedter.calendar.JDateChooser jDateChooserBornDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBoss;
    private javax.swing.JRadioButton jRadioButtonEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JToggleButton jToggleButtonSelectModify;
    // End of variables declaration//GEN-END:variables
}
