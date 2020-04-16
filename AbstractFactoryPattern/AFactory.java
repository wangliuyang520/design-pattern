public class AFactory implements IAbstractFactory {
    @Override
    public IFruit createIFruit() {
        return new Apple();
    }

    @Override
    public IVegetable createIVegetable() {
        return new Potato();
    }
}
