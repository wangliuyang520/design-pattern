public class Decorating implements IBirthdayCake{
    protected IBirthdayCake iBirthdayCake;


    public void setiBirthdayCake(IBirthdayCake iBirthdayCake) {
        this.iBirthdayCake = iBirthdayCake;
    }

    public Decorating(IBirthdayCake iBirthdayCake) {
        this.iBirthdayCake = iBirthdayCake;
    }

    public void show() {
        if (iBirthdayCake != null) {
            iBirthdayCake.show();
        }
    }
}

