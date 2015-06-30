package com.stacksync.commons.models.abe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


public class AccessTree implements Serializable {
	private ATNode root;
	
	public AccessTree(ATNode root_node){
		this.setRoot(root_node);
	}

	public ATNode getRoot() {
		return root;
	}

	public void setRoot(ATNode root) {
		this.root = root;
	}	
	
	public ArrayList<String> getAttributes(){
		return this.root.getAttributes();
	}
        
        public HashMap<String, Integer> getAttributesId(){
            return this.root.getAttributesId();
        }
	
	@Override
	public String toString(){
		return root.toString();
	}
}



