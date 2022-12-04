package terminalrestaurante;

import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class BuscaClientes extends javax.swing.JDialog {

    int codSelecionado;
    TableRowSorter<TableModel> sorter;

    public int getCodSelecionado() {
        return codSelecionado;
    }

    public BuscaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        this.setTitle("Buscar Clientes");

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFbusca = new javax.swing.JTextField();
        jBtnSelecionado = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "CPF", "Endereço"
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

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Buscar Cliente:");

        jTFbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscaKeyReleased(evt);
            }
        });

        jBtnSelecionado.setText("Selecionar");
        jBtnSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSelecionadoActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSelecionado)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnSelecionado)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscaKeyReleased
        String nome = jTFbusca.getText().trim();

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        filters.add(RowFilter.regexFilter("(?i)" + nome, 1));

        sorter.setRowFilter(RowFilter.andFilter(filters));
    }//GEN-LAST:event_jTFbuscaKeyReleased

    private void jBtnSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSelecionadoActionPerformed
        this.codSelecionado = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        dispose();
    }//GEN-LAST:event_jBtnSelecionadoActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        String cod = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String query = "DELETE FROM clientes WHERE cod=" + cod + ";";

        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este Cliente?");

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
        String nome = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String cpf = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String endereco = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        
        EditarCliente editarCliente = new EditarCliente(null, true);
        editarCliente.recebeDados(cod, nome, cpf, endereco);
        editarCliente.setVisible(true);
        
    }//GEN-LAST:event_jBtnEditarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            BuscaClientes dialog = new BuscaClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSelecionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbusca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void insereDados() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        try {
            Statement stmt = Conexao.conecta().createStatement();
            String query = "SELECT * FROM clientes;";
            ResultSet resultados = stmt.executeQuery(query);

            while (resultados.next()) {
                modelo.addRow(
                        new Object[]{
                            resultados.getString("cod"),
                            resultados.getString("nome"),
                            resultados.getString("cpf"),
                            resultados.getString("endereco"),}
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n" + ex.getMessage());
        }

    }
}
