package com.devsuperior.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_reply")
@NoArgsConstructor
public class Reply implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String body;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE ")
    private Instant moment;



    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;
}
