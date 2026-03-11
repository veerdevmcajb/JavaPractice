package collections.map.LinkedHashMap;

import java.util.LinkedHashMap;

public class CharacterCount {

    public static void main(String[] args) {

        String s = "Java Programming Language by Hari Krushna ";

        LinkedHashMap <Character , Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(map.containsKey(ch)){
                map.put(ch ,map.get(ch)+1 );
            }else {
                map.put(ch,1);
            }
        }

        System.out.println(map);

        // map.forEach(s-> System.out.println(s));
    }

}
