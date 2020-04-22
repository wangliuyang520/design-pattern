public class MidFruitSort extends  AFruitSort {
    public MidFruitSort(int minWeight, int maxWeight) {
        super(minWeight, maxWeight);
    }

    @Override
    public void pushList(Fruit fruit) {
        fruitlist.add(fruit);
        fruit.setSize("中");
    }
}
