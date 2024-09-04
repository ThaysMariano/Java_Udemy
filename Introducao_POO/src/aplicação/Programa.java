package aplicação;

import java.util.Locale;
import java.util.Scanner;
import entidades.triangulo;

//Problema sem Orientação a Objetos:

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    /*
    Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas  válidas).
    Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
    */

        System.out.println("Digite os lados do primeiro triângulo");
        triangulo A, B;
        A= new triangulo();
        B = new triangulo();

        A.x = sc.nextDouble();
        A.y = sc.nextDouble();
        A.z = sc.nextDouble();

        System.out.println("Digite os lados do segundo triângulo");
        B.x = sc.nextDouble();
        B.y = sc.nextDouble();
        B.z= sc.nextDouble();

        double pA =(A.x+A.y+A.z)/2;
        double pB =(B.x+B.y+B.z)/2;

        double areaA = Math.sqrt((pA*(pA-A.x)*(pA-A.y)*(pA-A.z)));
        double areaB = Math.sqrt((pB*(pB-B.x)*(pB-B.y)*(pB-B.z)));

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