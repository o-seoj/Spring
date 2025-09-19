package kr.co.ch04.service;

import kr.co.ch04.dao.user1DAO;
import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.mapper.User1Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class User1Service {

    private final User1Mapper mapper;

    private final user1DAO dao;

    public List<User1DTO> getUsers() {
        //return mapper.selectAll();
        return dao.selectAll();
    }

    public User1DTO getUser(String uids) {
        //return mapper.select(uids);
        return dao.select(uids);
    }

    public void save(User1DTO user) {
        // MyBatis 처리
        //mapper.insert(user);

        // Spring JDBC 처리
        dao.insert(user);
    }

    public void update(User1DTO user) {
        //mapper.update(user);
        dao.update(user);
    }

    public void delete(String uids) {
        //mapper.delete(uids);
        dao.delete(uids);
    }

}
