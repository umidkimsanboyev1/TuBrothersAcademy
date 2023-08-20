package uz.master.demotest.entity;

import lombok.*;
import uz.master.demotest.entity.Auditable;
import uz.master.demotest.enums.HelperTextType;

import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelperText extends Auditable {

    private String text;
    private UUID fatherId;
    private HelperTextType helperTextType;

}
