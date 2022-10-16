public class Employee {

    private int salary;
    private final String fullName;
    private int department;
    private final int id;
    private static int counter = 0;

    public Employee(String fullName, int salary, int department) {
        this.salary = salary;
        this.fullName = fullName;
        this.department = department;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id сотрудника: " + id +
                ", ФИО: " + fullName +
                ", Зарплата: " + salary +
                ", Отдел: " + department;
    }
}
