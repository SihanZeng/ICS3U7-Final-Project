/*Sihan Zeng and Patricia Carucinschi
 * January 28, 2021
 * Story
 * This class contains the images, story, and methods that the program uses to transition between scenes*/

/*import imageicon to allow image transitions*/
import javax.swing.ImageIcon;

public class Story {
	
	/*declare objects*/
	Main game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();
	Monster monster;
	
	/*create images for scene transitions*/
	ImageIcon sceneImage1 = new ImageIcon("Assets/story_pics/Scene_1.png");
	ImageIcon sceneImage2_1 = new ImageIcon("Assets/story_pics/Scene_2(FIRST_CHOICE).png");
	ImageIcon sceneImage2_2 = new ImageIcon("Assets/story_pics/Scene_2(SECOND_CHOICE).png");
	ImageIcon sceneImage3 = new ImageIcon("Assets/story_pics/Scene_3.png");
	ImageIcon sceneImage4_1 = new ImageIcon("Assets/story_pics/Scene_4(VERSION_1).png");
	ImageIcon sceneImage4_2 = new ImageIcon("Assets/story_pics/Scene_4(VERSION_2).png");
	ImageIcon sceneImage4_3 = new ImageIcon("Assets/story_pics/Scene_4(VERSION_3).png");
	ImageIcon sceneImage5_11 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_1-1).png");
	ImageIcon sceneImage5_12 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_1-2).png");
	ImageIcon sceneImage5_13 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_1-3).png");
	ImageIcon sceneImage5_21 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_2-1).png");
	ImageIcon sceneImage5_22 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_2-2).png");
	ImageIcon sceneImage5_23 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_2-3).png"); 
	ImageIcon sceneImage5_31 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_3-1).png");
	ImageIcon sceneImage5_32 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_3-2).png"); 
	ImageIcon sceneImage5_33 = new ImageIcon("Assets/story_pics/Scene_5(VERSION_3-3).png"); 
	ImageIcon sceneImage6_T2 = new ImageIcon("Assets/story_pics/Scene_6(T_VERSION_2).png");
	ImageIcon sceneImage6_111 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_1-1-1).png"); 
	ImageIcon sceneImage6_122 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_1-2-2).png"); 
	ImageIcon sceneImage6_131 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_1-3-1).png");
	ImageIcon sceneImage6_211 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_2-1-1).png"); 
	ImageIcon sceneImage6_222 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_2-2-2).png"); 
	ImageIcon sceneImage6_223 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_2-2-3).png");  
	ImageIcon sceneImage6_231 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_2-3-1).png");  
	ImageIcon sceneImage6_322 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_3-2-2).png");   
	ImageIcon sceneImage6_331 = new ImageIcon("Assets/story_pics/Scene_6(VERSION_3-3-1).png");
	ImageIcon sceneImage7_T1 = new ImageIcon("Assets/story_pics/Scene_7(T_VERSION_1).png"); 
	ImageIcon sceneImage7_1131 = new ImageIcon("Assets/story_pics/Scene_7(VERSION_1-1-3-1).png");
	ImageIcon sceneImage7_2122 = new ImageIcon("Assets/story_pics/Scene_7(VERSION_2-1-2-2).png"); 
	ImageIcon sceneImage7_2131 = new ImageIcon("Assets/story_pics/Scene_7(VERSION_2-1-3-1).png"); 
	ImageIcon sceneImage8_scientistAbductedEnding = new ImageIcon("Assets/story_pics/Scene_8(SCIENTIST_ABDUCTED_ENDING).png"); 
	ImageIcon sceneImage8_1 = new ImageIcon("Assets/story_pics/Scene_8(VERSION_1).png");
	ImageIcon sceneImage8_3 =  new ImageIcon("Assets/story_pics/Scene_8(VERSION_3).png");
	ImageIcon sceneImage8_villageBustedEnding = new ImageIcon("Assets/story_pics/Scene_8(VILLAGE_BUSTED_ENDING).png"); 
	ImageIcon sceneImage9_scientistBackstabbedEnding = new ImageIcon("Assets/story_pics/Scene_9(SCIENTIST_BACKSTABBED_ENDING).png");
	ImageIcon sceneImage9_11 = new ImageIcon("Assets/story_pics/Scene_9(VERSION_1-1).png"); 
	ImageIcon sceneImage9_21 = new ImageIcon("Assets/story_pics/Scene_9(VERSION_2-1).png"); 
	ImageIcon sceneImage9_23 = new ImageIcon("Assets/story_pics/Scene_9(VERSION_2-3).png"); 
	ImageIcon sceneImage10_scientistBackstabbedEnding =  new ImageIcon("Assets/story_pics/Scene_10(SCIENTIST_BACKSTABBED_ENDING).png");
	ImageIcon sceneImage10_scientistBrutalityEnding = new ImageIcon("Assets/story_pics/Scene_10(SCIENTIST_BRUTALITY_ENDING).png"); 
	ImageIcon sceneImage10_scientistDeceptiveEnding = new ImageIcon("Assets/story_pics/Scene_9(SCIENTIST_DECEPTIVE_ENDING).png"); 
	ImageIcon sceneImage10_scientistReportedEnding = new ImageIcon("Assets/story_pics/Scene_9(SCIENTIST_REPORTED_ENDING).png");
	ImageIcon sceneImage10_133 = new ImageIcon("Assets/story_pics/Scene_10(VERSION_1-3-3).png");
	
	public Story(Main g, UI userInterface, VisibilityManager vManager) {
		
		game = g;
		ui = userInterface;
		vm = vManager;
		
	}
	
	public void defaultSetup() {
		
		player.hp = 30;
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
		case "scene6_T2": scene6_T2(); break;
		case "scene6_choice2_2_3": scene6_choice2_2_3(); break;
		case "scene7_choice1_1_3_1": scene7_choice1_1_3_1(); break;
		case "scene7_T1": scene7_T1(); break;
		case "scene7_choice2_1_2_2": scene7_choice2_1_2_2(); break;
		case "scene7_choice1": scene7_choice1(); break;
		case "scene7_villageBusted": scene7_villageBusted(); break;
		case "scene8_choice1_1": scene8_choice1_1(); break;
		case "scene8_choice2_1": scene8_choice2_1(); break;
		case "scene8_choice1": scene8_choice1(); break;
		case "scene8_scientistAbducted": scene8_scientistAbducted(); break;
		case "scene9_villageDeceptive": scene9_villageDeceptive(); break; 
		case "scene9_villageInternalSorrow": scene9_villageInternalSorrow(); break; 
		case "scene9_villageExternalSorrow": scene9_villageExternalSorrow(); break; 
		case "scene9_choice2_2_1": scene9_choice2_2_1(); break; 
		case "scene9_scientistBackstabbed": scene9_scientistBackstabbed(); break; 
		case "scene9_choice2_3": scene9_choice2_3(); break; 
		case "scene9_choice3_3": scene9_choice3_3(); break; 
		case "scene10_scientistReported": scene10_scientistReported(); break; 
		case "scene10_scientistDeceptive": scene10_scientistDeceptive(); break; 
		case "scene10_scientistBrutality": scene10_scientistBrutality(); break; 
		case "combatScene5_32": combatScene5_32(); break;
		case "playerAttack5_32": playerAttack5_32(); break;
		case "monsterAttack5_32": monsterAttack5_32(); break;
		case "battleWon5_32": battleWon5_32(); break;
		case "combatScene6_222": combatScene6_222(); break;
		case "playerAttack6_222": playerAttack6_222(); break;
		case "monsterAttack6_222": monsterAttack6_222(); break;
		case "battleWon6_222": battleWon6_222(); break;
		case "combatScene7_2122": combatScene7_2122(); break;
		case "playerAttack7_2122": playerAttack7_2122(); break;
		case "monsterAttack7_2122": monsterAttack7_2122(); break;
		case "battleWon7_2122": battleWon7_2122(); break;
		case "gameOverFight": gameOverFight(); break;
		case "gameOverStory": gameOverStory(); break;
		case "toMenu": toMenu(); break;
		case "badEnding": badEnding(); break;
		case "goodEnding": goodEnding(); break;
		
		}
	}
	
	/*Scene 1*/
	public void scene1() {
		ui.sceneImage.setIcon(sceneImage1);
		ui.storyText.setText("Story begins with you talking to your best friend. While excitingly discussing "
				+ "your last day of school before winter break, you both see something unusual walking towards you guys."
				+ "Because it is dark out, you cannot see the figure very clearly, but you move along and continue "
				+ "talking about your day. Sooner or later, you turn around and see that your friend is suddenly missing. "
				+ "You believe that your friend took the creepy shortcut home as a joke to scare you.");
		ui.questionText.setText("What will you do next?");
		ui.choice1Button.setText("Continue walking home");
		ui.choice2Button.setText("Start walking through the creepy shortcut");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene2_choice1";
		game.nextPosition2 = "scene2_choice2";
		game.nextPosition3 = "";
	}
	
	/*Scenes 2*/
	
	public void scene2_choice1() {
		ui.sceneImage.setIcon(sceneImage2_1);
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
		ui.sceneImage.setIcon(sceneImage2_2);
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
		ui.sceneImage.setIcon(sceneImage3);
		ui.storyText.setText("It is the next day, so you decide to set out on a mission to find your best friend");
		ui.choice1Button.setText("Start researching the figure from the night before");
		ui.choice2Button.setText("Walk along the same path you went the other day");
		ui.choice3Button.setText("Call the police");
		
		game.nextPosition1 = "scene4_choice1";
		game.nextPosition2 = "scene4_choice2";
		game.nextPosition3 = "scene4_choice3";
	}
	
	/*Scenes 4*/
	
	public void scene4_choice1() {
		ui.sceneImage.setIcon(sceneImage4_1);
		ui.storyText.setText("You go on your computer and begin searching for answers. After a "
				+ "while, you land on this website that talks about aliens. It shows a picture of "
				+ "almost the exact same figure you saw the night before. You end up discovering that "
				+ "sightings of these figures are most commonly reported on the same path your friend went "
				+ "missing on.");
		ui.choice1Button.setText("Ask the school librarian to try to dig up more info");
		ui.choice2Button.setText("Go to the dollar store to purchase a weapon");
		ui.choice3Button.setText("Stay home and re-evaluate the situation");
		
		game.nextPosition1 = "scene5_choice1_1";
		game.nextPosition2 = "scene5_choice2_1";
		game.nextPosition3 = "scene5_choice3_1";
	}
	
	public void scene4_choice2() {
		ui.sceneImage.setIcon(sceneImage4_2);
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
		ui.sceneImage.setIcon(sceneImage4_3);
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
		ui.sceneImage.setIcon(sceneImage5_11);
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
		ui.sceneImage.setIcon(sceneImage5_21);
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
		ui.sceneImage.setIcon(sceneImage5_31);
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
		ui.sceneImage.setIcon(sceneImage5_12);
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
		ui.sceneImage.setIcon(sceneImage5_22);
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
		ui.sceneImage.setIcon(sceneImage5_32);
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
		ui.sceneImage.setIcon(sceneImage5_13);
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
		ui.sceneImage.setIcon(sceneImage5_23);
		ui.storyText.setText("You decide to find the village’s location yourself. The police revealed "
				+ "that it was within the area, and thus you begin your research on villages around the "
				+ "area. After some browsing, you find an address on a reddit forum about these figures.");
		ui.choice1Button.setText("Travel to the village to investigate further");
		ui.choice2Button.setText("Return to the police station");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_T2";
		game.nextPosition2 = "scene6_choice2_2_3";
		game.nextPosition3 = "";
	}
	
	public void scene5_choice3_3() {
		ui.sceneImage.setIcon(sceneImage5_33);
		ui.storyText.setText("You decide to show the police chief that you need the village’s address with "
				+ "your fists. You strike him in the face, which then gets you immediately pushed down to the "
				+ "ground with handcuffs on your wrists. Your slight anger issues have gotten in the way, and "
				+ "now there is no way back. ");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "gameOverStory";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scenes 6*/
	
	public void scene6_choice1_1_1() {
		ui.sceneImage.setIcon(sceneImage6_111);
		ui.storyText.setText("Following the librarian’s map, you decide to make your way to the village…");
		ui.choice1Button.setText("Travel to the village");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_T2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_1_1() {
		ui.sceneImage.setIcon(sceneImage6_211);
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
		ui.sceneImage.setIcon(sceneImage6_131);
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
		ui.sceneImage.setIcon(sceneImage6_231);
		ui.storyText.setText("You decide to travel to the police station and inform them about your situation…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene4_choice3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice3_3_1() {
		ui.sceneImage.setIcon(sceneImage6_331);
		ui.storyText.setText("Knowing that these figures often appear on the path, you decide to try and observe another…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene4_choice2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice1_2_2() {
		ui.sceneImage.setIcon(sceneImage6_122);
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
		game.nextPosition2 = "combatScene7_2122"; //scene7_choice2_1_2_2
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_2_2() {
		ui.sceneImage.setIcon(sceneImage6_222);
		ui.storyText.setText("After following it for a bit longer, you convince yourself that the figure does not know "
				+ "you are right behind them, but it suddenly turns around and catches you in their tracks. The figure "
				+ "immediately starts chasing you. You cannot run nor hide any longer, so the only choice you have left "
				+ "is to fight.");
		ui.choice1Button.setText("INITIATE COMBAT");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "combatScene6_222"; //scene6_choice1_2_2
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice3_2_2() {
		ui.sceneImage.setIcon(sceneImage6_322);
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
		ui.sceneImage.setIcon(sceneImage6_T2);
		ui.storyText.setText("After arriving at the village, you find that it seems to be abandoned. There are a few "
				+ "houses in the area, but nothing more with no signs of life. Suddenly, a figure appears behind you"
				+ ", as if it simply came out of thin air. You turn around in fear to see that the figure you have "
				+ "been looking for is standing right before your eyes. It has horrendous green skin with a large "
				+ "head. You stare at it for a moment until you snap back into reality. It has not seen you yet, so "
				+ "you devise a quick plan. ");
		ui.choice1Button.setText("Hide out and try to investigate where the figure");
		ui.choice2Button.setText("Follow the weird alien");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene7_choice1";
		game.nextPosition2 = "scene7_villageBusted";
		game.nextPosition3 = "";
	}
	
	public void scene6_choice2_2_3() {
		ui.sceneImage.setIcon(sceneImage6_223);
		ui.storyText.setText("After pondering your situation for some time, you come to the conclusion that you are "
				+ "unable to solve this mystery, and certainly not alone. You walk into the police station, and tell"
				+ " them everything. The police then remind you that it is too dangerous for a person to go there, "
				+ "so you just decide to stay home and move on, hoping your friend will come home safely eventually.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scenes 7*/
	
	public void scene7_choice1_1_3_1() {
		ui.sceneImage.setIcon(sceneImage7_1131);
		ui.storyText.setText("Even if Reddit is known to post false information, the address to the village has "
				+ "been the best piece of research that you have gathered so far. You decide to travel to the "
				+ "village following the address on the forum…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_T2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene7_T1() {
		ui.sceneImage.setIcon(sceneImage7_T1);
		ui.storyText.setText("Accepting the scientist’s offer, you provide them the body and they bring it to "
				+ "their lab. You travel for some time, eventually arriving at a small staircase leading to an "
				+ "underground lab. Once you enter, the scientist closes the door behind you. Looking around, you "
				+ "see mass amounts of highly sophisticated equipment in a room as large as a gym. They begin "
				+ "examining the specimen and you assist their efforts.");
		ui.choice1Button.setText("Explore the scientist’s lab after they leave");
		ui.choice2Button.setText("Continue assisting in the experiments");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene8_choice1";
		game.nextPosition2 = "scene8_scientistAbducted";
		game.nextPosition3 = "";
	}
	
	public void scene7_choice2_1_2_2() {
		ui.sceneImage.setIcon(sceneImage7_2122);
		ui.storyText.setText("You win the fight, and the scientist tells you about a village not too far that is "
				+ "the home base of these aliens. They give you the address and it appears to be all they know.");
		ui.choice1Button.setText("INITIATE COMBAT");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "combatScene7_2122"; //scene6_T2
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene7_choice1() {
		ui.sceneImage.setIcon(sceneImage7_2131);
		ui.storyText.setText("Surprisingly, the figure has still not seen you, so you run quickly into one of the "
				+ "houses, watching closely in case another alien-like figure appears through the window. Shortly "
				+ "after, another alien materializes out of thin air, and carries the body with them after talking "
				+ "into a walky-talky like device. It appears that they cannot go invisible when carrying something "
				+ "else, and you see a hole they enter before disappearing.");
		ui.choice1Button.setText("Carefully enter the hole the alien went through");
		ui.choice2Button.setText("Try to kill another alien to look for more clues");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene8_choice1_1";
		game.nextPosition2 = "scene8_choice2_1";
		game.nextPosition3 = "";
	}
	
	public void scene7_villageBusted() {
		ui.sceneImage.setIcon(sceneImage8_villageBustedEnding);
		ui.storyText.setText("Having defeated the figure, you decide to search its body for clues as to how you "
				+ "can continue your mission. You discover a flashing cube that seemed to have dropped from the "
				+ "figure after you knocked it out. Picking it up, a crowd of aliens suddenly appear all around you,"
				+ " and you get knocked unconscious. Waking up, you notice that you’re strapped in a chair in some "
				+ "dark, dungeon looking room. A figure walks towards you and says in a deep, monotonous voice “You "
				+ "are sentenced to life in prison for trespassing”. You mention your friend’s name, but to no "
				+ "avail, the figure leaves the room. You cry out as the entire mission’s objective is no longer "
				+ "possible to achieve.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scenes 8*/
	
	public void scene8_choice1_1() {
		ui.storyText.setText("You slowly make your way to the hole the alien entered. It appears to be closed, but "
				+ "you tap your foot on it and it opens. A circular platform zooms up to your level, and you stand "
				+ "on it, taking it as it zooms down. At the bottom, many aliens are pointing their guns at you "
				+ "and telling you to put your hands up.");
		ui.choice1Button.setText("Comply and explain the situation with your friend");
		ui.choice2Button.setText("Try to disarm the alien closest to you and fight back");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene9_villageDeceptive";
		game.nextPosition2 = "scene9_villageInternalSorrow";
		game.nextPosition3 = "";
	}
	
	public void scene8_choice2_1() {
		ui.sceneImage.setIcon(sceneImage8_3); //MAY NOT BE RIGHT
		ui.storyText.setText("Thinking it's too dangerous to directly follow the alien, you stay at your "
				+ "hideout and watch for another alien to appear. After a while, you decide to create a decoy "
				+ "to draw one’s attention. Finding a rock on the floor, you toss it near the hole, and immediately "
				+ "another alien appears, looking in your direction. You duck your head under the window, preparing "
				+ "for combat. As you take another peek, the alien is rushing towards your direction.");
		ui.choice1Button.setText("Investigate both bodies for clues");
		ui.choice2Button.setText("Enter the hole the other alien went through");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "combatScene8_21"; //scene9_villageExternalSorrow
		game.nextPosition2 = "scene8_choice1_1";
		game.nextPosition3 = "";
	}
	
	public void scene8_choice1() {
		ui.sceneImage.setIcon(sceneImage8_1);
		ui.storyText.setText("Curious with an array of questions, you wait for the scientist to leave the lab and "
				+ "then return to explore the place. You observe the high-tech equipment, and the 7 pages of "
				+ "notes they took about the alien. Beside the specimen, you notice an opened case that contained "
				+ "a letter. “Contract to Capture...”. Reading further, you realize that the "
				+ "scientist is trying to capture you to send to the “Extraterrestrial Activist Organization”, which "
				+ "you assume to be the aliens.");
		ui.choice1Button.setText("Confront the scientist about it");
		ui.choice2Button.setText("Ambush the scientist when they walk into the lab");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene9_villageExternalSorrow";
		game.nextPosition2 = "scene8_choice1_1";
		game.nextPosition3 = "";
	}
	
	public void scene8_scientistAbducted() {
		ui.sceneImage.setIcon(sceneImage8_scientistAbductedEnding);
		ui.storyText.setText("After spending some time looking over the corpse of the figure on the table, the "
				+ "scientist asks you if you would like to take a bathroom break. You accept the offer and they "
				+ "direct you to the small washroom that is located on the other side of the lab. Once you are in "
				+ "the bathroom, you overhear a phone conversation between the scientist and someone else you cannot "
				+ "recognize. The scientist says “We have the kid trapped in here, there’s no need to worry anymore.” "
				+ "You suddenly start panicking and try to get out, but the bathroom door is locked. You are trapped "
				+ "and caught, and there is no way out. ");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	/*Scenes 9*/
	
	public void scene9_villageDeceptive() {
		ui.storyText.setText("After mentioning your friend’s name, a figure walks out and takes off their costume. "
				+ "IT’S YOUR FRIEND. They explain that they are a group of Space Activists and are trying to get "
				+ "more government funding for space agencies. You angrily tell them about how they disappeared "
				+ "that one day and their method of completing their goal through abducting people. But they respond "
				+ "saying that their methods are working and government funding for space agencies has increased"
				+ " over the past few years because of them. ");
		ui.choice1Button.setText("YOU WIN");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "goodEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene9_villageInternalSorrow() {
		ui.storyText.setText("After defeating all the figures, you examine the bodies to make sure they’re not still"
				+ " alive. After taking off one of the costumes, you see that these aliens are actually humans "
				+ "dressed up in alien costumes. As you continue to take off the costumes of all the other dead "
				+ "bodies, you recognize a face. IT’S YOUR FRIEND. You had just killed your friend and cried out as "
				+ "the entire mission’s objective is no longer possible to achieve.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene9_villageExternalSorrow() {
		ui.storyText.setText("After dragging both bodies to your hideout, you notice that these aliens are actually "
				+ "just humans wearing alien costumes. Taking off one of the costumes, you notice a flashing cube "
				+ "strapped onto the person’s waist. You take it and inspect it, trying to understand what it is. "
				+ "After a while, you do the same to the second figure. However, as you remove the costume, the face"
				+ " seems familiar to you. IT’S YOUR FRIEND. You had just killed your friend and cried as aliens "
				+ "appeared at the house with guns pointed at you. The flashing cube seemed to be a tracker of some "
				+ "sort, and you continue weeping as the entire mission’s objective is no longer possible to achieve.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene9_choice2_2_1() {
		ui.sceneImage.setIcon(sceneImage9_21);
		ui.storyText.setText("Getting nowhere by taking out individual amounts of figures at the surface, you decide to enter the hole where the other alien went…");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene8_choice1_1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene9_scientistBackstabbed() {
		ui.sceneImage.setIcon(sceneImage9_scientistBackstabbedEnding);
		ui.storyText.setText("Once the scientist comes back, you try acting as if you had not just read that note, "
				+ "but you cannot act normal anymore. The scientist notices quickly, asking if you are okay in an "
				+ "awfully calm tone. You tell them about the note. The scientist does not react at all, which "
				+ "worries you even more. In a panicked state, you try running towards the door that would lead "
				+ "outside, knocking over equipment along the way. Once you reach the door, you notice that it is "
				+ "locked. You now realize why the scientist is so calm. They trapped you in the lab. The lab that "
				+ "is underground, and locked. There is no possible escape. You turn back to beg the scientist, but "
				+ "they are already gone with the specimen.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene9_choice2_3() {
		ui.sceneImage.setIcon(sceneImage9_23);
		ui.storyText.setText("As the door swings open, you strike the scientist in the head and they are knocked "
				+ "unconscious. You tie them to a chair, and as they wake up, you begin interrogating them about "
				+ "the letter you saw.");
		ui.choice1Button.setText("Contact the police");
		ui.choice2Button.setText("Continue the experiment yourself");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene10_scientistReported";
		game.nextPosition2 = "scene10_scientistDeceptive";
		game.nextPosition3 = "";
	}
	
	public void scene9_choice3_3() {
		ui.sceneImage.setIcon(sceneImage9_23);
		ui.storyText.setText("On high alert, you decide that by continuing to assist, you could find out more information "
				+ "about the aliens and the scientist. As the scientist enters, they walk towards the specimen and "
				+ "stare at the letter. “Did you read this?”, they ask you, while holding it up.");
		ui.choice1Button.setText("Lie and say you did not look at it properly");
		ui.choice2Button.setText("Attack them");
		ui.choice3Button.setText("Tell them the truth and question them");
		
		game.nextPosition1 = "scene10_scientistReported";
		game.nextPosition2 = "scene10_scientistBrutality";
		game.nextPosition3 = "scene9_scientistBackstabbed";
	}
	
	/*Scenes 10*/
	
	public void scene10_scientistReported() {
		ui.sceneImage.setIcon(sceneImage10_scientistReportedEnding);
		ui.storyText.setText("You try interrogating the scientist, but you realize that you are not getting the "
				+ "answers you want. The scientist is smart, twisting their words to make it seem as if they are "
				+ "saying something different. You catch on eventually, so you decide to call the police. The moment "
				+ "the police arrive at the lab, they immediately arrest the scientist. Confused, you ask them why "
				+ "the scientist was arrested instead of you. They say that the scientist is actually one of the "
				+ "aliens, and they were just trying to trap you so the aliens never got caught. They tell you that "
				+ "they are going to interrogate the scientist for answers. A few days later, the police call you, "
				+ "telling you that they got a way to communicate with the aliens through the fake scientist. You go"
				+ " to the police station and use a phone to talk to the aliens. You get incredibly happy to hear "
				+ "that your friend is actually on the other line. After talking to them for a bit, you realize that"
				+ " your friend is not allowed to say some things because they are most likely being watched, so you"
				+ " ask them where they are using your childhood language that you both made up. Your friend reveals "
				+ "everything, and the police immediately start driving to the location. You finally reunite with your friend.");
		ui.choice1Button.setText("YOU WIN");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "goodEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene10_scientistDeceptive() {
		ui.sceneImage.setIcon(sceneImage10_scientistDeceptiveEnding);
		ui.storyText.setText("You decide to examine the body yourself. As much as you look at the specimen, you "
				+ "realize that you do not have the proper knowledge to actually figure out what you are looking for."
				+ " You look over the body with wide eyes. There seems to be nothing you can do without the help of "
				+ "someone more knowledgeable in biology. You try to get the scientist to help you, but they are furious "
				+ "due to the fact that you knocked them out and tied them to a chair. After attempting to examine the "
				+ "body for some time, you decide to finally release the scientist from the chair so you can get more help. "
				+ "Unfortunately, the moment the scientist escapes, they knock you unconscious and tie you to a chair. There "
				+ "is no way to escape.");
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "badEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void scene10_scientistBrutality() {
		ui.sceneImage.setIcon(sceneImage10_scientistBrutalityEnding);
		ui.storyText.setText("");
		ui.choice1Button.setText("YOU WIN");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "goodEnding";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}

	/*combat scenes*/
	public void combatScene5_32() {
		monster = new Monster();
		ui.storyText.setText("You encountered an " + monster.name + "! \n"
				+ "Alien" + " HP: " + Monster.hp);
		ui.choice1Button.setText("Attack");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "playerAttack5_32";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void playerAttack5_32() {
		int playerDamage = (int)(Math.random() * 10 + 1);
		Monster.hp -= playerDamage;
		ui.storyText.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(Monster.hp > 0) {
			game.nextPosition1 = "monsterAttack5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "battleWon5_32";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		System.out.println(Monster.hp);
		
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
			game.nextPosition1 = "gameOverFight";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}		
		
	}
	
	public void battleWon5_32() {
		Monster.hp = 20;
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
				+ "Alien" + " HP: " + Monster.hp);
		ui.choice1Button.setText("Attack");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "playerAttack6_222";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void playerAttack6_222() {
		int playerDamage = (int)(Math.random() * 10 + 1);
		Monster.hp -= playerDamage;
		ui.storyText.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(Monster.hp > 0) {
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
			game.nextPosition1 = "gameOverFight";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}		
		
	}
	
	public void battleWon6_222() { 
		Monster.hp = 20;
		ui.storyText.setText("You've defeated the " + monster.name + "!");
		
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_choice1_2_2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void combatScene7_2122() { //scene6_T2
		monster = new Monster();
		ui.storyText.setText("You encountered an " + monster.name + "! \n"
				+ "Alien" + " HP: " + Monster.hp);
		ui.choice1Button.setText("Attack");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "playerAttack7_2122";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	
	public void playerAttack7_2122() {
		int playerDamage = (int)(Math.random() * 10 + 1);
		Monster.hp -= playerDamage;
		ui.storyText.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(Monster.hp > 0) {
			game.nextPosition1 = "monsterAttack7_2122";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "battleWon7_2122";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		
	}
	
	public void monsterAttack7_2122() {
		int monsterDamage = (int)(Math.random() * 4 + 1);
		player.hp -= monsterDamage;
		ui.hpLabel.setText("" + player.hp);
		
		ui.choice1Button.setText(">");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		if(player.hp > 0) {
			game.nextPosition1 = "combatScene7_2122";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}
		else {
			game.nextPosition1 = "gameOverFight";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
		}		
		
	}
	
	public void battleWon7_2122() { 
		Monster.hp = 20;
		ui.storyText.setText("You've defeated the " + monster.name + "!");
		
		ui.choice1Button.setText("Continue");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "scene6_T2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void gameOverFight() {
		ui.storyText.setText("You died!");
		
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
	
	public void gameOverStory() {
		ui.storyText.setText("You lose!");
		
		ui.choice1Button.setText("Return to Main Menu");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "toMenu";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void badEnding() {
		ui.storyText.setText("Bad Ending");
		
		ui.choice1Button.setText("Return to Main Menu");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "toMenu";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
	
	public void goodEnding() {
		ui.storyText.setText("Good Ending");
		
		ui.choice1Button.setText("Return to Main Menu");
		ui.choice2Button.setText("");
		ui.choice3Button.setText("");
		
		game.nextPosition1 = "toMenu";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}
}