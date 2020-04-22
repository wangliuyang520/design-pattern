import java.util.ArrayList;

public class WaiterInvoker {
    ArrayList<ICommand> list =null;
    public WaiterInvoker(){
        list =new ArrayList<ICommand>();
    }
    public void add(ICommand command){
        list.add(command);
    }
    public void remove(ICommand cammand){
        list.remove(cammand);
    }
    public void orderUP(){
        for(ICommand iCommand:list){
            if(iCommand!=null)
            iCommand.execute();
        }
    }
}
