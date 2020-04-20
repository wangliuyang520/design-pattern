public class ConcreteDefiniteIntergeralA extends ADefiniteIntergral {
    int a,b,c;
    public ConcreteDefiniteIntergeralA(int a, int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    double getMax() {
        return b;
    }

    @Override
    double getMin() {
        return a;
    }

    @Override
    int getTab() {
        return c;
    }

    @Override
    double function(double x) {
        return x;
    }
}
