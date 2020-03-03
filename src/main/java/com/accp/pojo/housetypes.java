package com.accp.pojo;

public class housetypes {
    private Integer id;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

	@Override
	public String toString() {
		return "housetypes [id=" + id + ", type=" + type + "]";
	}

	public housetypes(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public housetypes() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}