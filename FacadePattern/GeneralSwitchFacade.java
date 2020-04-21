public class GeneralSwitchFacade {
    private Light[] light;
    private Fan fan;
    private AirConditional conditional;
    private Television television;

    public GeneralSwitchFacade() {
        this.light = new Light[]{new Light("卧室主灯"), new Light("卧室副灯"), new Light("客厅吊灯"), new Light("餐桌灯")};
        this.fan = new Fan();
        this.conditional = new AirConditional();
        this.television = new Television();
    }

    public void on() {
        fan.on();
        television.on();
        for (int i = 0; i < 4; i++)
            light[i].on();
        conditional.on();
    }

    public void off() {
        fan.off();
        television.off();
        for (int i = 0; i < 4; i++)
            light[i].off();
        conditional.off();
    }
}
