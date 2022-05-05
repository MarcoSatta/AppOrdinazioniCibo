package it.AppPerOrdinazioniCibo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("------------------------------");
        System.out.println("Benvenuto su SpaceFood!");
        System.out.println("Qual'è il tuo nome?");
        cliente.nome = scanner.nextLine();
        System.out.println("Qual'è il tuo cognome?");
        cliente.cognome = scanner.nextLine();
        System.out.println("Quanti anni hai?");
        cliente.età = scanner.nextLine();
        System.out.println("Ti sei correttamente autenticato nel nostro portale " + cliente.nome + " " + cliente.cognome + "!");
        System.out.println("--------------------------------");
        System.out.println("Cosa desideri ordinare?");
        boolean condizione1 = true;
        while(condizione1){
            System.out.println("--------------------------------");
            System.out.println("McDonald's -> 1");
            System.out.println("BurgerKing -> 2");
            System.out.println("Sushi -> 3");
            System.out.println("Pizzeria -> 4");
            System.out.println("Ristorante -> 5");
            System.out.println("--------------------------------");
            String scelta = scanner.nextLine();
            switch (scelta){
                case "1" : condizione1 = false;
                    break;
                case "2" : condizione1 = false;
                break;
                case "3" : condizione1 = false;
                break;
                case "4" : condizione1 = false;
                    break;
                case "5" : condizione1 = false;
                    break;
                default:
                    System.out.println("Devi inserire un numero compreso tra quelli indicati");
                    break;
            }
        }

    }
}
