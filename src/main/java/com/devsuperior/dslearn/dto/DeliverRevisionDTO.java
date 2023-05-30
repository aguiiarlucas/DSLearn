package com.devsuperior.dslearn.dto;

import com.devsuperior.dslearn.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverRevisionDTO {

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
}
