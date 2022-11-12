package cje.umcAssignment.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class PostResponseDto {
    private String title;

    private String writer;

    private String content;

    private String category;
}
