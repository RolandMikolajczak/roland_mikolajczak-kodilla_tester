import com.kodilla.Notebook;

public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000);
        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        Notebook heavyNotebook = new Notebook(2000,1500);
        System.out.println("notebook.weight: " + heavyNotebook.weight);
        System.out.println("notebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        Notebook oldNotebook = new Notebook(1200,500);
        System.out.println("notebook.weight: " + oldNotebook.weight);
        System.out.println("notebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        }
    }

