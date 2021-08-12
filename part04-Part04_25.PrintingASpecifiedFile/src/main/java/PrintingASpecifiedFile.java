
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        
        String songFile = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(songFile))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                System.out.println(row);   
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
