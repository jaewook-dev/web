package com.test.main.dto;

public class Member {

	private int memberNo;
	private String memberID;
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberID=" + memberID + "]";
	}
	
}
