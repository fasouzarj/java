package br.com.alura.ex;
// public class TesteEmptySet

import java.util.Collections;
import java.util.Set;

public class Ex10 {
    public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
    }
}




