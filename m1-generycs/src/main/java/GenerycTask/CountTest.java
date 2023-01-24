package GenerycTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer>ci=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int count=countIfodd(ci,new OddPredicate());
        int count2=countIfeven(ci,new EvenPredicate());
        System.out.println("Number of odd integers= "+count);
        System.out.println("Number of even integers= "+count2);
    }

    private static<T> int countIfeven(List<T> ci, UnaryPredicate<T> evenPredicate) {
        int count=0;
        for (T each:ci){

            if (evenPredicate.test(each)){
               count++;
            }
        }
        return count;
    }

    private static<T> int countIfodd(List<T>c,UnaryPredicate<T> oddPredicate){
        int count=0;
        for (T each:c){
           if (oddPredicate.test(each)){
               ++count;
           }
        }
        return count;
  }

}
