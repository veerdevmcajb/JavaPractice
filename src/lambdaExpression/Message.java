package lambdaExpression;

//             Syntax : arguments ->expression

public interface Message {
    void wish();
}

class TestClient {
    public static void main(String[] args) {
        Message m1=()-> System.out.println("Good Morning");
        m1.wish();

        // ifyou want tp print multiple statements

        Message m2=()-> System.out.println("Good afternoon");
        System.out.println("Good Night");
        m2.wish();
    }
}


//             ***** Application without lambda ****
//          - The Advantages of lambda Expression
//            1) It will reduce the byte code
//            2) Reduce length of the code
//             Syntax : arguments ->expression
//        interface Message{
//            void wish();
//        }
//        class Test impliments Message{
//            public void wish(){
//                System.out.println("Good Morning");
//            }
//        }
//
//        class TestClient{
//            public static void main(String[] args) {
//                Test t=new Test();
//                t.wish();
//            }
//        }