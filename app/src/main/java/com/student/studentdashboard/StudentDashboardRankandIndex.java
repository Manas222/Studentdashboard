package com.student.studentdashboard;


public class StudentDashboardRankandIndex {
    public int getStudentRank()
    {
        return studentRank;
    }

    public int setStudentRank(int studentRank)
    {
        this.studentRank = studentRank;
        return studentRank;
    }

    public int getActivityIndex()
    {
        return activityIndex;
    }

    public void setActivityIndex(int activityIndex) {
        this.activityIndex = activityIndex;
    }

    int studentRank;
    int activityIndex;

}
