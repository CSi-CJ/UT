package demo27;

import java.util.*;
public class ReportCard {
    public String studentName;
    public ArrayList clines;

    public String printReport(){
    	StringBuffer reportinfo=new  StringBuffer();
    	reportinfo.append("Report card for " + studentName +"\n");
        reportinfo.append("-------------------------------"+"\n");
        reportinfo.append("Course Title              Grade"+"\n");
        Iterator grades = clines.iterator();
        CourseGrade grade;
        double avg = 0.0;
        while(grades.hasNext()) {
           grade = (CourseGrade)grades.next();
            reportinfo.append(grade.title + "            " +
                                          grade.grade+"\n");
            if(!(grade.grade=='F')) {
                avg = avg + grade.grade-64;
            }
        }
        avg = avg / clines.size();
        reportinfo.append("-------------------------------"+"\n");
        reportinfo.append("Grade Point Average = " + avg+"\n");
        
        return reportinfo.toString();
    }
}

class CourseGrade{
    public String title;
    public char grade;
}
