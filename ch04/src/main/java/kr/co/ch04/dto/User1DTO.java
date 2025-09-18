package kr.co.ch04.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User1DTO {
    private String uids;
    private String name;
    private String birth;
    private int age;

}
