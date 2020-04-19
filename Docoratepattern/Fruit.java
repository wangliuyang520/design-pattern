public class Fruit extends Decorating {
    public Fruit(IBirthdayCake iBirthdayCake){
        super(iBirthdayCake);
    }
    public void show(){
        iBirthdayCake.show();
        System.out.println("抹上奶油");
    }
}
