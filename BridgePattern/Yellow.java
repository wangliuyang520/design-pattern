public class Yellow implements Color {
    public String getColor() {
        return color;
    }

    private  String color = "黄色";
    @Override
    public void bepaint(String penType, String name) {
        System.out.println("使用"+penType+"绘制"+this.color+name);
    }
}
