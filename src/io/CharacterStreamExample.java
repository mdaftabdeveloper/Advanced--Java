package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        reader = new FileReader("E:\\JavaWorkspace\\Core Java\\Advanced-Java\\src\\io\\source.txt");
        writer = new FileWriter("E:\\JavaWorkspace\\Core Java\\Advanced-Java\\src\\io\\dest.txt");

        try {
            // this is going to read and write file character by character
            // it also internally read content byte by byte
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
            System.out.println("File written successfully..");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some exception in copying.." + e);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
