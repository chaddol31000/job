package com.example.job.job;

import lombok.*;
import org.springframework.format.annotation.*;

import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Job {
  private int jno;
  private String title;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate regDate;
}
