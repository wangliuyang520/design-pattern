public class Customer extends AVisitor {
    private String name;
    public Customer(String name){
        this.name = name;
    }
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客"+name+"正在挑选苹果，准备购买");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客"+name+"正在挑选书籍，准备买书");
    }
}
