package demo27;

import java.util.*;
public class ReportCard {
    public static final char GRADE_LEVEL = 'F';
    public static final int CONSTANT = 64;
    public String studentName;
    public ArrayList clines;

    public String printReport(){
        StringBuffer reportinfo = printReportHeader();
        Iterator grades = clines.iterator();
        CourseGrade grade;
        double avg = getAvg(reportinfo, grades);
        return printReportFooter(reportinfo, avg);
    }

    private double getAvg(StringBuffer reportinfo, Iterator grades) {
        CourseGrade grade;
        double avg = 0.0;
        while(grades.hasNext()) {
           grade = (CourseGrade)grades.next();
            reportinfo.append(grade.title + "            " +
                                          grade.grade+"\n");
            if(!(grade.grade== GRADE_LEVEL)) {
                avg = avg + grade.grade- CONSTANT;
            }
        }
        avg = avg / clines.size();
        return avg;
    }

    private String printReportFooter(StringBuffer reportinfo, double avg) {
        reportinfo.append("-------------------------------"+"\n");
        reportinfo.append("Grade Point Average = " + avg+"\n");

        return reportinfo.toString();
    }

    private StringBuffer printReportHeader() {
        StringBuffer reportinfo=new  StringBuffer();
        reportinfo.append("Report card for " + studentName +"\n");
        reportinfo.append("-------------------------------"+"\n");
        reportinfo.append("Course Title              Grade"+"\n");
        return reportinfo;
    }
}

class CourseGrade{
    public String title;
    public char grade;
}
