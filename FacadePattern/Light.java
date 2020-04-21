public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }    public void on(){
        System.out.println("打开"+name);
    }
    public void off(){
        System.out.println("关闭"+name);
    }
}
