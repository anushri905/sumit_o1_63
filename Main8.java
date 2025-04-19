import java.io.*;

public class Main8 {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a file handling example.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

