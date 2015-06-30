package com.stacksync.commons.models.abe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class ATNode implements Serializable {
	
	protected ATNode parent;
	protected int threshold_value;
	protected int index;
	
	public ATNode(ATNode parent){
		this.parent = parent;
		this.threshold_value = -1;
		this.index = 0;
	}
	
	public boolean isRoot(){
		return parent == null;
	}

	public ATNode getParent() {
		return parent;
	}

	public void setParent(ATNode parent) {
		this.parent = parent;
	}

	public int getThreshold_value() {
		return threshold_value;
	}

	public void setThreshold_value(int threshold_value) {
		this.threshold_value = threshold_value;
	}
	
	public abstract ArrayList<String> getAttributes();
        
        public abstract HashMap<String, Integer> getAttributesId();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

