public class Main {

	public static void main(String[] args) {

		AlunoDAO dao = new AlunoDAO(); // A CONEXÃO COM O BANDO DE DADOS JÁ ESTÁ NO CONSTRUTOR!
		
		//dao.inserir(new Aluno(84979	, "Gustavo"));	//INSERE ALUNO (RM, NOME)
		
		//System.out.println(dao.pesquisar(95142)); //PESQUISA POR RM - RETORNA TRUE/FALSE
		
		dao.atualizar(new Aluno(95142, "Steve"));	//ALTERANDO DADOS DO BANCO DE DADOS
		
		System.out.println(dao.listar());
	}
}
	