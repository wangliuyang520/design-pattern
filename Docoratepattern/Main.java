public class Main {
    public static void main(String[] args) {
        IBirthdayCake iBirthdayCake =new Cake();
        IBirthdayCake Cake = new Cream(iBirthdayCake);
        IBirthdayCake finalCake = new Fruit(Cake);
        finalCake.show();
    }
}
