//Declaração de pacotes:
package users;

//Importação de bibliotecas:
import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


/**
 *
 * @author Júlio e Maria Eduarda
 */

//Classe frm_acquisition, que herda os atributos/métodos/classes de JFrame
public class frm_acquisition extends javax.swing.JFrame {

    //Atributo com características da classe Conexao:
    Conexao con_cliente;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String nome;
    private String usuario;
    private String cnpj;
    
    //Método construtor:
    public frm_acquisition(int realId, String realUser, String realNome, String realCnpj) {
        initComponents();
        //Método initVars
        initVars(realId, realUser, realNome, realCnpj);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from jogos order by id_jogos");
        preencherTabela();
        tblGames.setAutoCreateRowSorter(true);
    }

    //Método initVars() responsável por passar parâmetros de dados do usuário e
    //adicioná-los em atributos locais (da classe):
    private void initVars(int realId, String realUser, String realNome, String realCnpj){
        id = realId;
        nome = realNome;
        cnpj = realCnpj;
        usuario = realUser;
    }
    
    /**
    * Esse método é chamado dentro do construtor para iniciar o form, sendo gerado
    * e atualizado automaticamente pelo próprio sistema do form
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Users = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        tf_Qtd = new javax.swing.JTextField();
        tf_Total = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        tf_CodJog = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 194, 231));
        jLabel1.setText("Faça sua Compra!!");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Código do Jogo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade");

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Total Da Compra");

        tf_Qtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_QtdKeyReleased(evt);
            }
        });

        btnBuy.setBackground(new java.awt.Color(91, 194, 231));
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/Shopping cart.png"))); // NOI18N
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(91, 194, 231));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/Exit.gif"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(91, 194, 231));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/add.png"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        tf_CodJog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_CodJogKeyReleased(evt);
            }
        });

        tblGames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Clasificação", "Preço (R$)"
            }
        ));
        jScrollPane2.setViewportView(tblGames);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tf_CodJog, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpresa)
                    .addComponent(lblId)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(tf_CodJog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpresa)
                    .addComponent(tf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método de uma tabela não utilizada, porém não consegui remove-lá:
    private void tbl_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UsersMouseClicked

    }//GEN-LAST:event_tbl_UsersMouseClicked

    //Ação do botão responsável por limpar as caixas de texto para novas entradas de dados.
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        tf_CodJog.setText("");
        tf_Qtd.setText("");
        tf_Total.setText("");
        tf_CodJog.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    //Ação do botão responsável por incluir na tabela um novo registro a partir dos dados digitados nas caixas de texto:
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        String ids = tf_CodJog.getText();
        String qtd = tf_Qtd.getText();
        String total = tf_Total.getText();
        
        try
        {
            String insert_sql="insert into vendas (id_cliente,cod_jog,qtd_jogos,total) values ('" + id + "','" + ids + "','" + qtd + "','" + total + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação Realizada com sucesso!!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_btnBuyActionPerformed

    //Quando pressionado, ele retorna para o menu de tabelas do cliente:
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frm_menu_user mostra = new frm_menu_user(id, usuario, nome, cnpj);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //Método responsável por automatizar o campo "total", colocando o valor do preço unitário do código inserido
    private void tf_CodJogKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_CodJogKeyReleased
        try
        {
            int preco = Integer.parseInt(tf_CodJog.getText());
            con_cliente.executaSQL("select preco from jogos where id_jogos = " + preco);
            con_cliente.resultset.first();
            tf_Total.setText(con_cliente.resultset.getString("preco"));
            int qtd_limite = tblGames.getRowCount();
            
            if(preco > qtd_limite)
            {
                JOptionPane.showMessageDialog(null, "Código de Jogo Inválido!");
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dado na tabela!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_tf_CodJogKeyReleased

    //Método responsável por determinar o valor final do produto, sendo calculado com o valor unitário (previamente inserido):
    private void tf_QtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_QtdKeyReleased
        double qtd = Double.parseDouble(tf_Qtd.getText());
        double n_total = Double.parseDouble(tf_Total.getText());
        double conta = qtd * n_total;
        tf_Total.setText("" + conta);
    }//GEN-LAST:event_tf_QtdKeyReleased

    //Esse método chama os componentes da tabela do banco, e os coloca no jtable:
    private void preencherTabela(){
        tblGames.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblGames.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblGames.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblGames.getColumnModel().getColumn(3).setPreferredWidth(60);
        
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
                            con_cliente.resultset.getString("id_jogos"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("classificacao"),con_cliente.resultset.getString("preco")
                        }
                );
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblGames;
    private javax.swing.JTable tbl_Users;
    private javax.swing.JTextField tf_CodJog;
    private javax.swing.JTextField tf_Qtd;
    private javax.swing.JTextField tf_Total;
    // End of variables declaration//GEN-END:variables
}
