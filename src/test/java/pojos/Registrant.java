package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Registrant {


    /*
    {
  "activated": true,
  "authorities": [
    "string"
  ],
  "createdBy": "string",
  "createdDate": "2022-03-06T16:16:26.333Z",
  "email": "string",
  "firstName": "string",
  "id": 0,
  "imageUrl": "string",
  "langKey": "string",
  "lastModifiedBy": "string",
  "lastModifiedDate": "2022-03-06T16:16:26.333Z",
  "lastName": "string",
  "login": "string",
  "password": "string",
  "ssn": "string"
}
     */

    private String firstName;
    private String lastName;
    private String ssn;
    private String login;
    private String langKey;
    private String password;
    private String email;

    public Registrant() {
    }

    public Registrant(String firstName, String lastName, String ssn, String login, String langKey, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.login = login;
        this.langKey = langKey;
        this.password = password;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Registrant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", login='" + login + '\'' +
                ", langKey='" + langKey + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
