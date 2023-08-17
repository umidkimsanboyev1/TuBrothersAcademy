package uz.master.demotest.entity.auth;


import lombok.*;
import uz.master.demotest.entity.Auditable;
import uz.master.demotest.enums.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthUser extends Auditable {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String fullName;
    private String avatarImagePath;
    private Role role;
    private UUID activationKey;

    private boolean darkTheme;
    private boolean registered;
    private boolean active;
    private boolean blocked;

}
