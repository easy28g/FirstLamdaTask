package megacom.service;

import megacom.models.Employee;

@FunctionalInterface
public interface ChooseEmployees {
    boolean myChoose(Employee employee);
}
