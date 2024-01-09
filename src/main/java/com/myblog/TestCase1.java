package com.myblog;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCase1 {

    public static void main (String [] args){


//        Function<String ,Integer> result = str->str.length();
//        Integer LENGTH = result.apply("Archivers");
//        System.out.println(LENGTH);
        
        // WRITE THE PROGRAM TO PRINT THE JAVA PROGRAM TO SORTED THE NUMBER BY USING THE STREAM API
        

        List<Integer> numbers = Arrays.asList(90, 67, 90, 67, 87, 56, 45);
        List<Integer> SortedNUmber = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(SortedNUmber);


        List<Integer> number1 = Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);
        List<Integer> Dupliacate = number1.stream().distinct().collect(Collectors.toList());
        System.out.println(Dupliacate);


        List<Integer> number2 = Arrays.asList(90, 67, 90, 67, 87,   67 , 56, 45);
        List<Integer> Sum = number2.stream().reduce((a, b) -> a+b).stream().collect(Collectors.toList());
        System.out.println(Sum);

        List<Integer> Data = Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);
        List<Integer> DATA = Data.stream().map(i -> i + 10).collect(Collectors.toList());
        System.out.println(DATA);


        List<Integer> Data1 = Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);
        List<Integer> DATA2 = Data.stream().map(i -> i*10).collect(Collectors.toList());
        System.out.println(DATA2);


        List<String> Data2 = Arrays.asList("VISHAL", "AMAIR","SHEWATA");
        List<String> NEWString = Data2.stream().sorted().collect(Collectors.toList());
        System.out.println(NEWString);

        List<String> Data9 = Arrays.asList("VISHAL", "AMAIR","SHEWATA","RAHUL","SHIVAM","JAI SHREE RAM");
        List<String> LOWERCASEDATA = Data9.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        System.out.println(LOWERCASEDATA);

        List<Integer> Data6 = Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);
        List<Integer> STARTWITHSIX = null;
        Data6.stream().map(i -> i + "").filter(i -> i.startsWith("6")).forEach(System.out::println);

        System.out.println(STARTWITHSIX);

        List<Integer> Data0 = Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);

        List<Integer> DescendingOrder = Data0.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(DescendingOrder);


        // Find the MAx number from the LIST

        List<Integer> Data8 = Arrays.asList(90, 67, 90, 123, 87, 87 , 56, 45);
        Integer MAX = Data8.stream().max(Integer::compare).get();
        System.out.println(MAX);


        List<Integer> Data4= Arrays.asList(90, 67, 90, 67, 87, 87 , 67 , 56, 45);
        long count = Data4.stream().count();
        System.out.println(count);



        List<Integer> result = Arrays.asList(89, 67, 56, 45, 34);
        long count1 = result.stream().count();
        System.out.println(count1);


        





    }
}