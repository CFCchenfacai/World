package com.greenish_orchid.model;


public class Brand implements java.io.Serializable {

	//columns START
	private Integer bid;
	private String bname;
	//columns END
	public Brand(){
	}
	public Brand(Integer bid,String bname){
		this.bid=bid;		this.bname=bname;	}

	public void setBid(Integer bid){
		this.bid=bid;
	}
	public Integer getBid(){
		return bid;
	}

	public void setBname(String bname){
		this.bname=bname;
	}
	public String getBname(){
		return bname;
	}
}

