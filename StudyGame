%File Name: Fun Math Games and Colourful English Games
%Author: Sophie
%Date: May 30th, 2017
%Description: This program is a learning game featuring different units
%in areas of math and English for Elementary level students. It has an animated
% graphical introduction (quizzes showing instructions), a menu of choice for
%both English and math, 3 graphical questions for each option the user has
%chosen with appropriate rewards and oral instructions given in order to provide
%convenience throughout the game. The identities of all users will be incorporated
%into the game as the computer get to branch the game with names, personalities,
%interests and styles of learning. Math questions are designed based on levels
%of Grade 1 to Grade 3 and are separated in forms of schooling units and level
%of hardness, for example, the 3 questions focus on areas of addition,
%subtraction, multiplication and division and are classified as "simple",
%"medium" and "hard". English games are mainly suitable for English Language
%Learners in Elementary school; therefore, it focuses on simple sentences
%structure. The entire program is full of colorful pictures and animations in
%order to attract the attention of Elementary students.

setscreen ("graphics: 1240:680")

var choice1 : string := "FUN MATH" % declare variables for the main menu
var commonterm : string := "GAMES"
var choice2 : string := "ENGLISH "
var greeting : string := "Welcome to the world of food!"
var encouragement : string := "Try your best!"
var instruction : string := "Choose one to begin! ><"


var fontId1 : int := Font.New ("elephant:25:Bold") %font variables
var fontId2 : int := Font.New ("forte:30:Bold")
var fontId3 : int := Font.New ("rockwell:20:Bold")
var fontId4 : int := Font.New ("agencyfb:16:Bold")
var fontId5 : int := Font.New ("agencyfb:10:Bold")
var pic3 : int := Pic.FileNew ("mathpic2.jpg")
var pic4 : int := Pic.FileNew ("Nobita1.jpg")
var pic1 : int := Pic.FileNew ("pink candy.jpg") % picture variables
var pic2 : int := Pic.FileNew ("candy2.jpg")
var x, y, button : int %mouse click variables
var x2, y2, button2 : int


var mathchoice1 : string := "Addition " % math choice variables
var mathchoice2 : string := "Subtraction "
var mathchoice3 : string := "Multiplication "
var stage : int := 1 %a stage variable to separate loops into different stages

var mathintro1 : string := "Hello! My friend!" %Math game introduction variables
var mathintro2 : string := "Follow me to meet "
var mathintro3 : string := " your best friend Nobita."
var mathintro4 : string := "He needs your help "
var mathintro5 : string := "in the food world."
var mathintro6 : string := "Please choose a "
var mathintro7 : string := "unit to begin!"

var pic31 : int := Pic.FileNew ("instructions.jpg")
var pic32 : int := Pic.FileNew ("blue dorm.jpg")
var pic33 : int := Pic.FileNew ("arrow.jpg")
var pic7 : int := Pic.FileNew ("talkingbubble.jpg")
var maininstruction1 : string := "It's instruction time!"
var maininstruction2 : string := "You get 3 chances to get the correct "
var maininstruction3 : string := "answers!"
var maininstruction4 : string := "Enter your name first and "
var maininstruction5 : string := "type in the correct answer! Press"
var maininstruction6 : string := "the return key at the end to start"
var maininstruction7 : string := "  a new game!"


var pic6 : int := Pic.FileNew ("Nobitamath1.jpg") % math level1 pictures
var pic8 : int := Pic.FileNew ("DoraemonMath.jpg")
var level1intro1 : string := "Hi! I'm Nobita and I need your help "
var level1intro2 : string := "with math problems!"
var level1intro3 : string := "Please tell me your name and "
var level1intro4 : string := " click start!"
var start : string := "START"
var fontId6 : int := Font.New ("agencyfb:20:Bold")
var name1 : string
var pic9 : int := Pic.FileNew ("nobita level1.jpg")
var pic10 : int := Pic.FileNew ("thinkingbubble.jpg")
var pic11 : int := Pic.FileNew ("math candy1.jpg")
var pic12 : int := Pic.FileNew ("math candy1.jpg")
var pic13 : int := Pic.FileNew ("thinkingdoraemon1.jpg")


var fontId7 : int := Font.New ("garamond:15:Bold") %Math Level 1 questions
var fontId8 : int := Font.New ("garamond:15")
var gameInstruct1 : string := "I had three candies this morning."
var gameInstruct2 : string := "During lunch time, my teacher gave "
var gameInstruct3 : string := "me 2 more candies."
var gameInstruct4 : string := "How many candies do I have "
var gameInstruct5 : string := " after lunch?"
var gameWelcome1 : string := "Welcome! "
var chance2 : string := "2"
var chance1 : string := "1"
var chance3 : string := "3"
var gameWelcome2 : string := "You have "
var gameWelcome3 : string := "chances. "

var wrongAnswer : string := "Try again!"
var answer1 : int

var pic14 : int := Pic.FileNew ("firstplace.jpg") %images and fonts
var pic15 : int := Pic.FileNew ("Success1.jpg")
var fontId9 : int := Font.New ("garamond:14:bold")
var pic16 : int := Pic.FileNew ("2ndplace.jpg")
var pic17 : int := Pic.FileNew ("Success3.jpg")
var pic18 : int := Pic.FileNew ("3rdplace.jpg")
var pic19 : int := Pic.FileNew ("failure1.jpg")

var ranking1 : string := "Congraduation!"       %%award page variables
var ranking111 : string := "You saved Nobita!"
var ranking11 : string := ", you rank 1st!"
var ranking22 : string := ", you rank 2nd!"
var ranking33 : string := ", you rank 3rd!"
var ranking4 : string := "Sorry"
var ranking44 : string := ", you didn't save "
var ranking444 : string := "Nobita!"

var pic20 : int := Pic.FileNew ("suneo.jpg")
var pic21 : int := Pic.FileNew ("mom.jpg")
var pic22 : int := Pic.FileNew ("doraemon2.jpg")
var pic23 : int := Pic.FileNew ("1st fireworks.jpg")
var pic24 : int := Pic.FileNew ("flying doraemon.jpg")
var pic25 : int := Pic.FileNew ("firework2.jpg")
var pic26 : int := Pic.FileNew ("2nd2.jpg")
var pic28 : int := Pic.FileNew ("3rdplace2.jpg")
var pic29 : int := Pic.FileNew ("winning.jpg")
var pic30 : int := Pic.FileNew ("hug.jpg")

var answer2 : int
var game2Instruct1 : string := "I had 3 apples this morning."
var game2Instruct2 : string := "During lunch time, I ate 1 apple "
var game2Instruct3 : string := "and gave Suneo 1."
var game2Instruct4 : string := "After school, my mom bought "
var game2Instruct5 : string := "2 more apples for me."
var game2Instruct6 : string := "How many apples do I have now? "
var level2intro1 : string := "with hard math problems!"

var Englishchoice : string := "Verbs"
var engintro1 : string := "Hello! My friend!"
var engintro2 : string := "Follow me to meet "
var engintro3 : string := " your best friend Nobita."
var engintro4 : string := "He needs your help "
var engintro5 : string := "in the food world."
var engintro6 : string := "Please begin! "
var engintro7 : string := "Are you ready?!"
var pic34 : int := Pic.FileNew ("waving.jpg")

var pic35 : int := Pic.FileNew ("crying.jpg")

var pic36 : int := Pic.FileNew ("sure.jpg")
var pic37 : int := Pic.FileNew ("smiling.jpg")

var engstart1 : string := "I need help with verbs!"
var engstart2 : string := "Do you want to help me?"
var engstart3 : string := "Please enter your name!"

var verbgame1 : string := "Doraemon is ______ at us."
var verbchoice1 : string := "smiled"
var verbchoice2 : string := "smiling"
var verbchoice3 : string := "smiles"

var pic38 : int := Pic.FileNew ("dancing.jpg")
var verbgame2 : string := "Doraemon  ______ to school yesterday."
var verbchoice4 : string := "went"
var verbchoice5 : string := "goes"
var verbchoice6 : string := "go"
var verbgame3 : string := "See! We can ______ in sky."
var verbchoice7 : string := "fly"
var verbchoice8 : string := "flying"
var verbchoice9 : string := "flied"


var fontId17 : int := Font.New ("agencyfb:25:Bold")
var fontId18 : int := Font.New ("agencyfb:15:Bold")
var fontId19 : int := Font.New ("agencyfb:19:Bold")
var wrongans1 : string := "Try again!"

var rightans1 : string := "Great!"
var rightans2 : string := "You saved Nobita"

var addpic1 : int := Pic.FileNew ("candy math1.jpg") %math addition game variables
var addpic2 : int := Pic.FileNew ("addsign.jpg")
var addpic3 : int := Pic.FileNew ("equalsign.jpg")
var addpic4 : int := Pic.FileNew ("questionmarks.jpg")
var addpic5 : int := Pic.FileNew ("food.jpg")
var addpic6 : int := Pic.FileNew ("3.jpg")
var addpic7 : int := Pic.FileNew ("4.jpg")
var addpic8 : int := Pic.FileNew ("5.jpg")

var addpic9 : int := Pic.FileNew ("lollipops.jpg")
var addpic10 : int := Pic.FileNew ("lollipopss.jpg")
var addpic11 : int := Pic.FileNew ("8.jpg")
var addattempt : int := 0

var tries1 : string := " You retried "
var tries2 : string := " times!"

var subtract1 : int := Pic.FileNew ("subtract.jpg")
var subtract2 : int := Pic.FileNew ("0.jpg")
var subtract3 : int := Pic.FileNew ("2.jpg")
var y_tmp : int := 0
var button_tmp : int := 0
var multi1 : int := Pic.FileNew ("multiplication.jpg")

var multi2 : int := Pic.FileNew ("fries.jpg")
var multi3 : int := Pic.FileNew ("chips2.jpg")
var multi4 : int := Pic.FileNew ("certifcate.jpg")
var multiplication : string := "Multiplication Game Winner"
var verbsss:string:="Verb Game Winner"

colourback (84) % The main starting menu
cls

Font.Draw (choice1, 25, 150, fontId1, 52) %Main choices on the main menu
Font.Draw (choice2, 410, 150, fontId1, 52)
Font.Draw (commonterm, 50, 100, fontId1, 52)
Font.Draw (commonterm, 435, 100, fontId1, 52)
Font.Draw (greeting, 65, 250, fontId2, 57)

pic1 := Pic.Scale (pic1, 100, 100) % Decoration Pictures
Pic.Draw (pic1, 100, 300, picMerge)
pic2 := Pic.Scale (pic2, 100, 100)
Pic.Draw (pic2, 510, 5, picMerge)

drawbox (610, 185, 400, 90, black) %Boxes around the choices
drawbox (10, 185, 250, 90, black)


loop

    colourback (84)

    if stage = 1 then % instruction animation
	Font.Draw (encouragement, 200, 50, fontId3, 54)
	delay (100)
	Font.Draw (encouragement, 200, 50, fontId3, 84)
	delay (100)

	Font.Draw (instruction, 210, 192, fontId3, 54)
	delay (100)
	Font.Draw (instruction, 210, 192, fontId3, 84)
	delay (100)
    end if

    Mouse.Where (x, y, button) %mouth click for user to choice between English Game and Math Game


    if x >= 10 and x <= 250 and y >= 90 and y <= 185 and button = 1 then %enters the math game
	cls
	colourback (white)
	cls

	Font.Draw (mathchoice1, 270, 310, fontId4, 38) %levels for math games
	Font.Draw (mathchoice2, 270, 200, fontId4, 38)
	Font.Draw (mathchoice3, 263, 90, fontId4, 38)

	drawbox (255, 350, 395, 290, 38) %boxes around the level choices
	drawbox (255, 240, 395, 180, 38)
	drawbox (255, 130, 395, 70, 38)

	pic3 := Pic.Scale (pic3, 250, 380) %pictures on the math menu
	Pic.Draw (pic3, 1, 10, picCopy)
	pic4 := Pic.Scale (pic4, 288, 320)
	Pic.Draw (pic4, 400, 0, picMerge)

	Font.Draw (mathintro1, 60, 300, fontId5, 38) %Math Game introduction
	Font.Draw (mathintro2, 55, 280, fontId5, 38)
	Font.Draw (mathintro3, 43, 260, fontId5, 38)
	Font.Draw (mathintro4, 52, 240, fontId5, 38)
	Font.Draw (mathintro5, 52, 220, fontId5, 38)
	Font.Draw (mathintro6, 52, 180, fontId5, 38)
	Font.Draw (mathintro7, 60, 160, fontId5, 38)


	loop %mouth click for user to choose between levels of the math game
	    Mouse.Where (x, y, button)

	    if x >= 255 and x <= 395 and y <= 350 and y >= 290 and button = 1 then % enter the addition Game
		cls
		pic31 := Pic.Scale (pic31, 200, 300)
		Pic.Draw (pic31, 1, 10, picMerge)

		pic7 := Pic.Scale (pic7, 370, 200)
		Pic.Draw (pic7, 160, 200, picMerge)

		pic32 := Pic.Scale (pic32, 200, 250)
		Pic.Draw (pic32, 270, 1, picUnderMerge)

		pic33 := Pic.Scale (pic33, 100, 120)
		Pic.Draw (pic33, 520, 1, picMerge)
		delay (1200)
		Font.Draw (maininstruction1, 250, 360, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction2, 200, 340, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction3, 190, 320, fontId7, 38)
		Font.Draw (maininstruction4, 267, 320, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction5, 210, 300, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction6, 210, 280, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction7, 250, 260, fontId7, 38)
		delay (1200)


		loop
		    Mouse.Where (x, y, button)
		    if x >= 500 and x <= 620 and y >= 0 and y <= 620 and button = 1 then
			cls
			pic6 := Pic.Scale (pic6, 170, 380) % rearrange the size of pictures
			Pic.Draw (pic6, 1, 1, picMerge) % place the pictures

			pic7 := Pic.Scale (pic7, 270, 150)
			Pic.Draw (pic7, 190, 230, picMerge)

			pic8 := Pic.Scale (pic8, 300, 270)
			Pic.Draw (pic8, 390, 10, picMerge)

			drawfillbox (240, 130, 400, 70, 101) % Start box
			Font.Draw (start, 270, 90, fontId6, 38)

			drawfillbox (590, 340, 470, 290, 101) % box for username

			Font.Draw (level1intro1, 220, 330, fontId5, 78) %math Level 1 introduction
			Font.Draw (level1intro2, 220, 310, fontId5, 78)
			Font.Draw (level1intro3, 223, 290, fontId5, 78)
			Font.Draw (level1intro4, 277, 272, fontId5, 78)

			locate (6, 62)                          %locate an input
			colourback (101)
			get name1 : *                       %prompt and get username

			loop
			    Mouse.Where (x, y, button)      %after the start button is clicked
			    if x >= 240 and x <= 400 and y >= 70 and y <= 130 and button = 1 then
				cls
				delay (1000)
				colourback (0)              %clear the whole screen
				cls

				addpic1 := Pic.Scale (addpic1, 100, 100) %display the 1st addition question
				Pic.Draw (addpic1, 10, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 110, 150, picMerge)

				addpic2 := Pic.Scale (addpic2, 80, 100)
				Pic.Draw (addpic2, 210, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 290, 150, picMerge)
				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 390, 150, picMerge)

				addpic3 := Pic.Scale (addpic3, 90, 170)
				Pic.Draw (addpic3, 470, 120, picMerge)

				addpic5 := Pic.Scale (addpic5, 130, 170)
				Pic.Draw (addpic5, 100, 250, picMerge)

				addpic4 := Pic.Scale (addpic4, 80, 150)
				Pic.Draw (addpic4, 540, 140, picMerge)

				drawbox (40, 20, 170, 100, 38) %give choices for the question
				drawbox (200, 20, 330, 100, 38)
				drawbox (360, 20, 490, 100, 38)

				addpic6 := Pic.Scale (addpic6, 80, 100)
				Pic.Draw (addpic6, 70, 10, picMerge)
				addpic7 := Pic.Scale (addpic7, 80, 100)
				Pic.Draw (addpic7, 230, 10, picMerge)
				addpic8 := Pic.Scale (addpic8, 80, 100)
				Pic.Draw (addpic8, 380, 10, picMerge)



				loop
				    Mouse.Where (x, y, button)

				    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first box is clicked
					addattempt := addattempt + 1

					pic7 := Pic.Scale (pic7, 200, 100) %another chance to try again
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)
				    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then %if the second box is clicked

					pic7 := Pic.Scale (pic7, 200, 100) % get the right answer
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)
					Font.Draw (rightans1, 280, 357, fontId18, 101)
					Font.Draw (rightans2, 260, 337, fontId18, 101)

					delay (1000)

					pic33 := Pic.Scale (pic33, 100, 120) % arrow to next question
					Pic.Draw (pic33, 450, 270, picMerge)
					loop
					    Mouse.Where (x, y, button) %if the arrow is clicked
					    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
						cls
						delay (1000)
						addpic9 := Pic.Scale (addpic9, 100, 100) %enters the 2nd addition question
						Pic.Draw (addpic9, 10, 150, picMerge)

						addpic10 := Pic.Scale (addpic10, 100, 100) %display the question
						Pic.Draw (addpic10, 110, 150, picMerge)

						addpic2 := Pic.Scale (addpic2, 80, 100)
						Pic.Draw (addpic2, 210, 150, picMerge)

						addpic3 := Pic.Scale (addpic3, 90, 170)
						Pic.Draw (addpic3, 470, 120, picMerge)

						addpic5 := Pic.Scale (addpic5, 130, 170)
						Pic.Draw (addpic5, 100, 250, picMerge)

						addpic4 := Pic.Scale (addpic4, 80, 150)
						Pic.Draw (addpic4, 540, 140, picMerge)

						addpic9 := Pic.Scale (addpic9, 100, 100)
						Pic.Draw (addpic9, 290, 150, picMerge)
						addpic10 := Pic.Scale (addpic10, 100, 100)
						Pic.Draw (addpic10, 390, 150, picMerge)

						drawbox (40, 20, 170, 100, 38) %give out choices
						drawbox (200, 20, 330, 100, 38)
						drawbox (360, 20, 490, 100, 38)

						addpic11 := Pic.Scale (addpic11, 130, 120)
						Pic.Draw (addpic11, 50, 1, picMerge)
						addpic7 := Pic.Scale (addpic7, 80, 100)
						Pic.Draw (addpic7, 230, 10, picMerge)
						addpic8 := Pic.Scale (addpic8, 80, 100)
						Pic.Draw (addpic8, 380, 10, picMerge)
						loop
						    Mouse.Where (x, y, button)
						    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first answer is clicked

							pic7 := Pic.Scale (pic7, 200, 100) %right answer page
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)
							Font.Draw (rightans1, 280, 357, fontId18, 101)
							Font.Draw (rightans2, 260, 337, fontId18, 101)

							delay (1000)

							pic33 := Pic.Scale (pic33, 100, 120) %arrow leads to the final question
							Pic.Draw (pic33, 450, 270, picMerge)
							loop
							    Mouse.Where (x, y, button)
							    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then %enters the final question
								cls
								delay (1000)


								pic9 := Pic.Scale (pic9, 200, 200) %pictures
								Pic.Draw (pic9, 1, 1, picMerge)

								pic10 := Pic.Scale (pic10, 400, 230)
								Pic.Draw (pic10, 40, 180, picMerge)

								pic3 := Pic.Scale (pic3, 270, 240)
								Pic.Draw (pic3, 220, 1, picMerge)

								pic13 := Pic.Scale (pic13, 170, 300)
								Pic.Draw (pic13, 470, 1, picMerge)

								drawfillbox (500, 330, 600, 280, 101) %answer box

								pic11 := Pic.Scale (pic11, 50, 70)
								Pic.Draw (pic11, 170, 157, picMerge)
								pic11 := Pic.Scale (pic11, 50, 70)
								Pic.Draw (pic11, 230, 157, picMerge)

								Font.Draw (gameInstruct1, 103, 350, fontId7, 78) %game instructions
								delay (1000)
								Font.Draw (gameInstruct2, 101, 330, fontId7, 78)
								delay (1000)
								Font.Draw (gameInstruct3, 101, 310, fontId7, 78)
								delay (1000)
								Font.Draw (gameInstruct4, 101, 280, fontId7, 78)
								delay (1000)
								Font.Draw (gameInstruct5, 190, 260, fontId7, 78)

								delay (2000)

								pic11 := Pic.Scale (pic11, 50, 70) %pictures giving hints

								Pic.Draw (pic11, 290, 157, picMerge)

								delay (2000)
								pic11 := Pic.Scale (pic11, 50, 70)
								Pic.Draw (pic11, 350, 157, picMerge)

								delay (1000)
								Font.Draw (gameWelcome1, 270, 140, fontId8, 38)
								delay (1000)
								Font.Draw (gameWelcome2, 270, 120, fontId8, 38)
								Font.Draw (chance3, 345, 120, fontId8, 38)
								Font.Draw (gameWelcome3, 360, 120, fontId8, 38)

								colourback (101) %prompt and get answer for final addition math game
								locate (6, 67)
								get answer1


								if answer1 = 4 then %the user gets the correct answer for the first time in the final addition question

								    cls
								    colourback (0)
								    cls


								    pic14 := Pic.Scale (pic14, 270, 230) %he/she is placed first in that current level.
								    Pic.Draw (pic14, 200, 90, picMerge)

								    pic3 := Pic.Scale (pic3, 260, 320)
								    Pic.Draw (pic3, 390, 40, picMerge)

								    pic15 := Pic.Scale (pic15, 283, 300)
								    Pic.Draw (pic15, 1, 70, picMerge)

								    Font.Draw (ranking1, 450, 290, fontId9, 78)
								    Font.Draw (name1, 444, 250, fontId9, 78)
								    Font.Draw (ranking11, 464, 250, fontId9, 78)
								    Font.Draw (ranking111, 437, 210, fontId9, 78)

								else
								    addattempt := addattempt + 1
								    Font.Draw (gameWelcome2, 270, 120, fontId8, 38)
								    drawfillbox (345, 135, 355, 115, 91)
								    Font.Draw (chance2, 345, 120, fontId8, 38)
								    Font.Draw (gameWelcome3, 360, 120, fontId8, 38)
								    Font.Draw (wrongAnswer, 270, 100, fontId8, 38) %the user did not get the correct answer for the first time
								    colourback (101)
								    locate (6, 67)
								    get answer1

								    if answer1 = 4 then %the user gets the correct answer for the second time
									cls
									colourback (0)
									cls

									pic16 := Pic.Scale (pic16, 270, 300) %he/she is placed second in that current level.
									Pic.Draw (pic16, 200, 90, picMerge)

									pic3 := Pic.Scale (pic3, 260, 320)
									Pic.Draw (pic3, 390, 40, picMerge)

									pic17 := Pic.Scale (pic17, 270, 300)
									Pic.Draw (pic17, 7, 50, picMerge)


									Font.Draw (ranking1, 450, 290, fontId9, 78)
									Font.Draw (name1, 444, 250, fontId9, 78)
									Font.Draw (ranking22, 464, 250, fontId9, 78)
									Font.Draw (ranking111, 437, 210, fontId9, 78)

								    else
									addattempt := addattempt + 1
									Font.Draw (gameWelcome2, 270, 120, fontId8, 38)
									drawfillbox (345, 135, 355, 115, 91)
									Font.Draw (chance1, 345, 120, fontId8, 38)
									Font.Draw (gameWelcome3, 360, 120, fontId8, 38)
									Font.Draw (wrongAnswer, 270, 100, fontId8, 38)
									colourback (101)
									locate (6, 67)
									get answer1

									if answer1 = 4 then %the user gets the correct answer for the third time

									    cls
									    colourback (0)
									    cls
									    addattempt := addattempt + 1
									    pic18 := Pic.Scale (pic18, 170, 230) %he/she is placed third in that current level.
									    Pic.Draw (pic18, 240, 90, picMerge)


									    pic3 := Pic.Scale (pic3, 260, 320)
									    Pic.Draw (pic3, 390, 40, picMerge)

									    pic17 := Pic.Scale (pic17, 250, 300)
									    Pic.Draw (pic17, 1, 50, picMerge)

									    Font.Draw (ranking1, 450, 290, fontId9, 78)
									    Font.Draw (name1, 444, 250, fontId9, 78)
									    Font.Draw (ranking33, 464, 250, fontId9, 78)
									    Font.Draw (ranking111, 437, 210, fontId9, 78)

									else %%the user does not get the correct answer after 3 tries
									    cls
									    colourback (0)
									    cls
									    addattempt := addattempt + 1



									    pic3 := Pic.Scale (pic3, 260, 340) % she/he did not successfully save Nobita
									    Pic.Draw (pic3, 390, 40, picMerge)

									    pic19 := Pic.Scale (pic19, 310, 400)
									    Pic.Draw (pic19, 1, 1, picMerge)

									    Font.Draw (ranking4, 490, 290, fontId9, 78)
									    Font.Draw (name1, 444, 270, fontId9, 78)
									    Font.Draw (ranking44, 450, 270, fontId9, 78)
									    Font.Draw (ranking444, 479, 210, fontId9, 78)
									    Font.Draw (tries1, 435, 190, fontId9, 78)
									    Font.Draw (intstr (addattempt), 534, 190, fontId9, 78)
									    Font.Draw (tries2, 540, 190, fontId9, 78)

									end if
								    end if
								end if
							    end if
							end loop


						    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then
							%wrong answers
							addattempt := addattempt + 1
							pic7 := Pic.Scale (pic7, 200, 100)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)

						    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then
							%wrong answers
							addattempt := addattempt + 1
							pic7 := Pic.Scale (pic7, 200, 100)
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)


						    end if
						end loop


					    end if
					end loop             %end question2

				    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then
					%wrong answers
					addattempt := addattempt + 1
					pic7 := Pic.Scale (pic7, 200, 100)
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)


				    end if
				end loop             %end question one
			    end if
			end loop
		    end if
		end loop





	    elsif x >= 255 and x <= 395 and y <= 240 and y >= 180 and button = 1 then                 % enters the subtraction game
		cls
		delay (1000)
		pic31 := Pic.Scale (pic31, 200, 300)
		Pic.Draw (pic31, 1, 10, picMerge)

		pic7 := Pic.Scale (pic7, 370, 200)
		Pic.Draw (pic7, 160, 200, picMerge)

		pic32 := Pic.Scale (pic32, 200, 250)
		Pic.Draw (pic32, 270, 1, picUnderMerge)

		pic33 := Pic.Scale (pic33, 100, 120)
		Pic.Draw (pic33, 520, 1, picMerge)
		delay (1200)
		Font.Draw (maininstruction1, 250, 360, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction2, 200, 340, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction3, 190, 320, fontId7, 38)
		Font.Draw (maininstruction4, 267, 320, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction5, 210, 300, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction6, 210, 280, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction7, 250, 260, fontId7, 38)
		delay (1200)


		loop
		    Mouse.Where (x, y, button)
		    if x >= 500 and x <= 620 and y >= 0 and y <= 620 and button = 1 then
			cls



			pic6 := Pic.Scale (pic6, 170, 380)                 % the instructions for the questions
			Pic.Draw (pic6, 1, 1, picMerge)

			pic7 := Pic.Scale (pic7, 270, 150)
			Pic.Draw (pic7, 190, 230, picMerge)

			pic8 := Pic.Scale (pic8, 300, 270)
			Pic.Draw (pic8, 390, 10, picMerge)

			drawfillbox (240, 130, 400, 70, 101)
			Font.Draw (start, 270, 90, fontId6, 38)

			drawfillbox (590, 340, 470, 290, 101)

			Font.Draw (level1intro1, 220, 330, fontId5, 78)
			Font.Draw (level2intro1, 220, 310, fontId5, 78)
			Font.Draw (level1intro3, 223, 290, fontId5, 78)
			Font.Draw (level1intro4, 277, 272, fontId5, 78)
			locate (6, 62)
			colourback (101)
			get name1                 %prompt and get the username for subtraction questions

			loop
			    Mouse.Where (x, y, button)
			    if x >= 240 and x <= 400 and y >= 70 and y <= 130 and button = 1 then % after the start button is clicked
				cls
				colourback (0)
				cls
				delay (1000)
				addpic1 := Pic.Scale (addpic1, 100, 100) %display the 1st subtraction question
				Pic.Draw (addpic1, 10, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 110, 150, picMerge)

				subtract1 := Pic.Scale (subtract1, 80, 100)
				Pic.Draw (subtract1, 210, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 290, 150, picMerge)
				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 390, 150, picMerge)

				addpic3 := Pic.Scale (addpic3, 90, 170)
				Pic.Draw (addpic3, 470, 120, picMerge)

				addpic5 := Pic.Scale (addpic5, 130, 170)
				Pic.Draw (addpic5, 100, 250, picMerge)

				addpic4 := Pic.Scale (addpic4, 80, 150)
				Pic.Draw (addpic4, 540, 140, picMerge)
				drawbox (40, 20, 170, 100, 38) %give choices for the question
				drawbox (200, 20, 330, 100, 38)
				drawbox (360, 20, 490, 100, 38)

				addpic6 := Pic.Scale (addpic6, 80, 100)
				Pic.Draw (addpic6, 70, 10, picMerge)
				subtract2 := Pic.Scale (subtract2, 80, 85)
				Pic.Draw (subtract2, 230, 17, picMerge)
				addpic8 := Pic.Scale (addpic8, 80, 100)
				Pic.Draw (addpic8, 380, 10, picMerge)



				loop
				    Mouse.Where (x, y, button)

				    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first box is clicked
					pic7 := Pic.Scale (pic7, 200, 100) %another chance to try again
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)
				    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then %if the second box is clicked

					pic7 := Pic.Scale (pic7, 200, 100) % get the right answer
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)
					Font.Draw (rightans1, 280, 357, fontId18, 101)
					Font.Draw (rightans2, 260, 337, fontId18, 101)

					delay (1000)

					pic33 := Pic.Scale (pic33, 100, 120) % arrow to next question
					Pic.Draw (pic33, 450, 270, picMerge)
					loop
					    Mouse.Where (x, y, button) %if the arrow is clicked
					    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
						cls
						delay (1000)
						addpic9 := Pic.Scale (addpic9, 100, 100) %enters the 2nd subtraction question
						Pic.Draw (addpic9, 10, 150, picMerge)

						addpic10 := Pic.Scale (addpic10, 100, 100) %display the question
						Pic.Draw (addpic10, 110, 150, picMerge)

						subtract1 := Pic.Scale (subtract1, 80, 100)
						Pic.Draw (subtract1, 210, 150, picMerge)

						addpic3 := Pic.Scale (addpic3, 90, 170)
						Pic.Draw (addpic3, 470, 120, picMerge)

						addpic5 := Pic.Scale (addpic5, 130, 170)
						Pic.Draw (addpic5, 100, 250, picMerge)

						addpic4 := Pic.Scale (addpic4, 80, 150)
						Pic.Draw (addpic4, 540, 140, picMerge)

						addpic9 := Pic.Scale (addpic9, 100, 100)
						Pic.Draw (addpic9, 290, 150, picMerge)


						drawbox (40, 20, 170, 100, 38) %give out choices
						drawbox (200, 20, 330, 100, 38)
						drawbox (360, 20, 490, 100, 38)

						subtract3 := Pic.Scale (subtract3, 100, 100)
						Pic.Draw (subtract3, 50, 12, picMerge)
						addpic7 := Pic.Scale (addpic7, 80, 100)
						Pic.Draw (addpic7, 230, 10, picMerge)
						addpic8 := Pic.Scale (addpic8, 80, 100)
						Pic.Draw (addpic8, 380, 10, picMerge)
						loop
						    Mouse.Where (x, y, button)
						    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first answer is clicked
							delay (1000)
							pic7 := Pic.Scale (pic7, 200, 100) %right answer page
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)
							Font.Draw (rightans1, 280, 357, fontId18, 101)
							Font.Draw (rightans2, 260, 337, fontId18, 101)

							delay (1000)

							pic33 := Pic.Scale (pic33, 100, 120) %arrow leads to the final question
							Pic.Draw (pic33, 450, 270, picMerge)
							loop
							    Mouse.Where (x, y, button)
							    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then %enters the final question
								cls
								colourback (0)              % clear the screen and given out questions
								cls
								delay (1000)




								pic3 := Pic.Scale (pic3, 270, 240) %pictures
								Pic.Draw (pic3, 220, 1, picMerge)

								pic20 := Pic.Scale (pic20, 120, 150)
								Pic.Draw (pic20, 150, 100, picMerge)

								pic9 := Pic.Scale (pic9, 200, 200)
								Pic.Draw (pic9, 1, 1, picMerge)

								pic21 := Pic.Scale (pic21, 120, 160)
								Pic.Draw (pic21, 400, 190, picUnderMerge)

								pic10 := Pic.Scale (pic10, 400, 260)
								Pic.Draw (pic10, 40, 180, picMerge)



								pic22 := Pic.Scale (pic22, 140, 290)
								Pic.Draw (pic22, 490, 10, picMerge)



								drawfillbox (510, 330, 610, 280, 38) %answer box



								Font.Draw (game2Instruct1, 102, 375, fontId8, 78) %giving out instructions

								delay (1000)
								Font.Draw (game2Instruct2, 101, 355, fontId8, 78)
								delay (1000)
								Font.Draw (game2Instruct3, 101, 335, fontId8, 78)
								delay (1000)
								Font.Draw (game2Instruct4, 101, 315, fontId8, 78)
								delay (1000)
								Font.Draw (game2Instruct5, 100, 295, fontId8, 78)
								delay (1000)
								Font.Draw (game2Instruct6, 100, 275, fontId8, 78)

								delay (1000)
								Font.Draw (gameWelcome1, 270, 160, fontId8, 38) %giving out the number of chances left
								delay (1000)
								Font.Draw (gameWelcome2, 270, 120, fontId8, 38)

								Font.Draw (chance3, 345, 120, fontId8, 38)
								Font.Draw (gameWelcome3, 360, 120, fontId8, 38)

								colourback (38)
								locate (6, 67)
								get answer2      %prompt and get answer for subtraction final question

								if answer2 = 3 then %if the user gets the correct answer within one try
								    cls
								    colourback (0) %he/she is placed as the first place for subtraction questions
								    cls
								    pic3 := Pic.Scale (pic3, 270, 340)
								    Pic.Draw (pic3, 390, 40, picMerge)



								    pic24 := Pic.Scale (pic24, 200, 250) %award pictures
								    Pic.Draw (pic24, 220, 180, picMerge)

								    pic23 := Pic.Scale (pic23, 220, 390)
								    Pic.Draw (pic23, 1, 1, picUnderMerge)


								    Font.Draw (ranking1, 450, 290, fontId9, 78) %congraduations
								    Font.Draw (name1, 444, 250, fontId9, 78)
								    Font.Draw (ranking11, 464, 250, fontId9, 78)
								    Font.Draw (ranking111, 437, 210, fontId9, 78)
								else
								    Font.Draw (gameWelcome2, 270, 120, fontId8, 38) %if the user does not get the answer for the first time
								    drawfillbox (345, 135, 355, 115, 91)
								    Font.Draw (chance2, 345, 120, fontId8, 38) %reduces the number of chances left
								    Font.Draw (gameWelcome3, 360, 120, fontId8, 38)
								    Font.Draw (wrongAnswer, 270, 100, fontId8, 38)
								    colourback (101)
								    locate (6, 67)
								    get answer2 %prompt and get the new answer
								    if answer2 = 3 then %if the user gets the answer within the second try
									cls
									colourback (0)
									cls

									pic3 := Pic.Scale (pic3, 270, 340) %award pictures for second place
									Pic.Draw (pic3, 390, 40, picMerge)

									pic25 := Pic.Scale (pic25, 200, 170)
									Pic.Draw (pic25, 20, 220, picMerge)

									pic26 := Pic.Scale (pic26, 250, 320)
									Pic.Draw (pic26, 170, 40, picMerge)

									pic28 := Pic.Scale (pic28, 190, 190)
									Pic.Draw (pic28, 1, 1, picMerge)


									Font.Draw (ranking1, 450, 290, fontId9, 78) %congraduations for getting placed 2nd in the level 2 game
									Font.Draw (name1, 444, 250, fontId9, 78)
									Font.Draw (ranking22, 464, 250, fontId9, 78)
									Font.Draw (ranking111, 437, 210, fontId9, 78)
								    else
									Font.Draw (gameWelcome2, 270, 120, fontId8, 38) % %reduces the number of chances to 1
									drawfillbox (345, 135, 355, 115, 91)
									Font.Draw (chance1, 345, 120, fontId8, 38)
									Font.Draw (gameWelcome3, 360, 120, fontId8, 38)
									Font.Draw (wrongAnswer, 270, 100, fontId8, 38)
									colourback (101)
									locate (6, 67)
									get answer2 %prompt and get the answer for the last time
									if answer2 = 3 then % if the user gets the answer within the third try
									    cls
									    colourback (0)
									    cls

									    pic3 := Pic.Scale (pic3, 270, 340) %3rd place awards
									    Pic.Draw (pic3, 390, 40, picMerge)

									    pic28 := Pic.Scale (pic28, 270, 340)
									    Pic.Draw (pic28, 190, 40, picMerge)

									    pic29 := Pic.Scale (pic29, 230, 240)
									    Pic.Draw (pic29, 10, 100, picMerge)

									    Font.Draw (ranking1, 450, 290, fontId9, 78) %congraduation for the user getting placed 3rd in the level 2 game
									    Font.Draw (name1, 444, 250, fontId9, 78)
									    Font.Draw (ranking33, 464, 250, fontId9, 78)
									    Font.Draw (ranking111, 437, 210, fontId9, 78)

									else
									    cls %if the user did not get the answer within his/her first 3 chances
									    colourback (0) %clear the screen for unsuccessful attempt
									    cls
									    pic30 := Pic.Scale (pic30, 270, 370) % unsuccessful pics
									    Pic.Draw (pic30, 1, 20, picMerge)

									    pic3 := Pic.Scale (pic3, 280, 320)
									    Pic.Draw (pic3, 390, 40, picMerge)

									    Font.Draw (ranking4, 490, 290, fontId9, 78) %the user did not save Nobita
									    Font.Draw (name1, 444, 250, fontId9, 78)
									    Font.Draw (ranking44, 472, 250, fontId9, 78)
									    Font.Draw (ranking444, 487, 210, fontId9, 78)
									    Font.Draw (tries1, 435, 190, fontId9, 78)
									    Font.Draw (intstr (addattempt), 534, 190, fontId9, 78)
									    Font.Draw (tries2, 540, 190, fontId9, 78)

									end if
								    end if
								end if
							    end if
							end loop
						    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then     %wrong answers
							pic7 := Pic.Scale (pic7, 200, 100)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)

						    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then %wrong answers
							pic7 := Pic.Scale (pic7, 200, 100)
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)


						    end if
						end loop


					    end if
					end loop %end question2

				    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then %wrong answers
					pic7 := Pic.Scale (pic7, 200, 100)
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)


				    end if
				end loop %end question one

			    end if
			end loop
		    end if
		end loop


	    elsif x >= 255 and x <= 395 and y <= 130 and y >= 70 and button = 1 then                                 %enters the multiplication math game
		cls
		pic31 := Pic.Scale (pic31, 200, 300)
		Pic.Draw (pic31, 1, 10, picMerge)

		pic7 := Pic.Scale (pic7, 370, 200)
		Pic.Draw (pic7, 160, 200, picMerge)

		pic32 := Pic.Scale (pic32, 200, 250)
		Pic.Draw (pic32, 270, 1, picUnderMerge)

		pic33 := Pic.Scale (pic33, 100, 120)
		Pic.Draw (pic33, 520, 1, picMerge)
		delay (1200)
		Font.Draw (maininstruction1, 250, 360, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction2, 200, 340, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction3, 190, 320, fontId7, 38)
		Font.Draw (maininstruction4, 267, 320, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction5, 210, 300, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction6, 210, 280, fontId7, 38)
		delay (1200)
		Font.Draw (maininstruction7, 250, 260, fontId7, 38)
		delay (1200)


		loop
		    Mouse.Where (x, y, button)
		    if x >= 500 and x <= 620 and y >= 0 and y <= 620 and button = 1 then
			cls


			pic6 := Pic.Scale (pic6, 170, 380)                 % the instructions for the questions
			Pic.Draw (pic6, 1, 1, picMerge)

			pic7 := Pic.Scale (pic7, 270, 150)
			Pic.Draw (pic7, 190, 230, picMerge)

			pic8 := Pic.Scale (pic8, 300, 270)
			Pic.Draw (pic8, 390, 10, picMerge)

			drawfillbox (240, 130, 400, 70, 101)
			Font.Draw (start, 270, 90, fontId6, 38)

			drawfillbox (590, 340, 470, 290, 101)

			Font.Draw (level1intro1, 220, 330, fontId5, 78)
			Font.Draw (level2intro1, 220, 310, fontId5, 78)
			Font.Draw (level1intro3, 223, 290, fontId5, 78)
			Font.Draw (level1intro4, 277, 272, fontId5, 78)
			locate (6, 62)
			colourback (101)
			get name1                 %prompt and get the username for subtraction questions

			loop
			    Mouse.Where (x, y, button)
			    if x >= 240 and x <= 400 and y >= 70 and y <= 130 and button = 1 then % after the start button is clicked
				cls
				colourback (0)
				cls


				addpic1 := Pic.Scale (addpic1, 100, 100) %display the 1st multiplication question
				Pic.Draw (addpic1, 10, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 110, 150, picMerge)

				multi1 := Pic.Scale (multi1, 80, 100)
				Pic.Draw (multi1, 210, 150, picMerge)

				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 290, 150, picMerge)
				addpic1 := Pic.Scale (addpic1, 100, 100)
				Pic.Draw (addpic1, 390, 150, picMerge)

				addpic3 := Pic.Scale (addpic3, 90, 170)
				Pic.Draw (addpic3, 470, 120, picMerge)

				addpic5 := Pic.Scale (addpic5, 130, 170)
				Pic.Draw (addpic5, 100, 250, picMerge)

				addpic4 := Pic.Scale (addpic4, 80, 150)
				Pic.Draw (addpic4, 540, 140, picMerge)

				drawbox (40, 20, 170, 100, 38) %give choices for the question
				drawbox (200, 20, 330, 100, 38)
				drawbox (360, 20, 490, 100, 38)

				addpic6 := Pic.Scale (addpic6, 80, 100)
				Pic.Draw (addpic6, 70, 10, picMerge)
				addpic7 := Pic.Scale (addpic7, 80, 100)
				Pic.Draw (addpic7, 230, 10, picMerge)
				addpic8 := Pic.Scale (addpic8, 80, 100)
				Pic.Draw (addpic8, 380, 10, picMerge)




				loop
				    Mouse.Where (x, y, button)

				    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first box is clicked
					drawfillbox (240, 280, 470, 410, 0)
					pic7 := Pic.Scale (pic7, 200, 100) %another chance to try again
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)
				    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then %if the second box is clicked

					pic7 := Pic.Scale (pic7, 200, 100) % get the right answer
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)
					Font.Draw (rightans1, 280, 357, fontId18, 101)
					Font.Draw (rightans2, 260, 337, fontId18, 101)

					delay (1000)

					pic33 := Pic.Scale (pic33, 100, 120) % arrow to next question
					Pic.Draw (pic33, 450, 270, picMerge)
					loop
					    Mouse.Where (x, y, button) %if the arrow is clicked
					    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
						cls
						delay (1000)
						addpic9 := Pic.Scale (addpic9, 100, 100) %enters the 2nd subtraction question
						Pic.Draw (addpic9, 10, 150, picMerge)

						addpic10 := Pic.Scale (addpic10, 100, 100) %display the question
						Pic.Draw (addpic10, 110, 150, picMerge)

						multi1 := Pic.Scale (multi1, 80, 100)
						Pic.Draw (multi1, 210, 150, picMerge)

						addpic3 := Pic.Scale (addpic3, 90, 170)
						Pic.Draw (addpic3, 470, 120, picMerge)

						addpic5 := Pic.Scale (addpic5, 130, 170)
						Pic.Draw (addpic5, 100, 250, picMerge)

						addpic4 := Pic.Scale (addpic4, 80, 150)
						Pic.Draw (addpic4, 540, 140, picMerge)

						addpic9 := Pic.Scale (addpic9, 100, 100)
						Pic.Draw (addpic9, 290, 150, picMerge)


						drawbox (40, 20, 170, 100, 38) %give out choices
						drawbox (200, 20, 330, 100, 38)
						drawbox (360, 20, 490, 100, 38)

						addpic11 := Pic.Scale (addpic11, 130, 120)
						Pic.Draw (addpic11, 50, 1, picMerge)
						addpic7 := Pic.Scale (addpic7, 80, 100)
						Pic.Draw (addpic7, 230, 10, picMerge)
						addpic8 := Pic.Scale (addpic8, 80, 100)
						Pic.Draw (addpic8, 380, 10, picMerge)

						loop
						    Mouse.Where (x, y, button)
						    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first answer is clicked
							pic7 := Pic.Scale (pic7, 200, 100) %right answer page
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)
							Font.Draw (rightans1, 280, 357, fontId18, 101)
							Font.Draw (rightans2, 260, 337, fontId18, 101)

							delay (1000)

							pic33 := Pic.Scale (pic33, 100, 120) %arrow leads to the final question
							Pic.Draw (pic33, 450, 270, picMerge)
							loop
							    Mouse.Where (x, y, button)
							    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then %enters the final question
								cls
								delay (1000)
								multi1 := Pic.Scale (multi1, 80, 100)
								Pic.Draw (multi1, 210, 150, picMerge)
								multi2 := Pic.Scale (multi2, 80, 100)
								Pic.Draw (multi2, 120, 150, picMerge)


								multi3 := Pic.Scale (multi3, 80, 100)
								Pic.Draw (multi3, 300, 150, picMerge)
								multi3 := Pic.Scale (multi3, 80, 100)
								Pic.Draw (multi3, 390, 150, picMerge)

								addpic3 := Pic.Scale (addpic3, 90, 170)
								Pic.Draw (addpic3, 470, 120, picMerge)

								addpic4 := Pic.Scale (addpic4, 80, 150)
								Pic.Draw (addpic4, 540, 140, picMerge)

								drawbox (40, 20, 170, 100, 38) %give choices for the question
								drawbox (200, 20, 330, 100, 38)
								drawbox (360, 20, 490, 100, 38)

								addpic6 := Pic.Scale (addpic6, 80, 100)
								Pic.Draw (addpic6, 70, 10, picMerge)
								addpic7 := Pic.Scale (addpic7, 80, 100)
								Pic.Draw (addpic7, 230, 10, picMerge)
								subtract3 := Pic.Scale (subtract3, 80, 100)
								Pic.Draw (subtract3, 380, 10, picMerge)

								addpic5 := Pic.Scale (addpic5, 130, 170)
								Pic.Draw (addpic5, 100, 270, picMerge)

								loop
								    Mouse.Where (x, y, button)
								    if x >= 40 and x <= 170 and y >= 20 and y <= 100 and button = 1 then %if the first box is clicked
									drawfillbox (240, 280, 470, 410, 0)
									pic7 := Pic.Scale (pic7, 200, 100) %another chance to try again
									Pic.Draw (pic7, 240, 290, picMerge)

									Font.Draw (wrongans1, 270, 337, fontId18, 101)
								    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then %if the second box is clicked
									drawfillbox (240, 280, 470, 410, 0)
									pic7 := Pic.Scale (pic7, 200, 100) %another chance to try again
									Pic.Draw (pic7, 240, 290, picMerge)

									Font.Draw (wrongans1, 270, 337, fontId18, 101)

								    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then

									delay (1000)
									pic7 := Pic.Scale (pic7, 200, 100) % get the right answer
									drawfillbox (240, 280, 470, 410, 0)
									Pic.Draw (pic7, 240, 290, picMerge)
									Font.Draw (rightans1, 280, 357, fontId18, 101)
									Font.Draw (rightans2, 260, 337, fontId18, 101)

									delay (1000)

									pic33 := Pic.Scale (pic33, 100, 120) % arrow to next question
									Pic.Draw (pic33, 450, 270, picMerge)

									loop
									    Mouse.Where (x, y, button) %if the arrow is clicked

									    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then %wrong answers
										cls
										multi4 := Pic.Scale (multi4, 640, 480)
										Pic.Draw (multi4, 0, 0, picMerge)
										Font.Draw (multiplication, 170, 237, fontId6, 101)
										Font.Draw (name1, 310, 204, fontId6, 101)
									    end if
									end loop
								    end if
								end loop


							    end if
							end loop

						    elsif x >= 200 and x <= 330 and y >= 20 and y <= 100 and button = 1 then %wrong answers
							drawfillbox (240, 280, 470, 410, 0)
							pic7 := Pic.Scale (pic7, 200, 100)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)

						    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then %wrong answers
							drawfillbox (240, 280, 470, 410, 0)
							pic7 := Pic.Scale (pic7, 200, 100)
							drawfillbox (240, 280, 470, 410, 0)
							Pic.Draw (pic7, 240, 290, picMerge)

							Font.Draw (wrongans1, 270, 337, fontId18, 101)


						    end if
						end loop


					    end if
					end loop %end question2

				    elsif x >= 360 and x <= 490 and y >= 20 and y <= 100 and button = 1 then %wrong answers
					pic7 := Pic.Scale (pic7, 200, 100)
					drawfillbox (240, 280, 470, 410, 0)
					Pic.Draw (pic7, 240, 290, picMerge)

					Font.Draw (wrongans1, 270, 337, fontId18, 101)


				    end if
				end loop %end question one
			    end if
			end loop
		    end if
		end loop

	    end if
	    stage := 2
	end loop

    elsif x >= 400 and x <= 610 and y >= 90 and y <= 185 and button = 1 then                                 % enters the English Game
	cls
	colourback (0)
	cls
	Font.Draw (Englishchoice, 280, 200, fontId4, 38)




	drawbox (255, 260, 395, 160, 38)


	pic3 := Pic.Scale (pic3, 250, 380)
	Pic.Draw (pic3, 1, 10, picCopy)

	pic4 := Pic.Scale (pic4, 288, 320)
	Pic.Draw (pic4, 400, 0, picMerge)

	Font.Draw (engintro1, 60, 300, fontId5, 38)
	Font.Draw (engintro2, 55, 280, fontId5, 38)
	Font.Draw (engintro3, 48, 260, fontId5, 38)
	Font.Draw (engintro4, 52, 240, fontId5, 38)
	Font.Draw (engintro5, 52, 220, fontId5, 38)
	Font.Draw (engintro6, 60, 180, fontId5, 38)
	Font.Draw (engintro7, 60, 160, fontId5, 38)

	loop
	    Mouse.Where (x, y, button)
	    if x >= 260 and x <= 290 and y >= 170 and y <= 270 and button = 1 then
		cls

		pic34 := Pic.Scale (pic34, 208, 300)
		Pic.Draw (pic34, 420, 40, picMerge)
		pic35 := Pic.Scale (pic35, 178, 270)
		Pic.Draw (pic35, 20, 1, picMerge)
		drawfillbox (130, 0, 230, 20, 0)
		pic7 := Pic.Scale (pic7, 250, 170)
		Pic.Draw (pic7, 170, 170, picMerge)

		pic36 := Pic.Scale (pic36, 200, 170)
		Pic.Draw (pic36, 210, 10, picUnderMerge)

		drawfillbox (210, 170, 410, 120, 0)
		drawfillbox (210, 70, 410, 0, 0)
		delay (1000)

		Font.Draw (engstart1, 190, 280, fontId7, 38)
		delay (1000)
		Font.Draw (engstart2, 190, 260, fontId7, 38)
		delay (1000)
		Font.Draw (engstart3, 190, 240, fontId7, 38)

		locate (6, 62)                  %locate an input

		get name1 : *


		loop
		    Mouse.Where (x, y, button)
		    if x >= 210 and x <= 410 and y >= 70 and y <= 120 and button = 1 then
			cls
			delay (1000)
			pic37 := Pic.Scale (pic37, 270, 270)
			Pic.Draw (pic37, 1, 130, picMerge)
			Font.Draw (verbgame1, 220, 200, fontId17, 101)
			Font.Draw (verbchoice1, 70, 67, fontId17, 101)
			Font.Draw (verbchoice2, 275, 67, fontId17, 101)
			Font.Draw (verbchoice3, 486, 67, fontId17, 101)

			drawbox (30, 30, 210, 120, 101)
			drawbox (240, 30, 420, 120, 101)
			drawbox (450, 30, 630, 120, 101)
			loop
			    Mouse.Where (x, y, button)
			    if x >= 30 and x <= 210 and y >= 30 and y <= 120 and button = 1 then
				pic7 := Pic.Scale (pic7, 200, 100)
				Pic.Draw (pic7, 240, 290, picMerge)

				Font.Draw (wrongans1, 270, 337, fontId18, 101)

			    elsif x >= 240 and x <= 420 and y >= 30 and y <= 120 and button = 1 then

				pic7 := Pic.Scale (pic7, 200, 100)
				drawfillbox (240, 280, 470, 410, 0)
				Pic.Draw (pic7, 240, 290, picMerge)
				Font.Draw (rightans1, 280, 357, fontId18, 101)
				Font.Draw (rightans2, 260, 337, fontId18, 101)

				delay (1000)
				Font.Draw (verbchoice2, 430, 207, fontId18, 101)
				pic33 := Pic.Scale (pic33, 100, 120)
				Pic.Draw (pic33, 450, 270, picMerge)

				loop
				    Mouse.Where (x, y, button)
				    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
					cls
					delay (1000)
					pic38 := Pic.Scale (pic38, 200, 270)
					Pic.Draw (pic38, 1, 130, picMerge)
					Font.Draw (verbgame2, 160, 200, fontId19, 101)
					Font.Draw (verbchoice4, 70, 67, fontId17, 101)
					Font.Draw (verbchoice5, 275, 67, fontId17, 101)
					Font.Draw (verbchoice6, 486, 67, fontId17, 101)

					drawbox (30, 30, 210, 120, 101)
					drawbox (240, 30, 420, 120, 101)
					drawbox (450, 30, 630, 120, 101)

					loop
					    Mouse.Where (x, y, button)
					    if x >= 30 and x <= 210 and y >= 30 and y <= 120 and button = 1 then

						pic7 := Pic.Scale (pic7, 200, 100)
						drawfillbox (240, 280, 470, 410, 0)
						Pic.Draw (pic7, 240, 290, picMerge)
						Font.Draw (rightans1, 280, 357, fontId18, 101)
						Font.Draw (rightans2, 260, 337, fontId18, 101)

						delay (1000)
						Font.Draw (verbchoice4, 320, 200, fontId18, 101)
						pic33 := Pic.Scale (pic33, 100, 120)
						Pic.Draw (pic33, 450, 270, picMerge)

						loop
						    Mouse.Where (x, y, button)
						    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
							cls
							pic15 := Pic.Scale (pic15, 250, 280)
							Pic.Draw (pic15, 1, 130, picMerge)
							Font.Draw (verbgame3, 220, 200, fontId17, 101)
							Font.Draw (verbchoice7, 70, 67, fontId17, 101)
							Font.Draw (verbchoice8, 275, 67, fontId17, 101)
							Font.Draw (verbchoice9, 486, 67, fontId17, 101)
							drawbox (30, 30, 210, 120, 101)
							drawbox (240, 30, 420, 120, 101)
							drawbox (450, 30, 630, 120, 101)

							loop
							    Mouse.Where (x, y, button)
							    if x >= 30 and x <= 210 and y >= 30 and y <= 120 and button = 1 then
								pic7 := Pic.Scale (pic7, 200, 100)
								drawfillbox (240, 280, 470, 410, 0)
								Pic.Draw (pic7, 240, 290, picMerge)
								Font.Draw (rightans1, 280, 357, fontId18, 101)
								Font.Draw (rightans2, 260, 337, fontId18, 101)

								delay (1000)
								Font.Draw (verbchoice7, 450, 200, fontId18, 101)
								pic33 := Pic.Scale (pic33, 100, 120)
								Pic.Draw (pic33, 450, 270, picMerge)
								loop
								    Mouse.Where (x, y, button)
								    if x >= 450 and x <= 550 and y >= 270 and y <= 400 and button = 1 then
									cls
									multi4 := Pic.Scale (multi4, 640, 480)
									Pic.Draw (multi4, 0, 0, picMerge)
									Font.Draw (verbsss, 210, 237, fontId6, 101)
									Font.Draw (name1, 310, 204, fontId6, 101)




								    end if
								end loop

							    elsif x >= 240 and x <= 420 and y >= 30 and y <= 120 and button = 1 then
								pic7 := Pic.Scale (pic7, 200, 100)
								Pic.Draw (pic7, 240, 290, picMerge)

								Font.Draw (wrongans1, 270, 337, fontId18, 101)

							    elsif x >= 450 and x <= 630 and y >= 30 and y <= 120 and button = 1 then
								drawfillbox (240, 280, 470, 410, 0)
								pic7 := Pic.Scale (pic7, 200, 100)
								Pic.Draw (pic7, 240, 290, picMerge)

								Font.Draw (wrongans1, 270, 337, fontId18, 101)

							    end if
							end loop






						    end if
						end loop

					    elsif x >= 240 and x <= 420 and y >= 30 and y <= 120 and button = 1 then
						pic7 := Pic.Scale (pic7, 200, 100)
						Pic.Draw (pic7, 240, 290, picMerge)

						Font.Draw (wrongans1, 270, 337, fontId18, 101)

					    elsif x >= 450 and x <= 630 and y >= 30 and y <= 120 and button = 1 then
						drawfillbox (240, 280, 470, 410, 0)
						pic7 := Pic.Scale (pic7, 200, 100)
						Pic.Draw (pic7, 240, 290, picMerge)

						Font.Draw (wrongans1, 270, 337, fontId18, 101)

					    end if
					end loop
				    end if
				end loop
			    elsif x >= 450 and x <= 630 and y >= 30 and y <= 120 and button = 1 then
				drawfillbox (240, 280, 470, 410, 0)
				pic7 := Pic.Scale (pic7, 200, 100)
				Pic.Draw (pic7, 240, 290, picMerge)

				Font.Draw (wrongans1, 270, 337, fontId18, 101)

			    end if
			end loop
		    end if
		end loop
	    end if
	end loop

	stage := 2
    end if
end loop
