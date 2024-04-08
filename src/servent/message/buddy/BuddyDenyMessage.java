package servent.message.buddy;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

public class BuddyDenyMessage extends BasicMessage {

    public BuddyDenyMessage(ServentInfo sender, ServentInfo receiver, long timeStamp) {
        super(MessageType.DENY, sender, receiver, String.valueOf(timeStamp));
    }

}
