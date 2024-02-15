package conexao;


import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Júlio e Maria
 */

public class Conexao {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/bd_jogos";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    
    public boolean conecta(){

        boolean result = true;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);        
        } catch (ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver não localizado.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada.", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
    
    public void desconecta(){
        
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException fecha){
            
        }
    }
    
    public void executaSQL(String sql){
        
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao){
            JOptionPane.showMessageDialog(null, "Dados não localizados!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
