package Ecommerce;
import java.util.Arrays;
public class SearchAlgorithms {
    public static Product linearSearch(Product[] product,int target)
    {
        for(int i=0;i<product.length;i++)
        {
            if(product[i].getProductID()==target)
                return product[i];
        }
        return null;
    }

    public static Product binarySearch(Product[] product, int target)
    {
        Arrays.sort(product, (a,b)->Integer.compare(a.getProductID(),b.getProductID()));
        int l=0,r=product.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int midproductId=product[mid].getProductID();
            if(midproductId==target)
                return product[mid];
            if(midproductId<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return null;
    }
}
