package entity;

import hannotation.Column;
import hannotation.Entity;
import hannotation.Id;

import java.sql.Date;

@Entity(tableName = "employees")
public class Employee {
    @Id
    @Column(columnName = "id", columnType = "INT")
    private String id;
    @Column(columnName = "fullName", columnType = "VARCHAR(250)")
    private String fullName;
    @Column(columnName = "birthDay", columnType = "DATE")
    private Date birthDay;
    @Column(columnName = "address", columnType = "VARCHAR(250)")
    private String address;
    @Column(columnName = "position", columnType = "VARCHAR(250)")
    private String position;
    @Column(columnName = "department", columnType = "VARCHAR(250)")
    private String department;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String id, String fullName, Date birthDay, String address, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.position = position;
        this.department = department;
    }
}
