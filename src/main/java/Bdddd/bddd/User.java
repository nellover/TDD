package Bdddd.bddd;

public class User {
    private String username;
    private String email;

    // Constructeur qui initialise le nom d'utilisateur et l'email
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getter pour récupérer le nom d'utilisateur
    public String getUsername() {
        return username;
    }

    // Getter pour récupérer l'email (si nécessaire dans d'autres tests)
    public String getEmail() {
        return email;
    }
}

