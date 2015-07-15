package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workspace implements Serializable {

	protected static final long serialVersionUID = 243350300638953723L;

	protected UUID id;
	protected String name;
	protected Item parentItem;
	protected Integer latestRevision;
	protected User owner;
	protected String swiftContainer;
	protected String swiftUrl;
	protected boolean isShared;
	protected boolean isEncrypted;
        protected boolean isAbeEncrypted;
	protected List<Item> items;
	protected List<User> users;

	public Workspace() {
		this(null);
	}

	public Workspace(UUID id) {
		this(id, 0, null, false, false);
	}

	public Workspace(UUID id, Integer latestRevision, User owner, boolean isShared, boolean isEncrypted ) {
		this.id = id;
		this.latestRevision = latestRevision;
		this.owner = owner;
		this.isShared = isShared;
		this.isEncrypted = isEncrypted;
		this.items = new ArrayList<Item>();
		this.users = new ArrayList<User>();
                this.isAbeEncrypted = false;
	}
        
        public Workspace(UUID id, String name, Item parentItem, Integer latestRevision, User owner, boolean isShared, boolean isEncrypted, List<User> users, List<Item> items, String swiftContainer, String swiftUrl) {
                this.id = id;
                this.name = name;
                this.parentItem = parentItem;
		this.latestRevision = latestRevision;
                this.owner = owner;
                this.swiftContainer = swiftContainer;
                this.swiftUrl = swiftUrl;
                this.isShared = isShared;
                this.isEncrypted = isEncrypted;
                this.isAbeEncrypted = false;
                this.items = items;
		this.users = users;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getLatestRevision() {
		return latestRevision;
	}

	public void setLatestRevision(Integer latestRevision) {
		this.latestRevision = latestRevision;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	public boolean isShared() {
		return isShared;
	}

	public boolean isEncrypted() {
		return isEncrypted;
	}
	
        public boolean isAbeEncrypted() {
		return isAbeEncrypted;
	}
        
	public void setEncrypted(boolean isEncrypted){
		this.isEncrypted = isEncrypted;
	}
        
        public void setAbeEncrypted(boolean isAbeEncrypted) {
		this.isAbeEncrypted = isAbeEncrypted;
	}

	
	public void setShared(Boolean isShared) {
		this.isShared =isShared;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSwiftContainer() {
		return swiftContainer;
	}

	public void setSwiftContainer(String swiftContainer) {
		this.swiftContainer = swiftContainer;
	}
	
	public String getSwiftUrl() {
		return swiftUrl;
	}

	public void setSwiftUrl(String swiftUrl) {
		this.swiftUrl = swiftUrl;
	}

	public Item getParentItem() {
		return parentItem;
	}

	public void setParentItem(Item parentItem) {
		this.parentItem = parentItem;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeObject(Item object) {
		this.items.remove(object);
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public void removeUser(User user) {
		this.users.remove(user);
	}

	/**
	 * Checks whether the user contains all required attributes (ID is not
	 * required since it is assigned automatically when a user is inserted to
	 * the database)
	 * 
	 * @return Boolean True if the user is valid. False otherwise.
	 */
	public boolean isValid() {
		if (this.owner == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return String.format(
				"workspace[id=%s, latestRevision=%s, owner=%s, items=%s, users=%s]", id,
				latestRevision, owner, items, users);
	}
}
