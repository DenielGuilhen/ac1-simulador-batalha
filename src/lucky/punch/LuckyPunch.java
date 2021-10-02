package lucky.punch;

import java.util.Scanner;

public class LuckyPunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Personagem personagem1 = new Personagem("Wolf", "Agressivo");
        Personagem personagem2 = new Personagem("Turtle", "Defensivo");
        Personagem personagem3 = new Personagem("Bear", "Resistencia");
        Personagem personagem4 = new Personagem("Tiger", "Agil");

        System.out.println("Os lutadores lutaram entre si por 3 rounds para decidir quem é o mais forte.");
        System.out.println("Escolha seu personagem: Wolf, Turtle, Bear, Tiger.");
        
        String nomePers = sc.next();
        if (nomePers.equals("Wolf")) {
            System.out.println("Você escolheu: " + nomePers + ".");
        } else if (nomePers.equals("Turtle")) {
            System.out.println("Você escolheu: " + nomePers + ".");
        } else if (nomePers.equals("Bear")) {
            System.out.println("Você escolheu: " + nomePers + ".");
        } else if (nomePers.equals("Tiger")) {
            System.out.println("Você escolheu: " + nomePers + ".");
        } else {
            System.out.println("Nome incorreto");
        }
        
        System.out.println("Round 1: ");
        battle(personagem1, personagem2);
        System.out.println("Round 2: ");

        battle(personagem1, personagem3);
        System.out.println("Round 3: ");

        battle(personagem1, personagem4);
        
    }

    private static void battle(Personagem p1, Personagem p2) {

        if (p1.getLevel() > p2.getLevel()) {
            System.out.println(p1.getNome() + " Venceu.");
        } else {
            System.out.println(p2.getNome() + " Venceu.");
        }
    }

}
