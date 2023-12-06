public class Bicycle {
    protected int speed;
    protected int gear;
    public Bicycle(int speed,int gear){
        this.speed = speed;
        this.gear = gear;
    }
    //setter mtd for speeding
    public void applySpeed(int increase){
        this.speed += speed;
    }
    //setter mtd for applyBreak
    public void applyBreak(int decrease){
        this.speed -= decrease;
    }
    //setter mtd for applygear
    public void applyGear(int gear){
        this.gear = gear;
    }
}
