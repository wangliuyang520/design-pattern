public class Blue implements   Color{
    private  String color = "蓝色";

    public String getColor() {
        return color;
    }

    @Override
    public void bepaint(String penType, String name) {
        System.out.println("使用"+penType+"绘制"+this.color+name);
    }
}
