package entidades;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double mediaAluno() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String statusAluno() {
        if(this.nota1 >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + ", Nota 1: " + this.nota1 + ", Nota 2: " + this.nota2 + ", Média: " + mediaAluno();
    }
}
