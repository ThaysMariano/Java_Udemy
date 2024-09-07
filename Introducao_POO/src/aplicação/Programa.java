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
        triangulo A, B;
        A= new triangulo();
        B = new triangulo();

        System.out.println("Digite os lados do primeiro triângulo");
        A.x = sc.nextDouble();
        A.y = sc.nextDouble();
        A.z = sc.nextDouble();

        System.out.println("Digite os lados do segundo triângulo");
        B.x = sc.nextDouble();
        B.y = sc.nextDouble();
        B.z= sc.nextDouble();

        double areaA = A.calcularArea();
        double areaB = B.calcularArea();

        System.out.printf("Área primeiro triângulo: %.2f%n", areaA);
        System.out.printf("Área segundo triângulo: %.2f%n", areaB);

        double maiorArea;
        String nome;
        if(areaA>areaB){
            maiorArea = areaA;
            nome = "primeiro";
        }else{
            maiorArea= areaB;
            nome = "segundo";
        }
        System.out.printf("A maior área é: %.2f do %s triângulo.", maiorArea, nome);

        sc.close();
    }

}