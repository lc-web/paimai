package com.accp.pojo;


public class houses {
	private Integer id;
	private String title;
	private Integer rtid;
	private Integer userid;
	private Integer proportion;
	private Long price;
	private String housedate;
	private String county;
	private String street;
	private String connect;
	private String detail;

	public houses(Integer id, String title, Integer rtid, Integer userid, Integer proportion, Long price,
			String housedate, String county, String street, String connect, String detail) {
		super();
		this.id = id;
		this.title = title;
		this.rtid = rtid;
		this.userid = userid;
		this.proportion = proportion;
		this.price = price;
		this.housedate = housedate;
		this.county = county;
		this.street = street;
		this.connect = connect;
		this.detail = detail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getRtid() {
		return rtid;
	}

	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getProportion() {
		return proportion;
	}

	public void setProportion(Integer proportion) {
		this.proportion = proportion;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getHousedate() {
		return housedate;
	}

	public void setHousedate(String housedate) {
		this.housedate = housedate;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getConnect() {
		return connect;
	}

	public void setConnect(String connect) {
		this.connect = connect;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public houses() {
		super();
		// TODO Auto-generated constructor stub
	}
}