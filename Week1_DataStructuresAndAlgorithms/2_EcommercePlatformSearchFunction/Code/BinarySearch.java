import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products,int targetId){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(products[mid].productId==targetId){
                return products[mid];
            }
            else if(products[mid].productId<targetId){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
