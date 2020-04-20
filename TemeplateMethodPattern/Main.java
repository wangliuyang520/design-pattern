public class Main {

    public static void main(String[] args) {
        ADefiniteIntergral a=new ConcreteDefiniteIntergeralA(1,10,1000);
        ADefiniteIntergral b=new ConcreteDefiniteIntergeral(1,10,1000);
        System.out.println(a.CalDefiniteIntergeral());
        System.out.println(b.CalDefiniteIntergeral());

    }
}
