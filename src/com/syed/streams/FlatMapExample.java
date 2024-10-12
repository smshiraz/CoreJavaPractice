package com.syed.streams;
/*
 * 
 * In Java 8 Streams, the flatMap() method applies operation as a mapper function and provides a stream of element values.
 *  It means that in each iteration of each element the map() method creates a separate new stream. By using the flattening
 *   mechanism, it merges all streams into a single resultant stream. 
 *   In short, it is used to convert a Stream of Stream into a list of values.
 */
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
import java.util.stream.Collectors;  
public class FlatMapExample  
{  
public static void main(String args[])   
{  
//creating ArrayList      
List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard");  
List<String>  productlist2 = Arrays.asList("Computer", "Mobile", "pendrive");  
 

List<List<String>> allproducts = new ArrayList<List<String>>();   

//adding elements to the list  
allproducts.add(productlist1);  
allproducts.add(productlist2);  
  
//creating a list of all products  

List<String> listOfAllProducts = new ArrayList<String>();  
//for each loop iterates over the list  
for(List<String> pro : allproducts)   
{  
for(String product : pro)   
{  
//adds all products to the list      
listOfAllProducts.add(product);  
}  
}  
System.out.println("List Before Applying mapping and Flattening: \n");  
//prints stream before applying the flatMap() method  
System.out.println(listOfAllProducts);  
System.out.println();  
//creats a stream of elemnts using flatMap()  
List<String> flatMapList = allproducts .stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());   
System.out.println("List After Applying Mapping and Flattening Operation: \n");   
//prints the new stream that we get after applying mapping and flattening   
System.out.println(flatMapList);          
}  
}  