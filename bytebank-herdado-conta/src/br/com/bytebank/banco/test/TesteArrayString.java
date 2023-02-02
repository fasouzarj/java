package br.com.bytebank.banco.test;

public class TesteArrayString {
    public static void main(String[] args) {

        System.out.println("funcionou!!!");
        System.out.println(args.length);
        for(int i = 0; i < args.length; i++ ) {
            System.out.println("argumento " + i + ": " + args[i]);
        }


    }
}