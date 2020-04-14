public class BananaFactory implements IFactory {
    @Override
    public IFruit creatFruit() {
        return new Banana();
    }
}
