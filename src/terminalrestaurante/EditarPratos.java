package terminalrestaurante;

import java.sql.*;
import javax.swing.JOptionPane;

public class EditarPratos extends javax.swing.JDialog {

    public EditarPratos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setTitle("Editar Pratos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLblTitulo = new javax.swing.JLabel();
        jTFnomePrato = new javax.swing.JTextField();
        jTFtamanho = new javax.swing.JTextField();
        jLblNomePrato = new javax.swing.JLabel();
        jLblValor = new javax.swing.JLabel();
        jLblTamanho = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnAtualiza = new javax.swing.JButton();
        jTFvalor = new javax.swing.JTextField();
        jLblCod = new javax.swing.JLabel();
        jTFcod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLblTitulo.setText("Editar Pratos");

        jLblNomePrato.setText("Nome Prato:");

        jLblValor.setText("Valor:");

        jLblTamanho.setText("Tamanho:");

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnAtualiza.setText("Atualizar");
        jBtnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizaActionPerformed(evt);
            }
        });

        jLblCod.setText("Cod:");

        jTFcod.setEditable(false);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnAtualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addGap(14, 14, 14))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblCod)
                            .addComponent(jLblNomePrato)
                            .addComponent(jLblValor)
                            .addComponent(jLblTamanho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFtamanho)
                            .addComponent(jTFnomePrato, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFvalor)
                            .addComponent(jTFcod))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLblTitulo)
                .addGap(138, 138, 138))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCod)
                    .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnomePrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNomePrato))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblValor)
                    .addComponent(jTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTamanho))
                .addGap(23, 23, 23)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnAtualiza))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtualizaActionPerformed
        if ("".equals(jTFnomePrato.getText()) || "".equals(jTFvalor.getText()) || "".equals(jTFtamanho.getText())) {
            JOptionPane.showMessageDialog(this, "Há Campos em Branco!");
        } else {
            String cod = jTFcod.getText();
            String nomePrato = jTFnomePrato.getText();
            String valor = jTFvalor.getText();
            String tamanho = jTFtamanho.getText();

            String query = "UPDATE `pratosComida` SET `cod` = '" + cod + "', `nomePrato` = '" + nomePrato + "', `valor` = '" + valor + "', `tamanho` = '" + tamanho + "' WHERE `pratosComida`.`cod` = " + cod + ";";

            try {
                Statement stmt = Conexao.conecta().createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(this, "Dados Registrados!");
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro de Sintaxe:\n" + ex.getMessage());
            }
        }
        this.dispose();
    }//GEN-LAST:event_jBtnAtualizaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            EditarPratos dialog = new EditarPratos(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jBtnAtualiza;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JLabel jLblCod;
    private javax.swing.JLabel jLblNomePrato;
    private javax.swing.JLabel jLblTamanho;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JLabel jLblValor;
    private javax.swing.JTextField jTFcod;
    private javax.swing.JTextField jTFnomePrato;
    private javax.swing.JTextField jTFtamanho;
    private javax.swing.JTextField jTFvalor;
    // End of variables declaration//GEN-END:variables

    public void recebeDados(String cod, String nomePrato, String valor, String tamanho) {
        jTFcod.setText(cod);
        jTFnomePrato.setText(nomePrato);
        jTFvalor.setText(valor);
        jTFtamanho.setText(tamanho);
    }
}