public class EmployeeNode
{
    private Employeee employee;
    private EmployeeNode next;
    public  EmployeeNode(Employeee employee)
    {
        this.employee =employee;
    }

    public Employeee getEmployee() {
        return employee;
    }

    public void setEmployee(Employeee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();

    }
}
