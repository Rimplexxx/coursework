public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 15_000,1);
        employees[1] = new Employee("Петров Петр Петрович",35_000, 2);
        employees[2] = new Employee("Максимов Максим Максимович",25_000, 3);
        employees[3] = new Employee("Андреев Андрей Андреевич",40_000, 4);
        employees[4] = new Employee("Антонов Антон Антонович",50_000, 5);
        employees[5] = new Employee("Семенов Виктор Петрович", 32_000, 2);
        employees[6] = new Employee("Драгун Алексей Иванович", 62_000, 3);
        employees[7] = new Employee("Петренко Мария Викторовна", 20_000, 5);
        employees[8] = new Employee("Моисеева Елена Юрьевна", 52_000, 1);
        employees[9] = new Employee("Тлатов Руслан Олегович", 45_000, 4);
        printEmployeesNames();
        printAllDataEmployees();
    }

    //Подсчет суммы всех зарплат
    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    //Подсчет среднего значения зарплат
    public static double calculateAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        double averageSalary = sum / employees.length;
        return averageSalary;
    }

    //Поиск сотрудника с максимальной зарплатой
    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Поиск сотрудника с минимальной зарплатой
    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Получаем ФИО всех сотрудников
    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    //Получаем список сотрудников со всеми данными
    public static void printAllDataEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Id: " + employee.getId() + ", Ф.И.О: " + employee.getFullName()
                        + ", Зарплата: " + employee.getSalary()
                        + ", Отдел: " + employee.getDepartment());
            }
        }
    }
}