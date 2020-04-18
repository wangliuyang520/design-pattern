public class Main {
    public static void main(String[] args) {
        Pear Pear1, Pear2, Pear3, Pear4;
                MyElement fruit1, fruit2, fruit3, fruit6, fruit4, fruit5;
        Pear1 = new Pear();
        Pear2 = new Pear();
        Pear3 = new Pear();
        Pear4 = new Pear();
        fruit1 = new Apple("红苹果");
        fruit2 = new Apple("青苹果");
        fruit3 = new Apple("红苹果");
        fruit4 = new Banana("野生香蕉");
        fruit5 = new Banana("普通香蕉");
        fruit6 = new Apple("红苹果");

        Pear1.add(fruit1);
        Pear1.add(fruit2);
        Pear2.add(Pear1);
        Pear2.add(fruit3);
        Pear2.add(fruit4);
        Pear3.add(Pear2);
        Pear3.add(fruit5);
        Pear4.add(Pear3);
        Pear4.add(fruit6);

        Pear4.eat();
    }


}
