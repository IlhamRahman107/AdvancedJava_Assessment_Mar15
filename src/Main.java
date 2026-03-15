import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("\nEnter employee id: ");
            int e_id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee name: ");
            String e_name = sc.nextLine();

            System.out.println("Enter employee type (Officer/Staff): ");
            String e_type = sc.nextLine();

            System.out.println("Enter date of birth (YYYY-MM-DD): ");
            LocalDate e_dob = LocalDate.parse(sc.nextLine());

            System.out.println("Enter employee email: ");
            String e_email = sc.nextLine();

            System.out.println("Enter joining date (YYYY-MM-DD): ");
            LocalDate e_joiningDate = LocalDate.parse(sc.nextLine());

            System.out.println("Enter total vacation days: ");
            int totalVacationDays = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter total sick days: ");
            int totalSickDats = sc.nextInt();
            sc.nextLine();

            employees.add(new Employee(e_id, e_type, e_type, e_dob, e_email, e_joiningDate, totalVacationDays, totalSickDats));
        }

        System.out.println("\nEmployee Details: ");

        for(int i=0;i<employees.size();i++){
            Employee e = employees.get(i);
            System.out.println(e);
        }
    }
}