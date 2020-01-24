package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ElectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ElectionParty> election = new HashSet<ElectionParty>();
		
		election.add(new ElectionParty(1,"Party1","District1","1/1/2020","30/1/2020"));
		election.add(new ElectionParty(2,"Party2","District2","10/1/2020","30/1/2020"));
		election.add(new ElectionParty(3,"Party3","District1","1/1/2020","30/1/2020"));
		election.add(new ElectionParty(1,"Party1","District1","5/1/2020","30/1/2020"));
		election.add(new ElectionParty(4,"Party4","District2","10/1/2020","30/1/2020"));
		election.add(new ElectionParty(5,"Party5","District2","7/1/2020","30/1/2020"));
		
		System.out.println(election);
		/*
		public Object getObjectReference(HashSet<Xobject> set, Xobject obj) {
		    if (set.contains(obj)) {
		        for (Xobject o : set) {
		            if (obj.equals(o))
		                return o;
		        }
		    }
		    return null;
		}
		*/
		
		for(ElectionParty e:  election) {
			String d = e.getElectiondate();
			System.out.println(d.hashCode());
			
		}
		
		//ArrayList<ElectionParty> newlist=new ArrayList<ElectionParty>();
		//System.out.println(election);
		List<String> arrlist = new ArrayList<String>();
		ArrayList<String> commonDate=new ArrayList<String>();
		for(ElectionParty e :election)
		{
			
			if(arrlist.contains(e.getElectiondate())) {
			System.out.println("These are the parties that have same date");
			
			commonDate.add(e.getElectiondate());
		
		}
		arrlist.add(e.getElectiondate());
		}
		System.out.println("Common Date "+commonDate);
		System.out.println("Array list" +arrlist);
		for(ElectionParty e1 :election)
		{
			if(commonDate.contains(e1.getElectiondate()))
			{
			System.out.println(e1);
			}
		}
		
	}

}
