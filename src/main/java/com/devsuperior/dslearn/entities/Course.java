package com.devsuperior.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_course")
public class Course  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    @OneToMany(mappedBy = "course")
    private List<Offer>offers = new ArrayList<>();

}
