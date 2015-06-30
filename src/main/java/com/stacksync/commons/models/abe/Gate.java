package com.stacksync.commons.models.abe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Gate extends ATNode implements Serializable{
	
	public enum GateType{AND, OR};
	private ArrayList<ATNode> children;
	private GateType gateType;
	
	
	public Gate(ATNode parent, GateType gateType){
		super(parent);
		this.children = new ArrayList<ATNode>();
		this.gateType = gateType;
		if(gateType.equals(GateType.OR)){
			this.threshold_value = 1;
		}else{
			this.threshold_value = 0;
		}
	}
	
	public void addChild(ATNode child){
		child.setIndex(this.children.size()+1);
		this.children.add(child);
		if(this.gateType.equals(GateType.AND)){
			this.threshold_value = this.children.size();
		}
	}
	
	public void addChildren(ArrayList<ATNode> children){
		for(ATNode child: children){
			child.setIndex(this.children.size()+1);
			this.children.add(child);
		}
		if(this.gateType.equals(GateType.AND)){
			this.threshold_value = this.children.size();
		}
	}

	public int getNum_child() {
		return this.children.size();
	}

	public ArrayList<ATNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<ATNode> children) {
		this.children = children;
	}

	public GateType getGateType() {
		return gateType;
	}

	public void setGateType(GateType gateType) {
		this.gateType = gateType;
	}
	
	public ArrayList<String> getAttributes(){
		ArrayList<String> attributes = new ArrayList<String>();
		for(ATNode child: this.children){
			attributes.addAll(child.getAttributes());
		}
		return attributes;
	}
        
	public HashMap<String, Integer> getAttributesId(){
		HashMap<String, Integer> attributes = new HashMap<String, Integer>();
		for(ATNode child: this.children){
			attributes.putAll(child.getAttributesId());
		}
		return attributes;
	}
	
	@Override
	public String toString(){
		String gate_str = "(";
		gate_str += this.children.get(0).toString();
		for(int i=1;i<this.children.size();++i){
			gate_str += " "+this.gateType.toString();
			gate_str += " "+this.children.get(i).toString();
		}
		gate_str += ")";
		return gate_str;
	}
}
