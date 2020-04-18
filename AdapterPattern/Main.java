public class Main {
    public static void main(String[] args) {
        INewjuicer iNewjuicer=new Adapter();
        String str = iNewjuicer.newPort(new Apple("红苹果"),new Banana("香蕉"));
        System.out.println(str);
    }
}
