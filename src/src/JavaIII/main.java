package src.JavaIII;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Bruno", "321");
        Pessoa pessoa2 = new Pessoa("Ana", "123");

        Pessoa[] pessoas = {pessoa1, pessoa2};

        SortUtil.sort(pessoas);

        System.out.println(Arrays.toString(pessoas));


        Celular celular1 = new Celular("942340057");
        Celular celular2 = new Celular("542340057");

        Celular[] celulares = {celular1, celular2};

        SortUtil.sort(celulares);

        System.out.println(Arrays.toString(celulares));
    }

}
