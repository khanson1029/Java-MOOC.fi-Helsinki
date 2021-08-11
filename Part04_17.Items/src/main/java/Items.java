
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if(name.equals("")){
                break;
            }
            Item namedItem = new Item(name);
            
            items.add(namedItem);         
        }
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).getName() + items.get(i).toString());
            }
        }
}

