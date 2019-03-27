import java.util.Comparator;

public class SortByDensity implements Comparator<Region>{
	
	public int compare(Region r1, Region r2) {
		int d1 = r1.pop/r1.superf;
		int d2 = r2.pop/r2.superf;
		if(d1 > d2)
			return 1;
		else if(d1 < d2)
			return -1;
		else
			return 0;
	}
	
}
