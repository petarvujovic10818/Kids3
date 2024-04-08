package servent.message.file;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

public class AskFileMessage extends BasicMessage {

    public AskFileMessage(ServentInfo sender, ServentInfo receiver, String message) {
        super(MessageType.ASK_FILE, sender, receiver, message);
    }

}
