public class p31 {
    public static void main(String[] args)throws carException {
        car car1;
        car1 = new car();

        car1.show();
    }
}
class carException extends Exception
{
    class car
    {
        private int num;
        private double gas;
        public void car()
        {
            num = 0;
            gas = 0.0;
            System.out.println("已生產了汽車");
        }

        public void setcar(int n,double g)throws carException
        {
            if(g<0)
            {
                carException e = new carException();
                throw e;
            }
            else
            {
                num = n;
                gas = g;
                System.out.println("將車號設為："+num+"，將汽油量設為："+gas);
            }
        }
        public void show()
        {
            System.out.println("車號是："+num);
            System.out.println("汽油量是："+gas);
        }
    }
}

