package com.mini.emoti.model.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostDto {
    private Long postId;
    private String email;
    private String nickname;
    private String content;

    @PositiveOrZero
    private int likeCnt;

    @PositiveOrZero
    private int hateCnt;
    private LocalDateTime createdDate;
}
