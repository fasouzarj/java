package br.com.alura;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        String curso1 = "Java";
        String curso2 = "Banco de dados";
        String curso3 = "TDD";
        String curso4 = "Engenharia de Software";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

    }
}
