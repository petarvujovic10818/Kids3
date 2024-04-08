package servent.handler.file;

import servent.handler.MessageHandler;
import servent.message.Message;
import servent.message.MessageType;

public class ReturnFileHandler implements MessageHandler {

    private Message clientMessage;

    public ReturnFileHandler(Message clientMessage) {
        this.clientMessage = clientMessage;
    }

    @Override
    public void run() {
        if(clientMessage.getMessageType().equals(MessageType.RETURN_FILE)){

        }
    }
}
