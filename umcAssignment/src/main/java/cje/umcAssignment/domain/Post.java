package cje.umcAssignment.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Getter @Setter @AllArgsConstructor
public class Post {
    @Id @GeneratedValue
    private Long id;

    private String title;

    private String writer;

    private String content;

    private String category;
}
