package domain;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {
	
	private int groupId;
	private String groupName;
	private Set<Contact> contacts = new HashSet();

	public ContactGroup() {
		super();
	}

	public ContactGroup(int groupId, String groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}	
	
	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

}
