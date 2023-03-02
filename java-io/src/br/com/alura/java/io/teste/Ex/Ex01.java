package br.com.alura.java.io.teste.Ex;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        
        // FileWriter fw = new FileWriter("arquivo.txt");
        PrintWriter fw = new PrintWriter("arquivo.txt");

        fw.write("Lorem ipsum dolor sit amet ...");
        // fw.write("\n");
        fw.write(System.lineSeparator());
        fw.write("tempor incididunt ut labore ...");

        fw.close();
    }
}
