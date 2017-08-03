import models.Story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/3/17.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Story myStory = new Story();

        boolean programRunning = true;
        while(programRunning){
            programRunning = myStory.endCheck();
            System.out.println(myStory.textToUser());
            System.out.println(myStory.choicesToUser());
            if(programRunning == true){
                try{
                    String userChoice = bufferedReader.readLine();
                    programRunning = myStory.makeChoice(userChoice);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
