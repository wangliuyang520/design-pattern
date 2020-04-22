import java.util.ArrayList;
import java.util.List;

public abstract class AFruitSort {
    public List<Fruit> fruitlist;
    public int maxWeight;
    public int minWeight;
    public AFruitSort nextFruitSort;

    public AFruitSort(int minWeight, int maxWeight) {
        this.fruitlist = new ArrayList();
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void getFruitlist() {
        for (Fruit fruit : fruitlist)
            System.out.print(fruit.weight + "的" + fruit.getSize() + fruit.name + " ");
        System.out.println("");
    }

    public void sort(Fruit fruit) {
        if ((fruit.weight <= maxWeight )&& (fruit.weight >= minWeight) ){
            pushList(fruit);
        } else if (this.nextFruitSort != null) {
            nextFruitSort.sort(fruit);
        }
    }

    public abstract void pushList(Fruit fruit);

    public void setNextFruitSort(AFruitSort nextFruitSort) {
        this.nextFruitSort = nextFruitSort;
    }

}

;


