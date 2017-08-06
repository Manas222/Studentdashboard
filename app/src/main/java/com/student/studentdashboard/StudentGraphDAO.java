package com.student.studentdashboard;

import java.util.HashMap;


public interface StudentGraphDAO {
    public abstract HashMap getRankingGraphValues();
    public abstract HashMap getPercentageGraphValues();
    public abstract HashMap getPercentileGraphValues();
    public abstract HashMap getSubjectsComparativeMarksGraphValues();
    public abstract HashMap getSubjectMarksGraphValues();
    public abstract HashMap getTermsComparativeMarksGraphValues();

}

