package com.sample.familytree;

import com.sample.familyTree.bean.Person;
import com.sample.familyTree.bean.Relation;

public class FamilyData {
	 public void createFamilyData() {
		Person papa1 = new Person("rameshwar",  70, "vlw","male");
		System.out.println(papa1);
		Person papa2 = new Person("Arun",  45, "farmer","male");
		System.out.println(papa2);
		Person mummy = new Person("Sudama",  65, "housewife","female");
		System.out.println(mummy);
		Person mummy2 = new Person("champa",  43, "housewife","Female");
		System.out.println(mummy2);
		
	}
	 public void createRelationData() {
		 Person papa1 = new Person("rameshwar",  70, "vlw","male");
		 Person mummy = new Person("Sudama",  65, "housewife","female");
		 
		   Relation papatomummy = new Relation(papa1,mummy ,"wife");
		   System.out.println(papatomummy);
		   //Relation papatome = new Relation(rameshwar,soni,"daughter");
		   //System.out.println(papatome);
		  // Relation mummytome = new Relation(sudama,soni,"daughter");
		   //System.out.println(mummytome);
		   
	 }
	
	

}
