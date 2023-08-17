package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.auth.AuthUser;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<Object> getAuthUsersByUsernameAndDeletedFalse(String username);
    boolean existsAuthUserByUsername(String username);
    boolean existsAuthUserByEmail(String email);
}
