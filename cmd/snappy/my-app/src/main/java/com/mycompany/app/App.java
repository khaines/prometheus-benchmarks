package com.mycompany.app;

import org.xerial.snappy.SnappyInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) {
      try {
        File file = new File("output");
        FileInputStream fis = new FileInputStream(file);
        SnappyInputStream sin = new SnappyInputStream(fis);

        byte[] uncompressed = new byte[100];
        int read = sin.read(uncompressed, 0, 100);
        String result = new String(uncompressed, "UTF-8");
        System.out.println(result);
      } catch (Exception e) {
        e.printStackTrace(new PrintStream(System.out));
      }
    }
}
