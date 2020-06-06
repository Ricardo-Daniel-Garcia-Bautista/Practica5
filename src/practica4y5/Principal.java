/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4y5;

import Funciones.Distribuciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Mega_
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ber = new javax.swing.JButton();
        Num = new javax.swing.JTextField();
        Exito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Poisson = new javax.swing.JButton();
        Geometrica = new javax.swing.JButton();
        Hipergeometrica = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Pobla = new javax.swing.JTextField();
        Exp = new javax.swing.JButton();
        Norm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));

        Ber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ber.setText("Bernoulli");
        Ber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BerMouseClicked(evt);
            }
        });
        Ber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("No. casos / Media");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Probabilidad/Varianza");

        Poisson.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Poisson.setText("Poisson");
        Poisson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoissonMouseClicked(evt);
            }
        });

        Geometrica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Geometrica.setText("Geometrica");
        Geometrica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeometricaMouseClicked(evt);
            }
        });

        Hipergeometrica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Hipergeometrica.setText("Hipergeometrica");
        Hipergeometrica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HipergeometricaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Poblacion ");

        Exp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exp.setText("Exponencial");
        Exp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpMouseClicked(evt);
            }
        });

        Norm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Norm.setText("Normal");
        Norm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NormMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Geometrica, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Norm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Poisson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hipergeometrica, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pobla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pobla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Exito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Norm)
                    .addComponent(Geometrica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Poisson)
                        .addGap(18, 18, 18)
                        .addComponent(Hipergeometrica))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Exp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ber)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerMouseClicked
        // TODO add your handling code here:
        double a = Double.parseDouble(Num.getText());
        double b = Double.parseDouble(Exito.getText());
        int x = 0;
        int x1 = 1;
        int cont=0;
        double r;
        if(b<1){
            double Esperanza = a*b;
            double Varianza = a*b*(1-b);
            double Desviacion = Math.sqrt(Varianza);
         
          System.out.println("Esperanza: " + Esperanza + "Varianza: " + Varianza+ "Desviacion:  "+ Desviacion);
            int i;
          
          for(i=0; i<=99;i++ ){
              int v = Distribuciones.Bernoulli(b);
                
              cont++;
              if(v ==1){
                  System.out.println("Exito en numero" + cont + "es :" + v);
              } else {
                  System.out.println("Fracaso  en numero" + cont+ "es :" + v);
              }
          }
        } else {
          JOptionPane.showMessageDialog(null, "Error, la probabilidad debe de ser menor a 1");  
        }
        
           
        
     
            
    }//GEN-LAST:event_BerMouseClicked

    private void PoissonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoissonMouseClicked
        // TODO add your handling code here:
        
        double a = Double.parseDouble(Num.getText());
        double b = Double.parseDouble(Exito.getText());
        int cont=0;
        if(b<1){
        double Esperanza = a*b;
        double Varianza = Esperanza;
        double Desviacion = Math.sqrt(Varianza);
        
        System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
        int i;
        for(i=0; i<= 99; i++){
            int v = Distribuciones.Poisson(b);
            cont++;
            if(v>=1){
            System.out.println("Numero de intento"+ cont + "Exito "+ v);
            } else {
             System.out.println("Numero de intento"+ cont + "Fracaso");
            }
        }
        } else{
            JOptionPane.showMessageDialog(null,"Error, la probabilidad debe de ser menor a 1");
        }
    }//GEN-LAST:event_PoissonMouseClicked

    private void GeometricaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeometricaMouseClicked
        // TODO add your handling code here:
        double b = Double.parseDouble(Exito.getText());
        int cont = 0;
        if(b<1){
            double Esperanza = 1/b;
            double Varianza = 1-b/(b*b);
            if(Varianza>0){
            double Desviacion = Math.sqrt(Varianza);
            System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
            }
            else {
                Varianza = Varianza*-1;
                double Desviacion = Math.sqrt(Varianza);
                System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
            }
            
            int i = 0;
            
                do{
                    int v = Distribuciones.Geomtrica(b);
                    cont ++;
                    if(v==1){
                        System.out.println("Numero de intento"+ cont + "Exito "+ v);
                        i++;
                    } else {
                        
                    }
                } while(i !=1);
        } else{
            JOptionPane.showMessageDialog(null,"Error, la probabilidad debe de ser menor a 1");
        }
            
    }//GEN-LAST:event_GeometricaMouseClicked

    private void HipergeometricaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HipergeometricaMouseClicked
        // TODO add your handling code here:
        double b = Double.parseDouble(Exito.getText());
        double n = Double.parseDouble(Num.getText());
        double m = Double.parseDouble(Pobla.getText());
        
         if(b<1){
             
            double Esperanza = n*b/m;
            double Varianza = ((m-n)/m-1)*(Esperanza)*(1-(b/m));
            double Desviacion = Math.sqrt(Varianza);
            System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
         }
        
    }//GEN-LAST:event_HipergeometricaMouseClicked

    private void ExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpMouseClicked
        // TODO add your handling code here:
        double a = Double.parseDouble(Exito.getText());
        int i=0;
        int cont=0;
        if(a<1){
            
            double Esperanza = 1/a;
            double Varianza = 1/(a*a);
            double Desviacion = Math.sqrt(Varianza);
            System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
           for(i=0; i<=99; i++){
               double v = Distribuciones.Exponencial(a);
               cont++;
               System.out.println("Numero de intento"+ cont + "P "+ v);
               
           }
        } else{
            JOptionPane.showMessageDialog(null,"Error, la probabilidad debe de ser menor a 1");
        }
    }//GEN-LAST:event_ExpMouseClicked

    private void NormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NormMouseClicked
        // TODO add your handling code here:
        double a = Double.parseDouble(Exito.getText());
        double b = Double.parseDouble(Num.getText());
        int i=0;
        int cont =0;
        if(a<1){
            double Esperanza = a*b;
            double Varianza = a*b*(1-a);
            double Desviacion = Math.sqrt(Varianza);
            System.out.println("Esperanza: "+ Esperanza + "Varianza:  "+ Varianza+ "Desviacion:  "+ Desviacion);
            for(i=0; i<=99;i++){
                double x = Math.random();
                cont ++;
                System.out.println("Caso: "+ cont+ "es :"+ Distribuciones.Normal(x,a,b));
            }
        }
    }//GEN-LAST:event_NormMouseClicked

    private void BerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BerActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ber;
    private javax.swing.JTextField Exito;
    private javax.swing.JButton Exp;
    private javax.swing.JButton Geometrica;
    private javax.swing.JButton Hipergeometrica;
    private javax.swing.JButton Norm;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField Pobla;
    private javax.swing.JButton Poisson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
