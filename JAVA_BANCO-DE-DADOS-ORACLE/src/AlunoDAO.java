import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO {
	private Connection connection; // ARMAZENA A CONEXÃO ESTABELECIDA
	private String sql; // AUXILIZAR PARA A MONTAGEM DAS INSTRUÇÕES SQL
	private PreparedStatement ps; // UTILIZADA PARA EXECUTAR OS COMANDOS SQL NO BANCO DE DADOS
	private ResultSet rs; // UTILIZADA PARA ARMAZENAR DADOS QUE SERÃO RECEBIDOS DO BANCO DE DADOS (SELECT)

	// CONSTRUTOR
	public AlunoDAO() {
		connection = new Conexao().Conectar();
	}

	// MÉTODO PARA INSERIR OS DADOS DE UM ALUNO NO BANCO DE DADOS
	public void inserir(Aluno aluno) {
		sql = "INSERT INTO JAVA_ALUNO(rm, nome) values(?, ?)";
		try {
			ps = connection.prepareStatement(sql); // LINHA PARA FAZER A INSERÇÃO NA BASE DADOS
			ps.setInt(1, aluno.getRm());
			ps.setString(2, aluno.getNome());
			ps.execute(); // EXECUTA A INSTRUÇÃO SQL NO BANCO DE DADOS

		} catch (SQLException e1) {
			System.out.println("Erro ao cadastrar aluno\n" + e1);
		}
	}

	// MÉTODO PARA PESQUISAR UM ALUNO PELO SEU RM
	public boolean pesquisar(int rm) {
	boolean aux = false;
	sql = "SELECT * FROM JAVA_ALUNO WHERE rm = ?";
	try {
		ps = connection.prepareStatement(sql);
		ps.setInt(1, rm);
		rs = ps.executeQuery(); //EXECUTA SELECT NO BANCO DE DADOS
		aux = rs.next();
	}
	catch (SQLException e1) {
		System.out.println("Erro ao pesquisar aluno\n" + e1);
	}
	return aux;
	}
	
	
	//MÉTODO PARA LISTAR TODOS OS ALUNOS DO BANCO DE DADOS
	public ArrayList<Aluno> listar(){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		sql = "SELECT * FROM JAVA_ALUNO";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				lista.add(new Aluno(rs.getInt("rm"), rs.getString("nome")));
			}
			
		}
		catch(SQLException e1) {
			System.out.println("Erro ao listar alunos\n" + e1);
		}
		return lista;
	}
	
	//MÉTODO PARA (ATUALIZAR) ALTERAR OS DADOS DE UM ALUNO NO BANCO
	public void atualizar(Aluno aluno){
		sql = "UPDATE JAVA_ALUNO SET NOME = ? WHERE RM = ?";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getRm());
			ps.execute();
		}
		catch(SQLException e1) {
			System.out.println("Erro ao atualizar dados do aluno\n" + e1);
		}
	}
}