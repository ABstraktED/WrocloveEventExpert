/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import static Classes.MainWindow.questionLabel;
import static Classes.MainWindow.questionNumberLabel;
import static Classes.MainWindow.radioButton1;
import static Classes.MainWindow.radioButton10;
import static Classes.MainWindow.radioButton11;
import static Classes.MainWindow.radioButton12;
import static Classes.MainWindow.radioButton13;
import static Classes.MainWindow.radioButton14;
import static Classes.MainWindow.radioButton2;
import static Classes.MainWindow.radioButton3;
import static Classes.MainWindow.radioButton4;
import static Classes.MainWindow.radioButton5;
import static Classes.MainWindow.radioButton6;
import static Classes.MainWindow.radioButton7;
import static Classes.MainWindow.radioButton8;
import static Classes.MainWindow.radioButton9;

/**
 *
 * @author ABstraktED
 */
public class Question {
    private String question;
    
    public static void question1() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("How are you feeling today?");
        questionNumberLabel.setText("1");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        
        radioButton1.setText("I'm feeling great!");
        radioButton2.setText("I'm feeling kinda down.");
        radioButton3.setText("I'm feeling official");
        radioButton4.setText("A bit of everything I suppose.");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
        
        
    }
    public static void question2() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Do you feel like dressing fancy?");
        questionNumberLabel.setText("2");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("No,not really.");
        radioButton2.setText("Yes, I do.");
        radioButton3.setText("I want to do something crazy.");
        radioButton4.setText("I don't really care.");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question3() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What is your favourite day of the week?");
        questionNumberLabel.setText("3");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(true);
        radioButton7.setEnabled(true);
        radioButton8.setEnabled(true);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Monday");
        radioButton2.setText("Tuesday");
        radioButton3.setText("Wednesday");
        radioButton4.setText("Thursday");
        radioButton5.setText("Friday");
        radioButton6.setText("Saturday");
        radioButton7.setText("Sunday");
        radioButton8.setText("All of them!");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
        
        
    }
    
    public static void question4() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What time of the day do you love the most?");
        questionNumberLabel.setText("4");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("I am kind of a early bird - morning.");
        radioButton2.setText("Noon is the best.");
        radioButton3.setText("Evening is my time of the day.");
        radioButton4.setText("I am the creature of the night.");
        radioButton5.setText("I don't care.");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question5() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Does it bothers you when it rains?");
        questionNumberLabel.setText("5");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("No, not really.");
        radioButton2.setText("Rain makes me sad.");
        radioButton3.setText("No used");
        radioButton4.setText("No used");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question6() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What age group suits you best?");
        questionNumberLabel.setText("6");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Kids.");
        radioButton2.setText("Teenagers.");
        radioButton3.setText("Students.");
        radioButton4.setText("Adults.");
        radioButton5.setText("Doesn't matter to me.");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question7() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What is your favourite drink?");
        questionNumberLabel.setText("7");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(true);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Alcohol.");
        radioButton2.setText("Tea.");
        radioButton3.setText("Coffee.");
        radioButton4.setText("Juice.");
        radioButton5.setText("All of the above.");
        radioButton6.setText("I don't care.");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question8() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Which of these words best describe you?");
        questionNumberLabel.setText("8");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Economical");
        radioButton2.setText("Good fun comes with good price.");
        radioButton3.setText("Reckless");
        radioButton4.setText("I'm all of the above. Depends on the situation");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question9() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("You feel more like watching TV or running now?");
        questionNumberLabel.setText("9");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(false);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Watching TV");
        radioButton2.setText("Running.");
        radioButton3.setText("Either one I guess.");
        radioButton4.setText("No used");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question9a() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Which of these below do you like the most?");
        questionNumberLabel.setText("9a");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(true);
        radioButton7.setEnabled(true);
        radioButton8.setEnabled(true);
        radioButton9.setEnabled(true);
        radioButton10.setEnabled(true);
        radioButton11.setEnabled(true);
        radioButton12.setEnabled(true);
        radioButton13.setEnabled(true);
        radioButton14.setEnabled(true);
        
        //setting the text
        radioButton1.setText("Dating.");
        radioButton2.setText("Shooting pool.");
        radioButton3.setText("Playing video games.");
        radioButton4.setText("Eating!");
        radioButton5.setText("Going on a play");
        radioButton6.setText("Just plain entertainment");
        radioButton7.setText("Shopping.");
        radioButton8.setText("Watching basketball.");
        radioButton9.setText("Waching soccer.");
        radioButton10.setText("Watching football.");
        radioButton11.setText("Gamble.");
        radioButton12.setText("I like smoking shisha.");
        radioButton13.setText("Watching speedway.");
        radioButton14.setText("Don't really care.");
    }
    public static void question9b() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Which of these below do you like the most?");
        questionNumberLabel.setText("9b");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(true);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Bowling.");
        radioButton2.setText("I like going to gym.");
        radioButton3.setText("Swimming.");
        radioButton4.setText("Squash.");
        radioButton5.setText("Carting.");
        radioButton6.setText("Don't really care.");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question10() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("Do you like crouded places?");
        questionNumberLabel.setText("10");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Not really.");
        radioButton2.setText("In reasonable quantities.");
        radioButton3.setText("I love them!");
        radioButton4.setText("Don't care.");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question11() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What kind of music do you listen to?");
        questionNumberLabel.setText("11");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("I love rock music.");
        radioButton2.setText("I'm into classical music.");
        radioButton3.setText("Modern music is the way to go.");
        radioButton4.setText("All music is good.");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    public static void question12() {
        /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("What about the music volume?");
        questionNumberLabel.setText("12");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("Keep it down.");
        radioButton2.setText("Perfect place between silence and noise.");
        radioButton3.setText("I like it...loud!");
        radioButton4.setText("Doesn't matter to me.");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
    
    public static void theEnd(){
         /*
        QUESTION PANEL SETUP
        */
        questionLabel.setText("The end. Check where you should go!");
        questionNumberLabel.setText("-");
        /*
        ANSWERS PANEL SETUP
        */
        //resetting
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);;
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        //enability
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        radioButton5.setEnabled(false);
        radioButton6.setEnabled(false);
        radioButton7.setEnabled(false);
        radioButton8.setEnabled(false);
        radioButton9.setEnabled(false);
        radioButton10.setEnabled(false);
        radioButton11.setEnabled(false);
        radioButton12.setEnabled(false);
        radioButton13.setEnabled(false);
        radioButton14.setEnabled(false);
        
        //setting the text
        radioButton1.setText("No used");
        radioButton2.setText("No used");
        radioButton3.setText("No used");
        radioButton4.setText("No used");
        radioButton5.setText("No used");
        radioButton6.setText("No used");
        radioButton7.setText("No used");
        radioButton8.setText("No used");
        radioButton9.setText("No used");
        radioButton10.setText("No used");
        radioButton11.setText("No used");
        radioButton12.setText("No used");
        radioButton13.setText("No used");
        radioButton14.setText("No used");
    }
}
