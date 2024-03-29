/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import abstractFactory.AbstractFactory;
import component.fields.AbstractPanelInput;
import component.fields.PanelInputComboBox;
import component.fields.PanelInputComboBoxes;
import component.fields.PanelInputTextFields;
import component.fields.PanelInputRadioButton;
import component.fields.PanelInputText;
import abstractFactory.impl.*;
import javax.swing.JComboBox;

public class FrmCustom extends javax.swing.JDialog {

    public FrmCustom() {
        initComponents();
        prepareView();
        changeConfig();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbConfiguration = new javax.swing.JLabel();
        cmbConfig = new javax.swing.JComboBox<>();
        lbFirstName = new javax.swing.JLabel();
        cmbFirstName = new javax.swing.JComboBox<>();
        lbLastName = new javax.swing.JLabel();
        cmbLastName = new javax.swing.JComboBox<>();
        cmbGender = new javax.swing.JComboBox<>();
        lbGender = new javax.swing.JLabel();
        cmbDate = new javax.swing.JComboBox<>();
        lbDate = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbConfiguration.setText("Configuration: ");

        cmbConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConfigActionPerformed(evt);
            }
        });

        lbFirstName.setText("First name: ");

        lbLastName.setText("Last name: ");

        lbGender.setText("Gender: ");

        lbDate.setText("Date:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFirstName)
                            .addComponent(lbLastName)
                            .addComponent(lbGender)
                            .addComponent(lbDate)
                            .addComponent(lbConfiguration))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGender, 0, 323, Short.MAX_VALUE)
                            .addComponent(cmbDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLastName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbFirstName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbConfig, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfiguration)
                    .addComponent(cmbConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName)
                    .addComponent(cmbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastName)
                    .addComponent(cmbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConfigActionPerformed
        changeConfig();
    }//GEN-LAST:event_cmbConfigActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        AbstractPanelInput panelFirstName = (AbstractPanelInput) cmbFirstName.getSelectedItem();
        AbstractPanelInput panelLastName = (AbstractPanelInput) cmbLastName.getSelectedItem();
        AbstractPanelInput panelGender = (AbstractPanelInput) cmbGender.getSelectedItem();
        AbstractPanelInput panelDate = (AbstractPanelInput) cmbDate.getSelectedItem();

        FrmPerson frmPerson = new FrmPerson(panelFirstName, panelLastName, panelGender, panelDate);
        frmPerson.setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<Object> cmbConfig;
    private javax.swing.JComboBox<component.fields.AbstractPanelInput> cmbDate;
    private javax.swing.JComboBox<component.fields.AbstractPanelInput> cmbFirstName;
    private javax.swing.JComboBox<component.fields.AbstractPanelInput> cmbGender;
    private javax.swing.JComboBox<component.fields.AbstractPanelInput> cmbLastName;
    private javax.swing.JLabel lbConfiguration;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLastName;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        setLocationRelativeTo(null);
        prepareCmbFirstName();
        prepareCmbLastName();
        prepareCmbGender();
        prepareCmbDate();
        prepareCmbConfig();
    }

    private void prepareCmbConfig() {
        cmbConfig.addItem(new ConcreteFactory1());
        cmbConfig.addItem(new ConcreteFactory2());
        cmbConfig.addItem(new ConcreteFactory3());
        cmbConfig.addItem("Custom");
        cmbConfig.setSelectedIndex(0);
    }

    private void prepareCmbFirstName() {
        cmbFirstName.addItem(new PanelInputText(AbstractFactory.lbFIRSTNAME));
    }

    private void prepareCmbLastName() {
        cmbLastName.addItem(new PanelInputText(AbstractFactory.lbLASTNAME));
    }

    private void prepareCmbGender() {
        cmbGender.addItem(new PanelInputText(AbstractFactory.lbGENDER));
        cmbGender.addItem(new PanelInputComboBox(AbstractFactory.lbGENDER));
        cmbGender.addItem(new PanelInputRadioButton(AbstractFactory.lbGENDER));
    }

    private void prepareCmbDate() {
        cmbDate.addItem(new PanelInputText(AbstractFactory.lbDATE));
        cmbDate.addItem(new PanelInputTextFields(AbstractFactory.lbDATE));
        cmbDate.addItem(new PanelInputComboBoxes(AbstractFactory.lbDATE));
    }

    private void enableComboBoxes(boolean enabled) {
        cmbGender.setEnabled(enabled);
        cmbFirstName.setEnabled(enabled);
        cmbLastName.setEnabled(enabled);
        cmbDate.setEnabled(enabled);
    }

    private void setSelectedComboBoxValue(JComboBox cmbBox, AbstractPanelInput abstractPanelInput) {
        for (int i = 0; i < cmbBox.getItemCount(); i++) {
            if (cmbBox.getItemAt(i).equals(abstractPanelInput)) {
                cmbBox.setSelectedItem(cmbBox.getItemAt(i));
                return;
            }
        }
        cmbBox.setSelectedIndex(0);
    }

    private void changeConfig() {
        Object config = cmbConfig.getSelectedItem();
        
        if (config instanceof AbstractFactory) {
            AbstractFactory factory = (AbstractFactory) config;
            enableComboBoxes(true);

            setSelectedComboBoxValue(cmbFirstName, factory.createPanelInputFirstName());
            setSelectedComboBoxValue(cmbLastName, factory.createPanelInputLastName());
            setSelectedComboBoxValue(cmbGender, factory.createPanelInputGender());
            setSelectedComboBoxValue(cmbDate, factory.createPanelInputDate());

            enableComboBoxes(false);
        } else {
            enableComboBoxes(true);
        }
    }
}
