package ExerciciosIntroducaoJava.JavaI;

import java.text.NumberFormat;
import java.util.*;

public class IntroducaoIJava {

    // Introdução ao java TM lista 01

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        numerosPares(sc);
//        numerosMultiplos(sc);
//        System.out.println(numerosPrimo(sc));
//        imprimaPrimo(sc);
//        arrayDados();
//        getEvolucaoAnual();
//        imprimaProdutos();

        sc.close();

    }

    /* 1) Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá inserir pelo console. */
    public static void numerosPares(Scanner sc) {
        System.out.print("Digite o numero: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num ; i++){
            System.out.println(i * 2);
        }
    }

    /* 2) Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n em valores que o
        usuário irá inserir via console. Lembre-se que um número a é divisível por b
        quando o resto da divisão de a por b é igual a 0.*/


    public static void numerosMultiplos(Scanner sc) {
        System.out.print("Digite a quantidade de numeros a verificar: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o numero multiplo: ");
        int numMultiplo = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num ; i++){
            System.out.println(i * numMultiplo);
        }
    }



    /* 3) Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
         valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
         divisível por 1 e por si mesmo. */
    public static String numerosPrimo(Scanner sc) {

        System.out.print("Digite o numero: ");
        int num = Integer.parseInt(sc.nextLine());

        if (num == 0 || num == 1){
            return  "não é primo";
        } else if(num == 2){
            return  "não é primo";
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return  "não é primo";
            }
        }
        return "não é primo";

    }

   /* Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
    e m, sendo m um valor que o usuário irá inserir pelo console */

    public static void imprimaPrimo(Scanner sc) {
        System.out.print("Digite o numero: ");
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 2; i <= num; i++) {
            boolean primo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }
        }
    }

    // Introdução ao java TM lista 02


    /*
        Praticar arrays e projeção de dados.
        Exercício 1: Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.
                Integer[] array ={52,10,85,1324,01,13,62,30,12,127};
        Imprima no console:
        a) Sua ordenação crescente.
        b) Sua ordenação decrescente.

     */

    public static void arrayDados() {
        Integer[] array ={52,10,85,1324,01,13,62,30,12,127};
        System.out.println("Original: "+ Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Crescente: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Decrescente: " + Arrays.toString(array));
    }

    /*
            Exercício 2: Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
        R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
        “Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.
        Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
        empresa X ultrapasse a empresa Y em seu valor de mercado.
     */


    public static void getEvolucaoAnual(){
        NumberFormat reais = NumberFormat.getCurrencyInstance();

        double valorEmpresaX = 1130000.0; //1,13m
        double valorEmpresaY = 18400000.0; //18,4m

        double crescenteEmpresaX = 1.48; //148%
        double crescenteEmpresaY = 0.32; //32%

        int contadorAnos = 2021;

        System.out.println("Empresa X - 01/01/2021 - valor da empresa: " + reais.format(valorEmpresaX));
        System.out.println("Empresa Y - 01/01/2021 - valor da empresa: " + reais.format(valorEmpresaY));
        System.out.println();

        while(true){
            valorEmpresaX = valorEmpresaX + (valorEmpresaX * crescenteEmpresaX);
            valorEmpresaY = valorEmpresaY + (valorEmpresaY * crescenteEmpresaY);
            contadorAnos++;

            System.out.println("Empresa X - 01/01/"+contadorAnos+" - valor da empresa: " + reais.format(valorEmpresaX));
            System.out.println("Empresa Y - 01/01/"+contadorAnos+" - valor da empresa: " + reais.format(valorEmpresaY));
            System.out.println();

            if(valorEmpresaX > valorEmpresaY){
                break;
            }
        }
    }

    /*
         Exercício 3: Para um protótipo de supermercado, crie um programa que leia 3 produtos e
        imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
        estrutura de dados para armazenamento dos produtos informados.
    */

    static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        private static double total;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
            total += preco * quantidade;
        }

        @Override
        public String toString() {
            return nome + "\nR$" + preco + "\nQuantidade: " + quantidade + "\n";
        }
    }

    public static void imprimaProdutos(){
        Produto p1 = new Produto("Arroz", 10.99, 2);
        Produto p2 = new Produto("Feijao", 14.49, 1);
        Produto p3 = new Produto("Tomate", 9.99, 5);

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
        System.out.println("Valor total: R$" + Produto.total);
    }

}
