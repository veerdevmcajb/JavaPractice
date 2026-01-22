package Arrays;

// The parent array can hold all the child object
public class Animal {

}
class Dog extends Animal{

}
class Puppy extends Dog{

}
class Test{
    public static void main(String[] args) {

        Animal a=new Animal();
        Dog d=new Dog();
        Puppy p=new Puppy();

        Animal [] arr=new Animal[3];
        arr[0]=a;
        arr[1]=d;
        arr[2]=p;

        for(Animal aa: arr){
            System.out.println(aa);
        }
    }
}
