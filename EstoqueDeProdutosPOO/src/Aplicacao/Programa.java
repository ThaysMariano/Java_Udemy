package Aplicacao;
import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println(" ");
        System.out.println("Dados: "+produto);

        System.out.print("Entre o número de produtos a serem adicionados no estoque: ");
        int quantidadeAlterada = sc.nextInt();
        produto.adicionarProdutos(quantidadeAlterada);      //atualiza a quantidade
        System.out.println(" ");

        System.out.println("Dados atualizados: "+ produto);
        System.out.println(" ");

        System.out.println("Entre o número de produtos para serem removidos do estoque: ");
        quantidadeAlterada =sc.nextInt();
        produto.removerProdutos(quantidadeAlterada);
        System.out.println("Dados atualizados: "+ produto);
        System.out.println(" ");

        sc.close();
    }
}
