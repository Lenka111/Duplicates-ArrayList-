import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hello", "Hello", "Bye", "Hi",
                "Bunny", "Bunny","Kiwi","3", "3"));

        //print the array list
        System.out.println(names);

        //call method remove duplicates
        ArrayList<String> newNames = removeDuplicates(names);
        //print the new names
        System.out.println(newNames);
        System.out.println(getDuplicates(names));


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,6,7,8,8,8,9,1));
        System.out.println(list);
        System.out.println(getDuplicates(list));

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println(newList);


    }
    public static <T> ArrayList<T> getDuplicates(ArrayList<T> names){
        for (int i = 0; i < names.size(); i ++){
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    System.out.println("Duplicates in the array :  " + names.get(i));
                }
            }
        }
        return names;

    }
    //remove duplicates
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
     //create new array list and save all the duplicate elements in it
        ArrayList<T>duplicateElements = new ArrayList<>();
        //traverse through the first list
        for(T i : list) {
            //if the element does not exist in the new list, add it
            if (!duplicateElements.contains(i)) {

                duplicateElements.add(i);
            }
        }
        //return the new list
        return  duplicateElements;
        }



    }//end class
