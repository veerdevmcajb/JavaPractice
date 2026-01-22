package Arrays;

public class Ex1 {
    void method1(){
        int arr[]={10,20,30,40,50};
        System.out.println(arr[2]);
        //System.out.println(arr[5]);//AIOB

        System.out.println("Retriving the element using for-loop");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        System.out.println("retriving elements in reverse order");
        for(int i=4;i>=0;i--){
            System.out.println(arr[i]);
        }

        System.out.println("foreach loop");
        for(int s:arr){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Ex1 obj=new Ex1();
        obj.method1();
    }
}
