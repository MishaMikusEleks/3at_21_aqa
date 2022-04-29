package day_3;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
        //1) Find max number in array: 5, 9, 3, 2, 0, -4, -8.3, 3, -4
        System.out.println("task_1");
        double[] array1= new double[] {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        double max= array1[0];
        for(double d:array1){
            if(max<d){max=d;}
        }
        System.out.println("max="+max);

        //2) Given array: {1, 6, 3, 3, 4, 5, 5, 6, 0}. Print array with only unique values, which are sorted.
        System.out.println("task_2");
        int[] array2= new int[] {1, 6, 3, 3, 4, 5, 5, 6, 0};

        int[] res2= new int[array2.length];
        int resIndex=0;
        for(int i:array2){
           if(!contains(res2,i)){
               res2[resIndex++]=i;
           }
        }
        Arrays.sort(res2);
        System.out.println(Arrays.toString(res2));


        //3)Given an array, e.g. "12", "23", "34", "12", "56", "67“. Replace all values “12” to “replaced”
        System.out.println("task_3");
        String[] array3= new String[] {"12", "23", "34", "12", "56", "67"};
        int i3=0;
        for(String s:array3){
            if(s.equals("12")){array3[i3]="replaced";}
            i3++;
        }
        System.out.println(Arrays.toString(array3));

        //4) Print any array in reverse mode (from the end)
        System.out.println("task_4");
        String[] array4= new String[] {"12", "23", "34", "12", "56", "67"};
        int i4=array4.length-1;
        for(String s:array4){
            System.out.print(array4[i4]+" ");
            i4--;
        }

    }

    private static boolean contains(int[] testArray, int testValue) {
        for(int i:testArray){
            if(i==testValue) {return true;}
        }
        return false;
    }
}
