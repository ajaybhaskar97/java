public class Employee extends Person   
{  
    private String name;
    
    public Employee(String name)
    {
      this.name = name;
    }
    public String getName()
    {
       return this.name;
    }
    public static void main (String args[])  
    {  
        Employee employee = new Employee("John Wilson");
        
        System.out.println("Employee's Name "+ employee.getName()); 
        
        Person person = new Employee("Thomas Smith");
        
        System.out.println("Employee-Person's Name "+ person.getName());
        
        
    }  
} 