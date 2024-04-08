package servent.handler.buddy;

import servent.handler.MessageHandler;
import servent.message.Message;
import servent.message.MessageType;
import servent.message.buddy.BuddyPongMessage;
import servent.message.util.MessageUtil;

public class BuddyPingHandler implements MessageHandler {

    private Message clientMessage;

    public BuddyPingHandler(Message clientMessage){
        this.clientMessage = clientMessage;
    }

    @Override
    public void run() {
        if(clientMessage.getMessageType().equals(MessageType.PING)){
            MessageUtil.sendMessage(new BuddyPongMessage(clientMessage.getReceiverInfo(), clientMessage.getOriginalSenderInfo(), ""));
        }
    }
}
