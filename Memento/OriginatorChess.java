public class OriginatorChess {
    private MementoChess memento;
    private int x,y;

    public OriginatorChess() {
        memento = new MementoChess();
    }

    public void setX(int x){
        memento.setX(x);
        this.x=x;
    }
    public void setY(int y){
        memento.setY( y);
        this.y = y;
    }
    public MementoChess saveCurrentMemento(){
        return new MementoChess(memento.getX(),memento.getY());

    }
    public void restore(MementoChess memento){
        this.x= memento.getX();
        this.y = memento.getY();
    }
    public void show(){
        System.out.println("棋子的位置为"+"("+x+","+y+")");
    }
}
