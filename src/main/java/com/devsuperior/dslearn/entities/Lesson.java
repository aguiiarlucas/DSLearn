package com.devsuperior.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_lesson")
@NoArgsConstructor
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tile;
    private Integer position;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

}
