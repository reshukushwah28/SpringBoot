package com.reshu.demo.StudentServer.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime TimeStamp;
    private int statusCode;
    private String error;
    private String message;
    private String path;

}
