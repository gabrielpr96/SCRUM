/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncion;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabir
 */
public class VentanaElementosFuncionales extends javax.swing.JFrame {
    DefaultTableModel modeloTElementos = new DefaultTableModel();
    private ManejaElementoFuncional me;
    /**
     * Creates new form VentanaElementosFuncionales
     */
    public VentanaElementosFuncionales() {
        initComponents();
        me = new ManejaElementoFuncional();
        this.RellenaCaja();
        JTable tElementos = new JTable(modeloTElementos);
        this.dibujarTabla();
    }
    
    public void RellenaCaja(){
        this.jComboBoxElementos.removeAllItems();
        this.jComboBoxElementos.addItem("EE");
        this.jComboBoxElementos.addItem("SE");
        this.jComboBoxElementos.addItem("CE");
        this.jComboBoxElementos.addItem("FLI");
        this.jComboBoxElementos.addItem("FLE");
    }
    
    public void dibujarTabla(){
        this.jTableElementos.setModel(modeloTElementos);
        String[]columnasTablaElementos = {"Elemento funcional", "Nombre", "Nº Fich. Ref.", "Nº Dat. Elem."};
        modeloTElementos.setColumnIdentifiers(columnasTablaElementos);
        
        jTableElementos.getColumnModel().getColumn(0).setPreferredWidth(65);
        jTableElementos.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableElementos.getColumnModel().getColumn(2).setPreferredWidth(25);
        jTableElementos.getColumnModel().getColumn(3).setPreferredWidth(25);
        
        jTableElementos.getTableHeader().setResizingAllowed(false);
    }

    
    public void llenarTabla(){
        jTableElementos.setModel(modeloTElementos);
        ArrayList<ElementoFuncional> e = me.elementos();
        int numRegistros=e.size();
        Object [] columna = new Object[4];
        for(int i=0; i<numRegistros; i++){
            columna[0]=e.get(i).getElemento();
            columna[1]=e.get(i).getNombre();
            columna[2]=e.get(i).getNFich();
            columna[3]=e.get(i).getNDat();
            modeloTElementos.addRow(columna);
        }
    }
    
    public void vaciatablaElementos(){
        while(modeloTElementos.getRowCount()>0){
            modeloTElementos.removeRow(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxElementos = new javax.swing.JComboBox<>();
        jLabelElemento = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelFicheros = new javax.swing.JLabel();
        jTextFieldFicheros = new javax.swing.JTextField();
        jLabelDatos = new javax.swing.JLabel();
        jTextFieldDatos = new javax.swing.JTextField();
        jButtonAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableElementos = new javax.swing.JTable();
        jButtonComplejidad = new javax.swing.JButton();
        jLabelFicherosS = new javax.swing.JLabel();
        jTextFieldFicherosS = new javax.swing.JTextField();
        jLabelDatosS = new javax.swing.JLabel();
        jTextFieldDatosS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxElementos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxElementosActionPerformed(evt);
            }
        });

        jLabelElemento.setText("Elemento funcional: ");

        jLabelNombre.setText("Nombre: ");

        jLabelFicheros.setText("Número de ficheros relacionados: ");

        jLabelDatos.setText("Número de datos elementales: ");

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jTableElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Elemento Funcional", "Nombre", "Nº Fich. Rel.", "Nº Dat. Elem."
            }
        ));
        jScrollPane1.setViewportView(jTableElementos);

        jButtonComplejidad.setText("Complejidad");
        jButtonComplejidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplejidadActionPerformed(evt);
            }
        });

        jLabelFicherosS.setText("Número de ficheros relacionados (CE):");

        jLabelDatosS.setText("Número de datos elementales (CE):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFicheros)
                            .addComponent(jLabelDatos))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldFicheros)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelElemento)
                            .addComponent(jLabelNombre))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAñadir)
                            .addComponent(jButtonComplejidad)
                            .addComponent(jLabelFicherosS)
                            .addComponent(jLabelDatosS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFicherosS)
                            .addComponent(jTextFieldDatosS, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelElemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFicheros)
                            .addComponent(jTextFieldFicheros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDatos)
                            .addComponent(jTextFieldDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFicherosS)
                            .addComponent(jTextFieldFicherosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDatosS)
                            .addComponent(jTextFieldDatosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAñadir)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonComplejidad)))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxElementosActionPerformed
        
    }//GEN-LAST:event_jComboBoxElementosActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        
        String elemento = (String)this.jComboBoxElementos.getSelectedItem();
        String tipo = this.jTextFieldNombre.getText();
        int fich = Integer.parseInt(this.jTextFieldFicheros.getText());
        int datos = Integer.parseInt(this.jTextFieldDatos.getText());
        
        if(elemento.equals("CE")){
            int fichS = Integer.parseInt(this.jTextFieldFicherosS.getText());
            int datosS = Integer.parseInt(this.jTextFieldDatosS.getText());
            ElementoFuncional e = new ElementoFuncional(elemento, tipo, fich, datos);
            ElementoFuncional eS = new ElementoFuncional(elemento, tipo, fichS, datosS);
            me.anadeElemento(e);
            me.anadeElemento(eS);
        }
        else{
            ElementoFuncional e = new ElementoFuncional(elemento, tipo, fich, datos);
            me.anadeElemento(e); 
        }

        this.vaciatablaElementos();
        this.llenarTabla();

    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonComplejidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplejidadActionPerformed
        int indice = this.jTableElementos.getSelectedRow();
        String string = me.getComplejidadElemento(indice);
        System.out.println(string);
        String mensaje = "La complejidad del elemento funcional es " + string;
        int EEs = 0, EEm = 0, EEc = 0, Es = 0, SEm = 0, SEc = 0, FLIs = 0, FLIm = 0, FLIc = 0, FLEs = 0, FLEm = 0, FLEc = 0, CEs = 0, CEm = 0, CEc = 0, TEE = 0, TSE = 0, TFLI = 0, TFLE = 0, TCE = 0, T = 0;
        me.getPFNA(EEs, EEm, EEc, Es, SEm, SEc, FLIs, FLIm, FLIc, FLEs, FLEm, FLEc, CEs, CEm, CEc, TEE, TSE, TFLI, TFLE, TCE, T);
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_jButtonComplejidadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaElementosFuncionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaElementosFuncionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaElementosFuncionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaElementosFuncionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaElementosFuncionales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonComplejidad;
    private javax.swing.JComboBox<String> jComboBoxElementos;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDatosS;
    private javax.swing.JLabel jLabelElemento;
    private javax.swing.JLabel jLabelFicheros;
    private javax.swing.JLabel jLabelFicherosS;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableElementos;
    private javax.swing.JTextField jTextFieldDatos;
    private javax.swing.JTextField jTextFieldDatosS;
    private javax.swing.JTextField jTextFieldFicheros;
    private javax.swing.JTextField jTextFieldFicherosS;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
