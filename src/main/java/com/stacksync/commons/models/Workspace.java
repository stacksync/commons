package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workspace implements Serializable {

	private static final long serialVersionUID = 243350300638953723L;

	private UUID id;
	private String name;
	private Item parentItem;
	private Integer latestRevision;
	private User owner;
	private String swiftContainer;
	private String swiftUrl;
	private boolean isShared;
	private boolean isEncrypted;
	private List<Item> items;
	private List<User> users;

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
	
	public void setEncrypted(boolean isEncrypted){
		this.isEncrypted = isEncrypted;
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
