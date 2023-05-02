package com.devsuperior.dslearn.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_content")
public class Content  extends  Lesson{
    private String textContent;
    private String videoUri;

    public Content(Long id, String tile, Integer position, Section section, String textContent, String videoUri) {
        super(id, tile, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }
}
