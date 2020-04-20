import javax.swing.*;
import java.util.ArrayList;

public class BuyBasket {
    ArrayList<IProduct> list = new ArrayList<IProduct>();
    public void add(IProduct iProduct){
        list.add(iProduct);
    }
    public void remove(IProduct iProduct){
        list.remove(iProduct);
    }
    public void accept(AVisitor aVisitor){
        for(IProduct iProduct:list){
            iProduct.accept(aVisitor);
        }
    }
}
