package terminalrestaurante;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class VendaComida extends javax.swing.JFrame {

    static LinkedList<Pratos> produtos = new LinkedList<>();
    static LinkedList<Cliente> clientes = new LinkedList<>();

    public VendaComida() {
        initComponents();

        this.setTitle("Restaurante Mota");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTxtValorTotal = new javax.swing.JLabel();
        jTFValorTotal = new javax.swing.JTextField();
        jTxtDinheiro = new javax.swing.JLabel();
        jTFDinheiro = new javax.swing.JTextField();
        jTxtTroco = new javax.swing.JLabel();
        jTFTroco = new javax.swing.JTextField();
        jBtnAdiciona = new javax.swing.JButton();
        jBnCancelaVenda = new javax.swing.JButton();
        jBtnConfirmaVenda = new javax.swing.JButton();
        jTFQtd = new javax.swing.JTextField();
        jTxtQtd = new javax.swing.JLabel();
        jTFProduto = new javax.swing.JTextField();
        jTFCodProduto = new javax.swing.JTextField();
        jBtnBuscaProdutos = new javax.swing.JButton();
        jTxtCodProduto = new javax.swing.JLabel();
        jTFCliente = new javax.swing.JTextField();
        jTFCodCliente = new javax.swing.JTextField();
        jBtnBuscaClientes = new javax.swing.JButton();
        jTxtCodCliente = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdicionarClientes = new javax.swing.JMenu();
        jMenuAdicionarPratos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Prato", "Valor", "Porções", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBtnSair.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jBtnSair.setForeground(new java.awt.Color(102, 0, 102));
        jBtnSair.setText("Sair");
        jBtnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTxtValorTotal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtValorTotal.setText("Valor Total: R$");

        jTFValorTotal.setEditable(false);
        jTFValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTFValorTotal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTFValorTotal.setForeground(new java.awt.Color(201, 8, 0));

        jTxtDinheiro.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtDinheiro.setText("Dinheiro: R$");

        jTFDinheiro.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        jTxtTroco.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtTroco.setText("Troco: R$");

        jTFTroco.setEditable(false);
        jTFTroco.setBackground(new java.awt.Color(255, 255, 255));
        jTFTroco.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTFTroco.setForeground(new java.awt.Color(0, 152, 35));

        jBtnAdiciona.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jBtnAdiciona.setText("Adicionar");
        jBtnAdiciona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBtnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionaActionPerformed(evt);
            }
        });

        jBnCancelaVenda.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jBnCancelaVenda.setForeground(new java.awt.Color(201, 8, 0));
        jBnCancelaVenda.setText("Cancela Venda");
        jBnCancelaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201, 8, 0)));
        jBnCancelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnCancelaVendaActionPerformed(evt);
            }
        });

        jBtnConfirmaVenda.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jBtnConfirmaVenda.setForeground(new java.awt.Color(0, 152, 35));
        jBtnConfirmaVenda.setText("Confirma Venda");
        jBtnConfirmaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 35)));
        jBtnConfirmaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmaVendaActionPerformed(evt);
            }
        });

        jTxtQtd.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtQtd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTxtQtd.setText("Porções:");

        jTFProduto.setEditable(false);
        jTFProduto.setBackground(new java.awt.Color(255, 255, 204));

        jTFCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodProdutoKeyReleased(evt);
            }
        });

        jBtnBuscaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jBtnBuscaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscaProdutosActionPerformed(evt);
            }
        });

        jTxtCodProduto.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtCodProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTxtCodProduto.setText("Cod. Prato:");

        jTFCliente.setEditable(false);
        jTFCliente.setBackground(new java.awt.Color(255, 255, 204));

        jTFCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodClienteKeyReleased(evt);
            }
        });

        jBtnBuscaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jBtnBuscaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscaClientesActionPerformed(evt);
            }
        });

        jTxtCodCliente.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTxtCodCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTxtCodCliente.setText("Cod. Cliente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtCodProduto))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnBuscaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnBuscaClientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTFCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCliente))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTxtValorTotal)
                                        .addComponent(jTxtDinheiro)
                                        .addComponent(jTxtTroco))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                        .addComponent(jTFDinheiro, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTFTroco)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTFCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTxtQtd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jBnCancelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnConfirmaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFCodCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnBuscaClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtQtd)
                        .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnBuscaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFTroco)
                    .addComponent(jTxtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnCancelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconeRestauranteMota.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuAdicionarClientes.setText("Adicionar Clientes");
        jMenuAdicionarClientes.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuAdicionarClientesMenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenuAdicionarClientes);

        jMenuAdicionarPratos.setText("Adicionar Pratos de Comida");
        jMenuAdicionarPratos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuAdicionarPratosMenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenuAdicionarPratos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCodClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodClienteKeyReleased
        try {
            int clienteCod = Integer.parseInt(jTFCodCliente.getText());
            buscaCliente(clienteCod);
        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_jTFCodClienteKeyReleased

    private void jTFCodProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodProdutoKeyReleased
        try {
            int codProduto = Integer.parseInt(jTFCodProduto.getText());
            buscaProdutos(codProduto);
        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_jTFCodProdutoKeyReleased

    private void jBtnBuscaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscaClientesActionPerformed
        BuscaClientes buscaClientes = new BuscaClientes(this, true);
        buscaClientes.setVisible(true);

        int codSelecionado = buscaClientes.getCodSelecionado();
        jTFCodCliente.setText("" + codSelecionado);
        buscaCliente(codSelecionado);
    }//GEN-LAST:event_jBtnBuscaClientesActionPerformed

    private void jBtnBuscaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscaProdutosActionPerformed
        BuscaPratos buscaProdutos = new BuscaPratos(this, true);
        buscaProdutos.setVisible(true);

        int codProdutoSelecionado = buscaProdutos.getCodProdutoSelecionado();
        jTFCodProduto.setText("" + codProdutoSelecionado);
        buscaProdutos(codProdutoSelecionado);
    }//GEN-LAST:event_jBtnBuscaProdutosActionPerformed

    private void jBtnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        int codSelecionado = Integer.parseInt(jTFCodProduto.getText());

        int quantidade = Integer.parseInt(jTFQtd.getText());

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCod() == codSelecionado) {
                modelo.addRow(
                        new Object[]{
                            produtos.get(i).getCod(),
                            produtos.get(i).getProduto(),
                            produtos.get(i).getValor(),
                            jTFQtd.getText(),
                            quantidade * produtos.get(i).getValor()
                        }
                );
            }
        }
        updateTotal();
        jTFQtd.setText(null);
        jTFProduto.setText(null);
        jTFCodProduto.setText(null);
        jTFCodProduto.requestFocus();
    }//GEN-LAST:event_jBtnAdicionaActionPerformed

    private void jBtnConfirmaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmaVendaActionPerformed
        double valorTotal = Double.parseDouble(jTFValorTotal.getText());
        double dinheiro = Double.parseDouble(jTFDinheiro.getText());
        double troco = dinheiro - valorTotal;

        jTFTroco.setText("" + troco);

        Resumo resumo = new Resumo(this, true, valorTotal, dinheiro, troco);
        resumo.setVisible(true);

        if (!resumo.isVisible()) {
            limpaCampos();
        }
    }//GEN-LAST:event_jBtnConfirmaVendaActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBnCancelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnCancelaVendaActionPerformed
        this.limpaCampos();
    }//GEN-LAST:event_jBnCancelaVendaActionPerformed

    private void jMenuAdicionarClientesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuAdicionarClientesMenuSelected
        AddCliente addCliente = new AddCliente(this, true);
        addCliente.setVisible(true);
    }//GEN-LAST:event_jMenuAdicionarClientesMenuSelected

    private void jMenuAdicionarPratosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuAdicionarPratosMenuSelected
        AddPratos addPratos = new AddPratos(this, true);
        addPratos.setVisible(true);
    }//GEN-LAST:event_jMenuAdicionarPratosMenuSelected

    public void limpaCampos() {
        jTFCodCliente.setText(null);
        jTFCodProduto.setText(null);
        jTFCliente.setText(null);
        jTFProduto.setText(null);
        jTFQtd.setText(null);
        jTFDinheiro.setText(null);
        jTFTroco.setText(null);
        jTFValorTotal.setText(null);

        limparTabela();

        jTFCodCliente.requestFocus();
    }

    private void limparTabela() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        while (jTable1.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VendaComida().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnCancelaVenda;
    private javax.swing.JButton jBtnAdiciona;
    private javax.swing.JButton jBtnBuscaClientes;
    private javax.swing.JButton jBtnBuscaProdutos;
    private javax.swing.JButton jBtnConfirmaVenda;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAdicionarClientes;
    private javax.swing.JMenu jMenuAdicionarPratos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCliente;
    private javax.swing.JTextField jTFCodCliente;
    private javax.swing.JTextField jTFCodProduto;
    private javax.swing.JTextField jTFDinheiro;
    private javax.swing.JTextField jTFProduto;
    private javax.swing.JTextField jTFQtd;
    private javax.swing.JTextField jTFTroco;
    private javax.swing.JTextField jTFValorTotal;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTxtCodCliente;
    private javax.swing.JLabel jTxtCodProduto;
    private javax.swing.JLabel jTxtDinheiro;
    private javax.swing.JLabel jTxtQtd;
    private javax.swing.JLabel jTxtTroco;
    private javax.swing.JLabel jTxtValorTotal;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

    private void buscaProdutos(int codProduto) {
        boolean encontrado = true;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCod() == codProduto) {
                jTFProduto.setText(produtos.get(i).getCod() + " - " + produtos.get(i).getProduto());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            jTFProduto.setText("null");
        }
    }

    private void buscaCliente(int clienteCod) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCodCliente() == clienteCod) {
                jTFCliente.setText(clientes.get(i).getCodCliente() + " - " + clientes.get(i).getNome());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            jTFCliente.setText(null);
        }
    }

    public void updateTotal() {
        double total = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            total += Double.parseDouble(jTable1.getValueAt(i, 4).toString());
        }
        jTFValorTotal.setText("" + total);
    }
}
