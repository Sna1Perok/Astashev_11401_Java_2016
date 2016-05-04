package ru.itis.astashev.security;/**
 * Created by 1 on 02.05.2016.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.itis.astashev.entity.Users;
import ru.itis.astashev.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        Users users = userRepository.findOneByLogin(login);
        if (users == null) {
            throw new UsernameNotFoundException("user not found");
        }
        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, users.getPass()) && !password.equals(users.getPass())) {
            throw new BadCredentialsException("invalid password");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(users.getRole().toString()));

        return new UsernamePasswordAuthenticationToken(users, null, authorities);
    }

    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}