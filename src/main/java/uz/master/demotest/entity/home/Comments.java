package uz.master.demotest.entity.home;

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
public class Comments extends Auditable {

    private String writerName;
    private String commentText;
    private String position;
    private String imagePath;
    private String title;
    private int orderNumber;
    private boolean active;


}
