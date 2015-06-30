package com.stacksync.commons.models.abe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Leaf extends ATNode implements Serializable{
	
	private String attribute;
	private boolean negated;
	private int id;
	private static int increment_id = 0;
	
	public Leaf(ATNode parent, String attribute){
		super(parent);
		this.attribute = attribute;
		this.threshold_value = 1;
		this.negated = false;
		this.id = increment_id++;
	}
	
	public void negate(){
		this.negated = !this.negated;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public boolean isNegated() {
		return negated;
	}

	public void setNegated(boolean negated) {
		this.negated = negated;
	}
	
	public ArrayList<String> getAttributes(){
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add(this.attribute);
		return attributes;
	}
        
	public HashMap<String, Integer> getAttributesId(){
		HashMap<String, Integer> attributes = new HashMap<String, Integer>();
		attributes.put(this.attribute, this.id);
		return attributes;
	}
	
	@Override
	public String toString(){
		String leaf_string="";
		if(this.negated){
			leaf_string+="!";
		}
		leaf_string += this.attribute;
		
		return leaf_string;
	}

	public int getId() {
		return this.id;
	}
	
	public static void resetIdCounter(){
		increment_id = 0;
	}
}
