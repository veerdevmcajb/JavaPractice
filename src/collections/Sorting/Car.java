package collections.Sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Car implements Comparable {
    int cost;

    public Car(int cost) {
        this.cost=cost;
    }


    @Override
    public String toString() {
        return "Car{" + "cost=" + cost + '}';
    }

    @Override
    public int compareTo(Object o) {
        Car car=(Car) o;
        return this.cost-car.cost;
    }
}


class SortCar{
    public static void main(String[] args) {
        TreeSet<Car>ts=new TreeSet<>();
        ts.add(new Car(200));
        ts.add(new Car(300));
        ts.add(new Car(100));

        System.out.println(ts);
    }
}