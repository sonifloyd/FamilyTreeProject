package com.sample.familyTree.bean;

public class Relation {
	private Person from;
	private Person to;
	private String relation;
	public Relation(Person from,Person to,String relation) {
		this.from=from;
		this.to=to;
		this.relation=relation;
	}
	@Override
	public String toString() 
    { 
        return from + " " + to + " " +  relation + " " ; 
    } 
	
	public Person getFrom() {
		return from;
	}
	public void setFrom(Person from) {
		this.from = from;
	}
	public Person getTo() {
		return to;
	}
	public void setTo(Person to) {
		this.to = to;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	

}
