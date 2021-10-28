
import java.util.*;

public class TestAdvList {

	public static void main(String[] args) 
	{
		Collection<Integer> myList1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{7,18,10,24,17,5}));
		Collection<Integer> myList2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3}));
		KjvAdvList list1 = new KjvAdvList(myList1);
		KjvAdvList list2 = new KjvAdvList(myList2);
		KjvAdvList list = new KjvAdvList();

		list.join(list1, list2);
		list.print();
	}
}
