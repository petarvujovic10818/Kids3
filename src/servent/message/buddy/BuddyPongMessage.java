package servent.message.buddy;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

public class BuddyPongMessage extends BasicMessage {

    public BuddyPongMessage(ServentInfo sender, ServentInfo receiver, String msg) {
        super(MessageType.PONG, sender, receiver, msg);
    }

}
