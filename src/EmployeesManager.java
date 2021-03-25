import java.util.Collection;
import java.utils.*;
import java.times;

public class EmployeesManager {

  /**
   * Implement EmployeesManager to manage all employees of a company
   *
   */

  /**
   * Adds an Employee
   *
   * @param employee
   * @return
   */
  String addEmployee(Employee employee) {
    List<Employee> mEmployees = new ArrayList<Employee>()
    if (mEmployees.contains(employee)) throw new IllegalArgumentException("Employee already exists");

    return mEmployees.add(employee);
  }

  /**
   * Finds an Employee
   *
   * @param employeeId
   * @return
   */
  Employee findEmployee(String employeeId) {
    List<Employee> el = new ArrayList<Employee>();
    Employee es = (Employee)el.get(employeeId);
    return es;
  }

  /**
   * Find all Employee who are older than X years
   * @param years
   * @return
   */
  Collection<Employee> findEmployee(int years) {
    List<Employee> empList = new ArrayList<>();
    Period period = Period.between(getAgeInYears, LocalDate.now());
     return empList.stream().filter(emp->emp.period.getYears() > 30).collect(Collectors.toList());
  }

  /**
   * Removes an employee
   *
   * @param employeeId
   * @return
   */
  boolean removeEmployee(String employeeId) {
    List<Employee> mEmployees = new ArrayList<Employee>();
    
    if (mEmployees.contains(employee)) {
        mEmployees.remove(employeeId);
        return true;
    }
    return false;
  }

  /**
   * Lists all Employees
   *
   * @return
   */
  Collection<Employee> listEmployees() {
    List<Employee> employeeList = new ArrayList<Employee>();
    
		System.out.println("List of all Employees");
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				candidates.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return candidates;

    return employeeList;
  }
}

class Employee {

  private int ageInYears;
  private int ageInMonths;
  private String birthDate;
  private String firstName;
  private String lastName;

  private String employeeId;

  public Employee(String fullName, String birthDate) {
    
    String firstName = fullName.substring(0, fullName.length() - surName.length());
    System.out.println(firstName );
    String surName=fullName.split(" ")[fullName.split(" ").length-1];
    System.out.println(surName);
    
    String dateArr[] = birthDate.split("-");
    String day = dateArr[0];
    String month = dateArr[1];
    String year = dateArr[2];
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public int getAgeInMonths() {
    return ageInMonths;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getBirthDate() {
    return birthDate;
  }
}
