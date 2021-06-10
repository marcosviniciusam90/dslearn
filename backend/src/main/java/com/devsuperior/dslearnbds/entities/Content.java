package com.devsuperior.dslearnbds.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

    private String textContent;
    private String videoUri;

    public Content(@NonNull Long id, @NonNull String title, @NonNull Integer position, @NonNull Section section, String textContent, String videoUri) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

}
