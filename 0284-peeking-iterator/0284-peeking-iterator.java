// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	LinkedList<Integer> iter = new LinkedList<>(); 
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    while (iterator.hasNext()) 
	        iter.offer(iterator.next());   
	}

	public Integer peek() {
            return iter.peek(); 
	}

	@Override
	public Integer next() {
	    return iter.poll(); 
	}

	@Override
	public boolean hasNext() {
	    return !iter.isEmpty(); 
	}
}