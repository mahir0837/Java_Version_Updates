package GenerycTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Generyc {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
        //It is compaile."? extends Number" all the accepting number
    }

    public static void main(String[] args) {
        List<Integer>integerList=new
                ArrayList<>(Arrays.asList(1,2,3,4,5,6));


        print(integerList);
    }
}
