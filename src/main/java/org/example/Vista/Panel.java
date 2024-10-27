/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.Vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date; 
import org.example.Controlador.Fechas;
import org.example.Modelos.Cliente;
import org.example.Modelos.Mesa;
import org.example.Modelos.Reserva;
import com.toedter.calendar.JDateChooser;


/**
 *
 * @author vic
 */
public class Panel extends javax.swing.JFrame {
private Cliente cliente1;
    /**
     * Creates new form Panel
     */
    public Panel() {

        initComponents();
        jDateChooser1.setMinSelectableDate(new Date());
    }
    public Panel(Cliente cliente1) {
        this.cliente1 = cliente1;
        initComponents();
        jDateChooser1.setMinSelectableDate(new Date());
    }






    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Horas2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        Ubicacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Consultar Disponibilidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa de 2", "Mesa de 4", "Mesa 6" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });


        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa de 2", "Mesa de 4", "Mesa 6" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });


        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/example/Vista/imagenes/Carta.jpg"))); // NOI18N

        jLabel2.setText("Escanee el QR para ver nuestra carta");

        jLabel3.setText("Seleccione la fecha");

        jLabel4.setText("Ingrese la hora");

        Horas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Horas2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/example/Vista/imagenes/OIG1-removebg-preview-removebg-p.png"))); // NOI18N

        jLabel5.setText("Número de mesa");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de mesa");

        jLabel1.setText("Seleccione la fecha");

        jLabel2.setText("Ingrese la hora");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("¿Es alérgico a algún ingrediente?");

        jLabel4.setText("Seleccione la mesa");

        jLabel5.setText("jLabel5");

        Ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4" }));
        Ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbicacionActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora");

        jLabel2.setText("Fecha");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()

                        .addGap(23, 23, 23)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(338, 338, 338)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Horas2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(145, Short.MAX_VALUE))

                        .addGap(61, 61, 61)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, 0, 120, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Horas)
                            .addComponent(Ubicacion, 0, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Horas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))

                .addGap(27, 27, 27)
                .addComponent(jButton2)

                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))

                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ubicacion))
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addGap(23, 23, 23))

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //recursos
      Fechas fechas=new Fechas();
      Cliente cliente=new Cliente();
      Mesa mesa=new Mesa();



        
        //extraemos los datos
        Date fechaSeleccionada = jDateChooser1.getDate();
        String hora=Horas.getText();

 
// Verificar si la fecha ha sido seleccionada
    if (fechaSeleccionada == null) {
        System.out.println("Error: No se ha seleccionado una fecha.");
        return;
    }

    // Verificar si la hora es válida
    if (!fechas.esHoraValida(hora)) {
        System.out.println("Error: La hora ingresada no es válida.");
        return;
    }

        
        
        int indiceUbicacion=Ubicacion.getSelectedIndex();

        
        switch (indiceUbicacion){

            case 0:
                mesa.setUbicacion("Ventana");
                break;

            case 1:
                mesa.setUbicacion("Barra");
                break;

                case 2:
                    mesa.setUbicacion("Afuera");
                    break;

            case 3:
                mesa.setUbicacion("Terraza");
                    break;
            default:
                mesa.setUbicacion(null);
                break;

        }
        



    int indice=jComboBox1.getSelectedIndex();
        switch(indice){

            case 0:
                mesa.setCapacidad(2);
                break;
            case 1:
                mesa.setCapacidad(4);
                break;
            case 2:
                mesa.setCapacidad(6);
                break;

            default:
                mesa.setCapacidad(0);
                break;



        }


        if(fechas.esHoraValida(hora)){

           //formateamos la hora
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime localTime = LocalTime.parse(hora, formatter);



            LocalDate fechaLocal = fechaSeleccionada.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();


            Reserva reserva = new Reserva(fechaLocal,localTime,mesa,cliente1);

            cliente.reservar(reserva);




        }else{

            System.out.println("Error al colocar la fecha");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PanelUsuario panelusuario=new PanelUsuario();
       panelusuario.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void Horas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Horas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Horas2ActionPerformed


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void UbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbicacionActionPerformed
        
    }//GEN-LAST:event_UbicacionActionPerformed


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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JTextField Horas;
    private javax.swing.JComboBox<String> Ubicacion;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;

    private javax.swing.JTextField jTextField1;

    private javax.swing.JLabel jLabel2;}

    // End of variables declaration//GEN-END:variables

}