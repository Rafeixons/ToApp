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
        jLabel3 = new javax.swing.JLabel();
        txf_quant = new javax.swing.JTextField();
        cb_lista = new javax.swing.JComboBox<>();
        jb_ok = new javax.swing.JButton();

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

        jLabel3.setText("Quantidade de tarefas cadastradas: ");

        txf_quant.setEditable(false);
        txf_quant.setBackground(new java.awt.Color(153, 153, 153));
        txf_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_quantActionPerformed(evt);
            }
        });

        jb_ok.setText("OK");
        jb_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txf_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jb_ok)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 428, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nomeActionPerformed

    private void jb_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adicionarActionPerformed
        String nome = txf_nome.getText();

        if (txf_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome para sua tarefa!");
            return;
        }

        for (int i = 0; i < cb_lista.getItemCount(); i++) {
            String vericar = cb_lista.getItemAt(i).toString();

            if (nome.equalsIgnoreCase(vericar)) {
                JOptionPane.showMessageDialog(null, "Tarefa com o mesmo nome já cadastrada!");
                return;
            }
        }

        cb_lista.addItem(txf_nome.getText());

        controller.adicionar(nome);
        String mensagem = "";
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

    private void rb_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_simActionPerformed

    }//GEN-LAST:event_rb_simActionPerformed

    private void rb_nãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_nãoActionPerformed

    private void txf_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_quantActionPerformed
        String tamanho = String.valueOf(lista.size());
        txf_quant.setText(tamanho);
    }//GEN-LAST:event_txf_quantActionPerformed

    private void jb_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_okActionPerformed

        String tamanho = String.valueOf(controller.tamanho());
        txf_quant.setText(tamanho);

        if (cb_lista.toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma atividade cadastrada!");
        } else {
            String[] opcoes = {"Listar", "Excluir"};

            int escolha = JOptionPane.showOptionDialog(
                    null,
                    cb_lista.getSelectedItem().toString(),
                    "Oque fazer com essa tarefa ? ", //Titulo da caixa
                    JOptionPane.DEFAULT_OPTION, //Botões desabilitados
                    JOptionPane.QUESTION_MESSAGE, //Icones
                    null, //Sempre null
                    opcoes, //Vetor 
                    opcoes[0]);                         //Inicio do vetor

            if (escolha == 0) {
                JOptionPane.showMessageDialog(null, controller.listar());
            } else if (escolha == 1) {
                String selecionado = cb_lista.getSelectedItem().toString();
                cb_lista.removeItem(selecionado);
                JOptionPane.showMessageDialog(null, "Tarefa excluida!");
            }


    }//GEN-LAST:event_jb_okActionPerformed
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarefaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_concluir;
    private javax.swing.JComboBox<String> cb_lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_adicionar;
    private javax.swing.JButton jb_ok;
    private javax.swing.JRadioButton rb_não;
    private javax.swing.JRadioButton rb_sim;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_quant;
    // End of variables declaration//GEN-END:variables
}
