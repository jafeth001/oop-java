public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(10,2,4);
        System.out.println("speed "+mountainBike.speed);
        System.out.println("gear "+mountainBike.gear);
        System.out.println("seat height "+mountainBike.seatHeight);
        mountainBike.applyBreak(4);
        System.out.println("new speed "+mountainBike.speed);


    }
}