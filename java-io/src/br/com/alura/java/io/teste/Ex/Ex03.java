package br.com.alura.java.io.teste.Ex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Ex03 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Charset utf8 = StandardCharsets.UTF_8;
        String s1 = "13º Órgão Oficial";
        byte[] bytes = s1.getBytes(utf8);
        String s2 = new String(bytes, utf8);
        System.out.println(s2);

        String s3 = "13º Órgão Oficial";
        byte[] bytes3 = s3.getBytes();
        String s4 = new String(bytes3, "UTF-8");
        System.out.println(s4);
    }
}
