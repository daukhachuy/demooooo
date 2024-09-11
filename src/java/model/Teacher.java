
package model;

import java.util.Date;



public class Teacher {
    private String id ;
    private String name ;
    private Date dob;
    private String phone ;

    public Teacher() {
    }

    public Teacher(String id, String name, Date dob, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", phone=" + phone + '}';
    }

    
    
   
    
}
