package com.sarac.TransectionTask;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Transectiontest {

    public static void main(String[] args) {

        //Find all transactions
        // in the year 2011 and sort them by value(small to high)
        System.out.println("**************************************");
        List<Transaction>transactionList= Transaction.getAll().stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());
        System.out.println(transactionList);

        //What are all the unique cities where the traders work?
        System.out.println("**************************************");
        Transaction.getAll().stream()
                        .map(p->p.getTrader().getCity()).distinct()
                .forEach(System.out::println);

        //Find all traders from Cambridge and sort them by name.
        System.out.println("**************************************");
        Transaction.getAll().stream()
                .filter(p->p.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(p->p.getTrader().getName()))
                .forEach(System.out::println);

        //Return a string of all traders’ names sorted alphabetically
        //  System.out.println("**************************************");.
        Transaction.getAll().stream()
                .sorted(Comparator.comparing(p->p.getTrader().getName()))
                .map(p->p.getTrader().getName()).distinct()
                .forEach(System.out::println);
        // Are any traders based in Milan?
        System.out.println("**************************************");
        boolean b=Transaction.getAll().stream()
                .filter(p->p.getTrader().getCity().equals("Milan"))
                .map(Transaction::getTrader).findAny().isPresent();
        System.out.println(b);

        //Print the values of all transactions
        // from the traders living in Cambridge
        System.out.println("**************************************");
        Transaction.getAll().stream()
                .filter(p->p.getTrader().getCity().equals("Cambridge")).distinct()
                .forEach(System.out::println);

        //What is the highest value of all the transactions?
        System.out.println("**************************************");
        Transaction.getAll().stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .limit(1).forEach(System.out::println);

        // Find the transaction with the smallest value.
        System.out.println("******************************");
        Transaction.getAll().stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1).forEach(System.out::println);
    }

}
