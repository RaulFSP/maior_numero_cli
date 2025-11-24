package io.github;

import java.util.Scanner;

public class Maior_numero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Comparador de Números");
        double num1 = sc.nextDouble();
        sc.nextLine();
        double num2 = sc.nextDouble();
        sc.nextLine();
        if (num1 == num2){
            System.out.println("Os número são iguais");
        } else if (num1 > num2){
            System.out.println("%.2f é maior que %.2f".formatted(num1,num2));
        } else {
            System.out.println("%.2f é maior que %.2f".formatted(num2,num1));
        }
        sc.close();
    }
}
