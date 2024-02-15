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

//Classe frm_gerenc_games, que herda os atributos/métodos/classes de JFrame
public class frm_gerenc_games extends javax.swing.JFrame {

    //Atributo com características da classe Conexao:
    Conexao con_cliente;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String usuario;
    private String nome;
    
    //Método construtor:
    public frm_gerenc_games(int realId, String realUser, String realNome) 
    {
        initComponents();
        //Método initVars
        initVars(realId, realUser, realNome);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from jogos order by id_jogos");
        preencherTabela();
        posicionarRegistro();
        tblGames.setAutoCreateRowSorter(true);
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

        jLabel5 = new javax.swing.JLabel();
        jp_frm_gerenc_games = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();
        lblEmpresa = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblPlataforma = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfEmp = new javax.swing.JTextField();
        tfClass = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfPlataforma = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCadastrar = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        tfData = new javax.swing.JFormattedTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_frm_gerenc_games.setBackground(new java.awt.Color(17, 17, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 194, 231));
        jLabel1.setText("Gerenciador de Jogos ");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Lançamento");

        tblGames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Data", "Empresa", "Clasificação", "Preço (R$)", "Plataforma"
            }
        ));
        tblGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGamesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGames);

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Empresa");

        lblClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClass.setForeground(new java.awt.Color(255, 255, 255));
        lblClass.setText("Classificação");

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Valor Unitário");

        lblPlataforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setText("Plataforma");

        btnFirst.setBackground(new java.awt.Color(91, 194, 231));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_first.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(91, 194, 231));
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_previous.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(91, 194, 231));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(91, 194, 231));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/resultset_last.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
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
        lblCadastrar.setText("Pesquisar pelo nome do jogo:");

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/Exit.gif"))); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jp_frm_gerenc_gamesLayout = new javax.swing.GroupLayout(jp_frm_gerenc_games);
        jp_frm_gerenc_games.setLayout(jp_frm_gerenc_gamesLayout);
        jp_frm_gerenc_gamesLayout.setHorizontalGroup(
            jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                        .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                                .addComponent(lblCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(lblEmpresa)
                                            .addComponent(lblClass)
                                            .addComponent(lblPreco)
                                            .addComponent(lblId)
                                            .addComponent(lblPlataforma)))
                                    .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNome)
                                        .addComponent(tfEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(256, Short.MAX_VALUE))
                    .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_frm_gerenc_gamesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(309, 309, 309))
        );
        jp_frm_gerenc_gamesLayout.setVerticalGroup(
            jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_frm_gerenc_gamesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(tfEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClass)
                    .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataforma))
                .addGap(47, 47, 47)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jp_frm_gerenc_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrar)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_frm_gerenc_games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_frm_gerenc_games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método responsável por filtrar os registros da JTable, mostrando somente aqueles que atendem as teclas digitadas nesta caixa de texto:
    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        try 
        {
            String pesquisa = "select * from jogos where nome like '" + tfPesquisa.getText() + "%'";
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

    //Quando pressionado, ele retorna para o menu de tabelas do admin:
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        frm_menu_admin mostra = new frm_menu_admin(id, usuario, nome);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    /*Quando pressionado, será apresentado o último registro da tabela */
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try 
        {
            con_cliente.executaSQL("select * from jogos order by id_jogos");
            con_cliente.resultset.last();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: ");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    /*Quando pressionado, será apresentado o registro posterior da tabela. 
    Caso o usuário esteja no último registro, ele será impossibilitado de avançar
    um registro, pois não existe esse registro.*/
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       try
       {
            int linha_selecionada = con_cliente.resultset.getRow();
            int ultima_linha = tblGames.getRowCount();
            
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
    }//GEN-LAST:event_btnNextActionPerformed
    
    /*Quando pressionado, será apresentado o registro anterior da tabela. 
    Caso o usuário esteja no primeiro registro, ele será impossibilitado de voltar
    um registro, pois não existe esse registro.*/
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
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
    }//GEN-LAST:event_btnPreviousActionPerformed

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
                sql = "delete from jogos where id_jogos = " + txtId.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir ==1)
                {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from jogos order by id_jogos");
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

    /*Ação do botão responsável por alterar na tabela os dados de um registro a partir dos dados digitados nas caixas de texto. 
    Para encontrar o registro na tabela será usado o campo “código”, onde acontecerá um filtro e as alterações só ocorrerão quando o SQL encontrar na tabela 
    o registro que tenha o código coincidente: */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String nome = tfNome.getText();
        String data = tfData.getText();
        String empresa = tfEmp.getText();
        String classificacao = tfClass.getText();
        String valor = tfPreco.getText();
        String plataforma = tfPlataforma.getText();
        String sql= "";
        String msg= "";
        
        try
        {
            if(txtId.getText().equals(""))
            {
                sql="insert into jogos (nome,data_lancamento,empresa,classificacao,preco,plataforma) values ('" + nome + "','" + data + "','" + empresa + "','" + classificacao  + "','" + valor + "','" + plataforma + "')";
                msg="Gravação de um novo registro";
            }
            else
            {
                sql="update jogos set nome='" + nome + "',data_lancamento='" + data + "', empresa='" + empresa + "', classificacao='" + classificacao + "', preco='" + valor + "', plataforma='" + plataforma  + "' where id_jogos = " + txtId.getText();
                msg = "Alteração de registro";
            }
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from jogos order by id_jogos");
            con_cliente.resultset.first();
            preencherTabela();
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Ação do botão responsável por incluir na tabela um novo registro a partir dos dados digitados nas caixas de texto:
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = tfNome.getText();
        String data = tfData.getText();
        String empresa = tfEmp.getText();
        String classificacao = tfClass.getText();
        String valor = tfPreco.getText();
        String plataforma = tfPlataforma.getText();
        
        try
        {
            String insert_sql="insert into jogos (nome,data_lancamento,empresa,classificacao,preco,plataforma) values ('" + nome + "','" + data + "','" + empresa + "','" + classificacao  + "','" + valor + "','" + plataforma + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação Realizada com sucesso!!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from jogos order by id_jogos");
            con_cliente.resultset.first();
            preencherTabela();
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_btnCadastrarActionPerformed

    //Ação do botão responsável por limpar as caixas de texto para novas entradas de dados.
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtId.setText("");
        tfNome.setText("");
        tfData.setText("");
        tfEmp.setText("");
        tfClass.setText("");
        tfPreco.setText("");
        tfPlataforma.setText("");
        txtId.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    /*Esse evento servirá para carregar as caixas de texto com dados do registro 
    que foi selecionado na tabela com o clique do mouse: */
    private void tblGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGamesMouseClicked
        int linha_selecionada = tblGames.getSelectedRow();
        txtId.setText(tblGames.getValueAt(linha_selecionada, 0).toString());
        tfNome.setText(tblGames.getValueAt(linha_selecionada, 1).toString());
        tfData.setText(tblGames.getValueAt(linha_selecionada, 2).toString());
        tfEmp.setText(tblGames.getValueAt(linha_selecionada, 3).toString());
        tfClass.setText(tblGames.getValueAt(linha_selecionada, 4).toString());
        tfPreco.setText(tblGames.getValueAt(linha_selecionada, 5).toString());
        tfPlataforma.setText(tblGames.getValueAt(linha_selecionada, 6).toString());
    }//GEN-LAST:event_tblGamesMouseClicked
        
    //Esse método chama os componentes da tabela do banco, e os coloca no jtable:
    private void preencherTabela(){
        tblGames.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblGames.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblGames.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblGames.getColumnModel().getColumn(3).setPreferredWidth(60);
        tblGames.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblGames.getColumnModel().getColumn(5).setPreferredWidth(60);
        tblGames.getColumnModel().getColumn(6).setPreferredWidth(60);
        
        DefaultTableModel modelo = (DefaultTableModel) tblGames.getModel();
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
                            con_cliente.resultset.getString("id_jogos"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("data_lancamento"),con_cliente.resultset.getString("empresa"), con_cliente.resultset.getString("classificacao"),con_cliente.resultset.getString("preco"), con_cliente.resultset.getString("plataforma")
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
            txtId.setText(con_cliente.resultset.getString("id_jogos"));
            tfNome.setText(con_cliente.resultset.getString("nome"));
            tfData.setText(con_cliente.resultset.getString("data_lancamento"));
            tfEmp.setText(con_cliente.resultset.getString("empresa"));
            tfClass.setText(con_cliente.resultset.getString("classificacao"));
            tfPreco.setText(con_cliente.resultset.getString("preco"));
            tfPlataforma.setText(con_cliente.resultset.getString("plataforma"));
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
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_frm_gerenc_games;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tblGames;
    private javax.swing.JTextField tfClass;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfEmp;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfPlataforma;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
