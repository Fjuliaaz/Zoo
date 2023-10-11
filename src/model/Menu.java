package model;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner teclado = new Scanner(System.in);

        int resposta;

        System.out.println("O que deseja fazer?");
        System.out.println("[1]- Cadastrar Mamifero: ");
        System.out.println("[2]- Cadastrar Aves: ");
        System.out.println("[3]- Cadastrar Repteis: ");
        System.out.println("[4]- Ver informação das espécies: [Mamifero]-[Ave]-[Réptil] ");
        resposta = teclado.nextInt();

        if (resposta == 1) {
            mamiferos mamiferos = new mamiferos();
            mamiferos.cadastroanimais();
            if (resposta == 2) {
                Aves aves = new Aves();
                Aves.CadastroAves();
            }
        }


    }
}