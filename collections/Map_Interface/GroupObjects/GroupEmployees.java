package collections.Map_Interface.GroupObjects;



import java.util.*;

public class GroupEmployees {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Sample employee list
        List<Employee> employees = Arrays.asList(
            new Employee("Ayush", "HR"),
            new Employee("Bhuvan", "IT"),
            new Employee("aman", "HR")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print output
        groupedEmployees.forEach((dept, empList) -> 
            System.out.println(dept + ": " + empList));
    }
}
