
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.time.format.TextStyle;

class Employee {
    private String name;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String name, double salary, LocalDate salaryDate) {
        this.name = name;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }
}

class Report {
    public void print(Employee employee) {
        System.out.println("Имя: " + employee.getName());
        System.out.println("Зарплата: " + employee.getSalary());
    }
}

class FullReport extends Report {
    @Override
    public void print(Employee employee) {
        super.print(employee);
        System.out.println("Дата выдачи зарплаты: " + employee.getSalaryDate());
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Basket {
    private List<Product> products;
    private LocalDate purchaseDate;

    public Basket(LocalDate purchaseDate) {
        this.products = new ArrayList<>();
        this.purchaseDate = purchaseDate;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class PurchaseReport {
    public void print(Basket basket) {
        System.out.println("Дата покупки: " + basket.getPurchaseDate());
        System.out.println("Купленные товары:");
        for (Product product : basket.getProducts()) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}

public class prog1 {
    public static void main(String[] args) {
        
        LocalDate birthday = LocalDate.of(2003, 10, 26);

        System.out.println("День недели: " + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("День в году: " + birthday.getDayOfYear());
        System.out.println("Месяц: " + birthday.getMonth());
        System.out.println("Год: " + birthday.getYear());

        LocalDate currentDate = LocalDate.now();

        if (currentDate.isAfter(birthday)) {
            System.out.println("Текущая дата позже дня рождения");
        } else if (currentDate.isBefore(birthday)) {
            System.out.println("Текущая дата раньше дня рождения");
        } else {
            System.out.println("Текущая дата совпадает с днем рождения");
        }

        int currentYear = LocalDate.now().getYear();

        LocalDate easterSunday = LocalDate.of(currentYear, Month.APRIL, 4);
        LocalDate christmas = LocalDate.of(currentYear, Month.DECEMBER, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.getDefault());

        System.out.println("График праздников на " + currentYear + " год:");
        System.out.println("Пасхальное воскресенье: " + easterSunday.format(formatter));
        System.out.println("Рождество: " + christmas.format(formatter));

        Employee employee = new Employee("Данил", 100000, LocalDate.now());
        Report report = new Report();
        report.print(employee);

        FullReport fullReport = new FullReport();
        fullReport.print(employee);

        Basket basket = new Basket(LocalDate.now());
        basket.addProduct(new Product("Телефон", 1000));
        basket.addProduct(new Product("Наушники", 200));
        basket.addProduct(new Product("Флешка", 50));

        PurchaseReport purchaseReport = new PurchaseReport();
        purchaseReport.print(basket);
    }
}
