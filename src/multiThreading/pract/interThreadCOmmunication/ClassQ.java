package multiThreading.pract.interThreadCOmmunication;

public class ClassQ
{
    public static void main(String[] args) {
        ClassF fobj=new ClassF();
        new Thread()
        {
            public void run()
            {
                try{
                    fobj.with_draw(15000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
                .start();
        new Thread()
        {
            public void run()
            {
                fobj.deposite(10000);
            }
        }
                .start();

    }
}
