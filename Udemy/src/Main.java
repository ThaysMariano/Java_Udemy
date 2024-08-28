import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Java COMPLETO Programação Orientada a Objetos + Projetos -Nelio ALves

        // 18.03.2024
        //diferenca print e println
        System.out.print("OLA ");
        System.out.print("MUNDO");
        System.out.println("");
        System.out.println("ola");
        System.out.println("mundo");

        //variavel
        int y = 24;
        System.out.println(y);

        double x = 10.34678;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //padrao eua
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        //concatenar
        System.out.println("Resultado = " + x + " metros!");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Ana";
        int idade = 36;
        double salario = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f de salario %n", nome, idade, salario);

        //19.03.2024
        //exercicio
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n%s, which price is $ %.2f %n%s, which price is %.2f %n" , product1, price1, product2, price2);
        System.out.println("");
        System.out.printf("Record: %d years old, code %d and gender: %c %n" ,age, code, gender);
        System.out.println("");
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);

        // variaveis
        int z, w;
         z = 5;
         w = z*2;
        System.out.println(w);

        //20.03.2024
        int c;
        double d;
        c = 5;
        d = c*2;
        System.out.println(d);

        //area trapezio
        double B, b, h, area;
        B = 8.0;
        b = 6.0;
        h = 5.0;
        area = (B+b)/2.0*h;
        System.out.println("A área do trapézio é " + area +" cm3");

        //exemplo 4 (resultado=2.0 se nao colocar o double na equacao)
        int e, f;
        double resultado;
        e = 5;
        f = 2;
        resultado = (double) e/f;
        System.out.println(resultado);

        //exemplo 5 (se nao colocar o int no i=g nao funciona)
        double g;
        int i;
        g = 5.0;
        i = (int) g;
        System.out.println(i);

        // ENTRADA DE DADOS

        Scanner sc = new Scanner(System.in);
        String X;
        X = sc.next();
        System.out.println("Você digitou o valor: "+ X);
        int  Y;
        Y = sc.nextInt();
        System.out.println("Você digitou: "+ Y);
        double  Z;
        Z = sc.nextDouble();
        System.out.println("Você digitou: "+ Z);
        char  W;
        W = sc.next().charAt(0);
        System.out.println("Você digitou: "+ W);

        String A;
        int C;
        double D;
        A = sc.next();
        C = sc.nextInt();
        D = sc.nextDouble();
        System.out.println("Itens digitados:");
        System.out.println(A);
        System.out.println(C);
        System.out.println(D);

        //line é a linha inteira, mais de uma palavra
       int S;
        String s1, s2, s3;
        S = sc.nextInt();
        sc.nextLine();          //armazena o enter
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(S);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //09.04.2024
        //funcoes matematicas
         double q = 3.0;
         double o = 4.0;
         double p = -5.0;
         double R, T, G;

         R = Math.sqrt(q);
         T = Math.sqrt(o);
         G = Math.sqrt(25.0);
         System.out.println("Raiz quadrada de "+ q + " = "+ R);
        System.out.println("Raiz quadrada de "+ o + " = "+ T);
        System.out.println("Raiz quadrada de 25 " + " = "+ G);

        R = Math.pow(q, o);
        T = Math.pow(q, 2.0);
        G = Math.pow(5.0, 2.0);
        System.out.println(q + " elevado a "+ o + " = "+ R);
        System.out.println(q + " elevado a "+ "2.0" + " = "+ T);
        System.out.println("5.0" + " elevado a "+ "2.0" + " = "+ G);

        R = Math.abs(q);
        T = Math.abs(p);
        System.out.println("Valor absoluto de  "+ q + " = "+ R);
        System.out.println("Valor absoluto de "+ p + " = "+ T);

        //bhaskara
        int b0= 2;
        int a0 = 4;
        int c0 = 0;
        double X1, X2, delta, Rdelta;
        delta=Math.pow(b0, 2.0) - (4*a0*c0);
        Rdelta= Math.sqrt(delta);
        X1=((-(b0) + Rdelta)/(2*a0));
        X2=((-(b0) - Rdelta)/(2*a0));

        System.out.println("Raizes= "+ X1 + " , " + X2 + " e delta vale: " + delta);






        sc.close();





















    }
}