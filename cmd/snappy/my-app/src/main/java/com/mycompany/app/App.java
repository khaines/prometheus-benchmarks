package com.mycompany.app;

import org.xerial.snappy.Snappy;
import java.io.File;
import java.io.FileInputStream;

public class App {
    public static void main(String[] args) {
      try {
        File file = new File("output");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        byte[] uncompressed = Snappy.uncompress(data);
        String result = new String(uncompressed, "UTF-8");
        System.out.println(result);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
}
