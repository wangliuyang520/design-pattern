public class Fruit implements Cloneable{
    public String fruitname;

    public void setFruitname(String fruitname) {
        this.fruitname = fruitname;
    }

    @Override
    protected Fruit clone()  {
        Fruit fruit =null;
        try{
         fruit= (Fruit) super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
    public void show(){
        System.out.println(fruitname);
    }
}
