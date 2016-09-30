package domain;

import java.util.Set;

public class ContactGroup {
	
	private int groupId;
	private String groupName;
	private Set contacts;

	
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
	
	

}
