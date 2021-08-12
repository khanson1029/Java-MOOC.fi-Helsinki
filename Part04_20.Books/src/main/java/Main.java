import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
       while(true){
           System.out.println("Title: ");
           
           String title = scanner.nextLine();
           
           if(title.equals("")){
               break;
           }
           
           System.out.println("Pages: ");
           
           int pages = Integer.valueOf(scanner.nextLine());
           
           System.out.println("Publication year: ");
           
           String pubYear = scanner.nextLine();
           
           Book book = new Book(title, pages, pubYear);
           
           bookList.add(book);
       }
       
       System.out.println("What information will be printed? ");
       
       String infoToBePrinted = scanner.nextLine();
       
       for(int i = 0; i < bookList.size(); i++){
           if(infoToBePrinted.equalsIgnoreCase("everything")){
               System.out.println(bookList.get(i).toString());
           }else if(infoToBePrinted.equalsIgnoreCase("name")){
               System.out.println(bookList.get(i).getTitle());
           }
       }
    }
}
