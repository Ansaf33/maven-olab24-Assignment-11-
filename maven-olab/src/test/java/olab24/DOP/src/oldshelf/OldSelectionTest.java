package olab24.DOP.src.oldshelf;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.testng.annotations.Test;


public class OldSelectionTest extends TestCase {

    // PASSING TEST CASE

    public void testcase_1(){
        Comic c = new Comic("Agatha all along",44);
        assertEquals("Agatha all along",OldSelection.getAgeOrTitle(c));
    }

    public void testcase_1_1(){
        TextBook t = new TextBook("Rotational Motion");
        assertEquals("Rotational Motion",OldSelection.getAgeOrTitle(t));
    }

    // FAILING TEST CASE

    public void testcase_2(){
        Fiction f = new Fiction("The 100",FictionType.Comedy);
        assertEquals("The 99",OldSelection.getAgeOrTitle(f));
    }













}