
package tela;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Telajogo extends javax.swing.JFrame {
   
 int valor=1;
 int ponto=0; 
    
  
 
    public Telajogo() {
        initComponents();
         botaosim.setVisible(false);
         botaonao.setVisible(false);
         continuar.setVisible(false);
    }
   
//configuração dos botões
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        botaonao = new javax.swing.JButton();
        botaosim = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("testadormacho");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        texto1.setForeground(new java.awt.Color(255, 255, 255));
        texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto1.setText("Pronto para as perguntas?");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 160));

        texto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto2.setText("<html>Este app é apenas um teste sobre níveis de ansiedade<html>");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 370, 120));
        texto2.getAccessibleContext().setAccessibleName("");

        continuar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 140, 60));

        botaonao.setBackground(Color.gray);
        botaonao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaonao.setText("Não");
        botaonao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaonaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaonao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 140, 60));

        botaosim.setBackground(Color.gray
        );
        botaosim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaosim.setText("Sim");
        botaosim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosimActionPerformed(evt);
            }
        });
        getContentPane().add(botaosim, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, 60));

        botao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botao1.setText("Começar");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 60));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Acções do botão continuar
    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
       texto2.setVisible(false);
       botao1.setVisible(false);
       botaosim.setVisible(true);
       botaonao.setVisible(true);
       continuar.setVisible(true);
       texto1.setText("<html>Você sente tensôes musculares ?<html>");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao1MouseClicked
    
    }//GEN-LAST:event_botao1MouseClicked
//ações botão sim
    private void botaosimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosimActionPerformed
   valor++;
    ponto++;
    botaosim.setBackground(Color.BLUE);
     botaonao.setBackground(Color.gray);
    }//GEN-LAST:event_botaosimActionPerformed
//ações botão não
    private void botaonaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaonaoActionPerformed
   valor++;
   botaonao.setBackground(Color.RED);
   botaosim.setBackground(Color.gray);
    }//GEN-LAST:event_botaonaoActionPerformed
  //ações do botão continuar
    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
      botaonao.setBackground(Color.gray);
      botaosim.setBackground(Color.gray);
            switch(valor){
                
                
                case 2:
                     texto1.setText("<html>Você se preocupa em  excesso?<html>");
                    break;
                case 3:
                    texto1.setText("<html>Você sente inquietação constante?<html>");
                    break;
                case 4:
                    texto1.setText("<html>Você é perfeccionista?<html>");
                    break;
                case 5:
                    texto1.setText("<html>Você tem problemas de insônia?<html>");
                    break;
                case 6:
                    texto1.setText("<html>Você se sente facilmente irritado/a?<html>");
                    break;
                case 7:
                    texto1.setText("<html>Você tem dificuldade de relaxar?<html>");
                    break;
                case 8:
                    texto1.setText("<html>Você se sente cansado/a excessivamente?<html>");
                    break;
                case 9:
                    texto1.setText("<html>Você sente falta de ar constantemente ?<html>");
                    break;
                case 10:
                    texto1.setText("<html>Você tem agitações ou movimentos repetitivos no seu corpo ?<html>");
                    break;
                  
            } 
          //calcular o resultado
          if(valor>10){
         botaosim.setVisible(false);
         botaonao.setVisible(false);
         continuar.setVisible(false);
         texto2.setVisible(true);
             if(ponto>=7){
            texto1.setText("<html>Você tem ansiedade<html>");  
            fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ancioso.jpg")));
            texto2.setText("<html>Procurar uma ajuda profissional,meditação e atividade físíca podem ajudar<html>"); 
          }
          else if(ponto>5){
              texto1.setText("<html>Você é meio ansioso<html>");
              fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meio.jpg")));
              texto2.setText("<html>Procure escutar músicas,descansar um pouco e fazer alongamentos<html>");
          } else {
              texto1.setText("<html>Você está bem<html>");
              fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/normal.jpg")));
              texto2.setText("<html>Entretanto ainda é importante cuidar da saúde física e mental<html>");
            }
                 
          }
    }//GEN-LAST:event_continuarActionPerformed
   
   
    //classe principal
public static void main(String args[]) {
     
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Telajogo().setVisible(true);
           
      
             }   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botaonao;
    private javax.swing.JButton botaosim;
    private javax.swing.JButton continuar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
