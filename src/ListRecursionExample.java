import java.util.ArrayList;
import java.util.List;

// IP: [1,2,3,[4,5],6,7,[8,9,10]]
// OP: [1,2,3,4,5,6,7,8,9,10]

public class ListRecursionExample {
    public static void main(String[] args) {

        List<Object> nestedList = new ArrayList<>();
        //System.out.println(nestedList);
        nestedList.add(1);
        nestedList.add(2);
        nestedList.add(3);
        List<Object> subList1 = new ArrayList<>();
        subList1.add(4);
        subList1.add(5);
        nestedList.add(subList1);
        nestedList.add(6);
        nestedList.add(7);
        nestedList.add(8);
        List<Object> subList2 = new ArrayList<>();
        subList2.add(9);
        subList2.add(10);
        nestedList.add(subList2);

        System.out.println(nestedList);
        System.out.println(output(nestedList));
    }
    public static List<Integer> output(List<Object> nestedList){
        List<Integer> outputList = new ArrayList<>();

        for(Object obj : nestedList){
            if(obj instanceof Integer){
                outputList.add((Integer) obj);
            }else{
                outputList.addAll(output((List<Object>) obj));
            }        }
        return outputList;
    }
}
