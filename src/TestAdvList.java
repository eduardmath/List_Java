
import java.util.*;

public class TestAdvList {

	public static void main(String[] args) 
	{
		Collection<Integer> myList1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{7,18,10,24,17,5}));
		Collection<Integer> myList2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3}));
		KjvAdvList list1 = new KjvAdvList(myList1);
		KjvAdvList list2 = new KjvAdvList(myList2);
		KjvAdvList list = new KjvAdvList();

		KjvIterator iterator1 = new KjvIterator(list1);
		KjvIterator iterator2 = new KjvIterator(list2);
		while(iterator1.hasNext() && iterator2.hasNext()){
			list.add(iterator1.next());
			list.add(iterator2.next());
		}
	}
}
