package org.srk.solutions.java.advanced.designPatterns;

import java.util.Scanner;

class Singleton {
	public String str;
    private Singleton() {
    	str = "Hello I am a singleton! ";
    }

    // private static Singleton instance = new Singleton();
	// public static Singleton getSingleInstance () {
	// return INSTANCE;
	// }
    
    private static Singleton instance = null;
    
    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }  
}

public class JavaSingletonPattern {
	public static void main(String args[])
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String input = scan.nextLine();
        // instantiating Singleton class with variable x
		Singleton obj = Singleton.getSingleInstance();
 
        // changing variable of instance x
		obj.str = obj.str + "Let me say "+ input + " to you.";
 
        System.out.println(obj.str);
        scan.close();
    }
}
