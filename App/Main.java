package App;

import Personagens.Factory;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("===== Character Generator v.1.0 =====");
        System.out.println("Digite o nome do seu personagem: ");
        String nome = input.nextLine();

        System.out.println("Rolando Atributos...");
        System.out.println('.');
        System.out.println('.');
        System.out.println('.');

        // Geração dos atributos
        int forca = 10 + rand.nextInt(9);
        int destreza = 10 + rand.nextInt(9);
        int constituicao = 10 + rand.nextInt(9);
        int inteligencia = 10 + rand.nextInt(9);
        int sabedoria = 10 + rand.nextInt(9);

        System.out.println("Seus Atributos são: ");
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constituição: " + constituicao);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Sabedoria: " + sabedoria);
        System.out.println(' ');


        System.out.println("Escolha a classe (Mago, Arqueiro, Clerigo, Guerreiro, Ladino): ");
        String classe = input.nextLine();

        Factory.criar(classe, nome, forca, destreza, constituicao,sabedoria,inteligencia);


    }
}
