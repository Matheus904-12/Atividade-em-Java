import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList();

        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Pedro");
        listaNomes.add("Ana");
        listaNomes.add("Lucas");

        //Funçã Anonima - Lambda

        listaNomes.removeIf(nome -> nome.equals("Pedro")); //Remove

        listaNomes.removeIf(nome -> nome.contains("M")); // Remove apenas letras maiusculas

        System.out.println(" === For ===");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Nome " + i + ": " + listaNomes.get(i));
        }

        System.out.println("\n === ForEach ===");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
