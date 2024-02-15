//Declaração de pacote:
package controle;

//Importação de bibliotecas e itens úteis para o sistema:
import administrador.frm_menu_admin;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import users.frm_menu_user;

/**
 *
 * @author Júlio e Maria
 */

//Classe frm_Cadastro, que recebe a herança da classe JFrame:
public class frm_Login extends javax.swing.JFrame {

    //Objeto com atributos da classe Conexão. Finalidade: Ligação com Banco de Dados.
    Conexao con_cliente;
    
    //Método construtor:
    public frm_Login() 
    {
        initComponents(); 
        con_cliente = new Conexao(); 
        con_cliente.conecta(); 
        lbl_Click_Cad.setText("<html><u>Clique Aqui!</u></html>"); 
        logo(); 
        getRootPane().setDefaultButton(btnEntrar);
    }
    
    /**
    * Esse método é chamado dentro do construtor para iniciar o form, sendo gerado
    * e atualizado automaticamente pelo próprio sistema do form
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioAdmin = new javax.swing.JRadioButton();
        radioUser = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelLogin = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_goCad = new javax.swing.JLabel();
        lbl_Click_Cad = new javax.swing.JLabel();
        rbtn_admin = new javax.swing.JRadioButton();
        rbtn_user = new javax.swing.JRadioButton();
        lbl_Choice = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lbl_alert = new javax.swing.JLabel();

        radioAdmin.setBackground(new java.awt.Color(0, 51, 51));
        radioAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        radioAdmin.setText("Administrador");
        radioAdmin.setToolTipText("Apenas para funcionários");
        radioAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        radioUser.setBackground(new java.awt.Color(0, 51, 51));
        radioUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioUser.setForeground(new java.awt.Color(255, 255, 255));
        radioUser.setSelected(true);
        radioUser.setText("Usuário");
        radioUser.setToolTipText("Para clientes");
        radioUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 17, 31));

        panelLogin.setBackground(new java.awt.Color(17, 17, 31));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(91, 194, 231));
        lblTitle.setText("LOGIN");

        lblUser.setBackground(new java.awt.Color(255, 255, 255));
        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário");

        tfUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        btnEntrar.setBackground(new java.awt.Color(91, 194, 231));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lbl_goCad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_goCad.setText("Não tem cadastro? ");

        lbl_Click_Cad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_Click_Cad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Click_Cad.setText("Clique aqui! ");
        lbl_Click_Cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Click_CadMouseClicked(evt);
            }
        });

        rbtn_admin.setBackground(new java.awt.Color(17, 17, 31));
        buttonGroup1.add(rbtn_admin);
        rbtn_admin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_admin.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_admin.setText("Administrador");
        rbtn_admin.setToolTipText("Apenas para funcionários");
        rbtn_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbtn_user.setBackground(new java.awt.Color(17, 17, 31));
        buttonGroup1.add(rbtn_user);
        rbtn_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_user.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_user.setText("Usuário");
        rbtn_user.setToolTipText("Para clientes");
        rbtn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_Choice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Choice.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Choice.setText("Você é um:");

        lbl_alert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_alert.setForeground(new java.awt.Color(255, 255, 0));
        lbl_alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_alert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser)
                                    .addComponent(lblSenha))
                                .addGap(51, 51, 51)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfUser, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEntrar)
                                    .addGroup(panelLoginLayout.createSequentialGroup()
                                        .addComponent(lbl_Choice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtn_admin)))
                                .addGap(26, 26, 26)
                                .addComponent(rbtn_user))))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lbl_goCad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Click_Cad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel1))
                        .addGroup(panelLoginLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTitle)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addGap(30, 30, 30)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_admin)
                    .addComponent(rbtn_user)
                    .addComponent(lbl_Choice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_goCad, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbl_Click_Cad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Método logo(), utilizado para apresentar a logo do nosso projeto, chamando 
    a classe ImageIcon e usando seus atributos e métodos para dimensionar e selecionar a
    imagem que será apresentada:*/
    private void logo()
    {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/logo/Logo.png"));
        Image scaleImage = imageIcon.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon img = new ImageIcon(scaleImage);
        lblLogo.setIcon(img);
    }
    
    /*Caso a pessoa clique no "Clique Aqui!", ela será redirecionada para o
    formulário de cadastro*/
    private void lbl_Click_CadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Click_CadMouseClicked
        frm_Cadastro mostra = new frm_Cadastro();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_Click_CadMouseClicked

    /*Botão para tentativa de entrar no sistema:*/
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Caso o usuário seja um administrador:
        if(rbtn_admin.isSelected())
        {
            //Verificando se os campos não estão vázios
            if(tfUser.getText().length() > 0 && tfSenha.getText().length() > 0)
            {
                //Procurando dados inseridos no banco de dados
                try
                {
                    //Comando SQL
                    String pesquisa = "select * from admin where usuario = '" + tfUser.getText() + "' && senha = " + tfSenha.getText() + "";
                    con_cliente.executaSQL(pesquisa);
                    //Validando se o dado inserido é véridico ou não:
                    if (con_cliente.resultset.first())
                    {
                        /*Chamando alguns atributos da tabela do banco para a
                        passagem de parâmetro e indo para a tela inicial do admin:*/
                        con_cliente.executaSQL(pesquisa);
                        con_cliente.resultset.first();
                        int realId = con_cliente.resultset.getInt("id_admin");
                        String realUser = con_cliente.resultset.getString("usuario");
                        String realNome = con_cliente.resultset.getString("nome");
                        frm_menu_admin mostra = new frm_menu_admin(realId, realUser, realNome);
                        mostra.setVisible(true);
                        dispose();
                    }
                    //Caso os dados inseridos sejam inválidos:
                    else
                    {
                        JOptionPane.showMessageDialog(null, "\n Usuário e/ou senha estão incorretos!\n Tente novamente","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        tfUser.requestFocus();
                    }

                }
                //Caso os dados sejam inexistentes ou ocorra algum erro de referência
                //de atributo da tabela:
                catch(SQLException errosql)
                {
                    JOptionPane.showMessageDialog(null, "\n Não foi possível encontrar esses dados inseridos...\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    tfUser.requestFocus();
                }
            }
            //Caso o usuário tenha deixado algum campo vázio:
            else
            {
                lbl_alert.setText("Preencha os campos!");
                tfUser.requestFocus();
            }
        }
        //Caso o usuário seja um cliente comum:
        else
        {
            //Verificando se os campos não estão vázios:
            if(tfUser.getText().length() > 0 && tfSenha.getText().length() > 0)
            {
                //Procurando dados inseridos no banco de dados
                try
                {
                    //Comando SQL
                    String pesquisa = "select * from cliente where usuario = '" + tfUser.getText() + "' && senha = " + tfSenha.getText() + "";
                    con_cliente.executaSQL(pesquisa);
                    //Validando se o dado inserido é véridico ou não:
                    if (con_cliente.resultset.first())
                    {
                        /*Chamando alguns atributos da tabela do banco para a
                        passagem de parâmetro e indo para a tela inicial do admin:*/
                        con_cliente.executaSQL(pesquisa);
                        con_cliente.resultset.first();
                        int realId = con_cliente.resultset.getInt("id_cliente");
                        String realUser = con_cliente.resultset.getString("usuario");
                        String realNome = con_cliente.resultset.getString("nome");
                        String realCnpj = con_cliente.resultset.getString("cnpj");
                        frm_menu_user mostra = new frm_menu_user(realId, realUser, realNome, realCnpj);
                        mostra.setVisible(true);
                        dispose();
                    }
                    //Caso os dados inseridos sejam inválidos:
                    else
                    {
                        JOptionPane.showMessageDialog(null, "\n Usuário e/ou senha estão incorretos!\n Tente novamente","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        tfUser.requestFocus();
                    }
                }
                //Caso os dados sejam inexistentes ou ocorra algum erro de referência
                //de atributo da tabela:
                catch(SQLException errosql)
                {
                    JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    tfUser.requestFocus();
                }
            }
            //Caso o usuário tenha deixado algum campo vázio:
            else
            {
                lbl_alert.setText("Preencha os campos!");
                tfUser.requestFocus();
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    //Método main:
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Criação e apresentação do form: */
        java.awt.EventQueue.invokeLater
        (
                new Runnable() 
                {
                    public void run() 
                    {
                        new frm_Login().setVisible(true);
                    }
                }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbl_Choice;
    private javax.swing.JLabel lbl_Click_Cad;
    private javax.swing.JLabel lbl_alert;
    private javax.swing.JLabel lbl_goCad;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioUser;
    private javax.swing.JRadioButton rbtn_admin;
    private javax.swing.JRadioButton rbtn_user;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
