package Arrays;

// method return type is array

public class ArrAsReturnType {

    int[] meth1(int arr[]){
        System.out.println("method1 called");
        return arr;
    }

    public static void main(String[] args) {
        ArrAsReturnType obj=new ArrAsReturnType();
        int input[]={10,20,30};
        int res []=obj.meth1(input);
        System.out.println(res);//[I@65ab7765
        for(int x:res){
            System.out.println(x) ;
        }
    }
}
