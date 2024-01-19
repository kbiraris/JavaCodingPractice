import java.util.*;

public class FindDuplicatesValuesInArray {

    public static void main(String[] args) {

        int[] array = {1,-2,3,4,1,5,-2};
        System.out.println("Given Array - " + Arrays.toString(array));

        findDuplicateValueInArray(array);
    }

    static void findDuplicateValueInArray(int[] array){
        List<Integer> list = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();

        for(int value:array){
            if(!hashSet.add(value)) // here If the element was successfully added to the 'set' then 'add' method returns true.
                                    // here If the result is false, '!' turns it into true as element was not added to the set because it is already present
            {
                list.add(value);
            }
        }

        System.out.println("Duplicate values in Array - " + list);
    }
}