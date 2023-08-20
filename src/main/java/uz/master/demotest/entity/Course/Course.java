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
public class Course  extends Auditable {

    private String name;
    private String duration;
    private String previewImage;
    private String description;
    private String language;
    private String ownerName;
    private String level;
    private Long categoryId;
    private Long countLessons;
    private Long views;
    private Long countOfSales;
    private Long ownerId;
    private Long likes;
    private Double mark;
    private Double price;
    private Double discountPrice;
    private boolean certificate;


}
