package com.greenish_orchid.model;


public class Movie implements java.io.Serializable {

	//columns START
	private Integer mid;
	private String mname;
	private String mdesc;
	private String mautor;
	private String mdate;
	
	private String bname;
	//columns END
	public Movie(){
	}
	public Movie(Integer mid,String mname,String mdesc,String mautor,String mdate){
		this.mid=mid;		this.mname=mname;		this.mdesc=mdesc;		this.mautor=mautor;		this.mdate=mdate;	}
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setMid(Integer mid){
		this.mid=mid;
	}
	public Integer getMid(){
		return mid;
	}

	public void setMname(String mname){
		this.mname=mname;
	}
	public String getMname(){
		return mname;
	}

	public void setMdesc(String mdesc){
		this.mdesc=mdesc;
	}
	public String getMdesc(){
		return mdesc;
	}

	public void setMautor(String mautor){
		this.mautor=mautor;
	}
	public String getMautor(){
		return mautor;
	}

	public void setMdate(String mdate){
		this.mdate=mdate;
	}
	public String getMdate(){
		return mdate;
	}
}

