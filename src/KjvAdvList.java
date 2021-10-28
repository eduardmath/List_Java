
import java.util.*;

public class KjvAdvList extends AbstractCollection<Integer>  //  implements Iterable<Integer>
  {
	int count = 0;
	KjvNode first = null;
	KjvNode last = null;

	public KjvAdvList() {}
	public KjvAdvList( Collection<? extends Integer> c)
	  {for ( Integer x: c)
	     { 
		   add(x);
	     }
	  }

	public boolean add(Integer x){
		KjvNode newltem = new KjvNode(x, null);
		   if (last == null) first = newltem;
		   else last.next = newltem;
		   last = newltem;
		   count++;
		   return true;
	}
    @Override
	public int size() { return count;}

    @Override
	public KjvIterator iterator()
	  { return new KjvIterator(this);}
	@Override
	public KjvAdvList clone()  throws CloneNotSupportedException 
	  { KjvAdvList tmp = new KjvAdvList(); 
	    for (Integer x: this)
	      tmp.add(x);
	    return tmp;
	   }	
}
