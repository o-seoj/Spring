package kr.co.ch08.dto;

import jakarta.persistence.Id;
import kr.co.ch08.entity.User5;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User5DTO {
    @Id
    private int no;
    private String name;
    private int age;
    private String gender; // M, F
    private String regDate;

    public User5 toEntity(){
        return User5.builder()
                .no(no)
                .name(name)
                .age(age)
                .gender(gender)
                .build();
    }
}
