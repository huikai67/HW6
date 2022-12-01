public class Sample4_11 {
    public static void main(String[] args)
    {
        Vehicle4_11[] vcs = new Vehicle4_11[2];

        vcs[0] = new Car4_11(1234, 20.5);
        vcs[1] = new Plane4_11(232);

        for(int i=0; i< vcs.length; i++)
        {
            if(vcs[i] instanceof Car4_11)
                System.out.println("第"+i+"個物件不是Car4_11類別");
            else
                System.out.println("第"+i+"個物件是Car4_11類別");
        }

    }
}


abstract class Vehicle4_11
{
    protected int speed;

    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為"+speed+"了");
    }
    abstract void show();
}

class Car4_11 extends Vehicle4_11
{
    private int num;
    private double gas;

    public Car4_11(int n, double g)
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
class Plane4_11 extends Vehicle4_11
{
    private int flight;

    public Plane4_11(int f)
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