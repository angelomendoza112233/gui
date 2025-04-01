
package config;

public class session {
     private static session instance;
    private static int u_id;

   
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String contact;
    private static String username;
    private static String password;
    private static String roles;

    

    
    private static String type;
    private static String status;
    public static synchronized session getInstance() {
        if (instance == null) {
            instance = new session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

   

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        session.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        session.lastName = lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        session.email = email;
    }

    public static String getContact() {
        return contact;
    }

    public static void setContact(String contact) {
        session.contact = contact;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        session.username = username;
    }

    public static String getAcc_type() {
        return type;
    }

    public static void setAcc_type(String acc_type) {
        session.type = acc_type;
    }

    public static String getAcc_status() {
        return status;
    }

    public static void setAcc_status(String acc_status) {
        session.status = acc_status;
    }
    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        session.password = password;
    }
    public static String getRoles() {
        return roles;
    }

    public static void setRoles(String roles) {
        session.roles = roles;
    }
     public static int getU_id() {
        return u_id;
    }

    public static void setU_id(int u_id) {
        session.u_id = u_id;
    }
}
    

