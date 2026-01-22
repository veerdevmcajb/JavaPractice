package Constructor;

public class ClassA {

        public ClassA()
        {
            System.out.println("Sunday");
            ClassA obj = new ClassA(10);
            System.out.println("Tuesday");
            String s=obj.display("Challange Accepted");
            System.out.println(s);
        }
        public ClassA(int temp)
        {
            System.out.println("Saturday");
            new ClassA(10,20);
            System.out.println("Monday");
        }
        String display(String s)
        {
            System.out.println("In the next Statement i am returning String value");
            return s;
        }
        public ClassA(int data,int temp)
        {
            System.out.println("Thursday");
        }
        public static void main(String[] args) {
            System.out.println("Main started");
            ClassA obj = new ClassA();
            System.out.println("Output verified");

        }
    }

