package com.happyhouse.dto;

import java.util.Date;

public class QnA {
	private String qnaNo;
	private String qnaTitle;
	private String qnaContent;
	private String qnaUserid;
	private String qnaDatetime;
	private String replyContent;
	private String replyDatetime;
	private String replyUserid;

	public QnA(String qnaNo, String qnaTitle, String qnaContent, String qnaUserid, String qnaDatetime, String replyContent,
			String replyDatetime, String replyUserid) {
		this.qnaNo = qnaNo;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaUserid = qnaUserid;
		this.qnaDatetime = qnaDatetime;
		this.replyContent = replyContent;
		this.replyDatetime = replyDatetime;
		this.replyUserid = replyUserid;
	}

	public String getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(String qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public String getQnaUserid() {
		return qnaUserid;
	}

	public void setQnaUserid(String qnaUserid) {
		this.qnaUserid = qnaUserid;
	}

	public String getQnaDatetime() {
		return qnaDatetime;
	}

	public void setQnaDatetime(String qnaDatetime) {
		this.qnaDatetime = qnaDatetime;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyDatetime() {
		return replyDatetime;
	}

	public void setReplyDatetime(String replyDatetime) {
		this.replyDatetime = replyDatetime;
	}

	public String getReplyUserid() {
		return replyUserid;
	}

	public void setReplyUserid(String replyUserid) {
		this.replyUserid = replyUserid;
	}

	@Override
	public String toString() {
		return "QnA [qnaNo=" + qnaNo + ", qnaTitle=" + qnaTitle + ", qnaContent=" + qnaContent + ", qnaUserid="
				+ qnaUserid + ", qnaDatetime=" + qnaDatetime + ", replyContent=" + replyContent + ", replyDatetime="
				+ replyDatetime + ", replyUserid=" + replyUserid + "]";
	}

}
