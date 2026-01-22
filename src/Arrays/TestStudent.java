package Arrays;

public class TestStudent {
    public static void main(String[] args) {

        Student [] s=new Student[8];
        s[0]=new Student(101,"Veer",75);
        s[5]=new Student(102,"Ram",88);
        s[2]=new Student(103,"Akash",55);
        s[7]=new Student(104,"Natha",98);
        s[4]=new Student(105,"Vijay",88);

        for(Student ss : s){
            if(ss==null){
                System.out.println(ss);
            }else {
                System.out.println(ss.id + " " + ss.name +" " + ss.marks);
            }
        }

        // if want the empty locations or  nall value index of array

        for(int i=0;i<s.length;i++){
            if(s[i]==null){
                System.out.println(i);
            }
        }
    }
}
