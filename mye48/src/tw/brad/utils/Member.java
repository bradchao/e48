package tw.brad.utils;

public class Member {
	private int id;
	private String account, realname;
	
	
	
	public Member(int id, String account, String realname) {
		super();
		this.id = id;
		this.account = account;
		this.realname = realname;
	}
	public int getId() {
		return id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
}
