public class Adapter implements INewjuicer {
    Oldjuicer oldjuicer = new Oldjuicer();
    @Override
    public String newPort(IFriut fruit1, IFriut fruit2) {
        return oldjuicer.getPort(fruit1)+oldjuicer.getPort(fruit2)+"混合果汁";

    }
}
