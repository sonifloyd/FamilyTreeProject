package com.sample.familyTree.bean;

public class Person {
   private String name;
   private int age;
   private String job;
   private String gender;
   
   
   public Person(String name, int age, String job,String gender)
   {
	   this.name = name;
	   this.age = age;
	   this.job = job;
	   this.gender = gender;
	   
   }
  

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
  
@Override
public String toString() 
{ 
    return name + " " + age +  " " + job + " " + gender; 
} 

}
