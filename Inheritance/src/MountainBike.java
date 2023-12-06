public class MountainBike extends Bicycle {
    public int seatHeight;

    //constructor moutainBike takes parameter the same as the constructor Bicycle
    public MountainBike(int speed, int gear, int seatHeight) {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int height) {
        this.seatHeight = height;
    }
}
