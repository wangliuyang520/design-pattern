public abstract class APiece {
    protected String color;
    public APiece(String color){
        this.color =color;
    }
public abstract void play(int x ,int y);
}
