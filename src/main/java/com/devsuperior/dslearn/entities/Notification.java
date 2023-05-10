package com.devsuperior.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_notification")
@NoArgsConstructor
public class Notification  implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String text;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE ")
    private Instant moment;
    private boolean read = false;
    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
