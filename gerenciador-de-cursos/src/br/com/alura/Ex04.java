package br.com.alura;

import java.util.ArrayList;

public class Ex04 {

    public static void main(String[] args) {

        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        for (int i = 0; i <= cursos.size(); i++) { //remover o = para evitar exception
            System.out.println("Aula : " + cursos.get(i));
        }
    }
    
}
