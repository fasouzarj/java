public class TestaLacos {
    public static void main(String[] args) {
        System.out.println("*************");

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada de " + multiplicador);
            for (int contador = 1; contador <= 10; contador++) {
                System.out.print(multiplicador + " * " + contador +
                        " = " + multiplicador * contador);
                System.out.println();
            }
            System.out.println("*************");
        }
    }
}
