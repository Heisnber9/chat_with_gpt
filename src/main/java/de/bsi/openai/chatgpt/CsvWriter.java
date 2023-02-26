package de.bsi.openai.chatgpt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

    public static void appendQuestionAndAnswerToCsv(String question, String answer, String filePath) {
        try {
            // Create the file if it doesn't exist
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            
            // Append the question and answer to the file
            FileWriter writer = new FileWriter(file, true); // "true" means append to the file
            writer.append(question);
            writer.append(",");
            writer.append(answer);
            writer.append("\n"); // Add a newline character at the end of each row
            writer.flush();
            writer.close();
            
            System.out.println("Successfully appended question and answer to CSV file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending question and answer to CSV file.");
            e.printStackTrace();
        }
    }
}
