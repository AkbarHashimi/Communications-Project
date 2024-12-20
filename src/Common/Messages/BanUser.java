package Common.Messages;

import Common.MessageInterface;
import Common.MessageType;
import java.io.Serializable;

public record BanUser(int userID) implements MessageInterface, Serializable {
    private static final MessageType type = MessageType.BAN_USER;

    public MessageType getType() {
        return type;
    }
}