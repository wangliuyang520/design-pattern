public class Saler extends AVisitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("苹果的价钱为：10元");
    }

    @Override
    public void visit(Book book) {
        System.out.println("书的价格为:35元");
    }
}
