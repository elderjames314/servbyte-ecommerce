package com.servbyte.ecommerce.utility;

import com.servbyte.ecommerce.entities.ApplicationUser;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;


public final class AuthenticatedUser {

    public static ApplicationUser getLoggedInUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof ApplicationUser) {
           return  (ApplicationUser) principal;
        } else {
             throw new BadCredentialsException("Access denied");
        }
    }

}
