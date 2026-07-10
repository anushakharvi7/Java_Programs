package java_training_;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TraditionalTryCatch {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        // --- STEP 1: CREATE AND WRITE TO THE FILE FIRST ---
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello! This file was created automatically by Java.\n");
            writer.write("Now the FileReader will be able to find it without errors.");
            System.out.println("🎉 File created successfully.");
        } catch (IOException e) {
            System.err.println("Could not create file: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------");

        // --- STEP 2: READ FROM THE FILE ---
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            int character;
            
            System.out.println("📖 Reading file character by character:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("\n\n🔒 File reader closed safely.");
                }
            } catch (IOException ex) {
                System.err.println("Error closing the reader: " + ex.getMessage());
            }
        }
    }
}