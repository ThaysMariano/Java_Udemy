package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // PROGRAMA ORIGINAL

    /*
    Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas  válidas).
    Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
    */


    //Problema sem Orientação a Objetos:

        System.out.println("Digite os lados do primeiro triângulo");
        double xA, yA, zA;
        xA = sc.nextDouble();
        yA = sc.nextDouble();
        zA = sc.nextDouble();

        System.out.println("Digite os lados do segundo triângulo");
        double xB, yB, zB;
        xB = sc.nextDouble();
        yB = sc.nextDouble();
        zB = sc.nextDouble();

        double pA =(xA+yA+zA)/2;
        double pB =(xB+yB+zB)/2;

        double areaA = Math.sqrt((pA*(pA-xA)*(pA-yA)*(pA-zA)));
        double areaB = Math.sqrt((pB*(pB-xB)*(pB-yB)*(pB-zB)));

        System.out.printf("Área primeiro triângulo: %.2f%n", areaA);
        System.out.printf("Área segundo triângulo: %.2f%n", areaB);

        double maiorArea;
        String nome;
        if(areaA>areaB){
            maiorArea = areaA;
            nome = "Primeiro";
        }else{
            maiorArea= areaB;
            nome = "Segundo";
        }
        System.out.printf("A maior área é: %.2f do %s triângulo.", maiorArea, nome );

        sc.close();
    }

}