public class SmallFruitSort extends AFruitSort {
    public SmallFruitSort(int minWeight, int maxWeight) {
        super(minWeight, maxWeight);
    }

    @Override
    public void pushList(Fruit fruit) {
        fruitlist.add(fruit);
        fruit.setSize("小");
    }
}
