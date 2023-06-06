package com.capgemini.DemoSpirngBoot;

import java.util.Random;

public class Rextester {
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSORS = 2;
	static final int SPOCK = 3;
	static final int LIZARD = 4;
	
	static int p1;
	static int p2; 
	static String vs[][] = new String[5][5];
	static String [] o = {"Rock", "Paper", "Scissors", "Spock", "Lizard"};

//	public static void main(String args[]) { 
//		setRules();
//		
//		do {
//			String result = play();
//
//			if( p1 != p2 ) {
//			if(result.equals("")) {
//				System.out.println(o[p2] + " " + vs[p2][p1] + " " + o[p1]);
//				System.out.println("Player 2 wins!");
//			} else {
//				System.out.println(o[p1] + " " + vs[p1][p2] + " " + o[p2]);
//				System.out.println("Player 1 wins!");
//			}
//			}
//		} while(p1 == p2);
//	}
//  
//	// Play!
//	private static String play() {
//		Random g = new Random();
//		p1 = g.nextInt(5);
//		p2 = g.nextInt(5);
//		System.out.println(o[p1] + " vs. " + o[p2] + " ...");
//		return vs[p1][p2];
//  	}
//  
//	// The rules
//	private static void setRules() {
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//			vs[i][j] = "";
//		}
//	}
//	vs[ROCK][SCISSORS] = "crushes";
//	vs[ROCK][LIZARD] = "crushes";
//	vs[PAPER][ROCK] = "covers";
//	vs[PAPER][SPOCK] = "disaproves";
//	vs[SCISSORS][PAPER] = "cuts";
//	vs[SCISSORS][LIZARD] = "decapitates";
//	vs[SPOCK][ROCK] = "vaporizes";
//	vs[SPOCK][SCISSORS] = "smashes";
//	vs[LIZARD][PAPER] = "eats";
//	vs[LIZARD][SPOCK] = "poisons";
//  }
}
