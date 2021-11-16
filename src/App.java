import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String product ;
        int quantity,price , l , total;
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Integer> Quantities = new ArrayList<Integer>();
        ArrayList<Integer> Prices = new ArrayList<Integer>();

        while(true){
            System.out.print("Input Product name or 'stop' if you want to stop :");
            product = input.next();
            if(product.equalsIgnoreCase("stop")){
                System.out.println("Processing Your Orders");
                break;
            }else{
                products.add(product);

                System.out.print("Input @ price :");
                price = input.nextInt();
                Prices.add(price);

                System.out.print("Input "+product+" quantity :");
                quantity = input.nextInt();
                Quantities.add(quantity);
            }
        }
        l = products.size();
        total = 0;
        for(int i=0;i<l;i++){
            String p = products.get(i);
            int $    = Prices.get(i);
            int q    = Quantities.get(i);
            total += $*q;

            System.out.println("No."+(i+1)+" "+p+" "+q+" pcs @"+$+" => "+$*q);
        }
            System.out.println("Total : "+total);
            input.close();
        
        
    }
}
