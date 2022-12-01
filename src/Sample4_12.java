public class Sample4_12 {
    public static void main(String[] args)
    {
        iVechicle[] ivcs = new iVechicle[2];

        ivcs[0] = new Car4_12(1234, 20.5);
        ivcs[1] = new Plane4_12(232);

        for(int i=0; i< ivcs.length; i++)
        {
            ivcs[i].show();
        }

    }

}

interface iVechicle
{
    int weight=1000;
    void show();
}

class Car4_12 implements iVechicle
{
    private int num;
    private double gas;

    public Car4_12(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"  汽油量為"+gas+"的車子");
    }
    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}

class Plane4_12 implements iVechicle
{
    private int flight;

    public Plane4_12(int f)
    {
        flight=f;
        System.out.println("生產了"+flight+"班次的飛機");
    }
    public void show()
    {
        System.out.println("飛機班次是"+flight);
    }
}