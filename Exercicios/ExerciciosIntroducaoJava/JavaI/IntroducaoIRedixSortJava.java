package ExerciciosIntroducaoJava.JavaI;

import java.util.ArrayList;
import java.util.List;


public class IntroducaoIRedixSortJava {

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

//        for (int i: iArr) {
//            System.out.print(i);
//        }
    }

    private static void radixSort(int[] iArr) {
        String[] sArr = new String[iArr.length];

        int maxLength = 0;

        int cont = 0; //contadora
        for (int elemento : iArr) { //teste forEach
            sArr[cont] = String.valueOf(iArr[cont]); //converte para string

            if (sArr[cont].length() > maxLength) { //pega o tamanho do maior numero
                maxLength = sArr[cont].length();
            }

            cont++;
        }

        //Completar stringsArray[] com 0 (zeros) à esquerda (coincidindo com o número
        //de dígitos do maior número de inteirosArray[]).

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() < maxLength) {
                int tamanhoDif = sArr[i].length() - maxLength;

                String zeros = "";

                while (tamanhoDif < 0) {
                    zeros += "0";
                    tamanhoDif++;
                }
                sArr[i] = zeros + sArr[i];
            }
        }
        criarListas(sArr);
    }

    private static void criarListas(String[] stringArray){
        List<List<String>> list = new ArrayList<>();

        for (int j = 0; j <= 9; j++){
            list.add(new ArrayList<>());

            for (int i = 0; i < stringArray.length; i++) {

                char digit = stringArray[i].charAt(stringArray[i].length() - 1);
                int numDigit = Integer.parseInt(String.valueOf(digit));

                if (numDigit == j){
                        list.get(j).add(stringArray[i]);
                }
            }
            System.out.println(list.get(j));
        }
        System.out.println(list);

    }

}
