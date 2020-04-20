public abstract class ADefiniteIntergral {
abstract double getMax(); //积分上限
    abstract double getMin();//积分下限
    abstract  int getTab();//切分单元格
    public final double CalDefiniteIntergeral()
    {
        double max,min,c,sum=0;
        int tab = 0;
        max = getMax();
        min =getMin();
        tab = getTab();
        for(double i =min;i<=max;i=i+(max-min)/tab){
            sum = sum +function(i)*((max-min)/tab);
        }
        return sum;
    }
    abstract double function(double x);
}
