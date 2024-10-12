package com.syed.corejava;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class PredefinedFunctionalInterface {
	//Function--      R apply(T t);
	//BiFunction      R apply(T t, U u);
	//Predicate--     boolean test(T t);
	//BiPredicate--   boolean test(T t, U u);
	//Consumer  --    void accept(T t);
	//BiConsumer--    void accept(T t, U u);
	//Supplier--       T get();
	//UnaryOperator
	//BinaryOperator
	public static void main(String[] args) {
		
		//Function
		 Function<String, Integer> func = x -> x.length();
		 System.out.println( func.apply("Hello")); // 5
		 
		 //BiFunction
		 
		  BiFunction<Integer, Integer, Integer> bifunc = (x1, x2) -> x1 + x2;
	        Integer result = bifunc.apply(2, 3);
	        System.out.println(result); // 5
	
		//Predicate
		Predicate<Integer> predicate=(x)->(x>50);
		System.out.println(predicate.test(100));//true
		
		//BiPredicate
		BiPredicate<Integer, Integer> biPredicate=(x,y)->(x>y);
		System.out.println(biPredicate.test(100, 50));//true
		
		  //Consumer 
          Consumer<String> consumer= x->System.out.println(x.length()); 
          consumer.accept("hello");
          
          List<Integer> intList= Arrays.asList(1,2,3,4,5);
          Consumer<Integer> c= x->System.out.println(x);
          intList.stream().forEach(c);
          
          //BiConsumer          
          BiConsumer<String,String> biCon=(a,b)-> System.out.println(a+" : "+b);
          biCon.accept("hello","java");
          
          Map<Integer,String> map=new HashMap<>();
          map.put(100,"India");
          map.put(200, "China");
          map.put(300,"USA");
          map.forEach((x,y)-> System.out.println(x+" : " +y));
          
          //Supplier
          Supplier<Integer> sup=()->404;
          System.out.println(sup.get());
          
          //UnaryOperator--In Java 8, UnaryOperator is a functional interface and it extends Function.
          //The UnaryOperator takes one argument, and returns a result of the same type 
          //of its arguments.
          
          UnaryOperator<Integer> uoperator = x -> x * 2;
          Integer res = uoperator.apply(2);
          System.out.println(res);     
          
          //BinaryOperator--In Java 8, BinaryOperator is a functional interface and it extends 
           //BiFunction.The BinaryOperator takes two arguments of the same type and returns
          //a result of the same type of its arguments 
          
          BinaryOperator<Integer> bioper = (x1, x2) -> x1 + x2;
          Integer result2 = bioper.apply(2, 3);
          System.out.println(result2); 
        
        
          
          
		
		
		
	}

}
