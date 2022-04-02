package thongke.mapping;

import thongke.model.Entity.User;
import thongke.model.payload.request.user.InfoUserRequest;
import thongke.model.payload.request.user.RegisterAdminRequest;
import thongke.model.payload.request.authenticate.RegisterRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserMapping {

    public static User registerToEntity(RegisterRequest registerRequest) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        registerRequest.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        return new User(registerRequest.getUsername(),registerRequest.getEmail(),registerRequest.getPassword());
    }

    public static User registerToEntity(RegisterAdminRequest registerRequest) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        registerRequest.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        return new User(registerRequest.getUsername(),registerRequest.getEmail(),registerRequest.getPassword());
    }

    public static User UpdateUserInfoByUser(User user, InfoUserRequest userInfo) {
        user.setBirthdate(userInfo.getBirthdate());
        user.setTenhienthi(userInfo.getTenhienthi());
        user.setImage(userInfo.getImage());
        return  user;
    }

    public static User UpdatePasswordByUser(User user, String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(password));
        return  user;
    }
}
