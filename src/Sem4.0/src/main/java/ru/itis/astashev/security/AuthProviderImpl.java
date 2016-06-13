
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
import ru.itis.astashev.entity.User;
import ru.itis.astashev.repository.UserRepository;
import ru.itis.astashev.services.UsersService;

import java.util.ArrayList;
import java.util.List;
public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        User user = userRepository.findOneByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, user.getPass()) && !password.equals(user.getPass())) {
            throw new BadCredentialsException("invalid password");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));

        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}