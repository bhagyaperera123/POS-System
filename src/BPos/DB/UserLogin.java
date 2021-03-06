package BPos.DB;
// Generated Aug 23, 2016 10:19:13 AM by Hibernate Tools 4.3.1



/**
 * UserLogin generated by hbm2java
 */
public class UserLogin  implements java.io.Serializable {


     private Integer idUserLogin;
     private User user;
     private UserType userType;
     private String userName;
     private String password;
     private Integer status;

    public UserLogin() {
    }

	
    public UserLogin(User user, UserType userType) {
        this.user = user;
        this.userType = userType;
    }
    public UserLogin(User user, UserType userType, String userName, String password, Integer status) {
       this.user = user;
       this.userType = userType;
       this.userName = userName;
       this.password = password;
       this.status = status;
    }
   
    public Integer getIdUserLogin() {
        return this.idUserLogin;
    }
    
    public void setIdUserLogin(Integer idUserLogin) {
        this.idUserLogin = idUserLogin;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


