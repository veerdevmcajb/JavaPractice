package collections.list.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList {

    Object []a=null;
    int index=0;

    CustomArrayList(int size){
        a=new Object[size];
    }

    CustomArrayList(){
        a=new Object[10];
    }

    @Override
    public String toString() {
//        return Arrays.toString(Arrays.copyOf(a,index));
        StringBuilder  s=new StringBuilder();
        s.append("[");
        for(int i=0; i < a.length;i++){
            if(i==(a.length-1)){
                if(null !=a[i]){
                    s.append(a[i]);
                }
            }else {
                if(null!=a[i])
                 s.append(a[i]+", ");
            }
        }
            s.append("]");
            return s.toString();
    }

    public void add(Object obj){
        if(index == a.length){
            int newSize=a.length +(a.length/2);

            a=Arrays.copyOf(a,newSize);
//            Object []ar=new Object[newSize];
//            for(int i=0;i<a.length;i++){
//                ar[i]=a[i];
//            }
//            a=ar;
        }

        a[index]=obj;
        index++;
    }

    public Object get(int i){
        if(i>=index || i <0){
            throw new IndexOutOfBoundsException();
        }
        return a[i];
    }

    public int size(){
        return index;
    }

    public Object remove(int indexToBeDeleted){
        Object obj=get(indexToBeDeleted);
        int noOfShiftOperations=a.length-indexToBeDeleted-1;
        if(noOfShiftOperations>0){
            System.arraycopy(a,indexToBeDeleted,a,indexToBeDeleted+1,noOfShiftOperations);
        }
        a[--index]=null;
            return obj;
    }
}
