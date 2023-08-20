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
public class MenuList extends Auditable {

    private String name;
    private boolean child;
    private String url;
    private Long fatherId;
    private int orderNumber;

}
