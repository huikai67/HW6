public class Sample4_3 {

    public static void main(String[] args){
        RacingCar4_3 rccar1;
        rccar1 = new RacingCar4_3();

        rccar1.newShow();
    }

}

class Car4_3
{
    protected int num;
    protected double gas;

    public Car4_3()
    {
        num=0;
        gas=0.0;
        System.out.println("生產了車子");
    }
    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}

class RacingCar4_3 extends Car4_3
{
    private int course;

    public RacingCar4_3()
    {
        course=0;
        System.out.println("生產了賽車");
    }
    public void newShow()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
        System.out.println("賽車編號是"+course);
    }
}
