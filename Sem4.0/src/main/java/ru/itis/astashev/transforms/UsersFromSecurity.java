package ru.itis.astashev.transforms;/**
 * Created by 1 on 15.05.2016.
 */

import org.springframework.security.core.context.SecurityContextHolder;
import ru.itis.astashev.entity.User;

public class UsersFromSecurity {
    public static User getUseresFromSecurity() {
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser"))
            return null;
        else
            return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}