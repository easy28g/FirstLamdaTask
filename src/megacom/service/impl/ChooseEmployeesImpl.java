package megacom.service.impl;

import megacom.enums.Otdel;
import megacom.models.Employee;
import megacom.service.ChooseEmployees;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ChooseEmployeesImpl {

    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployees(){
        employees.add(new Employee("Azamat", "Duisheev", Otdel.IT, 3, 23));
        employees.add(new Employee("Jyldyzbek", "Osmonkulov", Otdel.IT, 3, 21));
        employees.add(new Employee("Bekmyrza", "Rahimberdiev", Otdel.IT, 3, 24));
        employees.add(new Employee("Merim", "Duisheev", Otdel.Managment, 3, 23));
        employees.add(new Employee("Vlad", "Vecktorov", Otdel.Security, 10, 40));
        employees.add(new Employee("Mirbek", "Atabekov", Otdel.HR, 11, 40));
        employees.add(new Employee("Student-1", "FamStud-1", Otdel.IT,1,21));
        employees.add(new Employee("Intern-1", "FamIntern-1", Otdel.IT, 2, 21));
        employees.add(new Employee("Intern-2", "FamIntern-2", Otdel.IT, 1, 22));
    }


    ChooseEmployees ex = employee -> employee.getExpiriens()>1;
    ChooseEmployees age = employee -> employee.getAge()>22;
    ChooseEmployees otdel = employee -> employee.getOtdel().equals(Otdel.IT);

    public void getEmployees(){
        System.out.println("expiriens>1 && age>22 && otdel == 'IT'");
        employees.forEach(employee -> System.out.println(employee.getFirstname()+": "+
                (ex.myChoose(employee) && age.myChoose(employee) && otdel.myChoose(employee))));
    }

    public void createStream(){
        Stream<Object> employeeStream = Stream
                .builder()
                .add(new Employee("Azamat", "Duisheev", Otdel.IT, 3, 23))
                .add(new Employee("Jyldyzbek", "Osmonkulov", Otdel.IT, 3, 21))
                .add(new Employee("Bekmyrza", "Rahimberdiev", Otdel.IT, 3, 24))
                .add(new Employee("Merim", "Duisheev", Otdel.Managment, 3, 23))
                .add(new Employee("Vlad", "Vecktorov", Otdel.Security, 10, 40))
                .add(new Employee("Mirbek", "Atabekov", Otdel.HR, 11, 40))
                .add(new Employee("Student-1", "FamStud-1", Otdel.IT,1,21))
                .add(new Employee("Intern-1", "FamIntern-1", Otdel.IT, 2, 21))
                .add(new Employee("Intern-2", "FamIntern-2", Otdel.IT, 1, 22))
                .build();

        long count = employeeStream
                .count();

        Stream<Employee> employeeStreamOf = Stream.of(
                new Employee("Azamat", "Duisheev", Otdel.IT, 3, 23),
                new Employee("Jyldyzbek", "Osmonkulov", Otdel.IT, 3, 21),
                new Employee("Bekmyrza", "Rahimberdiev", Otdel.IT, 3, 24),
                new Employee("Merim", "Duisheev", Otdel.Managment, 3, 23),
                new Employee("Vlad", "Vecktorov", Otdel.Security, 10, 40),
                new Employee("Mirbek", "Atabekov", Otdel.HR, 11, 40),
                new Employee("Student-1", "FamStud-1", Otdel.IT,1,21),
                new Employee("Intern-1", "FamIntern-1", Otdel.IT, 2, 21),
                new Employee("Intern-2", "FamIntern-2", Otdel.IT, 1, 22)
        );

        long countOf = employeeStreamOf
                .filter(employee -> employee.getExpiriens()>3)
                .count();
        System.out.println("**********************************************************");
        System.out.println("Колличество сотрудников опыт которых больше 3 лет == "+countOf);
        //System.out.println(count);
    }
}
