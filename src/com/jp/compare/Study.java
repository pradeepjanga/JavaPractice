package com.jp.compare;

public class Study implements Comparable<Study> {
	
	private int studyId;
	private String name;
	private String desc;
	
	public Study(){
		super();
	}
	
	public Study(int studyId, String name, String desc){
		this.studyId = studyId;
		this.name = name;
		this.desc = desc;
	}

	public int getStudyId() {
		return studyId;
	}

	public void setStudyId(int studyId) {
		this.studyId = studyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int compareTo(Study o2) {
		if(this.getStudyId() < o2.getStudyId())
			return -1;
		if(this.getStudyId() > o2.getStudyId())
			return 1;
		return 0;
	}
	
	public String toString(){
		return "Study["+this.studyId + "name "+this.name+"]";
	}
	
	

}
