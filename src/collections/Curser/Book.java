package collections.Curser;

import inheritance.multiLevel.B;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    int id;
    String name;

        Book(int id,String name){
            this.id=id;
            this.name=name;
        }
    public static void main(String[] args) {
        ArrayList <Book>list= new ArrayList<Book>();
        list.add(new Book(101,"You can Win"));
        list.add(new Book(102,"5 AM Clb"));
        list.add(new Book(103,"Automic Habit"));
        list.add(new Book(104,"Questions are the ans"));
        list.add(new Book(105,"Rich dad"));

        // using for each loop
        for(Book s:list){
            System.out.println(s.id+" -> "+s.name);
        }

        // read the data using get() method
        Book b=list.get(3);
        System.out.println(b.id+" "+b.name);

        // read the data using curser Iterator
        System.out.println("Reading data using Curser Iterator");
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            Book s=(Book) itr.next();
            System.out.println(s.id+" "+ s.name);
        }

        System.out.println("--------------");
        // read data using forEach() method
        list.forEach(System.out::println);
        list.forEach(s-> System.out.println(s.id+" "+s.name));


    }
}
