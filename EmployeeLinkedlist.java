public class EmployeeLinkedlist {
    private  EmployeeNode head;
    public void addToFront(Employeee employeee)
    {
        EmployeeNode  node = new EmployeeNode(employeee);

        head = node;
    }
    public void PrintList()
    {
        EmployeeNode current = head;
        while(true)
        {
            if(current==null)
            {
                break;
            }
            else
            {
                System.out.println(current);
                current = current.getNext();
            }
        }

    }
}
