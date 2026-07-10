package java_training_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamFileDemo {
    public static void main(String[] args) {
        String fileName = "stream_demo.txt";
        String dataToWrite = "Hello! This file was written using FileOutputStream.\n" +
                             "And it will be read using FileInputStream.";

        // 1. WRITE CONTENT USING FILEOUTPUTSTREAM
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = dataToWrite.getBytes();
            fos.write(bytes);
            System.out.println("Successfully written to the file.");
            
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------");

        // 2. READ CONTENT USING FILEINPUTSTREAM
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Reading content using FileInputStream:");
            
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); 
            }
            System.out.println(); 
            
        } catch (IOException e) {
            System.err.println("Error while reading from file: " + e.getMessage());
        }
    }
}