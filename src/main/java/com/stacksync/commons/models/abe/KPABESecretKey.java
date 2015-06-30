package com.stacksync.commons.models.abe;

import java.util.HashMap;

import com.stacksync.commons.models.abe.AccessTree;
import java.io.Serializable;

public class KPABESecretKey implements Serializable{

	private HashMap<Integer,byte[]> leaf_keys;
	private AccessTree access_tree;
	
	public KPABESecretKey(HashMap<Integer,byte[]> leaf_keys, AccessTree access_tree){
		this.leaf_keys = leaf_keys;
		this.access_tree = access_tree;
	}

	public HashMap<Integer,byte[]> getLeaf_keys() {
		return this.leaf_keys;
	}
	
	public byte[] getLeaf_key(Integer leaf_id) {
		return this.leaf_keys.get(leaf_id);
	}

	public void setLeaf_keys(HashMap<Integer,byte[]> attribute_maps) {
		this.leaf_keys = attribute_maps;
	}
        
        public void setLeaf_key(Integer leaf_id, byte[] leafkey){
            this.leaf_keys.remove(leaf_id);
            this.leaf_keys.put(leaf_id, leafkey);
        }

	public AccessTree getAccess_tree() {
		return access_tree;
	}

	public void setAccess_tree(AccessTree access_tree) {
		this.access_tree = access_tree;
	}
}
