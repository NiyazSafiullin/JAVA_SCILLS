package ru.safiullinnh.springboot.server.demo.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.safiullinnh.springboot.server.demo.model.User;
import ru.safiullinnh.springboot.server.demo.repositories.UsersRepositiry;

@Component(value = "customUserDetailService")
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UsersRepositiry usersRepositiry;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = usersRepositiry.findByEmail(email);
        if(user!=null) {
            return new UserDetailsImpl(user);
        }
        else throw new UsernameNotFoundException("User not found");
    }
}
