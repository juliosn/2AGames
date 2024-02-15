//Declaração de pacote:
package controle;

//Importação de bibliotecas e itens úteis para o sistema:
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Júlio e Maria
 */


//Classe frm_Cadastro, que recebe a herança da classe JFrame:
public class frm_Cadastro extends javax.swing.JFrame {

    //Objeto com atributos da classe Conexão. Finalidade: Ligação com Banco de Dados.
    Conexao con_cliente;

    //Método construtor:
    public frm_Cadastro() {
        initComponents();
        con_cliente = new Conexao();
        con_cliente.conecta(); 
        con_cliente.executaSQL("select * from cliente order by id_cliente");
        getRootPane().setDefaultButton(btnCadastrar);
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
        lblNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfUser = new javax.swing.JTextField();
        tfEnd = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        tfSenha = new javax.swing.JTextField();
        lbl_alert = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JFormattedTextField();
        tfTel = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(91, 194, 231));
        lblTitle.setText("Cadastre sua Empresa");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        lblEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEnd.setForeground(new java.awt.Color(255, 255, 255));
        lblEnd.setText("Endereço");

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTel.setForeground(new java.awt.Color(255, 255, 255));
        lblTel.setText("Telefone");

        lblCNPJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJ.setText("CNPJ");

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(91, 194, 231));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/login.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lbl_alert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_alert.setForeground(new java.awt.Color(255, 255, 51));
        lbl_alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_alert.setToolTipText("aviso");
        lbl_alert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblUser)
                                    .addComponent(lblEnd)
                                    .addComponent(lblTel)
                                    .addComponent(lblCNPJ)
                                    .addComponent(lblSenha))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNome)
                                    .addComponent(tfUser)
                                    .addComponent(tfEnd)
                                    .addComponent(tfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(tfCNPJ)
                                    .addComponent(tfTel)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lbl_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lbl_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnd)
                            .addComponent(tfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCNPJ)
                            .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar)
                            .addComponent(btnCadastrar)))
                    .addComponent(btnVoltar))
                .addContainerGap(40, Short.MAX_VALUE))
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

    /*Método cad(), sua função é fazer o cadastro de dados no Banco de Dados, utilizando
    atributos/recursos do formulário (como as textFields) como parâmetro de dados:*/
    private void cad(){
            //Declaração de atributos das colunas (nome, usuário, senha, endereço, telefone e cnpj):
            String nome = tfNome.getText();
            String usuario = tfUser.getText();
            String senha = tfSenha.getText();
            String endereco = tfEnd.getText();
            String telefone = tfTel.getText();
            String cnpj = tfCNPJ.getText();
            
            //Tentativa de inserção de dados no banco e confirmação da ação:
            try 
            {
                String cad_sql="insert into cliente (`nome`, `usuario`, `senha`, `endereco`, `telefone`, `cnpj`) values ('" + nome + "','" + usuario + "','" + senha + "','" + endereco + "','" + telefone + "','" + cnpj + "');";
                con_cliente.statement.executeUpdate(cad_sql);
                JOptionPane.showMessageDialog(null, "Conta cadastrada!!\n Redirecionando para o Login...", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                frm_Login mostra = new frm_Login();
                mostra.setVisible(true);
                dispose();

            }
            //Caso ocorra alguma falha no processo...
            catch(SQLException errosql)
            {
                JOptionPane.showMessageDialog(null, "\n Falha no cadastro: \n ", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    //Botão que redireciona o usuário para a tela de login:
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frm_Login mostra = new frm_Login();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /*Botão que administra e verifica os dados inseridos pelo usuário, confirmando
    se eles podem ser inseridos no banco ou não.*/
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Se todos os campos não estiverem vázios:
        if(tfNome.getText().length() > 0 && tfUser.getText().length() > 0  && tfSenha.getText().length() > 0 && tfEnd.getText().length() > 0 && tfTel.getText().length() > 0 && tfCNPJ.getText().length() > 0)
        {
            //Verificando se há algum dado já cadastrado:
            try
            {
                String pesquisa = "select * from cliente where usuario = '" + tfUser.getText() + "'";
                con_cliente.executaSQL(pesquisa);
                
                if(con_cliente.resultset.first())
                {
                    JOptionPane.showMessageDialog(null, "Este usuário já está sendo utilizado!\n\nPor favor, escolha outro nome!" ,"Observação",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //Verificando se os critérios de senha estão sendo cumpridos ou não:
                    try
                    {
                        long teste;
                        teste =  Long.parseLong(tfSenha.getText());
                    
                        if(tfSenha.getText().length() < 3 || tfSenha.getText().length() > 8)
                        {
                            JOptionPane.showMessageDialog(null, "A senha deve conter entre 3 e 8 digitos!\n\nTente novamente!" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            cad();
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "A senha só pode conter números!" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            //Caso o email seja inválido:
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "\n Não é possível encontar o email digitado:\n ", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
            con_cliente.executaSQL("select * from cliente order by id_cliente");
        }
        //Mensagem de alerta caso o cliente não tenha preenchido todos os campos:
        else
        {
            lbl_alert.setText("Preencha os campos!");
        }    
    }//GEN-LAST:event_btnCadastrarActionPerformed

    //Botão que limpa os dados inseridos (e não cadastrados) pelo cliente anteriormente:
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            tfNome.setText("");
            tfUser.setText("");
            tfSenha.setText("");
            tfEnd.setText("");
            tfTel.setText("");
            tfCNPJ.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbl_alert;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JFormattedTextField tfTel;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
