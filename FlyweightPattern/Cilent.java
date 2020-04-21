import java.util.Random;

public class Cilent {
    public static void main(String[] args) {
        PieceFactory factory = new PieceFactory();
        Random random = new Random();
        for(int i=0;i<=19;i++){
            if(i%2==0) {
                APiece one =factory.getPiece("黑子");
                one.play(random.nextInt(19)+1,random.nextInt(19)+1);
            }
            else {
                APiece one =factory.getPiece("白子");
                one.play(random.nextInt(19)+1,random.nextInt(19)+1);
            }
        }
        System.out.println(factory.getPoolSize());
    }
}
