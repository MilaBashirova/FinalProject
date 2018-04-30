package ru.ivmiit.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.ivmiit.service.models.Role;
import ru.ivmiit.service.models.User;

@Data
@Builder
@AllArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private Role role;

    public static UserDto from(User user) {
        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .role(user.getRole())
                .build();
    }


}
