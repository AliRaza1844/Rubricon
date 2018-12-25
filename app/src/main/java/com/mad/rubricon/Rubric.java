package com.mad.rubricon;

import java.util.ArrayList;


public class Rubric {
    String courseID;
    String rubricTitle;
    ArrayList<RubricCLO> rubricCLOs = new ArrayList<>();
    ArrayList<GradingLevel> gradingLevels = new ArrayList<>();


    public Rubric(String courseID, String rubricTitle) {
        this.courseID = courseID;
        this.rubricTitle = rubricTitle;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getRubricTitle() {
        return rubricTitle;
    }

    public void setRubricTitle(String rubricTitle) {
        this.rubricTitle = rubricTitle;
    }

    public void addRubricClo(RubricCLO rubricCLO){
        rubricCLOs.add(rubricCLO);
    }

    public void addGradingLevel(GradingLevel level){
        gradingLevels.add(level);
    }
}
