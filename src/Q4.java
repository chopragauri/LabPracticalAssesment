class OutOfStockException extends Exception{
    OutOfStockException(String message){
        super(message);
    }
}
class Stock {
    int stock =10;
    void getItem(int amt){
        try{
            if(amt<=stock){
                stock=stock-amt;
                System.out.println("Successfully purchased.");
            }else throw new OutOfStockException("Product is Out of Stock!");
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Stock c1 = new Stock();
        c1.getItem(5);
        c1.getItem(6);
    }
}
