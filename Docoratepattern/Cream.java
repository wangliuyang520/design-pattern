public class Cream extends Decorating {
    public Cream(IBirthdayCake iBirthdayCake){
        super(iBirthdayCake);
    }
    public void show(){
        iBirthdayCake.show();
        System.out.println("点缀上水果");
    }
}
