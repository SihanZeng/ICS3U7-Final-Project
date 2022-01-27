
import java.util.*;
public class Story {
	
	Main game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();
	Monster monster;
	
	public Story(Main g, UI userInterface, VisibilityManager vManager) {
		
		game = g;
		ui = userInterface;
		vm = vManager;
		
	}
	
	public void defaultSetup() {
		
		player.hp = 10;
		ui.hpLabel.setText("" + player.hp);
		
		player.knife = new Weapon();
		ui.weaponImage.setText(player.knife.name);
		
	}
	
	public void selectPosition(String nextPosition) {
		switch(nextPosition) {
		case "scene2_choice1": scene2_choice1(); break;
		case "scene2_choice2": scene2_choice2(); break;
		case "scene3": scene3(); break;
		case "scene4_choice1": scene4_choice1(); break;
		case "scene4_choice2": scene4_choice2(); break;
		case "scene4_choice3": scene4_choice3(); break;
		case "scene5_choice1_1": scene5_choice1_1(); break;
		case "scene5_choice2_1": scene5_choice2_1(); break;
		case "scene5_choice3_1": scene5_choice3_1(); break;
		case "scene5_choice1_2": scene5_choice1_2(); break;
		case "scene5_choice2_2": scene5_choice2_2(); break;
		case "scene5_choice3_2": scene5_choice3_2(); break;
		case "scene5_choice1_3": scene5_choice1_3(); break;
		case "scene5_choice2_3": scene5_choice2_3(); break;
		case "scene5_choice3_3": scene5_choice3_3(); break;
		case "scene6_choice1_1_1": scene6_choice1_1_1(); break;
		case "scene6_choice2_1_1": scene6_choice2_1_1(); break;
		case "scene6_choice1_3_1": scene6_choice1_3_1(); break;
		case "scene6_choice2_3_1": scene6_choice2_3_1(); break;
		case "scene6_choice3_3_1": scene6_choice3_3_1(); break;
		case "scene6_choice1_2_2": scene6_choice1_2_2(); break;
		case "scene6_choice2_2_2": scene6_choice2_2_2(); break;
		case "scene6_choice3_2_2": scene6_choice3_2_2(); break;
		case "scene6_Tversion2": scene6_T2(); break;
		case "scene6_choice2_2_3": scene6_choice2_2_3(); break;
		case "combatScene5_32": combatScene5_32(); break;
		case "playerAttack5_32": playerAttack5_32(); break;
		case "monsterAttack5_32": monsterAttack5_32(); break;
		case "battleWon5_32": battleWon5_32(); break;
		case "gameOver5_32": gameOver5_32(); break;
		
		
		}
	}
	
	/*Scene 1*/
	
	public void scene1() {
		ui.storyText.setText("Story begins with you talking to your best friend. While excitingly discussing "
				+ "your last day of school before winter break, you both see something unusual walking towards you guys."
				+ "Because it is dark out, you cannot see the figure very clearly, but you move along and continue "
				+ "talking about your day. Sooner or later, you turn around and see that your friend is suddenly missing. "
				+ "You believe that your friend took the creepy shortcut home as a joke to scare them.");
		ui.questionText.setText("What will you do next? ");
		ui.choice1Button.setText("Continue walking home");
		ui.choice2Button.setText("Start walking through the creepy shortcut");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene2_choice1";
		game.nextPosition2 = "scene2_choice2";
		game.nextPosition3 = "";
	}
	
	/*Scenes 2*/
	
	public void scene2_choice1() {
		ui.storyText.setText("You then carry on walking home alone, thinking it was a plain old joke that your "
				+ "friend was playing. You call your friend when you get home. You begin to worry because there is "
				+ "no response, but you decide to just wait until the next day.");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene2_choice2() {
		ui.storyText.setText("After calling for your friend multiple times, you begin to worry. You run "
				+ "towards the shortcut where you think your friend is, but nobody is there. You think that "
				+ "you arrived too late, so you just continue walking home.");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scene 3*/
	
	public void scene3() {
		ui.storyText.setText("It is the next day, so you decide to set out on a mission to find your best friend");
		ui.choice1Button.setText("Start researching the figure from the night before");
		ui.choice2Button.setText("Walk along the same path they went the other day to find clues");
		ui.choice3Button.setText("Call the police");
		
		game.nextPosition1 = "scene4_choice1";
		game.nextPosition2 = "scene4_choice2";
		game.nextPosition3 = "scene4_choice3";
	}
	
	/*Scenes 4*/
	
	public void scene4_choice1() {
		ui.storyText.setText("You go on your computer and begin searching for answers. After a "
				+ "while, you land on this website that talks about aliens. It shows a picture of "
				+ "almost the exact same figure you saw the night before. You end up discovering that "
				+ "sightings of these figures are most commonly reported on the same path your friend went "
				+ "missing on.");
		ui.choice1Button.setText("Ask the school librarian to try to dig up more information ");
		ui.choice2Button.setText("Go to the dollar store to purchase a weapon and prepare to confront the figure");
		ui.choice3Button.setText("Stay home and re-evaluate the situation");
		
		game.nextPosition1 = "scene5_choice1_1";
		game.nextPosition2 = "scene5_choice2_1";
		game.nextPosition3 = "scene5_choice3_1";
	}
	
	public void scene4_choice2() {
		ui.storyText.setText("You walk around the neighborhood, looking for some clues. Suddenly, you see "
				+ "something move quickly from one side of the street to the other. It looks just like the "
				+ "figure you saw last night.");
		ui.choice1Button.setText("Back away, fearing its a trap");
		ui.choice2Button.setText("Discreetly follow the figure");
		ui.choice3Button.setText("Yell at the figure");
		
		game.nextPosition1 = "scene5_choice1_2";
		game.nextPosition2 = "scene5_choice2_2";
		game.nextPosition3 = "scene5_choice3_2";
	}
	
	public void scene4_choice3() {
		ui.storyText.setText("You contact the police and they reveal that many people went missing last "
				+ "night. After explaining your experiences to them, they tell you about a village where "
				+ "a number of arrests were made regarding people dressing up as these figures. They show "
				+ "this village’s location on a map to you, but refuse to give you the address.");
		ui.choice1Button.setText("Return home and re-evaluate the situation");
		ui.choice2Button.setText("Do some research to find the village’s location");
		ui.choice3Button.setText("Punch the chief of police in the face");
		
		game.nextPosition1 = "scene5_choice1_3";
		game.nextPosition2 = "scene5_choice2_3";
		game.nextPosition3 = "scene5_choice3_3";
	}
	
	/*Scenes 5*/
	
	public void scene5_choice1_1() {
		ui.storyText.setText("You arrive at the library, and find the librarian. After informing them "
				+ "about your experiences, they show you a local map with a village marked on it. They "
				+ "proceed to tell you about their theory of these aliens being a group of space activists "
				+ "disguising themselves as aliens to prompt the government to increase funding for space organizations.");
		ui.choice1Button.setText("Travel to the village to investigate the librarian’s theory");
		ui.choice2Button.setText("Return home to do some more research");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_choice1_1_1";
		game.nextPosition2 = "scene6_choice2_1_1";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice2_1() {
		ui.storyText.setText("You arrive at Dollarama, and immediately purchase a party set of "
				+ "plastic forks, spoons, and knives. Your plan is to only keep the knives on you. "
				+ "On your way back, you spot the figure from the corner of your eye…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene4_choice2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice3_1() {
		ui.storyText.setText("You arrive back home safely, and take some time to think about your "
				+ "next course of action. You fear that it may be too risky to immediately jump into "
				+ "solving this mystery without getting more research beforehand. Still determined to "
				+ "find out the cause of your friend’s disappearance, you divise three possible plans "
				+ "to execute in hopes of doing just that.");
		ui.choice1Button.setText("Do some more research to dig up more information");
		ui.choice2Button.setText("Contact the police about the matter");
		ui.choice3Button.setText("Try to observe a figure on the path");
		
		game.nextPosition1 = "scene6_choice1_3_1";
		game.nextPosition2 = "scene6_choice2_3_1";
		game.nextPosition3 = "scene6_choice3_3_1";
	}
	
	public void scene5_choice1_2() {
		ui.storyText.setText("After witnessing the figure more closely, you decide that it isn’t worth "
				+ "the risk to continue your pursuit. Thus, you safely return home...");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene5_choice3_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice2_2() {
		ui.storyText.setText("You decide to follow the figure, hopefully catching it off guard somewhere in "
				+ "a place where it might be more vulnerable to attack. ");
		ui.choice1Button.setText("Ambush the figure from behind");
		ui.choice2Button.setText("Continue discretely following the figure");
		ui.choice3Button.setText("Slowly back away and return home");
		
		game.nextPosition1 = "scene6_choice1_2_2";
		game.nextPosition2 = "scene6_choice2_2_2";
		game.nextPosition3 = "scene6_choice3_2_2";
	}
	
	public void scene5_choice3_2() {
		ui.storyText.setText("You yell out to the figure, knowing the possible consequences it may cause. "
				+ "You do not care anymore though, the fear you have for your friend has quickly transformed "
				+ "into anger. It immediately hears you and turns around, aggressively running towards you.");
		ui.choice1Button.setText("INITIATE COMBAT");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "combatScene5_32";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice1_3() {
		ui.storyText.setText("After being denied crucial information to your investigation, you decide to"
				+ " return home and rethink your plan going forward.");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene5_choice3_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice2_3() {
		ui.storyText.setText("You decide to find the village’s location yourself. The police revealed "
				+ "that it was within the area, and thus you begin your research on villages around the "
				+ "area. After some browsing, you find an address on a reddit forum about these figures.");
		ui.choice1Button.setText("Travel to the village to investigate further");
		ui.choice2Button.setText("Return to the police station to tell them that you have the address");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_Tversion2";
		game.nextPosition2 = "scene6_scene2_2_3";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice3_3() {
		ui.storyText.setText("You decide to show the police chief that you need the village’s address with "
				+ "your fists. You strike him in the face, which then gets you immediately pushed down to the "
				+ "ground with handcuffs on your wrists. Your slight anger issues have gotten in the way, and "
				+ "now there is no way back. ");
		ui.choice1Button.setText("GAME OVER");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "gameOver";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scenes 6*/
	
	public void scene6_choice1_1_1() {
		ui.storyText.setText("Following the librarian’s map, you decide to make your way to the village…");
		ui.choice1Button.setText("Travel to the village");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_T2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_1_1() {
		ui.storyText.setText("With the knowledge that these aliens might have a base, you decide to go home to "
				+ "re-evaluate the situation.");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene5_choice3_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice1_3_1() {
		ui.storyText.setText("Remembering how you were able to dig up such crucial information in your previous "
				+ "research session, you try to find out some more. After browsing for some time, you discover a "
				+ "reddit forum talking about how there exists a village that is supposedly infested with them.");
		ui.choice1Button.setText("Travel to the village");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene7_choice1_1_3_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_3_1() {
		ui.storyText.setText("You decide to travel to the police station and inform them about your situation…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene4_choice3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice3_3_1() {
		ui.storyText.setText("Knowing that these figures often appear on the path, you decide to try and observe another…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene4_choice2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice1_2_2() {
		ui.storyText.setText("You jump towards the figure and hit it. With one final blow, you knock the figure "
				+ "completely unconscious. Looking down over the unconscious body, you are proud of yourself, seeing "
				+ "that you have actually won. You slowly begin walking back home, dragging the heavy body behind you. "
				+ "After walking for what feels like a lifetime, you finally see your house, but a scientist is at "
				+ "your doorsteps. They introduce themselves, and inform you about their interest in the body you are "
				+ "carrying.");
		ui.choice1Button.setText("Provide them the body and research it together");
		ui.choice2Button.setText("Attack the figure so you can interrogate them to find out about these aliens yourself");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene7_T1";
		game.nextPosition2 = "scene7_choice2_1_2_2";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_2_2() {
		ui.storyText.setText("After following it for a bit longer, you convince yourself that the figure does not know "
				+ "you are right behind them, but it suddenly turns around and catches you in their tracks. The figure "
				+ "immediately starts chasing you. You cannot run nor hide any longer, so the only choice you have left "
				+ "is to fight.");
		ui.choice1Button.setText("INITIATE COMBAT");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "combatScene6_222";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice3_2_2() {
		ui.storyText.setText("Deciding that it isn’t worth the risk to continue your pursuit, you safely arrive "
				+ "home to rethink the situation…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene5_choice3_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_T2() {
		ui.storyText.setText("Accepting the scientist’s offer, you provide them the body and they bring it to their "
				+ "lab. You travel for some time, eventually arriving at a small staircase leading to an underground "
				+ "lab. Once you enter, the scientist closes the door behind you. Looking around, you see mass amounts"
				+ " of highly sophisticated equipment in a room as large as a gym. They begin examining the specimen and "
				+ "you assist their efforts.");
		ui.choice1Button.setText("Explore the scientist’s lab after they leave");
		ui.choice2Button.setText("Continue assisting in the experiments");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene7_choice1";
		game.nextPosition2 = "scene7_choice2";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_2_3() {
		ui.storyText.setText("After pondering your situation for some time, you come to the conclusion that you are "
				+ "unable to solve this mystery, and certainly not alone. You walk into the police station, and tell"
				+ " them everything. The police then remind you that it is too dangerous for a person to go there, "
				+ "so you just decide to stay home and move on, hoping your friend will come home safely eventually.");
		ui.choice1Button.setText("GAME OVER");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "gameOver";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*combat scenes*/
	public void combatScene5_32() {
		monster = new Monster();
		ui.storyText.setText("You encountered an " + monster.name + "! \n"
				+ monster.name + " HP: " + monster.hp);
		ui.choice1Button.setText("Attack");
		ui.choice2Button.setText("Flee");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "playerAttack5_32";
		game.nextPosition2 = "crossRoad5_32";
		
	}
	
	public void playerAttack5_32() {
		int playerDamage = (int)(Math.random() * 10 + 1);
		monster.hp -= playerDamage;
		ui.storyText.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(monster.hp > 0) {
			game.nextPosition1 = "monsterAttack5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "battleWon5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		System.out.println(monster.hp);
		
	}
	
	public void monsterAttack5_32() {
		int monsterDamage = (int)(Math.random() * 4 + 1);
		player.hp -= monsterDamage;
		ui.hpLabel.setText("" + player.hp);
		
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(player.hp > 0) {
			game.nextPosition1 = "combatScene5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "gameOver5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}		
		
	}
	
	public void battleWon5_32() {
		ui.storyText.setText("You've defeated the " + monster.name + "!");
		
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_choice1_2_2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void combatScene6_222() {
		monster = new Monster();
		ui.storyText.setText("You encountered an " + monster.name + "! \n"
				+ monster.name + " HP: " + monster.hp);
		ui.choice1Button.setText("Attack");
		ui.choice2Button.setText("Flee");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "playerAttack6_222";
		game.nextPosition2 = "crossRoad6_222";
		
	}
	
	public void playerAttack6_222() {
		int playerDamage = (int)(Math.random() * 10 + 1);
		ui.storyText.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(monster.hp > 0) {
			game.nextPosition1 = "monsterAttack6_222";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "battleWon6_222";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		
	}
	
	public void monsterAttack6_222() {
		int monsterDamage = (int)(Math.random() * 4 + 1);
		player.hp -= monsterDamage;
		ui.hpLabel.setText("" + player.hp);
		
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(player.hp > 0) {
			game.nextPosition1 = "combatScene6_222";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "gameOver6_222";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}		
		
	}
	
	public void battleWon6_222() {
		ui.storyText.setText("You've defeated the " + monster.name + "!");
		
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_choice1_2_2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void gameOver5_32() {
		ui.storyText.setText("You died on Scene 5-32!");
		
		ui.choice1Button.setText("Return to Main Menu");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "toMenu";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void toMenu() {
		defaultSetup();
		vm.displayMenu();
	}
	
	
}
