public class Fruit {
    int weight;
    String name;
    String Size;

    public Fruit(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getSize() {
        return Size;
    }
}
