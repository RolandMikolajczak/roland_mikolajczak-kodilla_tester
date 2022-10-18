import com.kodilla.Notebook;

public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2019);
        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);
        System.out.println("notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        Notebook heavyNotebook = new Notebook(2000,1500, 2020);
        System.out.println("notebook.weight: " + heavyNotebook.weight);
        System.out.println("notebook.price: " + heavyNotebook.price);
        System.out.println("notebook.year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        Notebook oldNotebook = new Notebook(1200,600, 2009);
        System.out.println("notebook.weight: " + oldNotebook.weight);
        System.out.println("notebook.price: " + oldNotebook.price);
        System.out.println("notebook.year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        }
    }

