public class AppleFactory implements IFactory {
    @Override
    public IFruit creatFruit() {
        return new Apple();
    }
}
