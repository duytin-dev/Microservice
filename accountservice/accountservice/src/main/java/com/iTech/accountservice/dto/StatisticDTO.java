package com.iTech.accountservice.dto;

import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class StatisticDTO {
    private Long id;
    @NonNull
    private String message;
    @NonNull
    private Date createdDate;
}
