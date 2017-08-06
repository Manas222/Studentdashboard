package com.student.studentdashboard;

import java.util.HashMap;


public class StudentGraphDAOImpl implements StudentGraphDAO {


    @Override
    public HashMap<Integer , Integer > getRankingGraphValues()
    {
        HashMap<Integer , Integer >  rankingGraphValuesMap = new HashMap<Integer , Integer>();
        rankingGraphValuesMap.put(2010 , 5);
        rankingGraphValuesMap.put(2011 , 4);
        rankingGraphValuesMap.put(2012 , 3);
        rankingGraphValuesMap.put(2013 , 2);
        rankingGraphValuesMap.put(2014 , 1);

        return rankingGraphValuesMap ;
    }

    @Override
    public HashMap<Integer , Integer > getPercentageGraphValues() {
        HashMap<Integer , Integer >  percentageGraphValuesMap = new HashMap<Integer , Integer>();
        percentageGraphValuesMap.put(2010 , 5);
        percentageGraphValuesMap.put(2011 , 4);
        percentageGraphValuesMap.put(2012 , 3);
        percentageGraphValuesMap.put(2013 , 2);
        percentageGraphValuesMap.put(2014 , 1);

        return percentageGraphValuesMap ;
    }

    @Override
    public HashMap<Integer , Integer > getPercentileGraphValues() {
        HashMap<Integer , Integer > percentileGraphValuesMap = new HashMap<Integer , Integer>();
        percentileGraphValuesMap.put(2010 , 5);
        percentileGraphValuesMap.put(2011 , 4);
        percentileGraphValuesMap.put(2012 , 3);
        percentileGraphValuesMap.put(2013 , 2);
        percentileGraphValuesMap.put(2014 , 1);

        return percentileGraphValuesMap ;
    }

    @Override
    public HashMap<Integer , Integer > getSubjectsComparativeMarksGraphValues() {
        HashMap<Integer , Integer > SubjectsComparativeMarksGraphValuesMap = new HashMap<Integer , Integer>();
        SubjectsComparativeMarksGraphValuesMap.put(2010 , 5);
        SubjectsComparativeMarksGraphValuesMap.put(2011 , 4);
        SubjectsComparativeMarksGraphValuesMap.put(2012 , 3);
        SubjectsComparativeMarksGraphValuesMap.put(2013 , 2);
        SubjectsComparativeMarksGraphValuesMap.put(2014 , 1);

        return SubjectsComparativeMarksGraphValuesMap ;
    }

    @Override
    public HashMap<Integer , Integer > getSubjectMarksGraphValues() {
        HashMap<Integer , Integer > SubjectMarksGraphValuesMap = new HashMap<Integer , Integer>();
        SubjectMarksGraphValuesMap.put(2010 , 5);
        SubjectMarksGraphValuesMap.put(2011 , 4);
        SubjectMarksGraphValuesMap.put(2012 , 3);
        SubjectMarksGraphValuesMap.put(2013 , 2);
        SubjectMarksGraphValuesMap.put(2014 , 1);

        return SubjectMarksGraphValuesMap ;

    }

    @Override
    public HashMap<Integer , Integer > getTermsComparativeMarksGraphValues() {
        HashMap<Integer , Integer > TermsComparativeMarksGraphValuesMap = new HashMap<Integer , Integer>();
        TermsComparativeMarksGraphValuesMap.put(2010 , 5);
        TermsComparativeMarksGraphValuesMap.put(2011 , 4);
        TermsComparativeMarksGraphValuesMap.put(2012 , 3);
        TermsComparativeMarksGraphValuesMap.put(2013 , 2);
        TermsComparativeMarksGraphValuesMap.put(2014 , 1);

        return TermsComparativeMarksGraphValuesMap ;

    }
}
