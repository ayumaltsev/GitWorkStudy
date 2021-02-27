//Всё будет хорошо
//********************************

package org.example.my;

public class Person extends BaseEntity{
    private String firtsName;
    private String lastName;

    public Person() {
    }

    public Person(String firtsName, String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public Person(Long id, String firtsName, String lastName) {
        super(id);
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
