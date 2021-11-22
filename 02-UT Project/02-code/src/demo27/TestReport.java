package demo27;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestReport {
	ReportCard reportCard;
	
	@Before
	public void setUp() throws Exception {
		reportCard=new ReportCard();
		
	    String studentName="Tom Lee";
	    ArrayList clines=new ArrayList();
	    CourseGrade c=new CourseGrade();
	    c.title="C";
	    c.grade='A';
	    clines.add(c);
	    
	    CourseGrade javalangue=new CourseGrade();
	    javalangue.title="JAVA";
	    javalangue.grade='B';
	    clines.add(javalangue);
	    
	    reportCard.studentName=studentName;
	    reportCard.clines=clines;	    
	}
	
	@Test
	public void testReport() {
		String reportinfo="Report card for Tom Lee\n"+
				"-------------------------------\n"+
				"Course Title              Grade\n"+
				"C            A\n"+
				"JAVA            B\n"+
				"-------------------------------\n"+
				"Grade Point Average = 1.5\n";
		assertEquals(reportinfo,reportCard.printReport());		
	}

}
