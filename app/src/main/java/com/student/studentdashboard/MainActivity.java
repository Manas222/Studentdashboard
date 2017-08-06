package com.student.studentdashboard;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends FragmentActivity{

    private Button Graph;
    private FrameLayout fragmentContainer ;
    private RelativeLayout studentDashBoardHomeScreenLayout ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createUIElementsForUse();



        ApplicationContext ob= new ApplicationContext();
        ob.setName("rahul");
        ob.setClassa(12);
        ob.setRollno(123);
        ob.getName();
        ob.getClassa();
        ob.getRollno();


        Notification no= new Notification();
        no.setNotificationPriority(1);
        no.setNotificationType("no new notification");
        no.getNotificationPriority();
        no.getNotificationType();


        StudentDashboardRankandIndex ri= new StudentDashboardRankandIndex();
        ri.setActivityIndex(3);
        ri.setStudentRank(1);
        ri.getActivityIndex();
        ri.getStudentRank();



    }
    private void createUIElementsForUse()
    {
        Graph = (Button) findViewById(R.id.Graph);
        fragmentContainer = (FrameLayout) findViewById(R.id.fragment_container);
        studentDashBoardHomeScreenLayout = (RelativeLayout) findViewById(R.id.studentDashBoardHomeScreenLayout);
    }

    public void onGraphClick(View v)
    {
        studentDashBoardHomeScreenLayout.setVisibility(View.GONE);

        StudentDashBoardGraphsFragment studentDashBoardGraphsFragment = new StudentDashBoardGraphsFragment() ;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.add(R.id.fragment_container, studentDashBoardGraphsFragment);

        //transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();

        fragmentContainer.setVisibility(View.VISIBLE);
    }


}
