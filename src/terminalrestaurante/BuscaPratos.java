package terminalrestaurante;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class BuscaPratos extends javax.swing.JDialog {

    int codProdutoSelecionado;
    TableRowSorter<TableModel> sorter;

    public int getCodProdutoSelecionado() {
        return codProdutoSelecionado;
    }

    public BuscaPratos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        this.setTitle("Buscar Pratos de Comida");

        initComponents();
        insereDados();

        TableModel model = jTable1.getModel();
        sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBtnSair = new javax.swing.JButton();
        jBtnSelecionar = new javax.swing.JButton();
        jLblBusca = new javax.swing.JLabel();
        jTFbusca = new javax.swing.JTextField();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLblTitulo.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLblTitulo.setText("Cardápio");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Prato", "Valor", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JBtnSair.setText("Sair");
        JBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSairActionPerformed(evt);
            }
        });

        jBtnSelecionar.setText("Selecionar");
        jBtnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSelecionarActionPerformed(evt);
            }
        });

        jLblBusca.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLblBusca.setText("Buscar Pratos:");

        jTFbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscaKeyReleased(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAdd.setText("Adicionar Novo");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBtnSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblBusca)
                        .addGap(18, 18, 18)
                        .addComponent(jTFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblBusca)
                    .addComponent(jTFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSelecionar)
                    .addComponent(JBtnSair)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_JBtnSairActionPerformed

    private void jBtnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSelecionarActionPerformed
        this.codProdutoSelecionado = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        dispose();
    }//GEN-LAST:event_jBtnSelecionarActionPerformed

    private void jTFbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscaKeyReleased
        String produto = jTFbusca.getText().trim();

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        filters.add(RowFilter.regexFilter("(?i)" + produto, 1));

        sorter.setRowFilter(RowFilter.andFilter(filters));
    }//GEN-LAST:event_jTFbuscaKeyReleased

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        String cod = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String query = "DELETE FROM pratosComida WHERE cod=" + cod + ";";

        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este Prato?");

        if (op == 0) {
            try {
                Statement stmt = Conexao.conecta().createStatement();
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Registro excluido com sucesso!\n");
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada.");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        String cod = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String nomePrato = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String valor = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tamanho = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        
        EditarPratos editarPratos = new EditarPratos(null, true);
        editarPratos.recebeDados(cod, nomePrato, valor, tamanho);
        editarPratos.setVisible(true);
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        AddPratos addPratos = new AddPratos(null, true);
        addPratos.setVisible(true);
    }//GEN-LAST:event_jBtnAddActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            BuscaPratos dialog = new BuscaPratos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnSelecionar;
    private javax.swing.JLabel jLblBusca;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbusca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void insereDados() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        try {
            Statement stmt = Conexao.conecta().createStatement();
            String query = "SELECT * FROM pratosComida;";
            ResultSet resultados = stmt.executeQuery(query);

            while (resultados.next()) {
                modelo.addRow(
                        new Object[]{
                            resultados.getString("cod"),
                            resultados.getString("nomePrato"),
                            resultados.getDouble("valor"),
                            resultados.getString("tamanho"),}
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n" + ex.getMessage());
        }
    }
}
