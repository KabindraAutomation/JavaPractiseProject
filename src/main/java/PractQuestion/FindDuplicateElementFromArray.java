package PractQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementFromArray {
    public static void main(String[] args) {
        //How to find duplicate elements in java Array

        String names[]= {"Java","javascript", "c++", "java",};
//        //1. Compare each element
//        for(int i = 0; i<names.length; i++){
//            for(int j = i+1; j<names.length; j++){
//                if(names[i].equals(names[j])){
//                    System.out.println("Duplicate element found " + names[i] );
//                }
//            }
//        }
        //2. using HashSet: Java Collection: it stores unique values;
        Set<String> store = new HashSet<String >();
        for(String name : names){
            if(store.add(name) == false){
                System.out.println("duplicate elements is :: "+ name);
            }
        }

        //3. Using HashMap
        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for(String name : names){
            Integer count = storeMap.get(name);
            if(count == null){
                storeMap.put(name, 1);
            }
            else{
                storeMap.put(name,++count);
            }
        }
        //get  the values from this hashMap:
        //Set<Map.Entry>storeMap.entrySet()


    }

}
