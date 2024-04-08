package servent.message.buddy;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

public class BuddyPingMessage extends BasicMessage {

    public BuddyPingMessage(ServentInfo sender, ServentInfo receiver, String msg) {
        super(MessageType.PING, sender, receiver, msg);
    }

}
