package soru2;

import java.util.Comparator;

public class Comperators implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		if(o1.getPageCount() < o2.getPageCount()) return -1;
        else if (o1.getPageCount() > o2.getPageCount()) return 1;
        return 0;
	}

	
}
