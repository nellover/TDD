package Bdddd.bddd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserCreation() {
        // Création de l'utilisateur
        User user = new User("JohnDoe", "john.doe@example.com");
        
        // Vérification que le nom d'utilisateur est bien "JohnDoe"
        assertEquals("JohnDoe", user.getUsername());
    }
}
