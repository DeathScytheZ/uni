/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author deathscythe
 */
public class Calculator extends javax.swing.JFrame {

    String Ans = "";
    String operation = "";
    
    float result = 0;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        Button1.addActionListener(this::numberButtonPressed);
        Button2.addActionListener(this::numberButtonPressed);
        Button3.addActionListener(this::numberButtonPressed);
        Button4.addActionListener(this::numberButtonPressed);
        Button5.addActionListener(this::numberButtonPressed);
        Button6.addActionListener(this::numberButtonPressed);
        Button7.addActionListener(this::numberButtonPressed);
        Button8.addActionListener(this::numberButtonPressed);
        Button9.addActionListener(this::numberButtonPressed);
        Button0.addActionListener(this::numberButtonPressed);
        ButtonAdd.addActionListener(this::operationButtonPressed);
        ButtonSub.addActionListener(this::operationButtonPressed);
        ButtonDiv.addActionListener(this::operationButtonPressed);
        ButtonMult.addActionListener(this::operationButtonPressed);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonEqual = new javax.swing.JButton();
        ButtonAc = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        ButtonSub = new javax.swing.JButton();
        ButtonMult = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ButtonCos = new javax.swing.JButton();
        ButtonSin = new javax.swing.JButton();
        ButtonConv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button1.setText("1");

        Button2.setText("2");

        Button3.setText("3");

        Button4.setText("4");

        Button5.setText("5");

        Button6.setText("6");

        Button7.setText("7");

        Button8.setText("8");

        Button9.setText("9");

        Button0.setText("0");

        ButtonEqual.setText("=");
        ButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualActionPerformed(evt);
            }
        });

        ButtonAc.setText("AC");

        ButtonAdd.setText("+");

        ButtonSub.setText("-");

        ButtonMult.setText("*");

        ButtonDiv.setText("/");

        text1.setBackground(new java.awt.Color(153, 153, 153));
        text1.setFont(new java.awt.Font("Digital-7", 0, 48)); // NOI18N
        text1.setForeground(new java.awt.Color(51, 204, 0));

        jButton1.setText("jButton1");

        ButtonCos.setText("Cos");
        ButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCosActionPerformed(evt);
            }
        });

        ButtonSin.setText("Sin");
        ButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinActionPerformed(evt);
            }
        });

        ButtonConv.setText("Convert");
        ButtonConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(Button1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button6)
                                    .addComponent(Button3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Button8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonMult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonDiv))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonCos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSin, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonAc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSub))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ButtonConv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button1, Button2, Button3, Button6, Button8, Button9, ButtonAdd, ButtonDiv, ButtonMult, ButtonSub});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button0, Button4, Button5, Button7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonAc, ButtonSin, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCos)
                    .addComponent(ButtonSin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6)
                    .addComponent(ButtonAc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ButtonSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonConv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button1, Button2, Button3, Button6, Button8, Button9, ButtonEqual});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button0, Button5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button4, Button7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonAdd, ButtonDiv, ButtonMult, ButtonSub});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonAc, ButtonCos, ButtonSin, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConvActionPerformed
        new Convertions().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonConvActionPerformed

    private void ButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCosActionPerformed
        double num = Double.parseDouble(Ans);
        num = Math.toRadians(num);
        num = Math.cos(num);
        text1.setText(String.valueOf(num));
        Ans = "";
    }//GEN-LAST:event_ButtonCosActionPerformed

    private void ButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinActionPerformed
        double num = Double.parseDouble(Ans);
        num = Math.toRadians(num);
        num = Math.sin(num);
        text1.setText(String.valueOf(num));
        Ans = "";
    }//GEN-LAST:event_ButtonSinActionPerformed

    private void ButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {                                            
        calculate();   
        text1.setText(String.valueOf(result));
    }

    private void display(JButton button, JTextField textField) {
        Ans += button.getText();
        textField.setText(Ans);
    }

    private void numberButtonPressed(java.awt.event.ActionEvent evt) {
        javax.swing.JButton clickedButton = (javax.swing.JButton) evt.getSource();
        display(clickedButton, text1);  // Pass the clicked button and target text field
        
    }

    private void operationButtonPressed(java.awt.event.ActionEvent evt){
        javax.swing.JButton clickedButton = (javax.swing.JButton) evt.getSource();
        operation = clickedButton.getText();
        calculate();
    }
    
    private void calculate(){
        text1.setText("");
        switch(operation){
            case "+":
                result += Float.parseFloat(Ans);
                break;
                case "-":
                text1.setText("");
                result -= Float.parseFloat(Ans);
                break;
            case "*":
                text1.setText("");
                result *= Float.parseFloat(Ans);
                break;
            case "/":
                text1.setText("");
                result /= Float.parseFloat(Ans);
                break;
            case "cos":

                break;
            case "sin":
                
                break;
        }       
    Ans = "";
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAc;
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonConv;
    private javax.swing.JButton ButtonCos;
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonEqual;
    private javax.swing.JButton ButtonMult;
    private javax.swing.JButton ButtonSin;
    private javax.swing.JButton ButtonSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
