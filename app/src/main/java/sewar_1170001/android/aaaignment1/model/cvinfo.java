package sewar_1170001.android.aaaignment1.model;

public class cvinfo {
private  String name;
private String email;
private String pass;
private String hobb;
private String gender;

    public cvinfo(String name, String email, String pass, String hobb, String gender) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.hobb = hobb;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobb() {
        return hobb;
    }

    public void setHobb(String hobb) {
        this.hobb = hobb;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
