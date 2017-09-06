package fan.geogames.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NamedQuery(name = "Users.getAll", query = "SELECT u from Users u")
public class Users {
    private int userId;
    private String login;
    private String password;
    private String userName;
    private String userSurname;
    private String email;
    private String regDate;
    private int role;
    private int delStatus;

    public Users() {
    }

    public Users(int userId, String login, String password, String userName, String userSurname, String email, String regDate, int role, int delStatus) {
        this.userId = userId;
        this.login = login;
        this.password = password;
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.regDate = regDate;
        this.role = role;
        this.delStatus = delStatus;
    }

    @Id
    @Column(name = "user_Id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_surname")
    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "reg_date")
    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "role")
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "del_status")
    public int getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(int delStatus) {
        this.delStatus = delStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId) return false;
        if (role != users.role) return false;
        if (delStatus != users.delStatus) return false;
        if (login != null ? !login.equals(users.login) : users.login != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (userName != null ? !userName.equals(users.userName) : users.userName != null) return false;
        if (userSurname != null ? !userSurname.equals(users.userSurname) : users.userSurname != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (regDate != null ? !regDate.equals(users.regDate) : users.regDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userSurname != null ? userSurname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + role;
        result = 31 * result + delStatus;
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", email='" + email + '\'' +
                ", regDate='" + regDate + '\'' +
                ", role=" + role +
                ", delStatus=" + delStatus +
                '}';
    }
}
