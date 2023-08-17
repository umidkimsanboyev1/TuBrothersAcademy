package uz.master.demotest.entity.auth;

import lombok.*;
import uz.master.demotest.entity.Auditable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Callback extends Auditable {

    private String email;
    private boolean resolved;

}
