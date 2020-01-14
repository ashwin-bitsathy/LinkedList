public class Main {
    public static void main(String[] args) {
        Employeee ashwin = new Employeee("ashwin","palanisamy",122);
        Employeee vaani = new Employeee("vaani", "palanisamy",100);
        EmployeeLinkedlist  lists = new EmployeeLinkedlist();
        lists.addToFront(ashwin);
        lists.addToFront(vaani);
        lists.PrintList();




    }
}
