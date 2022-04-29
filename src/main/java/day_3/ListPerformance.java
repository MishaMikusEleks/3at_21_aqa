package day_3;

import java.util.*;

public class ListPerformance {
    public static void main(String[] args) {
        //Check performance for some List operations (get(i),
        // insertAfter(i), ..) for different collection implementations.
        List<String> list1=new ArrayList<>();
        List<String> list2=new LinkedList<>();
        for(int i=0; i<1000;i++){
            list1.add(UUID.randomUUID().toString());
            list2.add(UUID.randomUUID().toString());
        }
        System.out.println("GET Array: "+checkPerfGet(list1));
        System.out.println("GET Linked: "+checkPerfGet(list2));

        System.out.println("SET Array: "+checkSet(list1));
        System.out.println("SET Linked: "+checkSet(list2));

    }

    private static long checkPerfGet(List<String> list1) {
        long start=new Date().getTime();
        Random rand=new Random();
        for(int i=0; i<10000;i++){
            int length=
            list1.get(rand.nextInt(list1.size()-1)).length();
        }
        return new Date().getTime()-start;
    }

    private static long checkSet(List<String> list) {
        long start=new Date().getTime();
        for(int i=0; i<100000;i++){
            list.add(UUID.randomUUID().toString());
        }
        return new Date().getTime()-start;
    }
}
