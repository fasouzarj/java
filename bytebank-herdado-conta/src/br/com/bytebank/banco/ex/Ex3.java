package br.com.bytebank.banco.ex;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(6);
        lista.add("RJ");
        lista.add("SP");
        lista.add("ES");
        lista.add("BR");
        lista.add("PR");
        lista.add("SC");
        System.out.println(lista);

        ArrayList<String> nova = new ArrayList<>(lista);
        nova.add("TO");
        nova.add("BA");
        nova.add("MG");
        nova.add("CE");
        System.out.println(nova);

        ArrayList<String> outra = new ArrayList<>(nova);
        outra.removeAll(outra);

        System.out.println(outra);

    }

}
