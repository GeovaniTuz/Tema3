/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class dlgInversa extends javax.swing.JFrame {
    


    DefaultTableModel md;//sirve para implementar un modelo a la tabla
    String data[][] = {};//se crea una matriz contenido de la tabla Ejemplo
    String cabeza[] = {"x", "x", "x"};//Emcabezado Ejemplo
    
    public dlgInversa() {
        initComponents();
         md = new DefaultTableModel(data, cabeza);//se le pasa el contenido = matriz y el encabezado 
        TablaInversa.setModel(md);//A la tabla original se le pasa el m
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        BotonGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizEntrada = new javax.swing.JTable();
        jbtnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInversa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Filas");

        jLabel2.setText("columnas");

        txtColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnasActionPerformed(evt);
            }
        });

        BotonGenerar.setText("Generar Matriz");
        BotonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarActionPerformed(evt);
            }
        });

        tblMatrizEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizEntrada);

        jbtnCalcular.setText("Mostrar Matriz Inversa");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        TablaInversa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaInversa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BotonGenerar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jbtnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCalcular)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnasActionPerformed

    private void BotonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarActionPerformed
        // TODO add your handling code here:
        
         int fila = 0, columna = 0;

        try {

            fila = Integer.parseInt(txtFilas.getText());
            columna = Integer.parseInt(txtColumnas.getText());

            int matrix[][] = new int[fila][columna];

            this.mostrarMatriz(matrix, fila, columna);

        } catch (Exception e) {
            if (fila > 0 && columna > 0) {

                JOptionPane.showMessageDialog(rootPane, "Rellene la matriz");

            } else {
                JOptionPane.showMessageDialog(rootPane, "ingrese numeros enteros, o mayores a cero");
            }
        }
        
    }//GEN-LAST:event_BotonGenerarActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        // TODO add your handling code here:
        
        try {

            int fila = Integer.parseInt(txtFilas.getText());
            int columna = Integer.parseInt(txtColumnas.getText());
            String matrizSalida[][] = new String[fila][columna];

            String datos[] = new String[columna];//arreglo sirve para el emcabezado de la tablaInversa
            for (int x = 0; x < columna; x++) {
                String cadena = Integer.toString(x);
                String cabeza = "x" + cadena;
                datos[x] = cabeza;
            }

            
            double matrizResultado[][] = matrizInversa(guardar());
                  //  matrizInversa(guardar());
            double matrizfinal[][] = matrizResultado;

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {

                    //System.out.println(matrizfinal[i][j]);
                    matrizSalida[i][j] = String.valueOf(matrizfinal[i][j]);
                }
            }
            md.setDataVector(matrizSalida, datos);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Perfect");
        }
        
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dlgInversa().setVisible(true);
            }
        });
    }
    
    
    
      public void mostrarMatriz(int matriz[][], int fila, int columna) {

        DefaultTableModel model = (DefaultTableModel) tblMatrizEntrada.getModel();

        model.setRowCount(fila);//filas
        model.setColumnCount(columna);//columnas

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tblMatrizEntrada.setValueAt(matriz[fila][columna], fila, columna);
            }
        }
    }

    public double[][] guardar() {

        int fila = Integer.parseInt(txtFilas.getText());
        int columna = Integer.parseInt(txtColumnas.getText());

        double[][] array_reg = new double[fila][columna];

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                array_reg[f][c] = Integer.parseInt((String) tblMatrizEntrada.getValueAt(f, c));
                 //System.out.println("numero = " + array_reg[f][c]);
            }

        }

        return array_reg;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGenerar;
    private javax.swing.JTable TablaInversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JTable tblMatrizEntrada;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
