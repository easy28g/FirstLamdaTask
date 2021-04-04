package megacom.models;

import megacom.enums.Otdel;

public class Employee {

    private String firstname;
    private String secondname;
    private Otdel otdel;
    private int expiriens;
    private int age;

    public Employee(String firstname, String secondname, Otdel otdel, int expiriens, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.otdel = otdel;
        this.expiriens = expiriens;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public Otdel getOtdel() {
        return otdel;
    }

    public void setOtdel(Otdel otdel) {
        this.otdel = otdel;
    }

    public int getExpiriens() {
        return expiriens;
    }

    public void setExpiriens(int expiriens) {
        this.expiriens = expiriens;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
