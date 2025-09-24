package kr.co.ch08.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.ch08.dto.User5DTO;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_USER5")
public class User5 {
    @Id
    private int no;
    private String name;
    private int age;
    private String gender; // M, F

    @CreationTimestamp
    private LocalDateTime regDate;

    public User5DTO toDTO() {
        return User5DTO.builder()
                .no(no)
                .name(name)
                .age(age)
                .gender(gender)
                .regDate(regDate.toString())
                .build();
    }

}
