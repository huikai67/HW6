public class Sample4_2 {
    public static void main(String[] args){
        RacingCar4_2 rccar1 = new RacingCar4_2(11,22,33);

    }
}

class Car4_2{
    private int num;
    private double gas;

    public Car4_2()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public Car4_2(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
    }

}
class RacingCar4_2 extends Car4_2
{
    private int course; //賽車編號
    public RacingCar4_2()
    {
        course = 0;
        System.out.println("生產了賽車");
    }
    public RacingCar4_2(int n, double g, int c){
        super(n,g);
        course = c;
        System.out.println("生產了編號為"+course+"的賽車");
    }
}
