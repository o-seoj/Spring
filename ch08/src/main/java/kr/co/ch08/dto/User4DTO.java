package kr.co.ch08.dto;


import jakarta.persistence.Id;
import kr.co.ch08.entity.User4;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User4DTO {

    @Id
    private int no;
    private String name;
    private int age;
    private String address;

    public User4 toEntity() {
        return User4.builder()
                .no(no)
                .name(name)
                .age(age)
                .address(address)
                .build();
    }
}
