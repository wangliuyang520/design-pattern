public class Book implements IProduct{
    public void accept(AVisitor aVisitor) {
        aVisitor.visit(this);
    }
}
