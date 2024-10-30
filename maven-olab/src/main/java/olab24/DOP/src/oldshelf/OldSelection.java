package olab24.DOP.src.oldshelf;

public class OldSelection {

	// DONE: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {

		switch(o){
			case Comic c:
				return c.getTitle();
			case Fiction f:
				return f.getName();
			case TextBook t:
				return t.subject();
            default:
                return "";
        }





	}

	public static void main(String[] args) {

		// DONE: Write a test code here and execute and text.
		TextBook t = new TextBook("Physics");

		System.out.println(OldSelection.getAgeOrTitle(t));

		Comic c = new Comic("Invincible",18);

		System.out.println(OldSelection.getAgeOrTitle(c));

		Fiction f = new Fiction("The Nun",FictionType.GoK);

		System.out.println(OldSelection.getAgeOrTitle(f));
	
		
	}
}
