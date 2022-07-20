public class AddEmployee {

    public static void main(String[] args){
        Employee employee = new EmployeeBuilder().setName("chathura").setAge(24).setAddress("Monaragala").getEmployee();
        System.out.println(employee);


    }
}
