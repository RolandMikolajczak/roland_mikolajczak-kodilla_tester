package com.kodilla.abstracts.homework;

public class logistyk extends Job{
    public logistyk(String responbilities, int salary) {
        super("Kontrola operacji zatowarowania magazynow oraz zachowanie ciaglosci pracy", 7000);
    }

    @Override
    public void OpisPracy() {
        super.OpisPracy();
        System.out.println("Jestem Logistyiem");
    }
}
