package Ex;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex02 {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();

        LocalDate data = LocalDate.of(2099, 1, 25);

        LocalDate data2 = LocalDate.of(2099, Month.JANUARY, 25);

        LocalDate agora2 = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        Period periodo = Period.between(agora, dataFutura);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);

        System.out.println(agora);
        System.out.println(data);
        System.out.println(data2);
        System.out.println(agora2);
        System.out.println(periodo);
        System.out.println(dataFormatada);
    }
}
