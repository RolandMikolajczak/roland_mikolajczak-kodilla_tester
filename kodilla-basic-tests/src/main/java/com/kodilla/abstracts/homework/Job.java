package com.kodilla.abstracts.homework;

public abstract class Job {

    private String responbilities;
    private int salary;

    public Job (String responbilities, int salary) {
        this.responbilities=responbilities;
        this.salary=salary;
        System.out.println("Zakres obowiazkow : " + responbilities + " za wynagordzeniem " +salary);
    }
    public String getResponibilities(){
        return responbilities;
    }
    public int getSalary(){
        return salary;
    }
    public void OpisPracy(){

    }


    }

