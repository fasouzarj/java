package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {

        // OutputStream fos = new FileOutputStream("lorem2.txt");
        // Writer osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);

        // PrintStream ps = new PrintStream(new File("lorem2.txt"));

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("asdafadskflkasdjbflb alkd jasdfjbasbdlfk aljsdf hkba fhbl qwied hpdl");

        ps.close();

    }
}
