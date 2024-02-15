//Declaração de pacotes:
package users;

//Importação de bibliotecas:
import conexao.Conexao;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Júlio e Maria
 */

//Classe frm_gerenc_users, que herda os atributos/métodos/classes de JFrame
public class frm_account_data extends javax.swing.JFrame {

    //Atributo com características da classe Conexao:
    Conexao con_cliente;
    
    //Atributos utilizados para passagem de parâmetro e comparação de dados:
    private int id;
    private String usuario;
    private String nome;
    private String cnpj;
    
    //Método construtor:
    public frm_account_data(int realId, String realUser, String realNome, String realCnpj) 
    {
        initComponents();
        //Método initVars
        initVars(realId, realUser, realNome, realCnpj);
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from cliente where id_cliente = " + realId);
        posicionarRegistro();
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
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 194, 231));
        jLabel1.setText("Sua Conta:");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário");

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Senha");

        lblClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClass.setForeground(new java.awt.Color(255, 255, 255));
        lblClass.setText("Endereço *");

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Telefone *");

        lblPlataforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setText("CNPJ");

        txtId.setEnabled(false);

        tfNome.setEnabled(false);

        tfUser.setEnabled(false);

        tfSenha.setEnabled(false);

        tfCnpj.setEnabled(false);

        btnAlterar.setBackground(new java.awt.Color(91, 194, 231));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(204, 0, 51));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Sair");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apenas os campos com * podem ser alterados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlataforma)
                                .addGap(101, 101, 101)))
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addComponent(tfTel)
                                .addComponent(tfCnpj)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(157, 157, 157))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataforma))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Quando pressionado, será apresentado o registro anterior da tabela. 
    Caso o usuário esteja no primeiro registro, ele será impossibilitado de voltar
    um registro, pois não existe esse registro.*/   
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frm_menu_user mostra = new frm_menu_user(id, usuario, nome, cnpj);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /*Ação do botão responsável por alterar na tabela os dados de um registro a partir dos dados digitados nas caixas de texto. 
    Para encontrar o registro na tabela será usado o campo “código”, onde acontecerá um filtro e as alterações só ocorrerão quando o SQL encontrar na tabela 
    o registro que tenha o código coincidente: */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String endereco = tfEnd.getText();
        String telefone = tfTel.getText();
        String sql= "";
        String msg= "";
        
        try
        {
                sql="update cliente set endereco='" + endereco + "', telefone='" + telefone + "' where id_cliente = " + txtId.getText();
                msg = "Alteração de registro";

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + " realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from cliente where id_cliente = " + id);
            posicionarRegistro();
            
        }
        catch(SQLException errosql)
        {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
 
    //Esse método define qual texto será apresentado, a partir da escolha do usuário
    //Ele irá apresentar todos os dados de um registro por vez.
    private void mostrar_Dados()
    {
        try 
        {
            txtId.setText(id + "");
            tfNome.setText(nome);
            tfUser.setText(usuario);
            tfSenha.setText(con_cliente.resultset.getString("senha"));
            tfEnd.setText(con_cliente.resultset.getString("endereco"));
            tfTel.setText(con_cliente.resultset.getString("telefone"));
            tfCnpj.setText(cnpj);
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados: ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfTel;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
