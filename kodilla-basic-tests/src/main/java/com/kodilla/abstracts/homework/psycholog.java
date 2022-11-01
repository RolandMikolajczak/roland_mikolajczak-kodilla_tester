package com.kodilla.abstracts.homework;

public class psycholog extends Job{

    public psycholog(String responbilities, int salary) {
        super("ocena stanu zdrowiapsychicznego pacjenta", 8000);
    }

    @Override
    public void OpisPracy() {
        super.OpisPracy();
        System.out.println("Jestem psychologiem");
    }
}
