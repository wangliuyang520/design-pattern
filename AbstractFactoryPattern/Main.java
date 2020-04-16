public class Main {
    public static void main(String[] args) {
        IAbstractFactory factory = new AFactory();          //实例化两个具体工厂
        IAbstractFactory factory1 = new BFactory();

        IFruit fruit = factory.createIFruit();
        IVegetable iVegetable = factory.createIVegetable();

        IFruit fruit1 = factory1.createIFruit();     //使用工厂创建两个商品簇
        IVegetable iVegetable1 = factory1.createIVegetable();

        System.out.println("吃A工厂产品：");
        fruit.feat();
        iVegetable.veat();

        System.out.println("吃B工厂产品：");
        fruit1.feat();
        iVegetable1.veat();
    }
}
