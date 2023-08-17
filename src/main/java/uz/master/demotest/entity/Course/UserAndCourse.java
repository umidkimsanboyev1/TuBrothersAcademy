package uz.master.demotest.entity.Course;

import lombok.*;
import uz.master.demotest.entity.Auditable;

import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAndCourse extends Auditable {

    private UUID courseId;
    private UUID userId;

}
