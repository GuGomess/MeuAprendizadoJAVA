import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection connection; // IMPORTA A BIBLIOTECA JAVA.SQL E CRIA VARIÁVEL DE REFERÊNCIA
	private String driver = "oracle.jdbc.driver.OracleDriver"; // REFERENCIA O DRIVER DE DETERMINADO PROVEDOR DE BD

	// JDBC:ORACLE:THIN:@ENDEREÇO DO SERVIDOR:PORTA:SERVIÇO
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"; // REFERENCIA O CAMINHO DO SERVIDOR

	// CREDENCIAIS DE ACESSO - (VALORES RETIRADOS POR QUESTÕES DE SEGURANÇA) 
	private String login = ""; // LOGIN
	private String senha = ""; // SENHA

	// MÉTODO CONECTAR
	public Connection Conectar() {

		try {
			Class.forName(driver); // REFERENCIA O DRIVER PARA TENTATIVA DE CONEXÃO
			connection = DriverManager.getConnection(url, login, senha); // ASSOCIA A URL, LOGIN E SENHA AO DRIVER PARA ACESSAR O BANCO DE DADOS

		} catch (ClassNotFoundException e1) {
			System.out.println("Erro ao carregor o driver\n" + e1);

		} catch (SQLException e2) {
			System.out.println("Erro ao conectar com o banco de dados\nVerifique: login, senha ou URL" + e2);
		}
		return connection;
	}

}
