package olab24.DOP.src.newshelf;

import olab24.DOP.src.oldshelf.FictionType;

public class NewSelection {

	public static String getAgeOrTitle(Object o) {

		return switch(o){
			case Comic c when c.title() != null -> c.title();
			case Fiction f when f.name() != null -> f.name();
			case TextBook t when t.subject() != null -> t.subject();
			default -> "Empty";

		};


	}

	public static String getAgeOrTitle_RecordPattern(Object o){

		return switch (o) {
			case Comic(String title, int age) when title != null -> title;
			case Fiction(String name, FictionType f) when name != null -> name;
			case TextBook(String subject) when subject != null -> subject;
			default -> "Empty";

		};
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Chemistry");
		Comic c = new Comic("Gintama",26);
		Fiction f = new Fiction("The 100",FictionType.Tragedy);
		

		System.out.println(NewSelection.getAgeOrTitle_RecordPattern(c));
		System.out.println(NewSelection.getAgeOrTitle_RecordPattern(t));
		System.out.println(NewSelection.getAgeOrTitle(f));
	
		
	
		
	}
}
