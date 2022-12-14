package com.lesson.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	ArrayList<String> names = new ArrayList();
    	names.add("Dave");
    	names.add("Aimee");
    	names.add("Adam");
    	names.add("Jane");
    	
    	System.out.println(names);
    	System.out.println(names.get(1));
    	Collections.reverse(names);
    	System.out.println(names);
    	Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
    	System.out.println(names);
    	*/
    	
    	Character legacyA = new Character();
    	Character legacyB = new Character();
    	
    	System.out.println(legacyA.getName());
    	System.out.println(legacyB.getName());
    	
    	legacyA.setName("abc");
    	legacyB.setName("xyz");
    	
    	System.out.println(legacyA.getName("Stylish"));
    	System.out.println(legacyB.getName("warning"));
    	
    	Character testA = new Character("123");
    	Character testB = new Character("456");
    	
    
    	System.out.println(testA.getName("reminder"));
    	testA.doSomething();
    	
    	System.out.println(testB.getName());
    	testB.doSomething();
    	
    	
    	Wizard theWizard = new Wizard("Mr Wizard");
    	System.out.println(theWizard.type);
    	Elf theElf = new Elf("Mrs Elf");
    	System.out.println(theElf.type);
    	
    	int score = 0;
    	score = score + theWizard.doMagic(10);
    	score = score + theElf.doArchery(10);
    	
    	System.out.println("The score was "+ score);
    	
    	/*if(theWizard.setHealth(50)) {
    		System.out.println(theWizard.getType() + " health was updated.");
    	}
    	System.out.println(theWizard.getHealth());
    	
    	
    	if(theWizard.setHealth(-50)) {
    		System.out.println(theWizard.getType() + " health was updated.");
    	}*/
    	
    	
    	if(theWizard.setHealth(50) > 0) {
    		System.out.println(theWizard.getType() + " is still alive.");
    	}else {
    		System.out.println(theWizard.getType() + " has died.");
    	}
    	System.out.println(theWizard.getHealth());
    	
    	if(theWizard.setHealth(-50) > 0) {
    		System.out.println(theWizard.getType() + " is still alive.");
    	}else {
    		System.out.println(theWizard.getType() + " has died.");
    	}
    	System.out.println(theWizard.getHealth());
    	
    	
    	if( theWizard.doMagic("open seasme") > 0 ) {
    		System.out.println("The spell was performed...");
    	}
    	
    	System.out.println( 5 < 10 );
    	System.out.println( 5 > 10 );
    	
    	if(true) {
    		System.out.println("ABC");
    	}else {
    		System.out.println("123");
    	}
    	
    	if(false) {
    		System.out.println("XYZ");
    	}else {
    		System.out.println("456");
    	}
    	
    	
    	if( theWizard.doMagic("open seasme") > 0 ) {
    		System.out.println("Magic was done...");
    	}
    	
    	if( theWizard.doMagic("something") == 0 ) {
    		System.out.println("No magic was done...");
    	}
    	
    	System.out.println("open seasme = "+ theWizard.doMagic("open seasme"));
    	
    	
    	System.out.println("magic hashmap = "+ theWizard.doMagicHashMap("blast"));
    	
    	
    	HashMap<String,Integer> magic = new HashMap<String,Integer>();
		
		magic.put("heal", 10);
		magic.put("blast", 20);
		magic.put("invisible", 30);
		
		System.out.println("heal = "+ magic.get("heal"));
		
		System.out.println(magic);
		System.out.println( magic.size() );
		
		magic.put("shrink", 25);

		System.out.println( magic.size() );
		
		
		System.out.println(magic);
		magic.remove("blast");
		System.out.println(magic);
		
		magic.put("heal", 40);
		System.out.println(magic);
        
		System.out.println( theWizard.getMagic("HeaL") );
		//theWizard.getMagic("random");
		System.out.println( theWizard.getMagic("xyz") );
		
		theWizard.testMagic();
		
		/*HashMap<String,HashMap> data = new HashMap<String,HashMap>();
		HashMap<String,HashMap> person = new HashMap<String,HashMap>();
		person.put("name", "Alan");
		person.put("age", 20);
		
		data.put("person", person);
		//data.person.name
		//data.person.age
		*/
		
    }
}
