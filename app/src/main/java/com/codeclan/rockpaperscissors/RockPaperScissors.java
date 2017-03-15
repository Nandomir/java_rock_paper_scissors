package com.codeclan.rockpaperscissors;


import java.util.Random;

/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissors {

   public String computerChoice(){
       String[] choices = new String[3];
       choices[0] = "rock";
       choices[1] = "paper";
       choices[2] = "scissors";

       int randomIndex = new Random().nextInt(choices.length);
       String computerChoice = choices[randomIndex];

       return computerChoice;
   }

}
