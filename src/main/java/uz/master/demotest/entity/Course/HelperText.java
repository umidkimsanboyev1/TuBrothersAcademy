package uz.master.demotest.entity.Course;

import lombok.*;
import uz.master.demotest.entity.Auditable;
import uz.master.demotest.enums.HelperTextType;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelperText extends Auditable {

    private String text;
    private Long fatherId;
    private HelperTextType helperTextType;

}
