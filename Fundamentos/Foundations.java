public class Foundations {
    
    public static void main(String[] args) {

            // Tipagem básica do Java - Primitivos

            int idade = 20;
            double altura = 1.75;
            float peso = 72.4f;
            char letra = 'M';
            boolean estudante = true;
            byte small = 127;
            short medio = 32000;

            System.out.println("=== TIPOS PRIMITIVOS ===");
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            System.out.println("Peso: " + peso);
            System.out.println("Letra: " + letra);
            System.out.println("Estudante: " + estudante);
            System.out.println("Byte: " + small);
            System.out.println("Short: " + medio);

            // Strings - não são primitivas, são um objeto

            String nome = "Matheus";
            String sobrenome = "Lucindo";
            String nomeCompleto = nome + " " + sobrenome;

            System.out.println("\n === STRINGS ===");
            System.out.println("Nome Completo: " + nomeCompleto);
            System.out.println("Tamanho do Nome: " + nome.length());
            System.out.println("Nome em Maiusculo: " + nome.toUpperCase());
            System.out.println("Nome em Minusculo: " + nome.toLowerCase());
            System.out.println("Contém 'ath'? " + nome.contains("ath"));
            System.out.println("Primeira Letra: " + nome.charAt(0));

            // Operadores - Aritméticos, Relacionais, Lógicos

            int a = 10;
            int b = 3;

            System.out.println("\n === OPERADORES ARITMÉTICOS===");
            System.out.println("Soma: " + (a + b));
            System.out.println("Subtração: " + (a - b));
            System.out.println("Multiplicação: " + (a * b));
            System.out.println("Divisão: " + (a / b));
            System.out.println("Resto: " + (a % b));

            System.out.println("\n === OPERADORES RELACIONAIS ===");
            System.out.println("a === b? " + (a == b));
            System.out.println("a != b? " + (a != b));
            System.out.println("a > b? " + (a > b));
            System.out.println("a < b? " + (a < b));
            System.out.println("a >= b? " + (a >= b));

            System.out.println("\n === OPERADORES LÓGICOS ===");
            boolean x = true;
            boolean y = false;
            System.out.println("x && y (E): " + (x && y));
            System.out.println("x || y (OU): " + (x || y));
            System.out.println("!x (NÂO): " + (!x));

            // Estruturta de Decisão - if, else if, else

            System.out.println("\n === ESTRUTURA DE DECISÃO ===");
            int nota = 85;

            if (nota >= 90) {
                System.out.println("Excelente!");
            } else if (nota >= 70) {
                System.out.println("Boa meu garoto;)");
            } else if (nota >= 50) { 
                System.out.println("Fica esperto!!!");
            } else {
                System.out.println("Reprovado seu burro!!! Pensa mais na próxima vez!!!");
            }

            // Operador ternario - curtinha para if-else simples

            String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
            System.out.println("Resultado: " + resultado);

            System.out.println("\n === SWITCH CASE ===");
            int diaSemana = 3;

            switch (diaSemana) {
                case 1:
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                default:
                    System.out.println("Final de Semana");
            }

            // Estruturas de Repetição de Loop

            System.out.println("\n ==== FOR ====");
            // for(inicio; condição; incremento)
            for (int i = 1; i <= 5; i++) {
                System.out.println("Volta " + i);
            }

            System.out.println("\n === WHILE ===");
            // roda enquanto a condição for true
            int contador = 1;
            while (contador <= 3) {
                System.out.println("Contando: " + contador);
                contador++; // mesmo que contador = contador = 1
            }

            System.out.println("\n ==== DO WHILE ===");
            // executa ao menos unma vez, depois verifica a condição
            int numero = 1;
            do {
                System.out.println("Número: " + numero);
                numero++;
            } while (numero <= 3);

            
        }
}