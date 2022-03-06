package pojos;

public class Registrant {

    private String ssn;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private String lan;


    //variables constructors /getters and setters / toString


    public Registrant() {
    }

    public Registrant(String ssn, String firstname, String lastname, String username, String email, String password) {
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getSsn() {
        return ssn;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registrant{" +
                "ssn='" + ssn + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lan='" + lan + '\'' +
                '}';
    }
}
