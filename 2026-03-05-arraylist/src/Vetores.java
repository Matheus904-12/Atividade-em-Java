public class Vetores {
    public static void main(String[] args) {
        double[] listaNumeros = new double[10];

        listaNumeros[0] = 1;
        listaNumeros[1] = 2;
        listaNumeros[2] = 3;
        listaNumeros[3] = 4;
        listaNumeros[4] = 5;

        //Percorrer Vetores em java

        System.out.println("\n === FOR ===");
        // inicio, condição de parada, incremento
        for (int i = 0; ,1 < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
        
        //ForEach
        System.out.println("\n === ForEach ===");
        for(double num : listaNumeros) {
            System.out.println(num);
        }
    }
}
