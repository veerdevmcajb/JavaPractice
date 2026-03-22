package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfCollection_DB_Table {

    public static void main(String[] args) {

        ArrayList <List<Object>> table =new ArrayList<>();

        List<Object> columnNames = List.of("V1","V2","V3","V4","V5");
        List<Object> row1 = List.of(1,2,3,4,5);
        List<Object> row2 = List.of(2,3,4,5);
        List<Object> row3 = List.of(3,4,5);
        List<Object> row4 = List.of(4,5);
        List<Object> row5 = List.of(5);

        table.add(columnNames);
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);
        table.add(row5);

        System.out.println(table);
        System.out.println();

        table.forEach(e-> System.out.println(e +"\t"));

        System.out.println("======================================");

        table.forEach(
                row ->{
                                for(Object o:row){
                                    System.out.print(o + "\t");
                                }
                    System.out.println();
                }
        );
    }
}
