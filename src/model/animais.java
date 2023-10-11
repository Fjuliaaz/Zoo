package model;

import java.util.Scanner;

public class animais {
    Scanner teclado = new Scanner(System.in);
    String nome,sexo, especie;
    int idade;

    public void cadastroAnimais(){


        System.out.println("******** Cadastro ********");
        System.out.println("Qual o nome do animal? ");
        nome = teclado.nextLine();
        System.out.println("Qual o sexo do animal? ");
        sexo = teclado.nextLine();
        System.out.println("Quantos anos tem o animal? ");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Qual a espécie do animal? [Mamifero]-[Ave]-[Réptil]");
        especie = teclado.nextLine();



    }
}

