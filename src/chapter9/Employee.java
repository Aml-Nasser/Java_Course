package chapter9;

public class Employee extends Person {
    private String employeeId;
    private String title;
    //Constructor
    public  Employee(){
        //to set specific inherited constructor(explicit call)instead of default
        //Must be first line Statement
        //super(); //this means default
        super("Aml"); // param constructor
        System.out.println("I'm Employee default Constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
