package uz.master.demotest.entity.Course;

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
public class Lesson  extends Auditable {

    private Long courseId;
    private String duration;
    private String pathOfVideo;
    private String name;
    private String description;

}
