package Arrays;

public class Ex2 {

    void meth1(){
        int arr1[];
        arr1=new int[5];

        int arr2[]=new int[5];

        int arr3[]={10,20,30,40,50};

        int arr4[]=new int[]{15,25,35,45,55};

        String s="java";
        System.out.println("Arrayy Length "+ arr1.length);
        System.out.println("String length "+ s.length());

        System.out.println("_______arr2________");
        arr2[2]=200;
        System.out.println(arr2[2-1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[arr2.length-1]);

        System.out.println("--------arr3------------");
        System.out.println(arr3[arr3.length-2]);
        System.out.println(arr2.length-1);

        System.out.println("Retriving the data using for each");
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }
    }

    public static void main(String[] args) {
        Ex2 obj=new Ex2();
        obj.meth1();
    }
}
