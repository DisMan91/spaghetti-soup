/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_quiz_app.q;

import org.jfugue.player.Player;

/**
 *
 * @author MD Design
 */
public class Tutorial extends javax.swing.JFrame {
    String[]tutorials={"tut1","tut2","tut3","tut4","tut5"};
    String[]sounds={"C D","D E","E F","B A","A C"}; //""
    String[]titles = {"Java keywords and Classes","Printing an Outcome", "Primitive Types", "Conditions", "Libraries"};
    int index=0;
    Player sound = new Player();
    

    /**
     * Creates new form Tutorial
     */
    public Tutorial() {
        initComponents();
       jButton_Next_TActionPerformed(null);
        
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
        jPanel_Title_Container = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jPanel_T_Container = new javax.swing.JPanel();
        Lbl_Tut = new javax.swing.JLabel();
        jButton_Next_T = new javax.swing.JButton();
        jButton_Goto_Ex = new javax.swing.JButton();
        jButton_Sound = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Title_Container.setBackground(new java.awt.Color(204, 204, 255));

        jLabel_Title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Title");

        javax.swing.GroupLayout jPanel_Title_ContainerLayout = new javax.swing.GroupLayout(jPanel_Title_Container);
        jPanel_Title_Container.setLayout(jPanel_Title_ContainerLayout);
        jPanel_Title_ContainerLayout.setHorizontalGroup(
            jPanel_Title_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Title_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel_Title_ContainerLayout.setVerticalGroup(
            jPanel_Title_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Title_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_T_Container.setBackground(new java.awt.Color(204, 255, 255));

        Lbl_Tut.setBackground(new java.awt.Color(204, 204, 204));
        Lbl_Tut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Tut.setText("Tutorial");
        Lbl_Tut.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel_T_ContainerLayout = new javax.swing.GroupLayout(jPanel_T_Container);
        jPanel_T_Container.setLayout(jPanel_T_ContainerLayout);
        jPanel_T_ContainerLayout.setHorizontalGroup(
            jPanel_T_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_T_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Tut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_T_ContainerLayout.setVerticalGroup(
            jPanel_T_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_T_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Tut, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Next_T.setBackground(new java.awt.Color(0, 204, 255));
        jButton_Next_T.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Next_T.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_T.setText("Next");
        jButton_Next_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_TActionPerformed(evt);
            }
        });

        jButton_Goto_Ex.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Goto_Ex.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton_Goto_Ex.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Goto_Ex.setText("Go To Exercises");
        jButton_Goto_Ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Goto_ExActionPerformed(evt);
            }
        });

        jButton_Sound.setBackground(new java.awt.Color(0, 102, 204));
        jButton_Sound.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Sound.setForeground(new java.awt.Color(0, 204, 204));
        jButton_Sound.setText("Listen");
        jButton_Sound.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SoundActionPerformed(evt);
            }
        });

        jButton_menu.setBackground(new java.awt.Color(255, 51, 51));
        jButton_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_menu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_menu.setText("Back to Menu");
        jButton_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_Title_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_T_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Sound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Next_T, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Goto_Ex)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel_Title_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_T_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Sound, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Next_T, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Goto_Ex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_TActionPerformed
 //System.out.println(evt);
        if(jButton_Next_T.getText().equals("Restart The Tutorial")){
     jButton_Next_T.setText("Next");
     index=0;
 }
 
 if(index == tutorials.length){
    //display user score
    jLabel_Title.setText("End");
  Lbl_Tut.setText("End Of Tutorial. Go to the exercises to test your Knowledge");
  jButton_Goto_Ex.setEnabled(true);
  jButton_Sound.setEnabled(false);


  jButton_Next_T.setText("Restart The Tutorial");
 }  
else{
        
// display next q
         
        Lbl_Tut.setText(tutorials[index]);
        jLabel_Title.setText(titles[index]);
        jButton_Goto_Ex.setEnabled(false);
        jButton_Sound.setEnabled(true);
       /* if(evt!=null){
            index++;
        }*/
       index++;
       

        
      if(index == tutorials.length-1){
      jButton_Next_T.setText("Finish");
      }
 }

 
    }//GEN-LAST:event_jButton_Next_TActionPerformed

    private void jButton_Goto_ExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Goto_ExActionPerformed
        // TODO add your handling code here:
    Quiz_Form quizitem=new Quiz_Form();
    quizitem.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jButton_Goto_ExActionPerformed

    private void jButton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_menuActionPerformed
Menu menitem=new Menu();
    menitem.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton_menuActionPerformed

    private void jButton_SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SoundActionPerformed
        // TODO add your handling code here:
        sound.play(sounds[index-1]); 
       // System.out.println(index);
    }//GEN-LAST:event_jButton_SoundActionPerformed

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
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tutorial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Tut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Goto_Ex;
    private javax.swing.JButton jButton_Next_T;
    private javax.swing.JButton jButton_Sound;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel_T_Container;
    private javax.swing.JPanel jPanel_Title_Container;
    // End of variables declaration//GEN-END:variables
}

      