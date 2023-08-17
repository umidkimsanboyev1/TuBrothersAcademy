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
    private Long categoryId;
    private Long countLessons;
    private String description;
    private Double mark;
    private Long views;
    private Long countOfSales;
    private String previewImage;
    private String ownerName;
    private Long ownerId;
    private Double price;
    private Double discountPrice;
    private String language;
    private String level;
    private boolean certificate;
    private Long likes;


}
