/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import domain.Currency;
import exception.BankNotesNotFound;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import logic.*;


/**
 *
 * @author user
 */
public class FormMain extends javax.swing.JDialog implements DocumentListener {

    Node first;

    /**
     * Creates new form FmGlavna
     */
    public FormMain(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setAmount();
        setListener();
        setChain();
        addBanknotes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jrb20 = new javax.swing.JRadioButton();
        jrb25 = new javax.swing.JRadioButton();
        jrb30 = new javax.swing.JRadioButton();
        jrb40 = new javax.swing.JRadioButton();
        jrb50 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtReturns = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnMake = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt100 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt50 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt20 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coffe machine");

        buttonGroup1.add(jrb20);
        jrb20.setSelected(true);
        jrb20.setText(" Espreso(20)");
        jrb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb20ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb25);
        jrb25.setText(" Espreso with milk (25)");
        jrb25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb25ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb30);
        jrb30.setText("Cappuccino (30)");
        jrb30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb30ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb40);
        jrb40.setText("Irish coffe (40)");
        jrb40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb40ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb50);
        jrb50.setText("Hot chocolate (50)");
        jrb50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb50ActionPerformed(evt);
            }
        });

        jLabel1.setText("Price:");

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        jLabel2.setText("Amount:");

        txtAmount.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        txtReturns.setEditable(false);
        txtReturns.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        jLabel3.setText("Returns:");

        btnMake.setText("Make coffe");
        btnMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeActionPerformed(evt);
            }
        });

        jLabel4.setText("100");

        txt100.setEditable(false);

        jLabel5.setText("50");

        txt50.setEditable(false);

        jLabel6.setText("20");

        txt20.setEditable(false);

        jLabel7.setText("1");

        txt1.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb20)
                            .addComponent(jrb25)
                            .addComponent(jrb30)
                            .addComponent(jrb40)
                            .addComponent(jrb50))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtAmount)
                                .addGap(28, 28, 28)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMake, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMake)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb30ActionPerformed
        // TODO add your handling code here:
        setAmount();
    }//GEN-LAST:event_jrb30ActionPerformed

    private void jrb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb20ActionPerformed
        // TODO add your handling code here:
        setAmount();
    }//GEN-LAST:event_jrb20ActionPerformed

    private void jrb25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb25ActionPerformed
        // TODO add your handling code here:
        setAmount();
    }//GEN-LAST:event_jrb25ActionPerformed

    private void jrb40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb40ActionPerformed
        // TODO add your handling code here:
        setAmount();
    }//GEN-LAST:event_jrb40ActionPerformed

    private void jrb50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb50ActionPerformed
        // TODO add your handling code here:
        setAmount();
    }//GEN-LAST:event_jrb50ActionPerformed

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        try {
            checkEnoughMoney();
            Map<String, Integer> map = new HashMap() {
                {
                    put("100", 0);
                    put("50", 0);
                    put("20", 0);
                    put("1", 0);
                }
            };
            try {
                first.getCurrency(new Currency(Integer.parseInt(txtReturns.getText().trim())), map);
            } catch (BankNotesNotFound e) {
                throw e;
            } finally {

                txt100.setText(map.get("100") + "");
                txt50.setText(map.get("50") + "");
                txt20.setText(map.get("20") + "");
                txt1.setText(map.get("1") + "");
                

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMakeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMake;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jrb20;
    private javax.swing.JRadioButton jrb25;
    private javax.swing.JRadioButton jrb30;
    private javax.swing.JRadioButton jrb40;
    private javax.swing.JRadioButton jrb50;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt100;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtReturns;
    // End of variables declaration//GEN-END:variables

    private void setAmount() {
        clearFields();

        if (jrb20.isSelected()) {
            txtPrice.setText("20");
        }
        if (jrb25.isSelected()) {
            txtPrice.setText("25");
        }
        if (jrb30.isSelected()) {
            txtPrice.setText("30");
        }
        if (jrb40.isSelected()) {
            txtPrice.setText("40");
        }
        if (jrb50.isSelected()) {
            txtPrice.setText("50");
        }

    }

    private void setListener() {
        txtAmount.getDocument().addDocumentListener(this);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        setReturns();
    }

    private void setReturns() throws NumberFormatException {
        try {
            int price = Integer.parseInt(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());

            int kusur = amount - price;
            txtReturns.setText(kusur + "");
        } catch (Exception e) {
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        setReturns();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }

    private void clearFields() {
        txt100.setText("");
        txt50.setText("");
        txt20.setText("");
        txt1.setText("");
        txtReturns.setText("");
        txtAmount.setText("");
    }

    private void checkEnoughMoney() throws Exception {
        if (txtAmount.getText().isEmpty()) {
            throw new Exception("Amount is empty");
        }
        int amount = Integer.parseInt(txtAmount.getText().trim());
        int price = Integer.parseInt(txtPrice.getText().trim());

        if (amount < price) {
            throw new Exception("Amount < price");
        }
    }

    private void setChain() {
        Node node100 = new Node100();
        Node node50 = new Node50();
        Node node20 = new Node20();
        Node node1 = new Node1();

        node100.setNext(node50);
        node50.setNext(node20);
        node20.setNext(node1);
        node1.setNext(null);

        first = node100;
    }

    private void addBanknotes() {
        Node current = first;
        while (current != null) {
            if (current instanceof Node100) {
                current.addBanknotes(20);
            } else if (current instanceof Node50) {
                current.addBanknotes(20);
            } else if (current instanceof Node20) {
                current.addBanknotes(20);
            } else {
                current.addBanknotes(10);
            }

            current = current.getNext();
        }
    }
   
}