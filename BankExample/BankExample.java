/*
 * An example implementation using the classes
 * in the Bank Example UML diagram.
 */
package bankexample;

//Seminar 2, Task 1
public class BankExample {

    public static void main(String[] args) {

        Person.ValidateSSN("85121245656"); //the validantion just checks that the string is 10 characters.
        Person.ValidateSSN("8512124565");

        Employee employee = new Employee("Ann", "8512124565", 30000);
        Customer customer = new Customer("Eric", "7410102020");

        employee.showInfo();

        customer.withDraw(Customer.SALARY_ACCOUNT_ID, 500, "2019-01-10");
        customer.withDraw(Customer.SALARY_ACCOUNT_ID, 2000, "2019-01-19");
        customer.withDraw(Customer.SALARY_ACCOUNT_ID, 800, "2019-01-25");

        customer.showInfo(); //should also list the SalaryAccount transactions sorted on amount
    }
}
