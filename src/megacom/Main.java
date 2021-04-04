package megacom;

import megacom.service.impl.ChooseEmployeesImpl;

public class Main {

    public static void main(String[] args) {

        ChooseEmployeesImpl chooseEmployees = new ChooseEmployeesImpl();
        chooseEmployees.addEmployees();
        chooseEmployees.getEmployees();
        chooseEmployees.createStream();
    }
}
