import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = LocalDate.now().getYear() - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    public double calculateTotalSalary() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();

        return salary - taxAmount + bonusAmount + raiseAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adı: ").append(name).append("\n");
        sb.append("Maaşı: ").append(salary).append("\n");
        sb.append("Çalışma Saati: ").append(workHours).append("\n");
        sb.append("Başlangıç Yılı: ").append(hireYear).append("\n");
        sb.append("Vergi: ").append(tax()).append("\n");
        sb.append("Bonus: ").append(bonus()).append("\n");
        sb.append("Maaş Artışı: ").append(raiseSalary()).append("\n");
        sb.append("Vergi ve Bonuslar ile birlikte maaş: ").append(calculateTotalSalary()).append("\n");
        sb.append("Toplam Maaş: ").append(salary + bonus()).append("\n");

        return sb.toString();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
