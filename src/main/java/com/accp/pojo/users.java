package com.accp.pojo;

public class users {
    private Integer userid;

    private String username;

    private String userpwd;

    private String userphone;

    private String userrealname;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }

	public users(Integer userid, String username, String userpwd, String userphone, String userrealname) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.userphone = userphone;
		this.userrealname = userrealname;
	}

	@Override
	public String toString() {
		return "users [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", userphone="
				+ userphone + ", userrealname=" + userrealname + "]";
	}

	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}