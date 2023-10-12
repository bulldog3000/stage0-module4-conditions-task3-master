package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double res;
        if (salary <= 10000) {
            res = ((double) salary /100)*85;
            System.out.println(res);
        }
        if (salary > 10000 && salary <= 20000) {
            res = ((double) salary /100)*82;
            System.out.println(res);
        }
        if (salary > 20000) {
            res = ((double) salary /100)*80;
            System.out.println(res);
        }
        if (salary == 0) System.out.println("wrong input!");
    }
}
