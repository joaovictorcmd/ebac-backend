package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.enums.Gender;

import java.util.Scanner;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 23
 */
public class Program {
    public static void main(String[] args) {

        NaturalPerson pessoaFisica = new NaturalPerson("Gabriel", "gabriel@gmail.com", "Rua Gabriel, 1200", "+1 520 636-5216", "123456789", Gender.valueOf("MALE"), "Single");
        LegalPerson pessoaJuridica = new LegalPerson("Vadd", "vadd@gmail.com", "Rua Requanto 65", "+55 62 3695-8596", "4569802");

        System.out.println(pessoaFisica.getName());
        System.out.println(pessoaJuridica.getName().toUpperCase());

    }
}
