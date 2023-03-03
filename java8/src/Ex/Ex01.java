package Ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        // palavras.sort((s1, s2) -> s1.length() - s2.length()); //sem Integer.compare


        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));

        // new Thread(new Runnable() {

        //     @Override
        //     public void run() {
        //         System.out.println("Executando um Runnable");
        //     }
        
        // }).start();

        new Thread(() -> System.out.println("Testando um Runnable...")).start();

    }
}
