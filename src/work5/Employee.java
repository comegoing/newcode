package work5;
import java.util.Scanner;
public class Employee {
    private String name;
    private int age = 0;
    private float salary = 0;
    private float bonus = 0;
    private float income = 0;
    Employee(){
        this.name = "NaN";
    }
    public Employee(String name, int age, float salary, float bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }
    float countincome(){
        income = salary+bonus;
        return income;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please input the employee's name: ");
        String name = in.nextLine();

        System.out.println("Please input the employee's age: ");
        int age = in.nextInt();

        System.out.println("Please input the employee's sarary: ");
        float salary = in.nextFloat();
        
        System.out.println("Please input the employee's bonus: ");
        float bonus = in.nextFloat();

        float income = 0;
        in.close();
        Employee e = new Employee(name, age, salary, bonus);
        income = e.countincome();
        System.out.println("Employee's name:"+e.name);
        System.out.println("Employee's age:"+e.age);
        System.out.println("Employee's income:"+income);

    }
}
