import java.sql.Timestamp;

public class UserDetail {

    private int idUserDetails;
    private String country;
    private String city;
    private Timestamp birthday;

    public UserDetail(String country, String city, Timestamp birthday) {
        this.country = country;
        this.city = city;
        this.birthday = birthday;
    }

    public UserDetail(int idUserDetails, String country, String city, Timestamp birthday) {
        this.idUserDetails = idUserDetails;
        this.country = country;
        this.city = city;
        this.birthday = birthday;
    }

    public UserDetail() {
    }

    public int getIdUserDetails() {
        return idUserDetails;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setIdUserDetails(int idUserDetails) {
        this.idUserDetails = idUserDetails;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }
}
