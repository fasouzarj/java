package br.com.bytebank.banco.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex6 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            System.out.println("Iteração através da lista: " + it.next());
        }

        Set<String> nomes2 = new HashSet<>();
        nomes2.add("Super Mario");
        nomes2.add("Yoshi");
        nomes2.add("Donkey Kong");

        Iterator<String> it2 = nomes2.iterator();

        while (it2.hasNext()) {
            System.out.println("Iteração através do set: " + it2.next());
        }
    }
}
