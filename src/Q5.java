import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        File file = new File("src/productNames.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            System.out.println("Product Names in Uppercase:");
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error in reading file: " + e.getMessage());
        }
    }
}
