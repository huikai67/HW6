public class Sample4_6 {

    public static void main(String[] args){
        Car4_6[] cars;
        cars = new Car4_6[2];           //準備父類別的陣列

        cars[0] = new Car4_6();
        cars[1] = new RacingCar4_6();

        cars[0].setCar(11,11);
        cars[1].setCar(22, 22);     //setCar是父類別的方法

        for(int i=0; i < cars.length; i++)
        {
            cars[i].show();
        }
    }
}

class Car4_6
{
    protected int num;
    protected double gas;

    public Car4_6()
    {
        num=0;
        gas=0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("將車號設為"+num+"，汽油量設為"+gas);
    }

    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}

class RacingCar4_6 extends Car4_6 {
    private int course;

    public RacingCar4_6()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車邊號設為" + course);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}
