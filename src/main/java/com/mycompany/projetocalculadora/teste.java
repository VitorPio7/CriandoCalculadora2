package com.mycompany.projetocalculadora;



import java.util.Scanner;

public class teste {

    private static double x;
    public static double y;

    public static void main(String[] args) {

        exibirImformacao();

        for (EnumCalc e1 : EnumCalc.values()) {
            System.out.print(x + " ");
            System.out.print(e1.toString() + " ");
            System.out.print(y + " :");
            try {
                System.out.println(e1.executarOperacao(x, y));
            } catch (Exception ex) {
                System.out.println("Calculo não pode ser realizado, insira os valores novamente");
            }
        }

    }

    public static void exibirImformacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
         y = sc.nextDouble();
        System.out.print("\nDigite o segundo numero: ");
         x = sc.nextDouble();
    }

}
