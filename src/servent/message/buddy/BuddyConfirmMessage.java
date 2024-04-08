package servent.message.buddy;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

import java.util.List;

public class BuddyConfirmMessage extends BasicMessage {

    public BuddyConfirmMessage(ServentInfo sender, ServentInfo receiver, long timeStamp) {
        super(MessageType.CONFIRM, sender, receiver, String.valueOf(timeStamp));
    }
}
