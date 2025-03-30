
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;


public class UserServiceTest {
    @Test
    void testGetUserEmail() {
        UserRepository userRepository = mock(UserRepository.class);
        UserService userService = new UserService(userRepository);

        User user = new User(1, "John Doe", "john@example.com");
        when(userRepository.findById(1)).thenReturn(Optional.of(user));

        String email = userService.getUserEmail(1);
        assertEquals("john@example.com", email);
    }
}
