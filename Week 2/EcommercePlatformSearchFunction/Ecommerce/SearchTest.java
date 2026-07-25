package Ecommerce;
import java.util.*;

public class SearchTest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Product[] product=new Product[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter for item "+(i+1));
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String category=sc.nextLine();
            product[i]=new Product(id, name, category);
        }
        int target=sc.nextInt();
        Product result1=SearchAlgorithms.linearSearch(product, target);
        // O(n)
        System.out.println(result1);
        Product result2 =
        SearchAlgorithms.binarySearch(product, target); 
        // O(logn)
        System.out.println(result2);
    }   
}
