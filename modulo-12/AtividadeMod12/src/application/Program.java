package application;

import java.util.*;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 16
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1
        System.out.println("PARTE 1");

        System.out.println("Digite nomes separados por vírgula:");
        String line = sc.nextLine();

        String[] fields = line.split(",");

        List<String> names = new ArrayList<>(Arrays.asList(fields));
        names.replaceAll(String::trim);

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();


        // Part 2
        System.out.print("Quantidade de pessoas que serão digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, String> men = new TreeMap<>();
        Map<String, String> women = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", (i+1));
            String name = sc.nextLine();

            System.out.printf("Digite o gênero da pessoa %d: ", (i+1));
            String gender = sc.nextLine();

            if (gender.equalsIgnoreCase("masculino")) {
                men.put(name, gender);
            } else if (gender.equalsIgnoreCase("feminino")) {
                women.put(name, gender);
            }
            System.out.println();
        }

        System.out.println("HOMENS:");
        for (String name : men.keySet()) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("MULHERES:");
        for (String name : women.keySet()) {
            System.out.println(name);
        }

        sc.close();
    }
}
