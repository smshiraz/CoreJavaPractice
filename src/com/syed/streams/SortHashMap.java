package com.syed.streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
 
public class SortHashMap
{
    public static void main(String[] args) 
    {
                
        Map<Integer, String> hashMap = new HashMap<Integer, String>(); 
        hashMap.put(111, "Delhi");
        hashMap.put(222, "Bombay");
        hashMap.put(333, "Amethi");
        hashMap.put(444, "Calcutta");
        hashMap.put(555, "Faridabad");
        hashMap.put(666, "Guwahati");
        
        //Java 8 sorting using Entry.comparingByValue()
         
        Map<Integer, String> sortedHashMap 
        = hashMap.entrySet()
                   .stream()
                   .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
         // OR  
        // .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
        
        
        //Print hashMap before and after sorting
         
        System.out.println("Before Sorting : ");         
        System.out.println(hashMap);
         
        System.out.println("After Sorting : ");         
        System.out.println(sortedHashMap);
        
        
        
        //sort by key
        Map<Integer, String> hm = new HashMap<Integer, String>(); 
        hm.put(222, "Delhi");
        hm.put(888, "Bombay");
        hm.put(444, "Amethi");
        hm.put(999, "Calcutta");
        hm.put(555, "Faridabad");
        hm.put(777, "Guwahati");
        
        Map<Integer, String> sortedhm
        = hm.entrySet()
                   .stream()
                   .sorted(Entry.comparingByKey())
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
    
    System.out.println("Before Sorting : ");         
    System.out.println(hm);
     
    System.out.println("After Sorting : ");         
    System.out.println(sortedhm);
}
}