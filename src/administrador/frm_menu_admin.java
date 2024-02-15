//Declaração de pacote:
package administrador;

//Importação de bibliotecas e itens úteis para o sistema:
import conexao.Conexao;
import controle.frm_Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Júlio e Maria
 */

//Classe frm_Cadastro, que recebe a herança da classe JFrame:
public class frm_menu_admin extends javax.swing.JFrame {

    //Objeto com atributos da classe Conexão. Finalidade: Ligação com Banco de Dados.
    Conexao con_cliente;
    //Objeto com atributos da classe frm_Login. Finalidade: Validação de login do usuário.
    frm_Login login;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String usuario;
    private String nome;
    
    //Método construtor:
    public frm_menu_admin(int realId, String realUser, String realNome) 
    {
        initComponents();
        //Método initVars:
        initVars(realId, realUser, realNome);
        //Início de conexão com login e banco de dados
        con_cliente = new Conexao();
        login = new frm_Login();
        con_cliente.conecta();
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
        lblTitle = new javax.swing.JLabel();
        btnJogo = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_encerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(91, 194, 231));
        lblTitle.setText("Menu do Administrador");

        btnJogo.setBackground(new java.awt.Color(91, 194, 231));
        btnJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJogo.setText("Gerenciar Jogos");
        btnJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogoActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(91, 194, 231));
        btnVendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVendas.setText("Gerenciar Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(91, 194, 231));
        btnUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUser.setText("Gerenciar Usuários");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento do Banco de Dados");

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/login.png"))); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_encerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/Close.png"))); // NOI18N
        btn_encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnVendas)
                        .addGap(33, 33, 33)
                        .addComponent(btnUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btn_voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendas)
                    .addComponent(btnJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Botão responsável por redirecionar o administrador para o banco de dados 
    da tabela jogos:*/
    private void btnJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogoActionPerformed
            frm_gerenc_games mostra = new frm_gerenc_games(id, usuario, nome);
            mostra.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnJogoActionPerformed

    /*Botão responsável por redirecionar o administrador para o banco de dados 
    da tabela vendas:*/
    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        try
        {
            frm_gerenc_sales mostra = new frm_gerenc_sales(id, usuario, nome);
            mostra.setVisible(true);
            dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"\n Não foi possível passar seus dados para a próxima tela! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVendasActionPerformed

    /*Botão responsável por redirecionar o administrador para o banco de dados 
    da tabela usuários:*/
    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        try
        {
            frm_gerenc_users mostra = new frm_gerenc_users(id, usuario, nome);
            mostra.setVisible(true);
            dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"\n Não foi possível passar seus dados para a próxima tela! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUserActionPerformed

    /*Botão responsável por redirecionar o administrador para a tela de login:*/
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        frm_Login mostra = new frm_Login();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    /*Botão responsável por encerrar a aplicação*/
    private void btn_encerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_encerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogo;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btn_encerrar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
