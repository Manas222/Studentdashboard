package com.student.studentdashboard;


public class ApplicationContext {
    String Name;

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getRollno()
    {
        return Rollno;
    }

    public void setRollno(int rollno)
    {
        Rollno = rollno;
    }

    public int getClassa()
    {

        return Class;
    }

    public void setClassa(int aClass)
    {
        Class = aClass;
    }

    int Rollno;
    int Class;
}
