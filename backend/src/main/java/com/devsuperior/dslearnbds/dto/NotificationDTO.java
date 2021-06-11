package com.devsuperior.dslearnbds.dto;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NotificationDTO implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;

    private String text;
    private Instant moment;
    private boolean read = false;
    private String route;
    private Long userId;
}
