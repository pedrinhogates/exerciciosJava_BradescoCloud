package dio.web_api.model;

public class usuario {
    private Integer id;
    private String login;
    private String password;
    public usuario () {}
    public usuario (String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "usuario [id=" + id + ", login=" + login + ", password=" + password + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
