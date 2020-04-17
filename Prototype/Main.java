public class Main {
    public static void main(String[] args) {
        Fruit fruit =new Apple("红富士苹果");
        Fruit fruit1 =new Banana("无催熟香蕉");

        ProtoctypePattern protoctypePattern = new ProtoctypePattern();
        protoctypePattern.add(1,new Apple("越南红苹果"));
        protoctypePattern.add(2,new Banana("催熟香蕉"));
        protoctypePattern.add(3,fruit);
        protoctypePattern.add(4,fruit1);

        protoctypePattern.getFruit(1).show();
        protoctypePattern.getFruit(2).show();
        protoctypePattern.getFruit(3).show();
        protoctypePattern.getFruit(4).show();
    }


}
