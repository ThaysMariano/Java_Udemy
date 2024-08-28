import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //09.04.2024
        //Lista de exercicios para iniciantes Udemy Java estruturta sequencial
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //01 somas inteiras
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println("Soma= "+(A+B));

        int C, D;
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println("Soma= "+(C+D));

        int E, F;
        E = sc.nextInt();
        F = sc.nextInt();
        System.out.println("Soma= "+(E+F));

        //02 area circulo
        double raio, area;
        float PI = 3.14159F;
        System.out.println("Insira o raio");
        raio = sc.nextDouble();            //mesmo com o locale ele so aceita com a virgula
        area = PI * Math.pow(raio, 2.0);
        System.out.printf("o circulo com raio igual a "+ raio + " possui area igual a %.4f%n" ,area);

        //03 expressao
        int G, H, I, J, diferenca;
        System.out.println("Digite os quatro numeros");
        G = sc.nextInt();
        H = sc.nextInt();
        I = sc.nextInt();
        J = sc.nextInt();
        diferenca = (G*H)-(I*J);
        System.out.println("Diferença = "+diferenca);

        //04 salario por hora trabalhada
        int numFuncionario;
        double horas, valorHora;
        System.out.println("Digite o numero do funcionario");
        numFuncionario = sc.nextInt();
        System.out.println("Digite as horas trabalhadas");
        horas = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada");
        valorHora = sc.nextDouble();
        System.out.println("Funcionario: " + numFuncionario);
        System.out.printf("Salario: R$ %.2f%n ", horas*valorHora);

        //05 pecas na loja
        int codigo, codigo2, quantidade, quantidade2;
        double preco, preco2;
        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        preco= sc.nextDouble();
        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        preco2= sc.nextDouble();
        System.out.println("Valor a pagar R$: "+ ((quantidade*preco) + (quantidade2*preco2)));

        //10.04.2024
        //06
        double K, L, M, areaTg, areaCl, areaTp, areaQd, areaRt;
        System.out.println("Digite 3 dados para calcular a area");
        K= sc.nextDouble();
        L= sc.nextDouble();
        M= sc.nextDouble();
        areaTg= (K*M)/2;
        areaCl= Math.pow(M, 2) * 3.14159;
        areaTp= ((K+L)*M)/2;
        areaQd= Math.pow(L,2);
        areaRt=K*L;
        System.out.printf("Area do triangulo: %.3f%n", areaTg);
        System.out.printf("Area do circulo: %.3f%n", areaCl);
        System.out.printf("Area do trapezio: %.3f%n", areaTp);
        System.out.printf("Area do quadrado: %.3f%n", areaQd);
        System.out.printf("Area do retangulo: %.3f%n", areaRt);


        //







        sc.close();

    }
}