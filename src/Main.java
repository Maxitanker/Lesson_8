public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312313", 35000, 35);
        employees[2] = new Employee("Sidorov Sidor", "Engineer", "sidorov@mailbox.com", "892312314", 32000, 48);
        employees[3] = new Employee("Roger Geralt", "Witcher", "roger@mailbox.com", "892312315", 55000, 98);
        employees[4] = new Employee("Maximov Maxim", "Engineer", "maximov@mailbox.com", "892312316", 33000, 28);
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}