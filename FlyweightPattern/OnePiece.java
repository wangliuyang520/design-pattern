public class OnePiece extends APiece {
    public OnePiece(String color) {
        super(color);
    }

    @Override
    public void play(int x, int y) {
        System.out.println("在"+x+"行"+y+"列"+"处落"+color+"棋子");
    }
}
