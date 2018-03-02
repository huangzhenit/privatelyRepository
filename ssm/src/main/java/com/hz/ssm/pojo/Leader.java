package com.hz.ssm.pojo;

public class Leader {
    private Integer id;

    private String username;

    private String userrealname;

    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

	@Override
	public String toString() {
		return "Leader [id=" + id + ", username=" + username + ", userrealname=" + userrealname + ", position="
				+ position + "]";
	}
    
    
}