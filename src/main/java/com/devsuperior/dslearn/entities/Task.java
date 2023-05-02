package com.devsuperior.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;


@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_task")
public class Task  extends  Lesson{

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight = 1.0;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;

    public Task(Long id, String tile, Integer position, Section section, String description, Integer questionCount, Integer approvalCount, Double weight, Instant dueDate) {
        super(id, tile, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }
}
