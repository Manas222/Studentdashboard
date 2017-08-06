package com.student.studentdashboard;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.DateAsXAxisLabelFormatter;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class StudentDashBoardGraphsFragment extends Fragment {

    private StudentGraphDAO studentGraphDAO ;

    public StudentDashBoardGraphsFragment()
    {
        studentGraphDAO = new StudentGraphDAOImpl() ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View fragmentGraphsView = inflater.inflate(R.layout.fragment_graphs, container, false);
        populateGraphs(fragmentGraphsView) ;

        return fragmentGraphsView ;
    }

    public void populateGraphs(View fragmentGraphsView)
    {
        GraphView graph1=(GraphView) fragmentGraphsView.findViewById(R.id.graph1);
        GraphView graph2=(GraphView) fragmentGraphsView.findViewById(R.id.graph2);
        GraphView graph3=(GraphView) fragmentGraphsView.findViewById(R.id.graph3);
        GraphView graph4=(GraphView) fragmentGraphsView.findViewById(R.id.graph4);
        GraphView graph5=(GraphView) fragmentGraphsView.findViewById(R.id.graph5);
        GraphView graph6=(GraphView) fragmentGraphsView.findViewById(R.id.graph6);

        populateRankingGraphValues(graph1);
        populatePercentageGraphValues( graph2);
        populatePercentileGraphValues( graph3);
        populateSubjectsComparativeMarksGraphValues( graph4);
        populateSubjectMarksGraphValues( graph5);
        populateTermsComparativeMarksGraphValues( graph6);
    }

    public void populateRankingGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > rankingGraphMap = studentGraphDAO.getRankingGraphValues();
        Set<Integer> rankingGraphMapSet = rankingGraphMap.keySet();
        Iterator<Integer> rankingGraphMapIterator = rankingGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[rankingGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(rankingGraphMapIterator.hasNext())
        {
            Integer rankingGraphMapKey = rankingGraphMapIterator.next();
            int value = rankingGraphMap.get(rankingGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)rankingGraphMapKey, (double)value);
        }

        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series1);

    }

    public void populatePercentageGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > percentageGraphMap = studentGraphDAO.getPercentageGraphValues();
        Set<Integer> percentageGraphMapSet = percentageGraphMap.keySet();
        Iterator<Integer> percentageGraphMapIterator = percentageGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[percentageGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(percentageGraphMapIterator.hasNext())
        {
            Integer percentageGraphMapKey =percentageGraphMapIterator.next();
            int value = percentageGraphMap.get(percentageGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)percentageGraphMapKey, (double)value);
        }

        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series2);

    }

    public void populatePercentileGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > percentileGraphMap = studentGraphDAO.getPercentileGraphValues();
        Set<Integer> percentileGraphMapSet = percentileGraphMap.keySet();
        Iterator<Integer> percentileGraphMapIterator = percentileGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[percentileGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(percentileGraphMapIterator.hasNext())
        {
            Integer percentileGraphMapKey =percentileGraphMapIterator.next();
            int value = percentileGraphMap.get(percentileGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)percentileGraphMapKey, (double)value);
        }

        LineGraphSeries<DataPoint> series3 = new LineGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series3);
    }

    public void populateSubjectsComparativeMarksGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > SubjectsComparativeMarksGraphMap = studentGraphDAO.getSubjectsComparativeMarksGraphValues();
        Set<Integer> SubjectsComparativeMarksGraphMapSet = SubjectsComparativeMarksGraphMap.keySet();
        Iterator<Integer> SubjectsComparativeMarksGraphMapIterator = SubjectsComparativeMarksGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[SubjectsComparativeMarksGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(SubjectsComparativeMarksGraphMapIterator.hasNext())
        {
            Integer SubjectsComparativeMarksGraphMapKey =SubjectsComparativeMarksGraphMapIterator.next();
            int value = SubjectsComparativeMarksGraphMap.get(SubjectsComparativeMarksGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)SubjectsComparativeMarksGraphMapKey, (double)value);
        }
        BarGraphSeries<DataPoint> series4 = new BarGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series4);
    }

    public void populateSubjectMarksGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > SubjectMarksGraphMap = studentGraphDAO.getSubjectMarksGraphValues();
        Set<Integer> SubjectMarksGraphMapSet = SubjectMarksGraphMap.keySet();
        Iterator<Integer> SubjectMarksGraphMapIterator = SubjectMarksGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[SubjectMarksGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(SubjectMarksGraphMapIterator.hasNext())
        {
            Integer SubjectMarksGraphMapKey =SubjectMarksGraphMapIterator.next();
            int value = SubjectMarksGraphMap.get(SubjectMarksGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)SubjectMarksGraphMapKey, (double)value);
        }

        BarGraphSeries<DataPoint> series5 = new BarGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series5);
    }

    public void populateTermsComparativeMarksGraphValues(GraphView graph)
    {
        HashMap<Integer , Integer > TermsComparativeMarksGraphMap = studentGraphDAO.getTermsComparativeMarksGraphValues();
        Set<Integer> TermsComparativeMarksGraphMapSet = TermsComparativeMarksGraphMap.keySet();
        Iterator<Integer> TermsComparativeMarksGraphMapIterator = TermsComparativeMarksGraphMapSet.iterator();
        DataPoint[] dataPointArray = new DataPoint[TermsComparativeMarksGraphMapSet.size()];
        int dataPointArrayCounter = 0 ;

        while(TermsComparativeMarksGraphMapIterator.hasNext())
        {
            Integer TermsComparativeMarksGraphMapKey =TermsComparativeMarksGraphMapIterator.next();
            int value = TermsComparativeMarksGraphMap.get(TermsComparativeMarksGraphMapKey);

            dataPointArray[dataPointArrayCounter++] = new DataPoint((double)TermsComparativeMarksGraphMapKey, (double)value);
        }

        BarGraphSeries<DataPoint> series6 = new BarGraphSeries<DataPoint>(dataPointArray);
        graph.addSeries(series6);
    }



}
