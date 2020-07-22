package com.blazingsales.configurations;


import com.blazingsales.entity.Role;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@Configuration
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private String returnURL;

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {

        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
            return;
        }

        RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }


    protected String determineTargetUrl(Authentication authentication) {
        returnURL = "/userView";
        GrantedAuthority grantedAuthority = new ArrayList<GrantedAuthority>(authentication.getAuthorities()).get(0);
        if (grantedAuthority.getAuthority().contains(Role.ADMIN.name())) {
            returnURL = "/admin";
        }else if (grantedAuthority.getAuthority().contains(Role.USER.name())) {
            returnURL = "/user";
        }
        return returnURL;
    }
}
