public class Client {
    public static void main(String[] args) {
        OriginatorChess oc = new OriginatorChess();
        oc.setX(5);
        oc.setY(10);
        oc.show();
        CaretakerChess caretakerChess = new CaretakerChess();
        caretakerChess.addMen(oc.saveCurrentMemento());
        oc.setX(29);
        oc.setY(24);

        oc.show();
        System.out.println("悔棋一步");
        oc.restore(caretakerChess.getMem(0));
        oc.show();
    }


}
