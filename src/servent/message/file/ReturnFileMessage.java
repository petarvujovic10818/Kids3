package servent.message.file;

import app.ServentInfo;
import servent.message.BasicMessage;
import servent.message.MessageType;

import java.io.File;

public class ReturnFileMessage extends BasicMessage {

    public ReturnFileMessage(ServentInfo sender, ServentInfo receiver, String message) {
        super(MessageType.RETURN_FILE, sender, receiver, message);
    }

}
