public class Mian {
    public static void main(String[] args) {
        KFCwaiter kfCwaiter= new KFCwaiter();           //实例化一个指挥者
        SubMealBuilder builderA = new MealBuilderA();       //由用户指定何种套餐
        kfCwaiter.setMb(builderA);
        kfCwaiter.construct().show();//生产套餐，并展示出来

        System.out.println("------------------------");

        KFCwaiter kfCwaiter1= new KFCwaiter();           //实例化一个指挥者
        SubMealBuilder builderB = new MealBuilderB();       //由用户指定何种套餐
        kfCwaiter1.setMb(builderB);
        kfCwaiter1.construct().show();//生产套餐，并展示出来

    }
}
