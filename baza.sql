/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 10.4.11-MariaDB : Database - seminarski
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`seminarski` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `seminarski`;

/*Table structure for table `diskografskakuca` */

DROP TABLE IF EXISTS `diskografskakuca`;

CREATE TABLE `diskografskakuca` (
  `DiskografskaKucaID` int(11) NOT NULL,
  `NazivDiskografskeKuce` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`DiskografskaKucaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `diskografskakuca` */

insert  into `diskografskakuca`(`DiskografskaKucaID`,`NazivDiskografskeKuce`) values 
(1,'Empire Records'),
(2,'Atlantic Records'),
(3,'Interscope Records'),
(5,'Republic Records'),
(7,'Def Jam Recordings'),
(8,'Cash Money Records'),
(9,'Capitol Records'),
(10,'Walt Disney Records'),
(11,'Metropolis Music'),
(12,'Warner Bros. Records'),
(13,'Polydor'),
(14,'Universal'),
(15,'Universal Records'),
(16,'ABKCO'),
(17,'Virgin'),
(18,'Top Dawg Entertainment'),
(19,'Aftermath Entertainment'),
(20,'VERTIGO'),
(21,'Island Records'),
(22,'Mass Appeal'),
(23,'Loma Vista'),
(24,'RCA'),
(25,'Geffen Records'),
(26,'Big Machine Records');

/*Table structure for table `format` */

DROP TABLE IF EXISTS `format`;

CREATE TABLE `format` (
  `FormatID` int(11) NOT NULL,
  `NazivFormata` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`FormatID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `format` */

insert  into `format`(`FormatID`,`NazivFormata`) values 
(1,'Vinyl'),
(2,'2LP'),
(3,'3LP'),
(4,'Box set'),
(5,'LP DLX'),
(6,'LP Limited Edition');

/*Table structure for table `kupac` */

DROP TABLE IF EXISTS `kupac`;

CREATE TABLE `kupac` (
  `KupacID` int(11) NOT NULL,
  `ImePrezime` varchar(30) DEFAULT NULL,
  `Adresa` varchar(50) DEFAULT NULL,
  `BrojTelefona` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`KupacID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `kupac` */

insert  into `kupac`(`KupacID`,`ImePrezime`,`Adresa`,`BrojTelefona`) values 
(1,'Bogdan Bogdanović','Jovane Stojisavljević 23/4, Beograd','+381651757211'),
(2,'Ivana Avramović','Omladinskih brigada 47, Beograd','+381617181544'),
(3,'Ivan Janković','Momčila Radivojevića 1a, Beograd','+381691424733'),
(4,'Zorana Radović','Jovana Stojisavljevića 43/3, Beograd','+381621266773'),
(5,'Milena Živković','Pregrevica 117b, Beograd','+381652631996'),
(6,'Jovan Bogić','Rada Končara 15/4, Beograd','+381112647845'),
(7,'Darko Živanović','Višnjički Venac 117/2, Beograd','+381654545114'),
(8,'Darijan Jović','Poslanička 14a, Novi Sad','+381125894668'),
(9,'Milica Marković','Pečenjarska 17/4, Subotica','+381212448794'),
(10,'Dušan Petković','Dragice Banić 115a, Beograd','+381647181511');

/*Table structure for table `ploca` */

DROP TABLE IF EXISTS `ploca`;

CREATE TABLE `ploca` (
  `PlocaID` int(11) NOT NULL,
  `NazivPloce` varchar(100) DEFAULT NULL,
  `Opis` text DEFAULT NULL,
  `Cena` double DEFAULT NULL,
  `Format` int(11) DEFAULT NULL,
  `DiskografskaKuca` int(11) DEFAULT NULL,
  PRIMARY KEY (`PlocaID`),
  KEY `DiskografskaKuca` (`DiskografskaKuca`),
  KEY `Format` (`Format`),
  CONSTRAINT `DiskografskaKuca` FOREIGN KEY (`DiskografskaKuca`) REFERENCES `diskografskakuca` (`DiskografskaKucaID`) ON UPDATE CASCADE,
  CONSTRAINT `Format` FOREIGN KEY (`Format`) REFERENCES `format` (`FormatID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `ploca` */

insert  into `ploca`(`PlocaID`,`NazivPloce`,`Opis`,`Cena`,`Format`,`DiskografskaKuca`) values 
(1,'Hotel Diablo - Machine Gun Kelly','A1 Sex Drive\nA2 El Diablo\nA3 Hollywood Whore\nA4 Glass House\nFeaturing – Naomi Wild\nA5 Burning Memories\nFeaturing – Lil Skies\nA6 A Message From The Count\nA7 Floor 13\nB1 Roulette\nB2 Truck Norris Interlude\nB3 Death In My Pocket\nB4 Candy\nFeaturing – Trippie Redd\nB5 Waste Love\nFeaturing – Madison Love\nB6 5:3666\nFeaturing – Phem\nB7 I Think I\'m Okay\nFeaturing – Travis Barker, Yungblud (3)',2799,1,3),
(2,'Mind the Moon - MILKY CHANCE','Fado\nOh Mama\nThe Game\nRush\nLong Run\nDaydreaming\nLP 2\nWe Didn\'t Make It to the Moon\nEden\'s House\nScarlet Paintings\nRight from Here\nFallen\nWindow',2699,1,20),
(3,'Sound Of Silence - MILOS KARADAGLIC','The Sound of Silence (Arr. Lawson, Trueman)\nSour Times (Arr. Metcalfe, Assad)\nEndecha\nMoving Mountain (Arr. Metcalfe, Ryan)\nNana\nStreet Spirit (Fade Out) (Arr. Metcalfe, Ryan)\nThe Book of Love\nEvocacin\n12\" 2\nFamous Blue Raincoat (Arr. Metcalfe, Foster)\nOremus\nSolitude (Arr. Campbell)\nCancin De Cuna (Berceuse)\nNights in White Satin (Arr. Hale, Delago, Assad)\nMilonga\nLife for Rent (Arr. Metcalfe, Ryan)\nOver the Rainbow (Arr. Takemitsu)',2799,2,14),
(4,'Welcome To The Cruel World - BEN HARPER','A1 The Three Of Us 2:35\nA2 Whipping Boy 5:31\nA3 Breakin\' Down 4:00\nB1 Don\'t Take That Attitude To Your Grave 4:25\nB2 Waiting On An Angel 3:53\nB3 Mama\'s Got A Girlfriend Now 2:29\nB4 Forever 3:23\nC1 Like A King 4:18\nC2 Pleasure And Pain 3:44\nC3 Walk Away 3:49\nD1 How Many Miles Must We March 3:07\nD2 Welcome To The Cruel World 5:36\nD3 I\'ll Rise 3:35',3199,2,17),
(5,'Body Music - AlunaGeorge','A1 Outlines\nA2 You Know You Like It\nA3 Attracting Flies\nA4 Your Drums, Your Love\nB1 Kaleidoscope Love\nB2 Bad Idea\nB3 Diver\nC1 Lost And Found\nC2 Best Be Believing\nC3 Superstar\nD1 Just A Touch\nD2 Body Music\nD3 Friends To Lovers\nD3 This Is How We Do It',2399,2,21),
(6,'Wu-Tang: Of Mics And Men - Wu-Tang Clan','On That Sht Again 3:20\nSeen A Lot Of Things 3:11\nProject Kids (Skit) 1:57\nDo The Same As My Brother Do 3:25\nYo, Is You Cheo? (Skit) 1:40\nOf Mics And Men 3:18\nOne Rhyme 2:07',2399,1,22),
(7,'Real Life - EMELI SANDE','Human\nLove to Help\nYou Are Not Alone\nShine\nSparrow\nHonest\nSurvivor\nExtraordinary Being\nSame Old Feeling\nReal Life\nFree As a Bird',2399,1,17),
(8,'Choba B Cccp - PAUL MCCARTNEY','Kansas City\nTwenty Flight Rock\nLawdy, Miss Clawdy\nBring It On Home To Me\nLucille\nDon\'t Get Around Much Anymore\nThat\'s All Right (Mama)\nAin\'t That A Shame\nCrackin\' Up\nJust Because\nMidnight Special',2699,1,9),
(9,'Let Love - Common','A1 Good Morning Love\nA2 HER Love\nA3 Dwele\'s Interlude\nA4 Hercules\nA5 Fifth Story\nA6 Forever Your Love\nB1 Leaders (Crib Love)\nB2 Memories Of Home\nB3 Show Me That You Love\nB4 My Fancy Free Future Love\nB5 God Is Love',2899,1,23),
(10,'Son Of Schmilsson - Harry Nilsson','A1 Take 54 4:22\nA2 Remember Christmas 4:07\nA3 Joy 3:42\nA4 Turn On Your Radio 2:42\nA5 You\'re Breakin\' My Heart 3:10\nB1 Spaceman3:33\nB2 The Lottery Song 2:24\nB3 At My Front Door 2:46\nB4 Ambush 5:35\nB5 I\'d Rather Be Dead 3:20\nB6 The Most Beautiful World In The World 3:33',3199,1,24),
(11,'We Can\'t Dance - Genesis','A1 No Son Of Mine 6:39\nA2 Jesus He Knows Me 4:16\nA3 Driving The Last Spike 10:08\nB1 I Can\'t Dance 4:01\nB2 Never A Time 3:50\nB3 Dreaming While You Sleep 7:16\nC1 Tell Me Why 4:58\nC2 Living Forever 5:40\nC3 Hold On My Heart 4:38\nD1 Way Of The World 5:39\nD2 Since I Lost You 4:09\nD3 Fading Lights 10:16',3599,2,17),
(12,'Roxy Music - Roxy Music','A1 Ladytron (Idjut Boys Flange Bath Version)\nRemix – Idjut Boys\n5:56\nA2 2HB (Leftside Wobble Beatless Mix)\nRemix – Leftside Wobble\n5:26\nB1 Ladytron (Idjut Boys Golden Shrine Mix)\nRemix – Idjut Boys\n5:12\nB2 Ladytron (Idjut Boys Golden Shrine Vocal Dub)\nRemix – Idjut Boys\n4:56\nC Chance Meeting (Johnson Somerset Mix)\nRemix – Johnson Somerset\n8:27\nD1 Ladytron (Man Power Mix)\nRemix – Man Power (2)\n6:47\nD2 Ladytron (Idjut Boys Golden Shrine Dub)\nRemix – Idjut Boys\n5:06',3699,2,17),
(13,'Rammstein - Rammstein','A1 Deutschland 5:18\nA2 Radio 4:34\nA3 Zeig Dich 4:12\nB1 Ausländer 3:48\nB2 Sex 3:53\nB3 Puppe 4:30\nC1 Was Ich Liebe 4:25\nC2 Diamant 2:32\nC3 Weit Weg 4:17\nD1 Tattoo 4:08\nD2 Hallomann 4:06',3599,2,14),
(14,'Red Pill Blues - Maroon 5','A1 Best 4 U\nA2 Maroon 5 + SZA What Lovers Do\nA3 Wait\nA4 Lips On You\nA5 Bet My Heart\nB1 Maroon 5 + Julia Michaels Help Me Out\nB2 Maroon 5 + Lunchmoney Lewis Who I Am\nB3 Maroon 5 + A$AP Rocky Whiskey\nB4 Girls Like You\nB5 Closure\nC1 Denim Jacket\nC2 Visions\nC3 Maroon 5 + Kendrick Lamar Don\'t Wanna Know\nD1 Maroon 5 + Future Cold\nD2 Maroon 5 + Cardi B Girls Like You',3099,2,13),
(15,'Thank U, Next - Ariana Grande','A1 Imagine\nA2 Needy\nA3 NASA\nB1 Bloodline\nB2 Fake Smile\nB3 Bad Idea\nC1 Make Up\nC2 Ghostin\nC3 In My Head\nD1 7 Rings\nD2 Thank U, Next\nD3 Break Up With Your Girlfriend, I\'m Bored',2999,2,5),
(16,'Sucker Punch - Sigrid','Sucker Punch 3:14\nMine Right Now 3:23\nBasic 3:37\nStrangers 3:53\nDon\'t Feel Like Crying 2:37\nLevel Up 2:17\nSight Of You 3:57\nIn Vain 4:07\nDon\'t Kill My Vibe 3:04\nBusiness Dinners 2:48\nNever Mine 3:38\nDynamite 3:51',2499,1,21),
(17,'Live at The Paramount - Nirvana','LP 1:\nA1 Jesus Doesn\'t Want Me for a Sunbeam\nA2 Aneurysm\nA3 Drain You\nA4 School\nA5 Floyd the Barber\nB1 Smells Like Teen Spirit\nB2 About a Girl\nB3 Polly\nB4 Breed\nB5 Sliver\nLP 2\nC1 Love Buzz\nC2 Lithium\nC3 Been a Son\nC4 Negative Creep\nC5 On a Plain\nD1 Blew\nD2 Rape Me\nD3 Territorial Pissings\nD4 Endless, Nameless',3799,2,25),
(18,'OK, I\'m Sick - Badflower','A1 X Ana X\nA2 The Jester\nA3 Ghost\nB1 We\'re In Love\nB2 Promise Me\nB3 Daddy\nB4 24\nC1 Heroin\nC2 Die\nC3 Murder Games\nD1 Girlfriend\nD2 Wide Eyes\nD3 Cry',2999,2,26),
(19,'Nasir - Nas','A1 Not For Radio\nA2 Cops Shot The Kid\nA3 White Label\nA4 Bonjour\nB1 Everything\nB2 Adam And Eve\nB3 Simple Things',2099,1,7),
(20,'Ye - Kanye West','A1 I Thought About Killing You\nA2 Yikes\nA3 All Mine\nB1 Wouldn\'t Leave\nFeaturing – PARTYNEXTDOOR\nB2 No Mistakes\nB3 Ghost Town\nFeaturing – PARTYNEXTDOOR\nB4 Violent Crimes',2299,1,7),
(21,'Crash Talk - Schoolboy Q','A1 Gang Gang\nA2 Tales\nA3 Chopstix\nA4 Numb Numb Juice\nA5 Drunk\nA6 Lies\nA7 5200\nB1 Black Folk\nB2 Floating\nB3 Dangerous\nB4 Die Wit Em\nB5 Crash\nB6 Water\nB7 Attention',2699,1,3),
(22,'Yours Truly - ARIANA GRANDE','Honeymoon Avenue\nBaby I\nRight There\nTattooed Heart\nLovin\' It\nPiano\nDaydreamin\'\nThe Way\nYou\'ll Never Know\nAlmost is Never Enough\nPopular Song\nBetter Left Unsaid',2199,1,5),
(24,'Good Girl Gone Bad - Rihanna','A1 Umbrella\nA2 Push Up On Me\nA3 Don\'t Stop The Music\nB1 Breakin\' Dishes\nB2 Shut Up And Drive\nB3 Hate That I Love You\nC1 Say It\nC2 Sell Me Candy\nC3 Lemme Get That\nD1 Rehab\nD2 Question Existing\nD3 Good Girl Gone Bad',3399,2,7),
(25,'Rated R - Rihanna','A1 Mad House\nA2 Wait Your Turn\nA3 Hard\nFeaturing – Young Jeezy\nA4 Stupid In Love\nB1 Rockstar 101\nFeaturing – Slash (3)\nB2 Russian Roulette\nB3 Fire Bomb\nC1 Rude Boy\nC2 Photographs\nFeaturing – Will I Am\nC3 G4L\nD1 Te Amo\nD2 Cold Case Love\nD3 The Last Song',3399,2,7),
(26,'The Last Concert In Japan - Deep Purple','A1 Burn\nA2 Love Child\nA3 You Keep On Moving\nA4 Wild Dogs\nB1 Lady Luck\nB2 Smoke On The Water\nB3 Soldier Of Fortune\nB4 Woman From Tokyo\nB5 Highway Star',2499,6,14),
(27,'Bridging The Gap - Black Eyed Peas','A1 BEP Empire 4:39\nA2 Weekends 4:46\nA3 Get Original 2:52\nA4 Hot 4:04\nB1 Cali To New York 4:04\nB2 Lil\' Lil\' 4:10\nB3 On My Own 3:52\nC1 Release 5:07\nC2 Bridging The Gaps 4:56\nC3 Go Go 4:53\nC4 Rap Song 3:42\nD1 Bringing It Back 3:36\nD2 Tell Your Mama Come 3:14\nD3 Request + Line 3:35',2599,1,3);

/*Table structure for table `racun` */

DROP TABLE IF EXISTS `racun`;

CREATE TABLE `racun` (
  `RacunID` int(11) NOT NULL,
  `Datum` date DEFAULT NULL,
  `UkupanIznos` double DEFAULT NULL,
  `Kupac` int(11) DEFAULT NULL,
  `Zaposleni` int(11) DEFAULT NULL,
  PRIMARY KEY (`RacunID`),
  KEY `Kupac` (`Kupac`),
  KEY `Zaposleni` (`Zaposleni`),
  CONSTRAINT `Kupac` FOREIGN KEY (`Kupac`) REFERENCES `kupac` (`KupacID`) ON UPDATE CASCADE,
  CONSTRAINT `Zaposleni` FOREIGN KEY (`Zaposleni`) REFERENCES `zaposleni` (`ZaposleniID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `racun` */

insert  into `racun`(`RacunID`,`Datum`,`UkupanIznos`,`Kupac`,`Zaposleni`) values 
(1,'2020-07-24',16195,6,2),
(2,'2020-07-24',9997,8,1),
(3,'2020-08-10',18793,1,1),
(4,'2020-08-10',10596,7,1),
(5,'2020-08-20',8997,7,2),
(6,'2020-08-20',8397,1,1),
(7,'2020-08-21',11096,1,2);

/*Table structure for table `stavkaracuna` */

DROP TABLE IF EXISTS `stavkaracuna`;

CREATE TABLE `stavkaracuna` (
  `Racun` int(11) NOT NULL,
  `RedniBroj` int(11) NOT NULL,
  `Kolicina` int(11) DEFAULT NULL,
  `Iznos` double DEFAULT NULL,
  `Ploca` int(11) DEFAULT NULL,
  PRIMARY KEY (`Racun`,`RedniBroj`),
  KEY `Ploca` (`Ploca`),
  CONSTRAINT `Ploca` FOREIGN KEY (`Ploca`) REFERENCES `ploca` (`PlocaID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `stavkaracuna` */

insert  into `stavkaracuna`(`Racun`,`RedniBroj`,`Kolicina`,`Iznos`,`Ploca`) values 
(1,1,1,2399,6),
(1,2,1,2699,8),
(1,3,3,11097,12),
(2,1,1,2399,7),
(2,2,2,7598,17),
(3,1,5,13995,1),
(3,2,2,4798,7),
(4,1,1,2399,7),
(4,2,1,3199,10),
(4,3,2,4998,16),
(5,1,1,3199,4),
(5,2,2,5798,9),
(6,1,1,2799,1),
(6,2,2,5598,1),
(7,1,3,8397,1),
(7,2,1,2699,8);

/*Table structure for table `zanr` */

DROP TABLE IF EXISTS `zanr`;

CREATE TABLE `zanr` (
  `ZanrID` int(11) NOT NULL,
  `NazivZanra` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ZanrID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `zanr` */

insert  into `zanr`(`ZanrID`,`NazivZanra`) values 
(1,'Pop'),
(2,'Hip Hop'),
(3,'RnB'),
(4,'Rock'),
(5,'Punk'),
(6,'Jazz'),
(7,'Soul'),
(8,'Metal'),
(9,'Blues'),
(10,'Funk'),
(12,'Rap'),
(13,'Soundtrack'),
(14,'Electronic'),
(15,'Klasična muzika'),
(16,'Folk'),
(17,'Electropop'),
(18,'Hardcore RnB'),
(19,'Pop Rock'),
(20,'Soft Rock'),
(21,'Industrial Rock'),
(22,'Alternative'),
(23,'Alternative Hip Hop'),
(24,'Hard Rock');

/*Table structure for table `zanrploce` */

DROP TABLE IF EXISTS `zanrploce`;

CREATE TABLE `zanrploce` (
  `PlocaID` int(11) NOT NULL,
  `ZanrID` int(11) NOT NULL,
  PRIMARY KEY (`PlocaID`,`ZanrID`),
  KEY `zanrploce_ibfk_2` (`ZanrID`),
  CONSTRAINT `zanrploce_ibfk_1` FOREIGN KEY (`PlocaID`) REFERENCES `ploca` (`PlocaID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `zanrploce_ibfk_2` FOREIGN KEY (`ZanrID`) REFERENCES `zanr` (`ZanrID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `zanrploce` */

insert  into `zanrploce`(`PlocaID`,`ZanrID`) values 
(1,2),
(2,1),
(3,15),
(4,4),
(4,16),
(5,1),
(5,14),
(5,17),
(6,2),
(6,18),
(7,1),
(8,1),
(8,19),
(9,2),
(10,1),
(10,4),
(10,19),
(10,20),
(11,1),
(11,19),
(12,4),
(12,14),
(13,4),
(13,21),
(14,1),
(14,19),
(15,1),
(15,2),
(15,3),
(15,14),
(16,1),
(17,4),
(17,22),
(18,4),
(18,21),
(19,2),
(20,2),
(21,2),
(21,12),
(22,1),
(24,1),
(24,2),
(24,3),
(24,12),
(25,1),
(25,2),
(25,3),
(25,23),
(26,4),
(26,24),
(27,2),
(27,3);

/*Table structure for table `zaposleni` */

DROP TABLE IF EXISTS `zaposleni`;

CREATE TABLE `zaposleni` (
  `ZaposleniID` int(11) NOT NULL,
  `ImePrezime` varchar(30) DEFAULT NULL,
  `KorisnickoIme` varchar(30) DEFAULT NULL,
  `Lozinka` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ZaposleniID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `zaposleni` */

insert  into `zaposleni`(`ZaposleniID`,`ImePrezime`,`KorisnickoIme`,`Lozinka`) values 
(1,'Katarina Bešlić','katarina','k123'),
(2,'Ilija Antović','ilija','i123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
