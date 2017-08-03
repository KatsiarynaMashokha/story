package models;

/**
 * Created by Guest on 8/3/17.
 */
public class Choice {
    String text = "";
    String option1 = "";
    String option2 = "";
    Choice c1 = null;
    Choice c2 = null;

    public Choice(String text, String option1, String option2){
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
    }

    public String showText(){
        return text;
    }

    public String showc1(){
        return option1;
    }

    public String showc2(){
        return option2;
    }

    public Choice choose(String input){
        if(input.equals("1")){
            return c1;
        }
        else{
            return c2;
        }
    }

    public void addChoices(Choice c1, Choice c2){
        this.c1 = c1;
        this.c2 = c2;
    }

}
