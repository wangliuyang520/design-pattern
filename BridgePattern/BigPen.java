public class BigPen extends  Pen {

    private  String penType="粗毛笔";
    @Override
    void draw(String name) {
        color.bepaint(this.penType,name);
    }
}

