package kedai;
// Generated 14/11/2018 7:12:46 PM by Hibernate Tools 4.3.1



/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;

    public Admin() {
    }

    public Admin(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


