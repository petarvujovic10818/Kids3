package cli.command;

import app.AppConfig;
import servent.message.Message;
import servent.message.file.AskFileMessage;
import servent.message.util.MessageUtil;

public class GetFileCommand implements CLICommand{
    @Override
    public String commandName() {
        return "get_file";
    }

    @Override
    public void execute(String args) {
        //if I don't have that file, broadcast the message and ask for it;

        String msgToSend = "";

        msgToSend = args;

        if (args == null) {
            AppConfig.timestampedErrorPrint("No message to broadcast");
            return;
        }

        Message broadcastMessage = new AskFileMessage(AppConfig.myServentInfo, null, msgToSend);
        for (Integer neighbor : AppConfig.myServentInfo.getNeighbors()) {

            broadcastMessage = broadcastMessage.changeReceiver(neighbor);

            MessageUtil.sendMessage(broadcastMessage);
        }

    }
}
