package java8Features.OptionalClass;

import java.util.Optional;

public class User {

    // this is without Optional Object
//    public String getUserNameById(int id){
//        if(id==100)
//        {
//            return "Raju";
//        } else if (id==101) {
//            return "Rani";
//        } else if (id==102) {
//            return "Vijay";
//        }else {
//            return null;
//        }
//    }

    // with Optional Object
    public Optional<String>getUserNameById(Integer id){
        String name=null;
        if(id==100){
            name="Raju";
        } else if (id==101) {
            name="Ram";
        } else if (id==102) {
            name="Rani";
        }return Optional.ofNullable(name);

    }
}
