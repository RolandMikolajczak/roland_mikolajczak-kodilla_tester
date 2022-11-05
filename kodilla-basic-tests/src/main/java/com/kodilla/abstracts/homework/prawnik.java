package com.kodilla.abstracts.homework;

public class prawnik extends Job{

    public prawnik() {
        super("Reprezentacja klientow przed sadami kazdej instancji na terenie Rp", 6000);
    }
    @Override
    public void OpisPracy() {
        super.OpisPracy();
        System.out.println("Jestem Prawnikiem");
    }
}
