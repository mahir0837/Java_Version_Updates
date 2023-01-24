package GenerycTask;

import java.util.Arrays;

public class SwapValues {

    private static<T> void swapArr(T[]arr,int i1,int i2){

        T a =arr[i1];
       if (i1!=i2){
           arr[i1]=arr[i2];
           arr[i2]=a;
       }else{
           System.err.println("index numbers are same");
       }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        Integer[]arr={1,2,3,4,5,6};
        swapArr(arr,1,3);
        String[]arr1={"apple","bananas","strawbery","chery"};
        swapArr(arr1,0,2);
    }

}

