public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов Иван Иванович", 15_000, 1);
        EMPLOYEES[1] = new Employee("Петров Петр Петрович", 35_000, 2);
        EMPLOYEES[2] = new Employee("Максимов Максим Максимович", 25_000, 3);
        EMPLOYEES[3] = new Employee("Андреев Андрей Андреевич", 40_000, 4);
        EMPLOYEES[4] = new Employee("Антонов Антон Антонович", 50_000, 5);
        EMPLOYEES[5] = new Employee("Семенов Виктор Петрович", 32_000, 2);
        EMPLOYEES[6] = new Employee("Драгун Алексей Иванович", 62_000, 3);
        EMPLOYEES[7] = new Employee("Петренко Мария Викторовна", 20_000, 5);
        EMPLOYEES[8] = new Employee("Моисеева Елена Юрьевна", 52_000, 1);
        EMPLOYEES[9] = new Employee("Тлатов Руслан Олегович", 45_000, 4);
        printEmployeesNames();
        printAllDataEmployees();
    }

    //Подсчет суммы всех зарплат
    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    //Подсчет среднего значения зарплат
    private static double calculateAverageSalary() {
        double sum = 0;
        int counting = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                counting++;
                sum += employee.getSalary();
            }
        }
        double averageSalary = sum / counting;
        return averageSalary;
    }

    //Поиск сотрудника с максимальной зарплатой
    private static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Поиск сотрудника с минимальной зарплатой
    private static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Получаем ФИО всех сотрудников
    private static void printEmployeesNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

    //Получаем список сотрудников со всеми данными
    private static void printAllDataEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
}