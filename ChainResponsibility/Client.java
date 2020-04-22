import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rm = new Random();
        BigFruitSort bigFruitSort = new BigFruitSort(10, 15);
        SmallFruitSort smallFruitSort = new SmallFruitSort(0, 5);
        MidFruitSort midFruitSort = new MidFruitSort(5, 10);

        bigFruitSort.setNextFruitSort(midFruitSort);
        midFruitSort.setNextFruitSort(smallFruitSort);

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0)
                bigFruitSort.sort(new Fruit(rm.nextInt(15), "苹果"));
            else bigFruitSort.sort(new Fruit(rm.nextInt(15), "香蕉"));
        }
        smallFruitSort.getFruitlist();
        midFruitSort.getFruitlist();
        bigFruitSort.getFruitlist();
    }

}
