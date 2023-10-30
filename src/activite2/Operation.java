package activite2;

import java.io.Serializable;

public class Operation implements Serializable{
	private String p1,p2,o;
	float res;
	
	public Operation(String p1, String p2, String o) {
		this.p1 = p1;
		this.p2 = p2;
		this.o = o;
	}
	
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getO() {
		return o;
	}
	public void setO(String o) {
		this.o = o;
	}
	public float getRes() {
		return res;
	}
	public void setRes(float res) {
		this.res = res;
	}
	

}