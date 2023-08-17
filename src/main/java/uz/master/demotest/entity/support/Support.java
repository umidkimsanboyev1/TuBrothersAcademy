package uz.master.demotest.entity.support;

import lombok.*;
import uz.master.demotest.entity.Auditable;
import uz.master.demotest.enums.SupportStatus;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Support extends Auditable {

    private String senderName;
    private Long senderId;
    private Long moderatorId;
    private String senderEmailAddress;
    private String text;
    private SupportStatus status;

}
