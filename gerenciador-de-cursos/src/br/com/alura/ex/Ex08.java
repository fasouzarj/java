package br.com.alura.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

// public class TestaPerformance

public class Ex08 {

    public static void main(String[] args) {

        // Collection<Integer> numeros = new ArrayList<Integer>();
        // Collection<Integer> numeros = new LinkedHashSet<Integer>();
        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        long inicioAdd = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fimAdd = System.currentTimeMillis();

        long tempoDeExecucaoAdd = fimAdd - inicioAdd;

        System.out.println("Tempo gasto 'add': " + tempoDeExecucaoAdd);

        long inicioContains = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimContains = System.currentTimeMillis();

        long tempoDeExecucaoContains = fimContains - inicioContains;

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto 'contains': " + tempoDeExecucaoContains);

        System.out.println("Tempo de execucao total: " + tempoDeExecucao);

    }
}
