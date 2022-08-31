/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_quiz_app.q;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import org.jfugue.player.Player;
/**
 *
 * @author MD Design
 */
public class Quiz_Form extends javax.swing.JFrame{
    String[]questions = {
        "Question 1: What do we create by using public class Project1 ?",
        "Question 2: What does an app do when we use the command: "
            + "System.out.print() ?",
        "Question 3: What is an Integer ?",
        "Question 4: What is the following command: If(x>=0){} ?",
        "Question 5: Which library enables typing from keyboard ?"
    };
    //το τελευταίο αντικέιμενο ειναι η σωστή απάντηση
    //Tsekarisma apantisewn spo xristi
    String[][] options = {
        {"A library called project1","A method called Project1","A Project called 1","A class called Project1","A class called Project1"},    //Q1
        {"Prints the Screen","Enables printer","Prints on Screen","Copies files","Prints on Screen"},                                          //Q2
        {"A Primitive type","A Number","A Loop","A class","A Primitive type"},                                                         //Q3
        {"An addition","A division","A condition","A summary","A condition"},    //Q4
        {"JFrame","Scanner","JButton","JFugue","Scanner"}     //Q5
    };
int index = 0, correct = 0;
Player soundScore = new Player();
ButtonGroup bg = new ButtonGroup();
    /**
     * Creates new form Quiz_Form
     */
    public Quiz_Form() {
        initComponents();
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        jButton_Next_QActionPerformed(null);
    }
    
    public void getSelectedOption(JRadioButton rbtn){ 
        // get the selected value from  answer (radiobutton)
        //increase the index
        //disable radiobuttons
        //check if the user selected the right answer
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if(rbtn.getText().equals(options[index][4])){
        correct++;
        }
        index++;
        enableRbuttons(false);
    }
//enable or disable radiobuttons
    public void enableRbuttons(boolean yes_or_no){
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
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
        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();
        jButton_GoTo_Wr = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Q_Container.setBackground(new java.awt.Color(255, 153, 0));

        Lbl_Question.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Question1");

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRadioButton1_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2_.setText("jRadioButton2");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(0, 153, 204));
        jButton_Next_Q.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Next_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        jButton_GoTo_Wr.setBackground(new java.awt.Color(255, 153, 102));
        jButton_GoTo_Wr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_GoTo_Wr.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GoTo_Wr.setText("Go to Chapter 2");
        jButton_GoTo_Wr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GoTo_WrActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton1_, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_GoTo_Wr, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jRadioButton1_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_menu)
                    .addComponent(jButton_GoTo_Wr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton3_);
        soundScore.play("E");
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed

        getSelectedOption(jRadioButton2_);
        soundScore.play("E");
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton4_);
        soundScore.play("E");
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed

 if(jButton_Next_Q.getText().equals("Restart The Quiz")){
     jButton_Next_Q.setText("Next");
     jPanel_Q_Container.setBackground(new java.awt.Color(255, 153, 0));
     index=0;
     correct=0;
 }
if(index == questions.length){
    //display user score
  Lbl_Question.setText("Your Score is:"+ correct +"/"+ questions.length);
  jButton_GoTo_Wr.setEnabled(true);
  if(correct >= (float) questions.length/2){ 
      soundScore.play("C C");
    jPanel_Q_Container.setBackground(Color.green);
  }
  else{ jPanel_Q_Container.setBackground(Color.red);
  soundScore.play("A A");
 
  }
  
  jButton_Next_Q.setText("Restart The Quiz");
    
}
else{
    //enable radiobutton
enableRbuttons(true);
        
// display next q
        Lbl_Question.setText(questions[index]);
        jRadioButton1_.setText(options[index][0]);
        jRadioButton2_.setText(options[index][1]);
        jRadioButton3_.setText(options[index][2]);
        jRadioButton4_.setText(options[index][3]);
        jButton_GoTo_Wr.setEnabled(false);
        
      if(index == questions.length-1){
      jButton_Next_Q.setText("Finish. Go to Results");
      }
}
        //clear selection
        bg.clearSelection();
        
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
        //increment for the next question
        getSelectedOption(jRadioButton1_);
        soundScore.play("E");
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jButton_GoTo_WrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GoTo_WrActionPerformed
Written_Answers writem=new Written_Answers();
    writem.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jButton_GoTo_WrActionPerformed

    private void jButton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_menuActionPerformed
        Menu menitem=new Menu();
        menitem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Quiz_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_GoTo_Wr;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}