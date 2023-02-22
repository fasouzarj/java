package br.com.alura.ex;

import java.util.HashSet;
import java.util.Set;

// TesteAlunosSemAcentos 
public class Ex07 {
    
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");   

        System.out.println(alunos.size());

        alunos.add("Paulo");

        System.out.println(alunos.size());


        boolean adicionou = alunos.add("Paulo");
        System.out.println("Paulo foi adicionado ao Set? " + adicionou);

    }

}
