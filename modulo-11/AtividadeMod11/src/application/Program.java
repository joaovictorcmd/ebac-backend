package application;

import java.util.*;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 11
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        names.add("Laura Ferreira");
        names.add("Pedro Lima");
        names.add("Ana Souza");
        names.add("João Santos");
        names.add("Mariana Costa");
        names.add("Gabriel Almeida");
        names.add("Lucas Rocha");
        names.add("Beatriz Barbosa");
        names.add("Rafael Melo");
        names.add("Juliana Oliveira");
        names.add("Thiago Pereira");
        names.add("Fernanda Carvalho");
        names.add("Matheus Fernandes");
        names.add("Carolina Ribeiro");
        names.add("Bruno Gonçalves");
        names.add("Letícia Castro");
        names.add("André Nunes");
        names.add("Camila Martins");
        names.add("Felipe Silva");
        names.add("Daniela Mendes");

        Collections.sort(names);

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}
