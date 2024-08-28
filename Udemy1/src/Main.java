//5 - Estrutura Condicional

import java.util.Scanner;

public class Main { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//IF-ELSE
//01 - Dizer se um numero e positivo ou negativo
    System.out.println("Digite um número");
    int numero;
    numero = scanner.nextInt();

    if (numero > 0) {
        System.out.println("POSITIVO");
    } else if (numero == 0) {
        System.out.println("ZERO");
    } else {
        System.out.println("NEGATIVO");
    }

//02 - Dizer se e par ou impar
    System.out.println("Digite um número para verificar se e impar ou par");
    int num;
    num = scanner.nextInt();
    if (num % 2 == 0) {
        System.out.println("Par");
    } else {
        System.out.println("Impar");
    }

//03 - Dizer se os nuemros sao multiplos
    System.out.println("Digite 2 numeros para verificar se sao multiplos");
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    if (A==0 || B==0){
        System.out.println("Um dos numeros é 0");
    }
    else if (A % B == 0 || B % A == 0) {
        System.out.println("Sao multiplos");
    } else {
        System.out.println("nao sao multiplos");
    }

//04 - intervalo de tempo (maximo de 24 horas)
        System.out.println("Digite a hora inicial");
    int a = scanner.nextInt();
        System.out.println("Digite a hora final");
    int b = scanner.nextInt();

    if (b<a){
        b = b +24;
        System.out.println("O jogo durou "+ (b-a) + " horas");
    } else if (a==b) {
        System.out.println("O jogo durou 24 horas");
    } else {
        System.out.println("O jogo durou "+ (b-a) + " horas");
    }
//05 - Ler codigo e quantidade de itens
    System.out.println("Digite o codigo do produto");
    double codigo = scanner.nextDouble();
    System.out.println("Digite a quantidade de produtos");
    int quantidade = scanner.nextInt();
    double total;

    if (codigo == 1) {
        total = quantidade * 4;
        System.out.println(quantidade + " Cachorros quentes por " + total +" reais");
    }
    else if (codigo == 2){
        total = quantidade * 4.5;
        System.out.println(quantidade + " X-Saladas por " + total +" reais");
    }
    else if (codigo == 3){
        total = quantidade * 5;
        System.out.println(quantidade + " X-Bacon por " + total +" reais");
    }
    else if (codigo == 4){
        total = quantidade * 2;
        System.out.printf(" %d Torradas simples por %.2f reais %n", quantidade, total);
    }
    else if (codigo == 5){
        total = quantidade * 1.5;
        System.out.printf("%d Refrigerantes por %.2f reais %n" ,quantidade, total); //outro jeito de escrever
    }
    else {
        System.out.println("Opcao invalida");
    }

//06 - Identificar se pertence ao intervalo
    System.out.println("Digite um numero para verificar se esta no intervalo");
    double numAleatorio = scanner.nextDouble();

    if (numAleatorio < 0 || numAleatorio > 100){
        System.out.println("Numero fora do intervalo");
    }
    else if (numAleatorio <= 25){
        System.out.println("Intervalo [0,25]");
    }
    else if (numAleatorio <=50){
        System.out.println("Intervalo de ]25, 50]");
    }
    else if (numAleatorio <=75){
        System.out.println("Intervalo de ]50, 75]");
    }
    else{
        System.out.println("Intervalo de ]75 100]");
    }

//07 - qual o quadrante no plano cartesiano com dois pontos
    System.out.println("Digite x e y");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    if (x==0 && y==0){
        System.out.println("Ponto de origem");
    }
    else if(x==0){
        System.out.println("Eixo Y");
    }
    else if (y==0){
        System.out.println("Eixo X");
    }
    else if (x > 0 && y>0){
        System.out.println("Quadrante 1");
    }
    else if (x< 0 && y>0){
        System.out.println("Quadrante 2");
    }
    else if (x< 0 && y<0){
        System.out.println("Quadrante 3");
    }
    else if (x > 0 && y<0){
        System.out.println("Quadrante 4");
    }

//08 - Imposto sobre o salario recebido
    System.out.println("Digite o salario");
    double salario = scanner.nextDouble();
    double imposto;

    if (salario <= 2000){
        System.out.println("Salario isento de imposto");
    }
    else if (salario <= 3000){
        imposto = (salario - 2000)* 0.08;
        System.out.printf("Imposto a pagar: %.2f%n", imposto);
    }
    else if (salario <= 4500){
        imposto = (1000 * 0.08)+ (salario - 3000)*0.18;
        System.out.printf("Imposto a pagar: %.2f%n", imposto);
    }
    else {
        imposto = (1000*0.08)+(1500*0.18)+((salario - 4500)*0.28);
        System.out.printf("Imposto a pagar: %.2f%n", imposto);
    }

// Extra - Conta fixa de R$50 por 100 minutos, R$2 por minuto a mais
    System.out.println("Digite quantos minutos foram usados");
    int minutos = scanner.nextInt();
    double conta = 50;

    if (minutos > 100){
        conta+= ((minutos - 100) * 2);
    }   //conta = conta + (minutos... --> mesma coisa
System.out.printf("O valor a pagar sera de: %.2f reais %n", conta);

// Condicao Ternaria
// (2>4)? 3:7   ->exibe 7

    double preco = scanner.nextDouble();
    double desconto = (preco<25)? preco*0.1 : preco*0.05;
    //se o preco for menor que 20 o desconto e de 10% se nao e de 5%
    //apenas exemplo, nao esta completo



//WHILE

// 01- Mostrar "senha invalida" ate a senha estar correta
    int senhaReal = 2002;
    System.out.println("Digite a senha");
    int senha = scanner.nextInt();
    while(senha != senhaReal){
        System.out.println("Senha inválida");
        senha = scanner.nextInt();   //pede p entrar senha dnv
    }
    System.out.println("Acesso permitido");

//02- dizer o quadrante que o ponto pertence mas se uma coordenada for 0 nao mostrar nada
   System.out.println("Digite dois numeros para as coordenadas");
    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    while (X != 0 && Y !=0){
        if(X>0 && Y>0){
            System.out.println("Primeiro quadrante");
        }
        else if (X>0 && Y<0){
            System.out.println("Quarto quadrante");
        }
        else if (X<0 && Y>0){
            System.out.println("Segundo quadrante");
        }
        else {
            System.out.println("Terceiro quadrante");
        }
        X = scanner.nextInt();
        Y = scanner.nextInt();
    }


//03- Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo

    System.out.println("Digite a opção desejada" + " 1.Álcool" + " 2.Gasolina" + " 3.Diesel" + " 4.Fim");

    int tipo = scanner.nextInt();
    int qntAlcool = 0;
    int qntGasolina= 0;
    int qntDiesel= 0;

    while(tipo!=4) {
        if (tipo == 1) {
            qntAlcool += 1;
        } else if (tipo == 2) {
            qntGasolina += 1;
        } else if (tipo == 3) {
            qntDiesel += 1;
        } else  {
            System.out.println("Cogido invalido, digite novamente");
        }
        tipo = scanner.nextInt();
    }

    if (tipo == 4){
        System.out.println("MUITO OBRIGADO " + "Alcool: "+ qntAlcool+ " Gasolina: "+qntGasolina+ " Diesel: "+ qntDiesel);
    }
//com os "formal specifier" nao deu certo


// FOR

//01 - mostrar os impares de 1 ate x
    System.out.println("Digite um numero para parar a contagem de impares");
    int numeroInicial= scanner.nextInt();
    for (int i = 1; i<= numeroInicial; i+=2){
            System.out.println(i);
    }

//02 - Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
    System.out.println("Digite o numero de valores a serem verificados no intervalo de 10 a 20");
    int in=0;
    int out=0;
    int numeroValores= scanner.nextInt();
    for (int i = 0; i<numeroValores; i++){
        int numerosIntervalo= scanner.nextInt();
        if(numerosIntervalo>=10 && numerosIntervalo<=20){
            in++;
        }
        else {
            out++;
        }
    }
    System.out.println("in: "+ in+ " out: "+out);

//03- Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.
    System.out.println("Digite o numero de casos a serem analisados ");
    int numeroCasos = scanner.nextInt();
    for(int i = 0; i<numeroCasos; i++){
        System.out.println("Digite os 3 valores");
        double val1 = scanner.nextDouble();
        double val2 = scanner.nextDouble();
        double val3 = scanner.nextDouble();
        double meDia = ((val1*2)+(val2*3)+(val3*5))/10;
        System.out.printf("Media: %.1f%n", meDia);
    }

//04-Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

    System.out.println("Digite um numero N");
    int numeroN = scanner.nextInt();
    for(int i =0; i<numeroN; i++){
        System.out.println("Digite os pares de numeros");
        double num1 =scanner.nextDouble();
        double num2 =scanner.nextDouble();
        if (num2 == 0){
            System.out.println("Divisao impossivel");
        }
        else {
            double divisaonum = (num1/num2);
            System.out.printf("Divisao igual a: %.1f%n", divisaonum);
        }
    }
    //05- Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    //Lembrando que, por definição, fatorial de 0 é 1.

    System.out.println("Digite o numero para calcular o fatorial");
    int N = scanner.nextInt();
    int fatorial = 1;
    if (N==0){
        System.out.println("1");
    }else {
        for (int i = 1; i <= N; i++) {
            fatorial = fatorial * i;

        }
        System.out.printf("Fatorial igual a %d%n", fatorial);
    }

//06- Ler um número inteiro N e calcular todos os seus divisores.






    scanner.close();




}
}