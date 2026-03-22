package com.codurance.ocp;

public class Manager implements Payable {
    int salary;
    int bonus;

    Manager(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int payAmount() {
        return bonus + salary;
    }
}