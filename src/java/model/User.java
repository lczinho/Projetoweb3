
package model;

public class User {
    //Atributos
    private String userName;
    private String userPass;
    private String userCpf;
    
    
    //Método construtor
    public User(String user, String pass){
       this.userName = user;
       this.userPass = pass;
    }
    
    //getters & Setters
    public String getUserName(){
    return this.userName;
    }
    
    public void setUserName(String user){
        this.userName = user;
    }
    
    
     public String getUserPass(){
    return this.userPass;
    }
    
    public void setUserPass(String pass){
        this.userPass = pass;
    }
    
    
     public String getUserCpf(){
    return this.userCpf;
    }
    
    public void setUserCpf(String cpf){
        this.userCpf = cpf;
    }
    
    //toString - método para representação geral do objeto

    @Override
    public String toString() {
        return "Nome:" + userName +"<br>CPF: " + userCpf;
    }
    
    
    //Métodos gerais
    public boolean isLogged(){
        return(this.userName.equals("lucas")
               &&this.userPass.equals("senha1234"));
    }
    
}//Fim da classe
