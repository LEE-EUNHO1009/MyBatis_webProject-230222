package com.eunocompany.home5.dto;

import java.sql.Timestamp;

public class BoardDto {
	private int bid; //게시판 번호
	private String btitle;  //게시판 글 제목
	private String bcontent;  //게시판 글 내용
	private Timestamp bdate;  //글쓴 일시
	private String bmid;  //글쓴이 아이디
	private String bmname;  //글쓴 사람 이름
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int bid, String btitle, String bcontent, Timestamp bdate, String bmid, String bmname) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bmid = bmid;
		this.bmname = bmname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Timestamp getBdate() {
		return bdate;
	}

	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}

	public String getBmid() {
		return bmid;
	}

	public void setBmid(String bmid) {
		this.bmid = bmid;
	}

	public String getBmname() {
		return bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}
	
	
}
