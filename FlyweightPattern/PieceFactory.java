import java.util.HashMap;

public class PieceFactory {
    HashMap<String, APiece> piecePool = new HashMap<String, APiece>();

    public APiece getPiece(String name) {
        if (piecePool.containsKey(name))
            return piecePool.get(name);
        else {
            APiece onepiece = new OnePiece(name);
            piecePool.put(name,onepiece);
            return piecePool.get(name);
        }
    }
    public int getPoolSize(){
        return piecePool.size();
    }
}
