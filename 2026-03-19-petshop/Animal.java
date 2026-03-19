public class Animal {
    protected String nome;
    protected double idade;
    protected String raca;
    protected String cor;
    protected double peso;

    public Animal(String nome, double idade, String raca, String cor, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return this.idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer() {
        System.out.println("Comendo");
    }

    public void dormir() {
        System.out.println("Zzzzzz");
    }

    public void fazerSom() {
        System.out.println("O animal faz um som genérico.");
    }

    public void brincar() {
        System.out.println("Brincando");
    }
}