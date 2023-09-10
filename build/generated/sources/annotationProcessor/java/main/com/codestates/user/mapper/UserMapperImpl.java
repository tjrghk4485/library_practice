package com.codestates.user.mapper;

import com.codestates.user.dto.UserDto.Post;
import com.codestates.user.dto.UserDto.Response;
import com.codestates.user.dto.UserDto.Response.ResponseBuilder;
import com.codestates.user.entity.User;
import com.codestates.user.entity.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-11T00:14:54+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.18 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userPostDtoToUser(Post requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.name( requestBody.getName() );
        user.phoneNumber( requestBody.getPhoneNumber() );

        return user.build();
    }

    @Override
    public Response userToUserDtoResponse(User user) {
        if ( user == null ) {
            return null;
        }

        ResponseBuilder response = Response.builder();

        response.name( user.getName() );
        response.phoneNumber( user.getPhoneNumber() );

        return response.build();
    }
}
