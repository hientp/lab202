import java.util.ArrayList;
import java.util.List;

public class Odd {

    public List<Integer> oddNum(int number){
            List<Integer> list = new ArrayList<>(number);
            for(int i=1; i <= number; i=i+2)
                list.add(i);
            return (list);
        }

    }

//    public String oddNum(int number){
//            List<Integer> list = new ArrayList<>(number);
//            for(int i=1; i <= number; i=i+2)
//                list.add(i);
//            return String.valueOf(list);
//        }