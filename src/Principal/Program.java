package Principal;

import java.util.Scanner;
import Entities.Bill;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        Bill bill = new Bill();

      
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        bill.setGender(sexo); 

        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = sc.nextInt();
        bill.setBeer(quantidadeCervejas); 

        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = sc.nextInt();
        bill.setSoftDrink(quantidadeRefrigerantes); 

        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = sc.nextInt();
        bill.setBarbecue(quantidadeEspetinhos); 

      
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());

        double couvert = bill.cover();
        if (couvert == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }

        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());

        sc.close();
    }
}
