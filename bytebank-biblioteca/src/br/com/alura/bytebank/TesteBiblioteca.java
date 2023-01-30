package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteBiblioteca {
    public static void main(String[] args) {
        
        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.0);
        try {
            c.saca(100.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        System.out.println(c.getSaldo());
    }
}
