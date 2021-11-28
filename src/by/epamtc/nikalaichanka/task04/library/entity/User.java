package by.epamtc.nikalaichanka.task04.library.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

        private long userID;
        private String userLogin;
        private String userPassword;
        private String firstName;
        private String lastName;
        private Role userRole;


        public User () {
        }

        public User (String userLogin, String userPassword, String firstName, String lastName, Role userRole) {
            this.userLogin = userLogin;
            this.userPassword = userPassword;
            this.firstName = firstName;
            this.lastName = lastName;
            this.userRole = userRole;

        }

        public long getUserID() {
            return userID;
        }

        public void setUserID(long userID){
            this.userID = userID;
        }

        public String getUserLogin() {
            return userLogin;
        }

        public void setUserLogin(String userLogin) {
            this.userLogin = userLogin;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
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

        public Role getUserRole() {
            return userRole;
        }

        public void setUserRole(Role userRole) {
            this.userRole = userRole;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userID == user.userID && Objects.equals(userLogin, user.userLogin)
                                     && Objects.equals(userPassword, user.userPassword)
                                     && Objects.equals(firstName, user.firstName)
                                     && Objects.equals(lastName, user.lastName)
                                     && Objects.equals(userRole, user.userRole);
    }

    @Override
    public int hashCode() { // ECLIPSE
        int result = 1;
        result = 31 * result + (userLogin == null ? 0 : userLogin.hashCode());
        result = 31 * result + (userPassword == null ? 0 : userPassword.hashCode());
        result = 31 * result + (firstName == null ? 0 : firstName.hashCode());
        result = 31 * result + (lastName == null ? 0 : lastName.hashCode());
        result = 31 * result + (userRole == null ? 0 : userRole.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "userLogin='" + userLogin + '\'' +
                " userPassword='" + userPassword + '\'' +
                " firstName='" + firstName + '\'' +
                " lastName='" + lastName + '\'';
    }
}
