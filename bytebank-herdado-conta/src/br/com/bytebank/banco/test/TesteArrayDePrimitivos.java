package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
    // array []
    public static void main(String[] args) {

        int[] idades = new int[5];


        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for( int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        // // int[] idades = { // declaracao do array mais simples, inves de um a um //

        // //     idades[0] = 29,
        // //     idades[1] = 39,
        // //     idades[2] = 49,
        // //     idades[3] = 59,
        // //     idades[4] = 69,
        // // };

        // int idades1 = 29;
        // int idades2 = 39;
        // int idades3 = 49;
        // int idades4 = 59;
        // int idades5 = 69;

        // int idade1 = idades[0];
        // int idade2 = idades[1];
        // int idade3 = idades[2];
        // int idade4 = idades[3];
        // int idade5 = idades[4];
        
        
        // System.out.println(idade4);
        // System.out.println(idades.length);


    }
}
