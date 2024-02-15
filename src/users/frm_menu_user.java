//Declaração de pacote:
package users;

//Importação de bibliotecas e itens úteis para o sistema:
import conexao.Conexao;
import controle.frm_Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Júlio e Maria
 */

//Classe frm_menu_user, que recebe a herança da classe JFrame:
public class frm_menu_user extends javax.swing.JFrame {

    //Objeto com atributos da classe Conexão. Finalidade: Ligação com Banco de Dados.
    Conexao con_cliente;
    //Objeto com atributos da classe frm_Login. Finalidade: Validação de login do usuário.
    frm_Login login;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String nome;
    private String usuario;
    private String cnpj;
    
    //Método construtor:
    public frm_menu_user(int realId, String realUser, String realNome, String realCnpj) 
    {
        initComponents();
        //Método initVars:
        initVars(realId, realUser, realNome, realCnpj);
        //Início de conexão com login e banco de dados
        con_cliente = new Conexao();
        login = new frm_Login();
        con_cliente.conecta();
    }

    //Método initVars() responsável por passar parâmetros de dados do usuário e
    //adicioná-los em atributos locais (da classe):
    private void initVars(int realId, String realUser, String realNome, String realCnpj)
    {
        id = realId;
        usuario = realUser;
        nome = realNome;
        cnpj = realCnpj;
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
        btnBuy = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnRequests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_encerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(91, 194, 231));
        lblTitle.setText("Menu do Cliente");

        btnBuy.setBackground(new java.awt.Color(91, 194, 231));
        btnBuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuy.setText("Realizar Compra");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnAccount.setBackground(new java.awt.Color(91, 194, 231));
        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAccount.setText("Dados de sua conta");
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnRequests.setBackground(new java.awt.Color(91, 194, 231));
        btnRequests.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRequests.setText("Pedidos realizados");
        btnRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá! Acesse uma das páginas abaixo:");

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
                        .addComponent(btnBuy)
                        .addGap(35, 35, 35)
                        .addComponent(btnAccount)
                        .addGap(27, 27, 27)
                        .addComponent(btnRequests))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btn_voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccount)
                    .addComponent(btnBuy)
                    .addComponent(btnRequests))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
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

    /*Botão responsável por redirecionar o cliente para a tela de compra:*/
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
            frm_acquisition mostra = new frm_acquisition(id, usuario, nome, cnpj);
            mostra.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnBuyActionPerformed

    /*Botão responsável por redirecionar o cliente para a tela que exibe seus dados:*/
    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        try
        {
            frm_account_data mostra = new frm_account_data(id, usuario, nome, cnpj);
            mostra.setVisible(true);
            dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"\n Não foi possível passar seus dados para a próxima tela! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAccountActionPerformed

    /*Botão responsável por redirecionar o cliente para a tela de seus pedidos:*/
    private void btnRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsActionPerformed
        try
        {
            frm_user_sales mostra = new frm_user_sales(id, usuario, nome, cnpj);
            mostra.setVisible(true);
            dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"\n Não foi possível passar seus dados para a próxima tela! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRequestsActionPerformed

    /*Botão responsável por redirecionar o cliente para a tela de login:*/
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
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnRequests;
    private javax.swing.JButton btn_encerrar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
