public class BFactory implements IAbstractFactory {
    @Override
    public IFruit createIFruit() {
        return new Banana();
    }

    @Override
    public IVegetable createIVegetable() {
        return new Tomato();
    }
}
