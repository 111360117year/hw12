package pc;
public class car_p10 {
    private int num;
    private double gas;

    public car_p10()
    {
        num=0;
        gas=0.0;
        System.out.println("已生產了汽車");
    }

    public void setcar(int n,double g)
    {
        num = n;
        gas = g;

        System.out.println("車號設為"+num+"，汽油量設為"+gas);
    }

    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }

}
