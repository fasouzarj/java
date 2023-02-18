package br.com.bytebank.banco.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List referencias = new ArrayList(); // AQUI
        // List<Number> referencias = new ArrayList<>();
        // List<Object> referencias = new ArrayList<>();

        referencias.add(Double.valueOf(30.9));
        referencias.add(Integer.valueOf(10));
        referencias.add(Float.valueOf(13.4f));

        System.out.println(referencias);
    }
}
