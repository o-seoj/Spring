package kr.co.ch08.repository;

import kr.co.ch08.entity.User4;
import kr.co.ch08.entity.User5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User5Repository extends JpaRepository<User5, Integer> {

}
