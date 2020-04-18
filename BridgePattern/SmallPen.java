public class SmallPen extends Pen {
    private  String penType="小毛笔";
    @Override
    void draw(String name) {
        color.bepaint(this.penType,name);
    }
}
