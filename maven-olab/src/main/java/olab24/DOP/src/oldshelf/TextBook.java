package olab24.DOP.src.oldshelf;


public class TextBook extends Book {

	// DONE: Make this a final field with most strict visiibility possible.
	private final String subject;
	
	// DONE: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject = subject;
	}

	// DONE : create a getter if required.
	public String subject() {
		return subject;
	}

	@Override
	public final int hashCode(){
		int m = 165;
		int c = 30;
		return m*subject.length() + c;
	}

	@Override
	public final boolean equals(Object o){
		if( o instanceof @SuppressWarnings("unused") TextBook t ){
			return this.hashCode() == o.hashCode();
		}
		return false;
	}
	
	
	
	// DONE: write a toString method
	@Override
	public final String toString() {
		return "Subject : " + this.subject;
	}


}
