package ex;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Início do metodo2");
        // ArithmeticException exception = new ArithmeticException();
        throw new ArithmeticException("mensagem de erro aqui");
    }
}