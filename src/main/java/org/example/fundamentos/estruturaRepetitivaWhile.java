package org.example.fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String senha = sc.next();

        while (!senha.equals("2006")){
            System.out.println("Senha invalida:(");
            senha = sc.next();
        }

        System.out.println("Acessa liberado:)");

        sc.close();
    }
}
