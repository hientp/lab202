import java.util.ArrayList;
import java.util.List;

public class Odd {

    public static List<Integer> oddNum(int number){
            List<Integer> list = new ArrayList<>(number);
            for(int i=1; i <= number; i=i+2)
                list.add(i);
            return (list);
        }

    public static void main(String[] args) {
        oddNum(29);
        com.java2novice.junit.samples.Breakword.hasBreakWord("boolean");
    }

}


//    public String oddNum(int number){
//            List<Integer> list = new ArrayList<>(number);
//            for(int i=1; i <= number; i=i+2)
//                list.add(i);
//            return String.valueOf(list);
//        }

