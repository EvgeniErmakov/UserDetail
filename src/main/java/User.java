import java.sql.Timestamp;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordSalt;
    private Timestamp lastUpdate;
    private UserDetail userDetail;


    public User(String firstName, String lastName, String email, String password, String passwordSalt, Timestamp lastUpdate, UserDetail userDetail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.lastUpdate = lastUpdate;
        this.userDetail = userDetail;
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
