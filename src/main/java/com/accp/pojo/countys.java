package com.accp.pojo;

public class countys {
    private Integer id;

    private String countyname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountyname() {
        return countyname;
    }

	@Override
	public String toString() {
		return "countys [id=" + id + ", countyname=" + countyname + "]";
	}

	public countys(Integer id, String countyname) {
		super();
		this.id = id;
		this.countyname = countyname;
	}

	public countys() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}