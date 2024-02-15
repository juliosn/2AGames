//Declaração de pacotes:
package administrador;

//Importação de bibliotecas:
import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author Júlio e Maria
 */

//Classe frm_gerenc_users, que herda os atributos/métodos/classes de JFrame
public class frm_gerenc_users extends javax.swing.JFrame {

    //Atributo com características da classe Conexao:
    Conexao con_cliente;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String usuario;
    private String nome;
    
    //Método construtor:
    public frm_gerenc_users(int realId, String realUser, String realNome) 
    {
        initComponents();
        //Método initVars
        initVars(realId, realUser, realNome);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from cliente order by id_cliente");
        preencherTabela();
        posicionarRegistro();
        tbl_Users.setAutoCreateRowSorter(true);
    }
    
    //Método initVars() responsável por passar parâmetros de dados do usuário e
    //adicioná-los em atributos locais (da classe):
    private void initVars(int realId, String realUser, String realNome)
    {
        id = realId;
        usuario = realUser;
        nome = realNome;
    }

    /**
    * Esse método é chamado dentro do construtor para iniciar o form, sendo gerado
    * e atualizado automaticamente pelo próprio sistema do form
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Users = new javax.swing.JTable();
        lblEmpresa = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblPlataforma = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfUser = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        tfEnd = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNxt = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCadastrar = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        btnLast = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 194, 231));
        jLabel1.setText("Gerenciador de Usuários");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário");

        tbl_Users.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Usuário", "Senha", "Endereço", "Telefone", "CNPJ"
            }
        ));
        tbl_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Users);

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Senha");

        lblClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClass.setForeground(new java.awt.Color(255, 255, 255));
        lblClass.setText("Endereço");

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Telefone");

        lblPlataforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setText("CNPJ");

        btnFirst.setBackground(new java.awt.Color(91, 194, 231));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_first.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(91, 194, 231));

        btnPrev.setBackground(new java.awt.Color(91, 194, 231));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_previous.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNxt.setBackground(new java.awt.Color(91, 194, 231));
        btnNxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_next.png"))); // NOI18N
        btnNxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNxtActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(91, 194, 231));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/add.png"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(91, 194, 231));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/disk.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(91, 194, 231));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(91, 194, 231));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/application_delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Pesquisar pelo nome do Usuário:");

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(91, 194, 231));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_last.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/Exit.gif"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(tfPesquisa))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblEmpresa)
                            .addComponent(lblClass)
                            .addComponent(lblPreco)
                            .addComponent(lblId))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(tfEnd)
                            .addComponent(tfTel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(tfCnpj)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(lblPlataforma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClass)
                    .addComponent(tfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrevious)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlataforma))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrev)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFirst))
                        .addGap(45, 45, 45)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrar)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Quando pressionado, será apresentado o registro anterior da tabela. 
    Caso o usuário esteja no primeiro registro, ele será impossibilitado de voltar
    um registro, pois não existe esse registro.*/   
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frm_menu_admin mostra = new frm_menu_admin(id, usuario, nome);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /*Quando pressionado, será apresentado o primeiro registro da tabela */
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try
        {
            con_cliente.resultset.first();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: " +erro);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    /*Quando pressionado, será apresentado o registro anterior da tabela. 
    Caso o usuário esteja no primeiro registro, ele será impossibilitado de voltar
    um registro, pois não existe esse registro.*/
    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        try
        {
            int linha_selecionada = con_cliente.resultset.getInt(1);
            if(linha_selecionada > 1)
            {
                con_cliente.resultset.previous();
                mostrar_Dados();
            }
            else
            {
                con_cliente.resultset.last();
                mostrar_Dados();
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro anterior: " +erro);
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    /*Quando pressionado, será apresentado o registro posterior da tabela. 
    Caso o usuário esteja no último registro, ele será impossibilitado de avançar
    um registro, pois não existe esse registro.*/
    private void btnNxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNxtActionPerformed
       try
       {
            int linha_selecionada = con_cliente.resultset.getRow();
            int ultima_linha = tbl_Users.getRowCount();
            
            if(linha_selecionada >= ultima_linha)
            {
                con_cliente.resultset.first();
                mostrar_Dados();
            }
            else
            {
                con_cliente.resultset.next();
                mostrar_Dados();
            }    
        }
       catch(SQLException erro)
       {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no próximo registro: ");
       }
    }//GEN-LAST:event_btnNxtActionPerformed

    /*Quando pressionado, será apresentado o último registro da tabela */
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try 
        {
            con_cliente.executaSQL("select * from cliente order by id_cliente");
            con_cliente.resultset.last();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: ");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    /*Esse evento servirá para carregar as caixas de texto com dados do registro 
    que foi selecionado na tabela com o clique do mouse: */
    private void tbl_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UsersMouseClicked
        int linha_selecionada = tbl_Users.getSelectedRow();
        txtId.setText(tbl_Users.getValueAt(linha_selecionada, 0).toString());
        tfNome.setText(tbl_Users.getValueAt(linha_selecionada, 1).toString());
        tfUser.setText(tbl_Users.getValueAt(linha_selecionada, 2).toString());
        tfSenha.setText(tbl_Users.getValueAt(linha_selecionada, 3).toString());
        tfEnd.setText(tbl_Users.getValueAt(linha_selecionada, 4).toString());
        tfTel.setText(tbl_Users.getValueAt(linha_selecionada, 5).toString());
        tfCnpj.setText(tbl_Users.getValueAt(linha_selecionada, 6).toString());
    }//GEN-LAST:event_tbl_UsersMouseClicked

    //Ação do botão responsável por limpar as caixas de texto para novas entradas de dados.
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtId.setText("");
        tfNome.setText("");
        tfUser.setText("");
        tfSenha.setText("");
        tfEnd.setText("");
        tfTel.setText("");
        tfCnpj.setText("");
        txtId.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    //Ação do botão responsável por incluir na tabela um novo registro a partir dos dados digitados nas caixas de texto:
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = tfNome.getText();
        String user = tfUser.getText();
        String senha = tfSenha.getText();
        String endereco = tfEnd.getText();
        String telefone = tfTel.getText();
        String cnpj = tfCnpj.getText();
        
        try
        {
            String insert_sql="insert into cliente (nome,usuario,senha,endereco,telefone,cnpj) values ('" + nome + "','" + user + "','" + senha + "','" + endereco  + "','" + telefone + "','" + cnpj + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação Realizada com sucesso!!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from cliente order by id_cliente");
            con_cliente.resultset.first();
            preencherTabela();
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /*Ação do botão responsável por alterar na tabela os dados de um registro a partir dos dados digitados nas caixas de texto. 
    Para encontrar o registro na tabela será usado o campo “código”, onde acontecerá um filtro e as alterações só ocorrerão quando o SQL encontrar na tabela 
    o registro que tenha o código coincidente: */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String nomes = tfNome.getText();
        String usuarios = tfUser.getText();
        String senha = tfSenha.getText();
        String endereco = tfEnd.getText();
        String telefone = tfTel.getText();
        String cnpj = tfCnpj.getText();
        String sql= "";
        String msg= "";
        
        try
        {
            if(txtId.getText().equals(""))
            {
                sql="insert into cliente (nome,usuario,senha,endereco,telefone,cnpj) values ('" + nomes + "','" + usuarios + "','" + senha + "','" + endereco  + "','" + telefone + "','" + cnpj + "')";
                msg="Gravação de um novo registro";
            }
            else
            {
                sql="update cliente set nome=' " + nomes + "',usuario='" + usuarios + "', senha='" + senha + "', endereco='" + endereco + "', telefone='" + telefone + "', cnpj='" + cnpj  + "' where id_cliente = " + txtId.getText();
                msg = "Alteração de registro";
            }
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from cliente order by id_cliente");
            con_cliente.resultset.first();
            preencherTabela();
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    /*Excluir na tabela um registro a partir do código da caixa de texto. 
    Para encontrar o registro na tabela será usado o campo “id”, onde acontecerá um filtro e a exclusão só ocorrerá 
    quando o SQL encontrar na tabela o registro que tenha o código coincidente: */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String sql="";
        try
        {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if(resposta==0)
            {
                sql = "delete from cliente where id_cliente = " + txtId.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir ==1)
                {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from cliente order by id_cliente");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(SQLException excecao)
        {
            JOptionPane.showMessageDialog(null, "Erro na exclusão: "+excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //Método responsável por filtrar os registros da JTable, mostrando somente aqueles que atendem as teclas digitadas nesta caixa de texto:
    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        try 
        {
            String pesquisa = "select * from cliente where nome like '" + tfPesquisa.getText() + "%'";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first())
            {
                preencherTabela();
                posicionarRegistro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n ", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfPesquisaKeyReleased

    //Esse método chama os componentes da tabela do banco, e os coloca no jtable:
    private void preencherTabela(){
        tbl_Users.getColumnModel().getColumn(0).setPreferredWidth(4);
        tbl_Users.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbl_Users.getColumnModel().getColumn(2).setPreferredWidth(60);
        tbl_Users.getColumnModel().getColumn(3).setPreferredWidth(60);
        tbl_Users.getColumnModel().getColumn(4).setPreferredWidth(60);
        tbl_Users.getColumnModel().getColumn(5).setPreferredWidth(60);
        tbl_Users.getColumnModel().getColumn(6).setPreferredWidth(60);
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_Users.getModel();
        modelo.setNumRows(0);
        
        try 
        {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next())
            {
                modelo.addRow
                (
                        new Object[]
                        {
                            con_cliente.resultset.getString("id_cliente"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("usuario"),con_cliente.resultset.getString("senha"), con_cliente.resultset.getString("endereco"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("cnpj")
                        }
                );
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Esse método chama os componentes do jtable, e os apresenta a partir do primeiro:
    private void posicionarRegistro()
    {
        try 
        {
            con_cliente.resultset.first();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro:","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Esse método define qual texto será apresentado, a partir da escolha do usuário
    //Ele irá apresentar todos os dados de um registro por vez.
    private void mostrar_Dados()
    {
        try 
        {
            txtId.setText(con_cliente.resultset.getString("id_cliente"));
            tfNome.setText(con_cliente.resultset.getString("nome"));
            tfUser.setText(con_cliente.resultset.getString("usuario"));
            tfSenha.setText(con_cliente.resultset.getString("senha"));
            tfEnd.setText(con_cliente.resultset.getString("endereco"));
            tfTel.setText(con_cliente.resultset.getString("telefone"));
            tfCnpj.setText(con_cliente.resultset.getString("cnpj"));
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados: ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNxt;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tbl_Users;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfTel;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
