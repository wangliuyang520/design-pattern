public class Main {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        Color color = new Blue();
        pen.setColor(color);
        pen.draw("小花");


        Pen pen2 = new BigPen();
        Color color2 = new Yellow();
        pen2.setColor(color2);
        pen2.draw("小花");
    }
}
