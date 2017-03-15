package com.codeclan.rockpaperscissors;


import android.util.Log;

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

   public String compareHands(String playerChoice) {

       String computer = computerChoice();

       if (computer == playerChoice) {
           return "It's a draw!!";
       }
       switch (playerChoice) {
           case "rock":
               if (computer == "scissors") {
                   return "Player wins!";
               } else {
                   return "Computer wins =(";
               }
//
           case "scissors":
               if (computer == "paper") {
                   return "Player wins!";
               } else {
                   return "Computer wins =( ";
               }
//
           case "paper":
               if (computer == "rock") {
                   return "Player wins!";
               } else {
                   return "Computer wins =(";
               }
//
       }
       return null;
   }

}
