/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_quiz_app.q;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JButton;
import org.jfugue.player.Player;



/**
 *
 * @author MD Design
 */
public class Written_Answers extends javax.swing.JFrame {
    Scanner scan = new Scanner(System.in);
    String []wr_titles={"Title1","Title2","Title3","Title4","Title5"};
    String []wr_answers = {"Hello","If","int","println",">"};
    String []exercises = {"System.out.print("+"_____"+")","___"+"(y = 10){}","___"+"aNumber = 5;","System.out."+"_______"+"("+"Hello"+")","If (x=1){}else(x__1)"};
    int index = 0, correct = 0;
    Player soundScore = new Player();


    public Written_Answers() {
        initComponents();
        jButton_Nxt_QActionPerformed(null);   
  }
    public void getSelectedAnswer(JButton sbtn){ 
        System.out.println(sbtn.getText());
        System.out.println(wr_answers[index]);
        if(sbtn.getText().equals(wr_answers[index])){
        correct++;
        }
        index++;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_WQ_Container = new javax.swing.JPanel();
        jLabel_WQ = new javax.swing.JLabel();
        jPanel_Ex_Container = new javax.swing.JPanel();
        jLabel_ExText = new javax.swing.JLabel();
        answerTxt = new javax.swing.JTextField();
        jButton_Nxt_Q = new javax.swing.JButton();
        jButton_GoTo_Tutorials = new javax.swing.JButton();
        jButton_GoTo_Quiz = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_WQ_Container.setBackground(new java.awt.Color(255, 204, 0));
        jPanel_WQ_Container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_WQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_WQ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_WQ.setText("Title");

        javax.swing.GroupLayout jPanel_WQ_ContainerLayout = new javax.swing.GroupLayout(jPanel_WQ_Container);
        jPanel_WQ_Container.setLayout(jPanel_WQ_ContainerLayout);
        jPanel_WQ_ContainerLayout.setHorizontalGroup(
            jPanel_WQ_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WQ_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_WQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_WQ_ContainerLayout.setVerticalGroup(
            jPanel_WQ_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WQ_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_WQ, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Ex_Container.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_ExText.setText("Exercise text");

        answerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Ex_ContainerLayout = new javax.swing.GroupLayout(jPanel_Ex_Container);
        jPanel_Ex_Container.setLayout(jPanel_Ex_ContainerLayout);
        jPanel_Ex_ContainerLayout.setHorizontalGroup(
            jPanel_Ex_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Ex_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ExText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel_Ex_ContainerLayout.setVerticalGroup(
            jPanel_Ex_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Ex_ContainerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_Ex_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ExText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton_Nxt_Q.setBackground(new java.awt.Color(51, 204, 255));
        jButton_Nxt_Q.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Nxt_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Nxt_Q.setText("Next");
        jButton_Nxt_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Nxt_QActionPerformed(evt);
            }
        });

        jButton_GoTo_Tutorials.setBackground(new java.awt.Color(255, 204, 102));
        jButton_GoTo_Tutorials.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_GoTo_Tutorials.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GoTo_Tutorials.setText("Tutorials");
        jButton_GoTo_Tutorials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GoTo_TutorialsActionPerformed(evt);
            }
        });

        jButton_GoTo_Quiz.setBackground(new java.awt.Color(255, 204, 102));
        jButton_GoTo_Quiz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_GoTo_Quiz.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GoTo_Quiz.setText("Chapter 1");
        jButton_GoTo_Quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GoTo_QuizActionPerformed(evt);
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

        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_Ex_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_WQ_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_GoTo_Tutorials)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Nxt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_GoTo_Quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton_menu)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel_WQ_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Ex_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Nxt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GoTo_Tutorials, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GoTo_Quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Nxt_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Nxt_QActionPerformed
        // TODO add your handling code here:
    if(jButton_Nxt_Q.getText().equals("Restart")){
     jButton_Nxt_Q.setText("Next");
     jPanel_WQ_Container.setBackground(new java.awt.Color(255, 153, 0));
     index=0;
     correct=0;
 }
if(index == exercises.length){
    //display user score
  jLabel_WQ.setText("Your Score is:"+ correct +"/"+ exercises.length);
  jLabel_ExText.setText("You are Finished");
  answerTxt.setEnabled(false);
  answerTxt.setText("");
  jButton_GoTo_Tutorials.setEnabled(true);
  jButton_GoTo_Quiz.setEnabled(true);
   submitBtn.setEnabled(false);
  if(correct >= (float) exercises.length/2){ 
    jPanel_WQ_Container.setBackground(Color.green);
      soundScore.play("F F");
  }
  else{ jPanel_WQ_Container.setBackground(Color.red);
    soundScore.play("A A");
  }
  
  jButton_Nxt_Q.setText("Restart");
    
}
else{
    jLabel_WQ.setText(wr_titles[index]);
    jLabel_ExText.setText(exercises[index]);  
      answerTxt.setEnabled(true);
      jButton_GoTo_Tutorials.setEnabled(false);
      jButton_GoTo_Quiz.setEnabled(false);
      submitBtn.setEnabled(true);
      answerTxt.setText("");
    index++;

if(index == exercises.length){
      jButton_Nxt_Q.setText("Finish. Go to Results");
      }
    }

    }//GEN-LAST:event_jButton_Nxt_QActionPerformed


    private void jButton_GoTo_TutorialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GoTo_TutorialsActionPerformed
        // TODO add your handling code here:
    Tutorial tutitem=new Tutorial();
    tutitem.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jButton_GoTo_TutorialsActionPerformed

    private void jButton_GoTo_QuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GoTo_QuizActionPerformed
        // TODO add your handling code here:
    Quiz_Form quizitem=new Quiz_Form();
    quizitem.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jButton_GoTo_QuizActionPerformed

    private void jButton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_menuActionPerformed
        Menu menitem=new Menu();
        menitem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_menuActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed


    }//GEN-LAST:event_submitBtnActionPerformed

    private void answerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtActionPerformed


    }//GEN-LAST:event_answerTxtActionPerformed

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
answerTxt.setEnabled(false);
soundScore.play("A");

switch(answerTxt.getText()){

    case "Hello":
        correct++;
        break;
    case "If":
        correct++;
        break;
    case "int":
        correct++;
        break;
    case "println":
        correct++;
        break;
    case">":
        correct++;
        break;
}

/*if(answerTxt.getText().equals(wr_answers[0])){
    correct++;
}
if(answerTxt.getText().equals(wr_answers[1])){
    correct++;
}
if(answerTxt.getText().equals(wr_answers[2])){
    correct++;
}
if(answerTxt.getText().equals(wr_answers[3])){
    correct++;
}
if(answerTxt.getText().equals(wr_answers[4])){
    correct++;
}*/
    }//GEN-LAST:event_submitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Written_Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Written_Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Written_Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Written_Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Written_Answers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTxt;
    private javax.swing.JButton jButton_GoTo_Quiz;
    private javax.swing.JButton jButton_GoTo_Tutorials;
    private javax.swing.JButton jButton_Nxt_Q;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JLabel jLabel_ExText;
    private javax.swing.JLabel jLabel_WQ;
    private javax.swing.JPanel jPanel_Ex_Container;
    private javax.swing.JPanel jPanel_WQ_Container;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}