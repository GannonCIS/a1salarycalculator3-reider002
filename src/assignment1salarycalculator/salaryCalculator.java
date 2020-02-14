/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author 18147
 */
public class salaryCalculator {

    public int yearlySalary = 100000;
    private int hours = 1200;
    public double hourlyRate = 11.5;
    double percent = 0.6;

    public double calcHourlyWage() {

        if (hours >= 40) {
            hourlyRate = yearlySalary / 52 / hours;
        } else {
            int extraHours = hours - 40;
            yearlySalary = (int) ((40 * hourlyRate) + (extraHours * hourlyRate));
        }
        return hourlyRate;
    }

    public int calcSalary() {
        yearlySalary = (int) (hours * hourlyRate * 52);
        return yearlySalary;
    }

    public int monthlyAfterTax() {
        int monthlySalary = yearlySalary / 12;
        int monthAfterTax = (int) (percent * monthlySalary);
        return monthAfterTax;
    }

    public void test() {
        calcHourlyWage();
        calcSalary();
        monthlyAfterTax();
    }
}
