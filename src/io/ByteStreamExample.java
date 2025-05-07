package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("E:\\JavaWorkspace\\Core Java\\Advanced-Java\\src\\io\\source.txt");
            fileOutputStream = new FileOutputStream("E:\\JavaWorkspace\\Core Java\\Advanced-Java\\src\\io\\dest.txt");
            // this is going to read content byte by byte
            int content;
            while ((content = fileInputStream.read()) != -1) {
                fileOutputStream.write((byte) content);
            }
            System.out.println("File written successfully..");

        } catch (Exception e) {
            System.out.println("Something exception" + e);
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
