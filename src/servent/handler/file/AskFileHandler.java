package servent.handler.file;

import app.AppConfig;
import servent.handler.MessageHandler;
import servent.message.Message;
import servent.message.file.ReturnFileMessage;
import servent.message.util.MessageUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AskFileHandler implements MessageHandler {

    private Message clientMessage;

    public AskFileHandler(Message clientMessage) {
        this.clientMessage = clientMessage;
    }

    @Override
    public void run() {
        String returnMsg = "";
        File dir = new File(AppConfig.myServentInfo.getWarehouse() + "/" + clientMessage);

        try {
            Scanner myReader = new Scanner(dir);
            while (myReader.hasNextLine()) {
                returnMsg = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if(dir.exists()){

            MessageUtil.sendMessage(new ReturnFileMessage(clientMessage.getReceiverInfo(), clientMessage.getOriginalSenderInfo(), returnMsg));
        } else {
            MessageUtil.sendMessage(new ReturnFileMessage(clientMessage.getReceiverInfo(), clientMessage.getOriginalSenderInfo(), "File does not exist"));
        }
    }
}
