import java.util.Comparator;

public class SortByPIBHbt implements Comparator<Region> {

	public int compare(Region r1, Region r2) {
		if(r1.pib == r2.pib) {
			if(r1.pop > r2.pop)
				return 1;
			else if(r1.pop < r2.pop)
				return -1;
			else
				return 0;
		}
		else if(r1.pib > r2.pib)
			return 1;
		else
			return -1;
	}
	
}
