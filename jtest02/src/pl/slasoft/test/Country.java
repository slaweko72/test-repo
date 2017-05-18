package pl.slasoft.test;

public class Country {
	
	private String cName;
	private String cCapital;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcCapital() {
		return cCapital;
	}
	public void setcCapital(String cCapital) {
		this.cCapital = cCapital;
	}
	
	@Override
	public String toString() {
		return "Country [cName=" + cName + ", cCapital=" + cCapital + "]";
	}

}
