package com.devsuperior.dslearn.dto;

import com.devsuperior.dslearn.entities.Notification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO  implements Serializable {

    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    private Long userId;
    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }
}
