package br.com.bytebank.banco.test.util;

public class TesteWrapper {

    public static void main(String[] args) {
        Integer ref = Integer.valueOf("3");
        ref++;
        // int valor = ref.intValue(); // O valor é desembrulhado, incrementado e embrulhado de novo! 
        // valor = valor + 1;
        // ref = Integer.valueOf(valor);
        System.out.println(ref);
    }
}