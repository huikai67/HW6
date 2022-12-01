public class Sample4_5 {
    public static void main(String[] args){
        Car4_5 rccar1;
        rccar1 = new RacingCar4_5();

        rccar1.setCar(1234,20.5);
        //rccar1.setCourse(5);   使用Car4_5宣告變數，只能對Car4_5類別呼叫方法和存取
        // 無法呼叫RacingCar類別的方法
        rccar1.show();



        //rccar1.hello();  找不到方法
    }
}


class Car4_5
{
    protected int num;
    protected double gas;

    public Car4_5()
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

class RacingCar4_5 extends Car4_5
{
    private int course;

    public RacingCar4_5() {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車邊號設為" + course);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
    public void hello()
    {
        System.out.println("hello!!");
    }
}
