import java.io.*;

class CreateFile2 {
    public static void main(String[] args) {
        File file = new File("D:\\22UAI040\\abcd.txt");

        try {
      
            if (file.createNewFile()) {
                System.out.println("File is successfully created.");
            } else {
                System.out.println("File already exists.");
            }

           
            FileWriter writer = new FileWriter(file);
            writer.write("hello friends");
            writer.close();
            System.out.println("Successfully written to file.");

            
            FileReader reader = new FileReader(file);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println("\nSuccessfully read from file.");

            
            if (file.delete()) {
                System.out.println("File is successfully deleted.");
            } else {
                System.out.println("File could not be deleted.");
            }

        } catch (IOException e) {
            System.out.println("Exception handling: " + e.getMessage());
        }
    }
}
