public class main {
    public static void main(String[] args) {
        GerenciarListaAlunos gerenciarListaAlunos = new GerenciarListaAlunos();

        Aluno aluno1 = new Aluno("João", 8.5, 7.0);
        Aluno aluno2 = new Aluno("Maria", 6.0, 5.5);
        Aluno aluno3 = new Aluno("Pedro", 9.0, 8.5);

        gerenciarListaAlunos.adicionarAluno(aluno1);
        gerenciarListaAlunos.adicionarAluno(aluno2);
        gerenciarListaAlunos.adicionarAluno(aluno3);

        gerenciarListaAlunos.listarAlunos();
    }
}