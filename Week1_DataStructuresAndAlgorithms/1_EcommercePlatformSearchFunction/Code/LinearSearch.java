public class LinearSearch{
    public static Product linearSearch(Product[] products,int targetId){
        for(Product p:products){
            if(p.productId==targetId){
                return p;
            }
        }
        return null;
    }
}