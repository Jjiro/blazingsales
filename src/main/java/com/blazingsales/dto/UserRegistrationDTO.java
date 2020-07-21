package com.blazingsales.dto;

import com.blazingsales.constraints.FieldMatch;
import lombok.Value;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@FieldMatch.List({@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")})
@Value
public class UserRegistrationDTO {

        @NotEmpty
        private String firstName;

        @NotEmpty
        private String lastName;

        @NotEmpty
        private String accountName;

        @Email
        @NotEmpty
        private String email;

        @NotEmpty
        private String province;

        @NotEmpty
        private String city;

        @NotEmpty
        private String address;

        @NotEmpty
        private String accountCreationDate;

        @NotEmpty
        private String Avatar;

        @NotEmpty
        private String accountType;

        @AssertTrue
        private Boolean termsANDconditions;

        @NotEmpty
        private String password;

        @NotEmpty
        private String confirmPassword;


}
