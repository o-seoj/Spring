package kr.co.ch05.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


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
