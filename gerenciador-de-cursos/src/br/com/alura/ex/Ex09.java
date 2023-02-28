package br.com.alura.ex;

import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Curso;

public class Ex09 {

    // class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Set<Aluno> alunos = javaColecoes.getAlunos();

        // tente adicionar mais um aluno no Set de alunos (sempre sem acentos)
        alunos.add("Flavio Alves", 2409);
        javaColecoes.matricula(a4);

        // Set<Aluno> alunos = javaColecoes.getAlunos();

        // System.out.println("Todos os alunos matriculados: ");
        // javaColecoes.getAlunos().forEach(a -> System.out.println(a));

    }
}
