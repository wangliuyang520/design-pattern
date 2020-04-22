public class BigFruitSort extends AFruitSort {
    public BigFruitSort(int minWeight, int maxWeight) {
        super(minWeight, maxWeight);
    }

    @Override
    public void pushList(Fruit fruit) {
        fruitlist.add(fruit);
        fruit.setSize("大");
    }
}
