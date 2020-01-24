package Assignment;


public class ElectionParty {
	private int Electionid;
	private String name,district,electiondate,countingdate;
	
	public ElectionParty(int Electionid,String name,String district,String electiondate,String countingdate) {
		this.Electionid = Electionid;
		this.name = name;
		this.district = district;
		this.countingdate  = countingdate;
		this.electiondate = electiondate;
		
	}
	public int getElectionid() {
		return Electionid;
	}
	public void setElectionid(int electionid) {
		Electionid = electionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getCountingdate() {
		return countingdate;
	}
	public void setCountingdate(String countingdate) {
		this.countingdate = countingdate;
	}
	@Override
	public String toString() {
		return "\n ElectionParty [Electionid=" + Electionid + ", name=" + name + ", district=" + district
				+ ", electiondate=" + electiondate + ", countingdate=" + countingdate + "]";
	}
	
	public int hashCode() {
		/*int code = 0;
		code = uid * 20;
		code += name.hashCode();
		*/return name.hashCode();
		
	}
	public boolean equals(Object o) {
		System.out.println("In Equals...");
		boolean flag = false;
		if(o instanceof ElectionParty) {
			ElectionParty ep = (ElectionParty)o;
			if(ep.name == this.name)
				flag = true;
		}
		return flag;
	}
	
	
}



