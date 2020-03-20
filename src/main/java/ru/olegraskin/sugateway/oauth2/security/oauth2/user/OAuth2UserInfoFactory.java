package ru.olegraskin.sugateway.oauth2.security.oauth2.user;


import ru.olegraskin.sugateway.oauth2.exception.OAuth2AuthenticationProcessingException;
import ru.olegraskin.sugateway.oauth2.model.AuthProvider;

import java.util.Map;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}