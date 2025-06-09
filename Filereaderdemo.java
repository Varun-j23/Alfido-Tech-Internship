import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Specify the file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            reader.close(); // Close the file after reading
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }
    }
}
