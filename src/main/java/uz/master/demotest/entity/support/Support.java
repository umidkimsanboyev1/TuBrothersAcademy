package uz.master.demotest.entity.support;

import lombok.*;
import uz.master.demotest.entity.Auditable;
import uz.master.demotest.enums.SupportStatus;

import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Support extends Auditable {

    private String senderName;
    private String text;
    private String senderEmailAddress;
    private String seenDateTime;
    private String closedDateTime;
    private SupportStatus status;
    private Long senderId;
    private Long moderatorId;

}
