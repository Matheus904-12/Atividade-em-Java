package src;


import java.util.List;

public class GerenciarListaAlunos {

    private final List<Aluno> listaAlunos = new ArrayList<>();

    // Create - Cadastrar Aluno public void adicionarAluno(Aluno aluno) {
 listaAlunos.add(aluno);
 System.out.println("Aluno adicionado com sucesso!");
}

public void listarAlunos() {
    if (listaAlunos.isEmpty()) {
        System.out.println("Nenhum aluno encontrado");
    } else {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}
}