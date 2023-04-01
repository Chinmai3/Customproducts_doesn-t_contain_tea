import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Customproducts=new ArrayList<>();
        Customproducts.add("Tropical coffe");
        Customproducts.add("Green tea");
        Customproducts.add("Lemon tea");
        Customproducts.add("coffe");
        Customproducts.add("Black coffe");
        Customproducts.add("capichino");
        Customproducts.add("Rose tea");
        Customproducts.add("Honey mix");
        
        System.out.println("Initial Custom products are:");
        for(String product:Customproducts)
        {
            System.out.println(product);
            
        }
        
        System.out.println("Mpodified custom products are:");
        
        //Remove all those products containing the word tea
        for(String item:Customproducts)
        {
            if(!item.toLowerCase().contains("tea"))
            {
                System.out.println(item);
            }
        }
        
    }
}
