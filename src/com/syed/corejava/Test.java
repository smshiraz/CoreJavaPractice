package com.syed.corejava;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
        List<User1> users = Arrays.asList(
            new User1("Alice", 20),
            new User1("Bob", 30),
            new User1("Charlie", 26),
            new User1("David", 23)
        );
        
       users.stream().filter(x->x.getAge()>20).map(x->x.getName()).forEach(System.out::println);
        
        
	
	}
	
}



