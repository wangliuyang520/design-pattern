import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CaretakerChess {
    private List<MementoChess> list = new ArrayList<MementoChess>();

    public void addMen(MementoChess men) {
        list.add(men);
    }

    public MementoChess getMem(int i) {
        return list.get(i);
    }
}
