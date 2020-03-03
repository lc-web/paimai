package com.accp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * reply_detail
 * @author 
 */
public class ReplyDetail implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 帖子编号
     */
    private Integer invid;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 回复人昵称
     */
    private String author;

    /**
     * 回复时间
     */
    private Date createdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvid() {
        return invid;
    }

    public void setInvid(Integer invid) {
        this.invid = invid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	@Override
	public String toString() {
		return "ReplyDetail [id=" + id + ", invid=" + invid + ", content=" + content + ", author=" + author
				+ ", createdate=" + createdate + "]";
	}

	public ReplyDetail(Integer id, Integer invid, String content, String author, Date createdate) {
		super();
		this.id = id;
		this.invid = invid;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}

	public ReplyDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}