public class Meal {
    private String food;
    private String drink;

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
    public void show(){
        System.out.println("套餐为："+this.getFood()+"、"+this.getDrink());
    }
}
