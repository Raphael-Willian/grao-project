package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponseDTO {

    private int status;
    private String error;
    private String message;
    private String path;
    private LocalDateTime timestap;

    public ErrorResponseDTO(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.timestap = LocalDateTime.now();
    }

}
