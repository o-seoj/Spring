package kr.co.ch08.repository;

import kr.co.ch08.entity.User3;
import kr.co.ch08.entity.User4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User4Repository extends JpaRepository<User4, Integer> {

}
