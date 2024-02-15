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

//Classe frm_gerenc_sales, que herda os atributos/métodos/classes de JFrame
public class frm_gerenc_sales extends javax.swing.JFrame {

    //Atributo com características da classe Conexao:
    Conexao con_cliente;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String usuario;
    private String nome;
    
    //Método construtor:
    public frm_gerenc_sales(int realId, String realUser, String realNome) {
        initComponents();
        //Método initVars
        initVars(realId, realUser, realNome);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from vendas order by id_venda");
        preencherTabela();
        posicionarRegistro();
        tblSales.setAutoCreateRowSorter(true);
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

        jLabel2 = new javax.swing.JLabel();
        btnAlterar3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_Id = new javax.swing.JTextField();
        tf_Cliente = new javax.swing.JTextField();
        tf_Jogo = new javax.swing.JTextField();
        tf_Qtd = new javax.swing.JTextField();
        tf_Data = new javax.swing.JTextField();
        tf_Total = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNxt = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        btnAlterar3.setBackground(new java.awt.Color(91, 194, 231));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        lblTitle.setBackground(new java.awt.Color(91, 194, 231));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(91, 194, 231));
        lblTitle.setText("Gerenciador de Vendas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código Vendas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id do Cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código do Jogo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade de Jogos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data da Venda");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total da Compra");

        btnNew.setBackground(new java.awt.Color(91, 194, 231));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/add.png"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(91, 194, 231));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(91, 194, 231));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/disk.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(91, 194, 231));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_last.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(91, 194, 231));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/application_delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(91, 194, 231));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_previous.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNxt.setBackground(new java.awt.Color(91, 194, 231));
        btnNxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_last.png"))); // NOI18N
        btnNxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNxtActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(91, 194, 231));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_first.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        tblSales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Vendas", "Id Cliente", "Código Jogo", "Quantidade de Jogos", "Data Venda", "Preço"
            }
        ));
        tblSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSales);

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
                        .addGap(246, 246, 246)
                        .addComponent(lblTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(178, 178, 178)
                                    .addComponent(tf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_Jogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_Qtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_Data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(tf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)
                        .addGap(171, 171, 171)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(70, 70, 70)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFirst)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Quando pressionado, ele retorna para o menu de tabelas do admin:
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
            int ultima_linha = tblSales.getRowCount();
            
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
            con_cliente.executaSQL("select * from vendas order by id_venda");
            con_cliente.resultset.last();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: ");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    //Ação do botão responsável por limpar as caixas de texto para novas entradas de dados.
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        tf_Id.setText("");
        tf_Cliente.setText("");
        tf_Jogo.setText("");
        tf_Qtd.setText("");
        tf_Data.setText("");
        tf_Total.setText("");
        tf_Id.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    //Ação do botão responsável por incluir na tabela um novo registro a partir dos dados digitados nas caixas de texto:
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String id_cliente = tf_Cliente.getText();
        String id_jogo = tf_Jogo.getText();
        String qtd_jogos = tf_Qtd.getText();
        String data = tf_Data.getText();
        String total = tf_Total.getText();
        
        try
        {
            String insert_sql="insert into vendas (id_cliente,cod_jog,qtd_jogos,data_venda,total) values ('" + id_cliente + "','" + id_jogo + "','" + qtd_jogos + "','" + data  + "','" + total + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação Realizada com sucesso!!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from vendas order by id_venda");
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
        String id_cliente = tf_Cliente.getText();
        String id_jogo = tf_Jogo.getText();
        String qtd_jogos = tf_Qtd.getText();
        String data = tf_Data.getText();
        String total = tf_Total.getText();
        String sql= "";
        String msg= "";
        
        try
        {
            if(tf_Id.getText().equals(""))
            {
                sql="insert into vendas (id_cliente,cod_jog,qtd_jogos,data_venda,total) values ('" + id_cliente + "','" + id_jogo + "','" + qtd_jogos + "','" + data  + "','" + total + "')";
                msg="Gravação de um novo registro";
            }
            else
            {
                sql="update vendas set id_cliente='" + id_cliente + "',cod_jog='" + id_jogo + "', qtd_jogos='" + qtd_jogos + "', data_venda='" + data + "', total='" + total  + "' where id_venda = " + tf_Id.getText();
                msg = "Alteração de registro";
            }
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from vendas order by id_venda");
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
                sql = "delete from vendas where id_venda = " + tf_Id.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir ==1)
                {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from vendas order by id_venda");
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

    /*Esse evento servirá para carregar as caixas de texto com dados do registro 
    que foi selecionado na tabela com o clique do mouse: */
    private void tblSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesMouseClicked
        int linha_selecionada = tblSales.getSelectedRow();
        tf_Id.setText(tblSales.getValueAt(linha_selecionada, 0).toString());
        tf_Cliente.setText(tblSales.getValueAt(linha_selecionada, 1).toString());
        tf_Jogo.setText(tblSales.getValueAt(linha_selecionada, 2).toString());
        tf_Qtd.setText(tblSales.getValueAt(linha_selecionada, 3).toString());
        tf_Data.setText(tblSales.getValueAt(linha_selecionada, 4).toString());
        tf_Total.setText(tblSales.getValueAt(linha_selecionada, 5).toString());
    }//GEN-LAST:event_tblSalesMouseClicked

    //Esse método chama os componentes da tabela do banco, e os coloca no jtable:
    private void preencherTabela(){
        tblSales.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblSales.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblSales.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblSales.getColumnModel().getColumn(3).setPreferredWidth(60);
        tblSales.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblSales.getColumnModel().getColumn(5).setPreferredWidth(60);
        
        DefaultTableModel modelo = (DefaultTableModel) tblSales.getModel();
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
                            con_cliente.resultset.getString("id_venda"),con_cliente.resultset.getString("id_cliente"),con_cliente.resultset.getString("cod_jog"),con_cliente.resultset.getString("qtd_jogos"), con_cliente.resultset.getString("data_venda"),con_cliente.resultset.getString("total")
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
            tf_Id.setText(con_cliente.resultset.getString("id_venda"));
            tf_Cliente.setText(con_cliente.resultset.getString("id_cliente"));
            tf_Jogo.setText(con_cliente.resultset.getString("cod_jog"));
            tf_Qtd.setText(con_cliente.resultset.getString("qtd_jogos"));
            tf_Data.setText(con_cliente.resultset.getString("data_venda"));
            tf_Total.setText(con_cliente.resultset.getString("total"));
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados: ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterar3;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNxt;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSales;
    private javax.swing.JTextField tf_Cliente;
    private javax.swing.JTextField tf_Data;
    private javax.swing.JTextField tf_Id;
    private javax.swing.JTextField tf_Jogo;
    private javax.swing.JTextField tf_Qtd;
    private javax.swing.JTextField tf_Total;
    // End of variables declaration//GEN-END:variables
}
