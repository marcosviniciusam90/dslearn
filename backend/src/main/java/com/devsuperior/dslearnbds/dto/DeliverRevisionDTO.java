package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliverRevisionDTO implements Serializable {
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
}
