package io_decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LoweCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("3.Decorator/io_decorator/test.txt")));

            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
