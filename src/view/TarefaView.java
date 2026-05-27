
package view;

import model.TarefaModel;
import controller.TarefaController;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TarefaView extends javax.swing.JFrame {
    
    TarefaController controller = new TarefaController();
    ArrayList<TarefaModel> lista = new ArrayList<>();
    

    public TarefaView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_concluir = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        jb_adicionar = new javax.swing.JButton();
        rb_sim = new javax.swing.JRadioButton();
        rb_não = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_lista = new javax.swing.JTextArea();
        jb_listar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txf_quant = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txf_excluir = new javax.swing.JTextField();
        jb_excluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To Do List");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Tarefa"));
        jPanel1.setToolTipText("Cadastro de Tarefas");

        jLabel1.setText("Nome da Tarefa: ");

        txf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nomeActionPerformed(evt);
            }
        });

        jb_adicionar.setText("Adicionar");
        jb_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_adicionarActionPerformed(evt);
            }
        });

        btg_concluir.add(rb_sim);
        rb_sim.setText("Sim");
        rb_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_simActionPerformed(evt);
            }
        });

        btg_concluir.add(rb_não);
        rb_não.setText("Não");
        rb_não.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nãoActionPerformed(evt);
            }
        });

        jLabel2.setText("Ela foi concluida?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_adicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_não)
                            .addComponent(rb_sim)))
                    .addComponent(jLabel2))
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_adicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rb_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_não)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Tarefas"));
        jPanel2.setToolTipText("Cadastro de Tarefas");

        ta_lista.setColumns(20);
        ta_lista.setRows(5);
        jScrollPane1.setViewportView(ta_lista);

        jb_listar.setText("Listar Tarefas");
        jb_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade de tarefas cadastradas: ");

        txf_quant.setEditable(false);
        txf_quant.setBackground(new java.awt.Color(153, 153, 153));
        txf_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_quantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_listar)
                .addGap(158, 158, 158))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txf_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_listar)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 428, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Excluir Tarefa"));

        jb_excluir.setText("Excluir");
        jb_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_excluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome da Tarefa: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(txf_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_excluir)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_excluir)
                    .addComponent(jLabel4)
                    .addComponent(txf_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nomeActionPerformed

    private void jb_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adicionarActionPerformed
       String nome = txf_nome.getText();
       controller.adicionar(nome);
       String mensagem  = "";
       mensagem += "Tarefa Cadastrada";
       
       
       if (rb_sim.isSelected()) {
            controller.concluir(true);
            mensagem += "\nTarefa marcada como concluida!";
        }
       if (rb_não.isSelected()) {
            controller.concluir(false);
            mensagem += "\nTarefa em andamento!";
        }
       JOptionPane.showMessageDialog(null, mensagem);
       txf_nome.setText("");
    }//GEN-LAST:event_jb_adicionarActionPerformed

    private void jb_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarActionPerformed
          ta_lista.setText("");
        // Percorre a lista
        
        for(TarefaModel t : controller.listar()){
            ta_lista.append(t.toString());
            ta_lista.append("\n");            
        }
        
        String tamanho = String.valueOf(controller.tamanho());
        txf_quant.setText(tamanho);
    }//GEN-LAST:event_jb_listarActionPerformed

    private void rb_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_simActionPerformed
        
    }//GEN-LAST:event_rb_simActionPerformed

    private void rb_nãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_nãoActionPerformed

    private void txf_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_quantActionPerformed
       String tamanho = String.valueOf(lista.size());
        txf_quant.setText(tamanho);
    }//GEN-LAST:event_txf_quantActionPerformed

    private void jb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluirActionPerformed
       String nome = txf_excluir.getText().trim();
       controller.excluir(nome);
    }//GEN-LAST:event_jb_excluirActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarefaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_concluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_adicionar;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_listar;
    private javax.swing.JRadioButton rb_não;
    private javax.swing.JRadioButton rb_sim;
    private javax.swing.JTextArea ta_lista;
    private javax.swing.JTextField txf_excluir;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_quant;
    // End of variables declaration//GEN-END:variables
}
