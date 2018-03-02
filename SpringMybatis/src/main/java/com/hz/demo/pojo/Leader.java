package com.hz.demo.pojo;

import java.io.Serializable;

public class Leader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4626552406387093187L;

	private Integer Id;
	
	private String userName;
	
	private String userRealName;
	
	private String position;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userRealName == null) ? 0 : userRealName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leader other = (Leader) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userRealName == null) {
			if (other.userRealName != null)
				return false;
		} else if (!userRealName.equals(other.userRealName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Leader [Id=" + Id + ", userName=" + userName + ", userRealName=" + userRealName + ", position="
				+ position + "]";
	}
	
	
}
