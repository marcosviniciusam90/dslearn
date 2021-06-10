package com.devsuperior.dslearnbds.entities.pk;

import com.devsuperior.dslearnbds.entities.Offer;
import com.devsuperior.dslearnbds.entities.User;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class EnrollmentPK implements Serializable {

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
