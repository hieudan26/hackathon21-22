package thongke.Service;

import thongke.model.Entity.User;

public interface EmailService {
    public void sendActiveMessage(User user);
    public void sendForgetPasswordMessage(User user,String newpassword);

    public void sendMessageWithAttachment(
            String to, String subject, String text, String pathToAttachment);
}
