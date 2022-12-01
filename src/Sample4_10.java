public class Sample4_10 {
    public static void main(String[] args)
    {
        Vehicle[] vcs = new Vehicle[2];

        vcs[0] = new Car4_10(11,11);
        vcs[1] = new Plane4_10(12);

        vcs[0].setSpeed(60);
        vcs[1].setSpeed(1000);

        vcs[0].show();
        vcs[1].show();
    }
}

abstract class Vehicle
{
    protected int speed;

    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為"+speed+"了");
    }
    abstract void show();
}

class Car4_10 extends Vehicle
{
    private int num;
    private double gas;

    public Car4_10(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"  汽油量為"+gas+"的車子");
    }
    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
        System.out.println("速度是"+speed);
    }
}
class Plane4_10 extends Vehicle
{
    private int flight;

    public Plane4_10(int f)
    {
        flight=f;
        System.out.println("生產了"+flight+"班次的飛機");
    }
    public void show()
    {
        System.out.println("飛機班次是"+flight);
        System.out.println("速度是"+speed);
    }
}