public class Sample4_13 {
    public static void main(String[] args)
    {
        Car4_13 car= new Car4_13(1234, 20.5);

        car.vShow();
        car.mShow();

    }
}

interface iVehicle
{
    void vShow();
}
interface iMaterial
{
    void mShow();
}

class Car4_13 implements iVehicle, iMaterial
{
    private int num;
    private double gas;

    public Car4_13(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"  汽油量為"+gas+"的車子");
    }

    public void vShow()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
    public void mShow()
    {
        System.out.println("車的材質是鐵");
    }
}
