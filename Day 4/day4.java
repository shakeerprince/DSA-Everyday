import java.util.*;
public class Main {
    public static void main(String[] args){

        int[] arr= {1,2,3,4,5,8,9,0,1};

        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i< arr.length; i++){
            int n = arr[i];

            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (int i:map.keySet()){
            System.out.println(i+ " ->" +map.get(i));
        }

    }
}


////////

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] arr ={ "Hello", "bolo", "Hello", "tata", "Hello", "bolo", "Hello", "tata"};

        for (int i =0; i< arr.length; i++){
            String n = arr[i];
//            if (map.containsKey(n)){
//                int prev = map.get(n);
//                map.put(n,prev+1);
//            }else{
//                map.put(n,1);
//            }
            map.put(n,map.getOrDefault(n,0)+1);

            }
        for (String s:map.keySet()){
            System.out.println(s + " ->"+map.get(s));
        }
        }

    }

