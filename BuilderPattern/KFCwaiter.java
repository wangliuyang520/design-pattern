public class KFCwaiter {
    SubMealBuilder mb;

    public void setMb(SubMealBuilder mb) {
        this.mb = mb;
    }
    public Meal construct(){
mb.buildMealFood();
mb.buildMealDrink();
return mb.m;
    }
}
