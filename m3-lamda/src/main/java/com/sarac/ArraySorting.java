package com.sarac;

public class ArraySorting {//QuickSort,BubbleSort

    public static void main(String[] args) {


        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);


        System.out.println("------------------------------------");
        Sorting quickSort=()-> System.out.println("Quick Sorting");
        as.sort(quickSort);
        //or
        System.out.println("--------------------");
        as.sort(()->System.out.println("Quick Sorting"));

        //With Java 8 we have access to a bunch of ready functional interface


    }

    public void sort(Sorting sorting) {
        sorting.sort();
    }
}
