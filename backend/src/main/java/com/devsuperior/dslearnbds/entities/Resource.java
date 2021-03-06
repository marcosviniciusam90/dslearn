package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.entities.enums.ResourceType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "resource")
    private Set<Section> sections = new HashSet<>();
}
