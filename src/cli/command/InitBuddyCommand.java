package cli.command;

import app.AppConfig;
import servent.message.Message;
import servent.message.buddy.BuddyPingMessage;
import servent.message.util.MessageUtil;

public class InitBuddyCommand implements CLICommand{
    @Override
    public String commandName() {
        return "init_buddy";
    }

    @Override
    public void execute(String args) {

        while(true){
            int buddy1 = (AppConfig.myServentInfo.getId() + 1) % AppConfig.getServentCount();
            int buddy2 = (AppConfig.myServentInfo.getId() + 2) % AppConfig.getServentCount();
            MessageUtil.sendMessage(new BuddyPingMessage(AppConfig.getInfoById(AppConfig.myServentInfo.getId()), AppConfig.getInfoById(buddy1), ""));
            MessageUtil.sendMessage(new BuddyPingMessage(AppConfig.getInfoById(AppConfig.myServentInfo.getId()), AppConfig.getInfoById(buddy2), ""));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //get my id
        //every half second (Thread.sleep(500));
        //send ping to (my_id + 1) % node.size - buddy 1
        //send ping to (my_id + 2) % node.size - buddy 2
        //cuvaj txt files about my buddies

        //store send time,
        //check time every 2 second, if didn't get ping send to another buddy is ok?
        //if the answer is CONFIRM -> wait 8 more seconds
        //if no answer save his data

    }
}
