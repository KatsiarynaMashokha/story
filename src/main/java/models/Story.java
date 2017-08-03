package models;

/**
 * Created by Guest on 8/3/17.
 */
public class Story {
    Choice currentChoice;

    public Story(){
        Choice start = new Choice("I am the start", "I'll go to 1", "I'll go to 2");
        currentChoice = start;
        Choice c1 = new Choice("I am the first choice", "I'll go to 3", "I'll go to 4");
        Choice c2 = new Choice("I am the second choice", "I'll go to 5", "I'll go to 6");
        start.addChoices(c1,c2);
        Choice c3 = new Choice("I am the third choice -THE END", "NULL", "NULL");
        Choice c4 = new Choice("I am the fourth choice -THE END", "NULL", "NULL");
        c1.addChoices(c3, c4);
        Choice c5 = new Choice("I am the fifth choice -THE END", "NULL", "NULL");
        Choice c6 = new Choice("I am the sixth choice --THE END", "NULL", "NULL");
        c2.addChoices(c5, c6);
    }

    public String textToUser(){
        return currentChoice.showText();
    }

    public String choicesToUser(){
        String choices;
        if(currentChoice.showc1().equals("NULL") && currentChoice.showc2().equals("NULL")){
            choices = "You've reached the end";
        }else{
            choices = "Option 1 - " + currentChoice.showc1() + "\n Option 2 - " + currentChoice.showc2();
        }
        return choices;
    }

    public boolean makeChoice(String input){
        if(currentChoice.choose(input) == null){
            return false;
        }else{
            this.currentChoice = currentChoice.choose(input);
            return true;
        }
    }

    public boolean endCheck(){
        if(currentChoice.choose("1") == null && currentChoice.choose("2") == null){
            return false;
        }else{
            return true;
        }
    }
}

