package servent.message.buddy;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

public class BuddyIsAliveMessage extends BasicMessage {

    public BuddyIsAliveMessage(ServentInfo sender, ServentInfo receiver, long timeStamp) {
        super(MessageType.IS_ALIVE, sender, receiver, String.valueOf(timeStamp));
    }

}
