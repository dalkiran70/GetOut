package Model;

import com.google.firebase.analytics.FirebaseAnalytics;
/**
 * @author Muhammed Naci Dalkıran
 */
public class User {
    private String name;
    private String email;
    private int password;
    private boolean verified;

    public User(String email) {
        this.email = email;
        setName();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVerified() {
        return verified;
    }

    private void verify(){
        //TODO
    }

    private void setName(){
        name = "";
        name += email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf('.')) + " " + email.substring(email.indexOf('.')+1,email.indexOf('.')+2).toUpperCase() + email.substring(email.indexOf('.')+2 , email.indexOf('@'));
    }

    public String toString(){
        return name;
    }

}
