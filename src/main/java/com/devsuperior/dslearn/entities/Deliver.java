package com.devsuperior.dslearn.entities;

import com.devsuperior.dslearn.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_deliver")
@NoArgsConstructor
public class Deliver  implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String uri;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE ")
    private Instant moment;
    private DeliverStatus deliverStatus;
    private String feedback;
    private int correctCount;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
