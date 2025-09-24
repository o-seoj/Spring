package kr.co.ch07.security;


import kr.co.ch07.entity.User;
import kr.co.ch07.repository.UserRopository;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRopository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 사용자가 입력한 아이디로 사용자 조회, 비밀번호에 대한 검증은 이전 컴포넌트인 AuthenticationProvider에서 수행
        Optional<User> optUser = userRepository.findById(username);

        if(optUser.isPresent()) {
            User user = optUser.get();

            // 인증 객체 생성
            MyUserDetails myuserDetails = MyUserDetails.builder()
                                                        .user(user)
                                                          .build();
            // 반환되는 인증객체가 Security Context Holder에 Authentication으로 저장
            return myuserDetails;
        }
        return null;
    }
}
