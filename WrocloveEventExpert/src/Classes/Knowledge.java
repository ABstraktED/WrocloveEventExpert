/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Enums.ActivityTypes;
import Enums.ActiveActivities;
import Enums.AgeCategories;
import Enums.Beverages;
import Enums.Cost;
import Enums.Day;
import Enums.Daytime;
import Enums.DressCode;
import Enums.EventTypes;
import Enums.MusicLoudness;
import Enums.MusicTypes;
import Enums.PassiveActivities;
import Enums.PeopleAmount;
import Enums.WeatherTypes;
import java.util.ArrayList;
import Classes.Question;
import Classes.MainWindow;
import java.util.Iterator;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ABstraktED
 */
public class Knowledge {

    public static ArrayList<Event> events;

    public Event czajownia;
    public Event odZmierzchuDoSwitu;
    public Event dachMonopolu;
    public Event up;
    public Event gafa;
    public Event sombrero;
    public Event casaDeLaMusica;
    public Event puzzle;
    public Event mundo;
    public Event planB;
    public Event capitol;
    public Event fugaMundi;
    public Event sezam;
    public Event skyBowling;
    public Event mirazBowling;
    public Event creatorBowling;
    public Event skyTowerFitness;
    public Event classicFitness;
    public Event pureJatomiFitnessRenoma;
    public Event pasazGrunwaldzki;
    public Event renoma;
    public Event galeriaDominikanska;
    public Event magnolia;
    public Event arkady;
    public Event czarnyKot;
    public Event daytona;
    public Event teatrWspolczesny;
    public Event teatrPolski;
    public Event teatrKomedia;
    public Event aquapark;
    public Event glinianki;
    public Event basenyNaTeatralnej;
    public Event stadionMiejski_soccer;
    public Event halaOrbita_basketball;
    public Event stadionOlimpijski_speedway;
    public Event stadioOlimpijski_football;
    public Event zoo;
    public Event padBar;
    public Event kasynoOlimpique;
    public Event sushi77;
    public Event chaczapuri;
    public Event amalfi;
    public Event kuchniaChinska;
    public Event mexixan;
    public Event rodeoBar;
    public Event hastaLaVista;
    public Event sportwerk;
    public Event alladyn;
    public Event chopperBar;
    public Event przekret;
    public Event graciarnia;
    public Event schodyDoNikad;
    public Event torKartingowy;
    public Event wroclawskieCentrumSpa;
    public Event capriPizza;
    public Event pureJatomiFitnessPasazGrundwaldzki;

    public void updateKnowledge() {

    }

    public Knowledge() {

        //ArrayList<Event> tempEvents = new ArrayList<>();
        events = new ArrayList<>();
        /*
         ************************************************************************
         */
        String[] czajowniaDescription;
        czajowniaDescription = new String[4];
        czajowniaDescription[0] = "Here you can taste tea from all around the world. With your friends and smooth sounds you will relax and forget about all your problems.";
        czajowniaDescription[1] = "Czajownia's additional information";
        czajowniaDescription[2] = "Czajownia's fun fun fun facts";
        czajowniaDescription[3] = "Białoskórnicza 7";

        czajownia = new Event("Czajownia",
                czajowniaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SHISHA,
                AgeCategories.IRRELEVANT,
                Beverages.TEA,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.OFFICIAL,
                EventTypes.PRIVATE,
                MusicLoudness.LOW,
                MusicTypes.CLASSICAL,
                PeopleAmount.LOW,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(czajownia);
        /*
         ************************************************************************
         */
        String[] renomaDescription;
        renomaDescription = new String[4];
        renomaDescription[0] = "Trade House Renoma is a unique place in Wroclaw. It combines the commercial offer of cultural respect for the history of the modern field of design, as well as leading a number of innovative programs, educational and social, as nearly as possible to respond to the needs of Wroclaw.";
        renomaDescription[1] = "Czajownia's additional information";
        renomaDescription[2] = "Czajownia's fun fun fun facts";
        renomaDescription[3] = "ul. Świdnicka 40";

        renoma = new Event("Renoma",
                renomaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SHOPPING,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(renoma);
        /*
         ************************************************************************
         */
        String[] odZmierzchuDoSwituDescription;
        odZmierzchuDoSwituDescription = new String[4];
        odZmierzchuDoSwituDescription[0] = "Czajownia's sample description";
        odZmierzchuDoSwituDescription[1] = "Czajownia's additional information";
        odZmierzchuDoSwituDescription[2] = "Czajownia's fun fun fun facts";
        odZmierzchuDoSwituDescription[3] = "Czajownia's adress";

        odZmierzchuDoSwitu = new Event("Od Zmierzchu do Świtu",
                odZmierzchuDoSwituDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.ALCOHOL,
                Cost.MODERATE,
                Day.SATURDAY,
                Daytime.NIGHT,
                DressCode.THEMATIC,
                EventTypes.PRIVATE,
                MusicLoudness.HIGH,
                MusicTypes.ROCK,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(odZmierzchuDoSwitu);
        /*
         ************************************************************************
         */
        String[] galeriaDominikanskaDescription;
        galeriaDominikanskaDescription = new String[4];
        galeriaDominikanskaDescription[0] = "Galeria Dominikańska - a fabulous world of fashion in the very heart of the city of Wrocław, a few minutes walk from the Main Market Square. Brand-named retail stores, latest trends, world renowned fashion collections, cafes, restaurants, service outlets where everything that stands for quality, fashion and style can be found.";
        galeriaDominikanskaDescription[1] = "Czajownia's additional information";
        galeriaDominikanskaDescription[2] = "Czajownia's fun fun fun facts";
        galeriaDominikanskaDescription[3] = "Plac Dominikański 3";

        galeriaDominikanska = new Event("Galeria Dominikańska",
                galeriaDominikanskaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SHOPPING,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(galeriaDominikanska);
        /*
         ************************************************************************
         */
        String[] magnoliaDescription;
        magnoliaDescription = new String[4];
        magnoliaDescription[0] = "Magnolia Park is the largest shopping, entertainment and recreation center in Lower Silesia. The total retail space is currently 77,595 m2, and further investments are precisely executed. Among the tenants of the center is about 230 shops, cafes, restaurants and services. Other activities include a cinema and a children's playroom. Drivers customers can benefit from 3,018 parking spaces.";
        magnoliaDescription[1] = "Czajownia's additional information";
        magnoliaDescription[2] = "Czajownia's fun fun fun facts";
        magnoliaDescription[3] = "ul. Legnicka 58";

        magnolia = new Event("Magnolia",
                magnoliaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SHOPPING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(magnolia);
        /*
         ************************************************************************
         */
        String[] dachMonopoluDescription;
        dachMonopoluDescription = new String[4];
        dachMonopoluDescription[0] = "Czajownia's sample description";
        dachMonopoluDescription[1] = "Czajownia's additional information";
        dachMonopoluDescription[2] = "Czajownia's fun fun fun facts";
        dachMonopoluDescription[3] = "Czajownia's adress";

        dachMonopolu = new Event("Monopol Roof",
                dachMonopoluDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.DATE,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.IRRELEVANT,
                EventTypes.PRIVATE,
                MusicLoudness.LOW,
                MusicTypes.CLASSICAL,
                PeopleAmount.LOW,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(dachMonopolu);
        /*
         ************************************************************************
         */
        String[] arkadyDescription;
        arkadyDescription = new String[4];
        arkadyDescription[0] = "Arkady Wrocław is a modern facility that meets the dominant features of retail, service, entertainment and office space, located in the central-southern part of the city.";
        arkadyDescription[1] = "Czajownia's additional information";
        arkadyDescription[2] = "Czajownia's fun fun fun facts";
        arkadyDescription[3] = "ul. Powstańców Śląskich 2-4";

        arkady = new Event("Arkady",
                arkadyDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SHOPPING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(arkady);
        /*
         ************************************************************************
         */
        String[] upDescription;
        upDescription = new String[4];
        upDescription[0] = "Every weekend this club become cave of electro music. The best DJs presents their best tracks. Want more? This events is on the top of Times building with great view and open air space.\n"
                + "Be there with us.";
        upDescription[1] = "Czajownia's additional information";
        upDescription[2] = "Czajownia's fun fun fun facts";
        upDescription[3] = "Kazimierza Wielkiego 1";

        up = new Event("Up",
                upDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.ALCOHOL,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(up);
        /*
         ************************************************************************
         */
        String[] czarnyKotDescription;
        czarnyKotDescription = new String[4];
        czarnyKotDescription[0] = "Czarny Kot is decorated with an idea. The concept is to combine music with a passion for modern art. Red walls of the premises are littered with photographs, covers albums, music magazines and posters of concerts.";
        czarnyKotDescription[1] = "Czajownia's additional information";
        czarnyKotDescription[2] = "Czajownia's fun fun fun facts";
        czarnyKotDescription[3] = "ul. Ruska 47/48a";

        czarnyKot = new Event("Czarny Kot",
                czarnyKotDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.ALCOHOL,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(czarnyKot);
        /*
         ************************************************************************
         */
        String[] daytonaDescription;
        daytonaDescription = new String[4];
        daytonaDescription[0] = "The most recognizable brand club at the Market Square. Club Daytona is characterized by primarily unprecedented climate, which consists of modern decor and lighting, with elements of old school, car graphics, specially upholstered lodges, Cadillac's profile on one of the rooms, and the brick and stone walls.";
        daytonaDescription[1] = "Czajownia's additional information";
        daytonaDescription[2] = "Czajownia's fun fun fun facts";
        daytonaDescription[3] = "Rynek 36/37";

        daytona = new Event("Daytona",
                daytonaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.ALCOHOL,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.NIGHT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.HIGH,
                MusicTypes.MODERN,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(daytona);
        /*
         ************************************************************************
         */
        String[] teatrWspolczesnyDescription;
        teatrWspolczesnyDescription = new String[4];
        teatrWspolczesnyDescription[0] = "Czajownia's sample description";
        teatrWspolczesnyDescription[1] = "Czajownia's additional information";
        teatrWspolczesnyDescription[2] = "Czajownia's fun fun fun facts";
        teatrWspolczesnyDescription[3] = "Czajownia's adress";

        teatrWspolczesny = new Event("Teatr Współczesny",
                teatrWspolczesnyDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.THEATRE,
                AgeCategories.ADULTS,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.OFFICIAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(teatrWspolczesny);
        /*
         ************************************************************************
         */
        String[] gafaDescription;
        gafaDescription = new String[4];
        gafaDescription[0] = "Do you wanna dance? We have found perfec place for you. Thematic parties with club music interest every music lover. Do you want to dance something from Latin America ? Salsa, Bachiata, Kizomba.. every Thursday in Gafa.";
        gafaDescription[1] = "Czajownia's additional information";
        gafaDescription[2] = "Czajownia's fun fun fun facts";
        gafaDescription[3] = "ul. Ruska 51";

        gafa = new Event("Gafa Club",
                gafaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.NIGHT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(gafa);
        /*
         ************************************************************************
         */
        String[] teatrPolskiDescription;
        teatrPolskiDescription = new String[4];
        teatrPolskiDescription[0] = "Polish Theatre in Wroclaw - Wroclaw theater, provincial cultural institution, founded in 1949 as the State Theatre of Lower Silesia in Wroclaw. Since 1969 bears its present name .";
        teatrPolskiDescription[1] = "Czajownia's additional information";
        teatrPolskiDescription[2] = "Czajownia's fun fun fun facts";
        teatrPolskiDescription[3] = "ul. G. Zapolskiej 3";

        teatrPolski = new Event("Teatr Polski",
                teatrPolskiDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.THEATRE,
                AgeCategories.ADULTS,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.OFFICIAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(teatrPolski);
        /*
         ************************************************************************
         */
        String[] sombreroDescription;
        sombreroDescription = new String[4];
        sombreroDescription[0] = "Heve you ever been in Mexico? And you'd like to? There is no need to fly over 15 000 km - just visit Sombrero music club to taste Mexical climate. Mexican drinks, music,  arrangement this is what you can find in our place. Come to try sombrero hat.";
        sombreroDescription[1] = "Czajownia's additional information";
        sombreroDescription[2] = "Czajownia's fun fun fun facts";
        sombreroDescription[3] = "Świdnicka 12-16";

        sombrero = new Event("Sombrero Music Club",
                sombreroDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(sombrero);
        /*
         ************************************************************************
         */
        String[] teatrKomediaDescription;
        teatrKomediaDescription = new String[4];
        teatrKomediaDescription[0] = "Wroclaw Comedy Theatre is a new, professional theater scene on the map of Wroclaw.\n"
                + "It was created as an extension of Monday's activities Theatre, founded in 1997 by Wojciech Dabrowski and Paul Okoński, former actors Wroclaw Mime Theatre and the Polish Theatre in Wroclaw. Since January 2005, Wroclaw Comedy Theatre has its headquarters on the hospitality scene Wroclaw Puppet Theatre.";
        teatrKomediaDescription[1] = "Czajownia's additional information";
        teatrKomediaDescription[2] = "Czajownia's fun fun fun facts";
        teatrKomediaDescription[3] = "pl. Teatralny 4";

        teatrKomedia = new Event("Teatr Komedia",
                czajowniaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.THEATRE,
                AgeCategories.ADULTS,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(teatrKomedia);
        /*
         ************************************************************************
         */
        String[] aquaparkDescription;
        aquaparkDescription = new String[4];
        aquaparkDescription[0] = "Aquapark Wrocław was formed to conduct business activity, and in particular activity related to promoting sport and propagating physical fitness, recreational and promotional activity, including activities supporting the local community and the local government, which is important for the development of the Wrocław Municipality.";
        aquaparkDescription[1] = "Czajownia's additional information";
        aquaparkDescription[2] = "Czajownia's fun fun fun facts";
        aquaparkDescription[3] = "ul. Borowska 99";

        aquapark = new Event("Aquapark",
                aquaparkDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.SWIMMING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.IRRELEVANT,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(aquapark);
        /*
         ************************************************************************
         */
        String[] casaDeLaMusicaDescription;
        casaDeLaMusicaDescription = new String[4];
        casaDeLaMusicaDescription[0] = "Want to try new dance? maybe somthing from coasts of Caribbean Sea? Try to dance Salsa, Bachiata, Merengue, Cha cha cha - you for sure ind something for you. Come and have great time with your friends.";
        casaDeLaMusicaDescription[1] = "Czajownia's additional information";
        casaDeLaMusicaDescription[2] = "Czajownia's fun fun fun facts";
        casaDeLaMusicaDescription[3] = "Rynek Ratusz 11/12";

        casaDeLaMusica = new Event("Casa De La Musica",
                czajowniaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(casaDeLaMusica);
        /*
         ************************************************************************
         */
        String[] gliniankiDescription;
        gliniankiDescription = new String[4];
        gliniankiDescription[0] = "Natural reservoir of 3 lakes (swimming, canoeing and fishing) is available on site, among others. slide for children, camping and equipment rental.\n"
                + "- The longest water slide for kids (90 m long)\n"
                + "- Pitch of soccer and beach volleyball\n"
                + "- Hire of sunbeds\n"
                + "- Wake Park\n"
                + "- Land at outdoor events\n"
                + "- Log Cabin BBQ mountaineers";
        gliniankiDescription[1] = "Czajownia's additional information";
        gliniankiDescription[2] = "Czajownia's fun fun fun facts";
        gliniankiDescription[3] = "ul. Kosmonautów 2";

        glinianki = new Event("Glinianki",
                gliniankiDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.SWIMMING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.NOON,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(glinianki);
        /*
         ************************************************************************
         */
        String[] puzzleDescription;
        puzzleDescription = new String[4];
        puzzleDescription[0] = "Love electronic sounds? Spend your time with others electro soulmates. Perfect place for calming down after whole week of work, drinking beer with friends. Listen, swind, bounce, dance in the middle of   Wrocław old town.";
        puzzleDescription[1] = "Czajownia's additional information";
        puzzleDescription[2] = "Czajownia's fun fun fun facts";
        puzzleDescription[3] = "Przejście Garncarskie 2";

        puzzle = new Event("Puzzle Music Club",
                puzzleDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.ALCOHOL,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.NIGHT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.HIGH,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(puzzle);
        /*
         ************************************************************************
         */
        String[] wroclawskieCentrumSpaDescription;
        wroclawskieCentrumSpaDescription = new String[4];
        wroclawskieCentrumSpaDescription[0] = "The complex of buildings and facilities equipped with swimming pools and baths and other equipment for hydrotherapy and spas, built in the late nineteenth century by the architect William Werdelmann, a professor at the School of Applied Arts in Barmen (today a part of Wuppertal).";
        wroclawskieCentrumSpaDescription[1] = "Czajownia's additional information";
        wroclawskieCentrumSpaDescription[2] = "Czajownia's fun fun fun facts";
        wroclawskieCentrumSpaDescription[3] = "ul. Teatralna 10-12";

        wroclawskieCentrumSpa = new Event("Wrocław's SPA Centre",
                wroclawskieCentrumSpaDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.SWIMMING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.IRRELEVANT,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(wroclawskieCentrumSpa);
        /*
         ************************************************************************
         */
        String[] stadionMiejski_soccerDescription;
        stadionMiejski_soccerDescription = new String[4];
        stadionMiejski_soccerDescription[0] = "The football stadium in Wroclaw, owned by the city of Wroclaw. The main user of the arena is a football club Slask Wroclaw. The stadium was one of the arenas for Euro 2012 - played on it were three group stage matches (including one Polish National Team - 16 June). The stadium meets the requirements of the highest fourth category of UEFA.";
        stadionMiejski_soccerDescription[1] = "Czajownia's additional information";
        stadionMiejski_soccerDescription[2] = "Czajownia's fun fun fun facts";
        stadionMiejski_soccerDescription[3] = "al. Śląska 1";

        stadionMiejski_soccer = new Event("City's Stadium (Soccer)",
                stadionMiejski_soccerDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SOCCER,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.HIGH,
                MusicTypes.IRRELEVANT,
                PeopleAmount.HIGH,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(stadionMiejski_soccer);
        /*
         ************************************************************************
         */
        String[] halaOrbita_basketballDescription;
        halaOrbita_basketballDescription = new String[4];
        halaOrbita_basketballDescription[0] = "This is one of the most modern sports and entertainment in Europe. Hall \"ORBIT\" is, in fact, two halls: a large audience of nearly 3 thousand. places and small - designed mainly for ice rink, playground, or a side room attendant. The fully air-conditioned, ventilated and heated. Has a professional structured cabling, unlimited access to the telecommunications network and the Internet.";
        halaOrbita_basketballDescription[1] = "Czajownia's additional information";
        halaOrbita_basketballDescription[2] = "Czajownia's fun fun fun facts";
        halaOrbita_basketballDescription[3] = "ul. Wejherowska 34";

        halaOrbita_basketball = new Event("Orbit's hall (basketball)",
                halaOrbita_basketballDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.BASKETBALL,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.HIGH,
                MusicTypes.MODERN,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(halaOrbita_basketball);
        /*
         ************************************************************************
         */
        String[] stadionOlimpijski_speedwayDescription;
        stadionOlimpijski_speedwayDescription = new String[4];
        stadionOlimpijski_speedwayDescription[0] = "Multi-purpose stadium in Wroclaw, built between 1926-1928, designed by German architect Richard Konwiarz. It is a central element of the sports complex, located on the outskirts of Wroclaw Zaleśsie.";
        stadionOlimpijski_speedwayDescription[1] = "Czajownia's additional information";
        stadionOlimpijski_speedwayDescription[2] = "Czajownia's fun fun fun facts";
        stadionOlimpijski_speedwayDescription[3] = "Al.I.J. Paderewskiego 35";

        stadionOlimpijski_speedway = new Event("Olimpic Stadium (speedway)",
                stadionOlimpijski_speedwayDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.SPEEDWAY,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.MORNING,
                DressCode.IRRELEVANT,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(stadionOlimpijski_speedway);
        /*
         ************************************************************************
         */
        String[] mundoDescription;
        mundoDescription = new String[4];
        mundoDescription[0] = "Club music, popular place and good drinks, this and much more you can find im Mundo 71 Club. Popular DJs and many dancing young people. Do you like that? Go and check for more";
        mundoDescription[1] = "Czajownia's additional information";
        mundoDescription[2] = "Czajownia's fun fun fun facts";
        mundoDescription[3] = "Ruska 51";

        mundo = new Event("Mudno71 Music Club",
                mundoDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.STUDENTS,
                Beverages.DRINK,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.HIGH,
                MusicTypes.MODERN,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(mundo);
        /*
         ************************************************************************
         */
        String[] stadioOlimpijski_footballDescription;
        stadioOlimpijski_footballDescription = new String[4];
        stadioOlimpijski_footballDescription[0] = "Multi-purpose stadium in Wroclaw, built between 1926-1928, designed by German architect Richard Konwiarz. It is a central element of the sports complex, located on the outskirts of Wroclaw Zalesie.";
        stadioOlimpijski_footballDescription[1] = "Czajownia's additional information";
        stadioOlimpijski_footballDescription[2] = "Czajownia's fun fun fun facts";
        stadioOlimpijski_footballDescription[3] = "Al.I.J. Paderewskiego 35";

        stadioOlimpijski_football = new Event("Olimpic Stadium (football)",
                stadioOlimpijski_footballDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.FOOTBALL,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(stadioOlimpijski_football);
        /*
         ************************************************************************
         */
        String[] zooDescription;
        zooDescription = new String[4];
        zooDescription[0] = "Zoo is located at ul. Wroblewski 1-5 in Wroclaw, founded in 1865. It is the oldest existing on Polish lands and the largest (in terms of the number of issued animals) zoo in Poland. Garden area is 33 hectares.";
        zooDescription[1] = "Czajownia's additional information";
        zooDescription[2] = "Czajownia's fun fun fun facts";
        zooDescription[3] = "ul. Wróblewskiego 1-5";

        zoo = new Event("Zoo",
                zooDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.ENTERTAINMENT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.NOON,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.IRRELEVANT,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(zoo);
        /*
         ************************************************************************
         */
        String[] padBarDescription;
        padBarDescription = new String[4];
        padBarDescription[0] = "Padbar is more than just a bar. Imagine that you cross thresholds and greet cocktail bar with friends. You look to the card and choose one of over twenty different drinks - Peach on the Beach, Tennis, GTA London and play at Max. Then you get into the longer people play, catch the controller and join the game.";
        padBarDescription[1] = "Czajownia's additional information";
        padBarDescription[2] = "Czajownia's fun fun fun facts";
        padBarDescription[3] = "ul. Kazimierza Wielkiego 1";

        padBar = new Event("Pad Bar",
                padBarDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.GAMING,
                AgeCategories.STUDENTS,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.HIGH,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(padBar);
        /*
         ************************************************************************
         */
        String[] capitolDescription;
        capitolDescription = new String[4];
        capitolDescription[0] = "In the music theatre Capitol you will have chance to meet culture on the higher level. Spend time with proffessional singer in the directed performances.";
        capitolDescription[1] = "Czajownia's additional information";
        capitolDescription[2] = "Czajownia's fun fun fun facts";
        capitolDescription[3] = "Marszałka Józefa Piłsudskiego 67";

        capitol = new Event("Capitol Music Theatre",
                capitolDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.THEATRE,
                AgeCategories.ADULTS,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.OFFICIAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.CLASSICAL,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(capitol);
        /*
         ************************************************************************
         */
        String[] kasynoOlimpiqueDescription;
        kasynoOlimpiqueDescription = new String[4];
        kasynoOlimpiqueDescription[0] = "Building intended for legal gambling. Usually, the game takes place on special chips that playing should purchase at the entrance. Any win is also the chips that the casino lists the output service for the money.";
        kasynoOlimpiqueDescription[1] = "Czajownia's additional information";
        kasynoOlimpiqueDescription[2] = "Czajownia's fun fun fun facts";
        kasynoOlimpiqueDescription[3] = "ul. Piłsudzkiego 40";

        kasynoOlimpique = new Event("Casino Olimpic",
                kasynoOlimpiqueDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.GAMBLING,
                AgeCategories.ADULTS,
                Beverages.ALCOHOL,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.NIGHT,
                DressCode.OFFICIAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(kasynoOlimpique);
        /*
         ************************************************************************
         */
        String[] sushi77Description;
        sushi77Description = new String[4];
        sushi77Description[0] = "77 sushi attach great importance to the taste and appearance of food. We make sure that the dishes were delicious, enjoyed eyes, delighted the injection procedure, color and exquisitely executed set.";
        sushi77Description[1] = "Czajownia's additional information";
        sushi77Description[2] = "Czajownia's fun fun fun facts";
        sushi77Description[3] = "ul. Powstańców Śląskich 2-4";

        sushi77 = new Event("Sushi77",
                sushi77Description,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.EATING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(sushi77);
        /*
         ************************************************************************
         */
        String[] chaczapuriDescription;
        chaczapuriDescription = new String[4];
        chaczapuriDescription[0] = "Restaurants Georgian Chaczapuri is the only place in Poland with such an unusual assortment that given the high quality dishes combine with low price.";
        chaczapuriDescription[1] = "Czajownia's additional information";
        chaczapuriDescription[2] = "Czajownia's fun fun fun facts";
        chaczapuriDescription[3] = "ul. Kiełbaśnicza 7";

        chaczapuri = new Event("Chaczapuri",
                chaczapuriDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.EATING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.NOON,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(chaczapuri);
        /*
         ************************************************************************
         */
        String[] amalfiDescription;
        amalfiDescription = new String[4];
        amalfiDescription[0] = "Italian restaurant and pizzeria \"Amalfi\" has been for many years on the gastronomic map of Wroclaw place valued by lovers of sunny Italy and its exquisite flavors. Especially for you we import from Italy proven quality products.";
        amalfiDescription[1] = "Czajownia's additional information";
        amalfiDescription[2] = "Czajownia's fun fun fun facts";
        amalfiDescription[3] = "ul. Więzienna 21";

        amalfi = new Event("Amalfi",
                amalfiDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.EATING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(amalfi);
        /*
         ************************************************************************
         */
        String[] capriPizzaDescription;
        capriPizzaDescription = new String[4];
        capriPizzaDescription[0] = "Pizzeria Trattoria \"Capri\" is located at the Prison street in the gallery \"Italiana\" and has two air-conditioned rooms divided into smokers and non-smokers and places in the passage with comfortable sofas.";
        capriPizzaDescription[1] = "Czajownia's additional information";
        capriPizzaDescription[2] = "Czajownia's fun fun fun facts";
        capriPizzaDescription[3] = "ul.Więzienna 21";

        capriPizza = new Event("Capri Pizza",
                capriPizzaDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.EATING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(capriPizza);
        /*
         ************************************************************************
         */
        String[] rodeoBarDescription;
        rodeoBarDescription = new String[4];
        rodeoBarDescription[0] = "Lovers of grilled dishes certainly can not miss this place in the Old Town. Although housed in the Gallery Italiana, do not be fooled - this is not the Mediterranean cuisine is known for this restaurant.";
        rodeoBarDescription[1] = "Czajownia's additional information";
        rodeoBarDescription[2] = "Czajownia's fun fun fun facts";
        rodeoBarDescription[3] = "ul. Więzienna 21";

        rodeoBar = new Event("Rodeo Bar",
                rodeoBarDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.EATING,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.ROCK,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(rodeoBar);
        /*
         ************************************************************************
         */
        String[] hastaLaVistaDescription;
        hastaLaVistaDescription = new String[4];
        hastaLaVistaDescription[0] = "At the time of the opening in the center of Hasta La Vista we will find 12 indoor courts. They were built with special plates between which is a quartz sand.\n"
                + "This ensures uniform ball bounce off the walls. Everything is decorated according to the standards imposed by the World Squash Federation.";
        hastaLaVistaDescription[1] = "Czajownia's additional information";
        hastaLaVistaDescription[2] = "Czajownia's fun fun fun facts";
        hastaLaVistaDescription[3] = "ul. Góralska 5";

        hastaLaVista = new Event("Hasta La Vista",
                hastaLaVistaDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.SQUASH,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.IRRELEVANT,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(hastaLaVista);
        /*
         ************************************************************************
         */
        String[] sportwerkDescription;
        sportwerkDescription = new String[4];
        sportwerkDescription[0] = "Squash is a great way to recover from daily stress and getting rid of unnecessary calories.\n"
                + "When you only have a moment come to our club and try your skills. Waiting for you are three professional courts for the game.";
        sportwerkDescription[1] = "Czajownia's additional information";
        sportwerkDescription[2] = "Czajownia's fun fun fun facts";
        sportwerkDescription[3] = "ul. Kozonowska 69";

        sportwerk = new Event("SportWerk",
                sportwerkDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.SQUASH,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.IRRELEVANT,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(sportwerk);
        /*
         ************************************************************************
         */
        String[] fugaMundiDescription;
        fugaMundiDescription = new String[4];
        fugaMundiDescription[0] = "Twilight, green tables, men in suits... Would you like try play in this game? In Fuga Mundi Club are waiting for you 14 tables for pool billard and 3 tables for snooker.";
        fugaMundiDescription[1] = "Czajownia's additional information";
        fugaMundiDescription[2] = "Czajownia's fun fun fun facts";
        fugaMundiDescription[3] = "Pl. Grunwaldzki 12-14";

        fugaMundi = new Event("Fuga Mundi Pool Club",
                fugaMundiDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.POOL,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(fugaMundi);
        /*
         ************************************************************************
         */
        String[] sezamDescription;
        sezamDescription = new String[4];
        sezamDescription[0] = "Billard cave in the old town center of Wrocław, you can try yourself on the green table, or face with your friends. Play billard in Sezam Club. ";
        sezamDescription[1] = "Czajownia's additional information";
        sezamDescription[2] = "Czajownia's fun fun fun facts";
        sezamDescription[3] = "ul. Kuźnicza 10";

        sezam = new Event("Sezam Billard Club",
                sezamDescription,
                ActivityTypes.PASSIVE,
                ActiveActivities.IRRELEVANT,
                PassiveActivities.POOL,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.EVENING,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(sezam);
        /*
         ************************************************************************
         */
        String[] skyBowlingDescription;
        skyBowlingDescription = new String[4];
        skyBowlingDescription[0] = "The highest scycraper in Wrocław - Sky Tower gives shelter for bowling club. Heavy balls hurrying to the crash with 10 bowling. Strike - it is not hard challenge. Come one and try";
        skyBowlingDescription[1] = "Czajownia's additional information";
        skyBowlingDescription[2] = "Czajownia's fun fun fun facts";
        skyBowlingDescription[3] = "Powstańców Śląskich 73";

        skyBowling = new Event("SkyBowling",
                skyBowlingDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.BOWLING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(skyBowling);
        /*
         ************************************************************************
         */
        String[] mirazBowlingDescription;
        mirazBowlingDescription = new String[4];
        mirazBowlingDescription[0] = "Since bowling was invented world has seen billions of strikes and same number of euphory scream. Would you like scream in the same way? Come to TGG Center and play on 10 bowling tracks.";
        mirazBowlingDescription[1] = "Czajownia's additional information";
        mirazBowlingDescription[2] = "Czajownia's fun fun fun facts";
        mirazBowlingDescription[3] = "Słubicka 18";

        mirazBowling = new Event("Miraż Bowling",
                mirazBowlingDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.BOWLING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.IRRELEVANT,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(mirazBowling);
        /*
         ************************************************************************
         */
        String[] creatorBowlingDescription;
        creatorBowlingDescription = new String[4];
        creatorBowlingDescription[0] = "This place is called Creator of fun and happiness. It animates your time and take off your stress. Creator bowling is perfect place for spending time with friends. Thought that strike if out of your possibility? Wrong - it isn't such hard if it seems to be. Check it and become bowling freak";
        creatorBowlingDescription[1] = "Czajownia's additional information";
        creatorBowlingDescription[2] = "Czajownia's fun fun fun facts";
        creatorBowlingDescription[3] = "Szybowcowa 23";

        creatorBowling = new Event("Creator Bowling",
                creatorBowlingDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.BOWLING,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.MANY,
                Cost.MODERATE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.LOW,
                MusicTypes.IRRELEVANT,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(creatorBowling);
        /*
         ************************************************************************
         */
        String[] skyTowerFitnessDescription;
        skyTowerFitnessDescription = new String[4];
        skyTowerFitnessDescription[0] = "Fitness Academy Club was created for health and good condtion of the customers. Inside this gym you can recover you health and strengthen yourself. Your good shape influences on quality of life and efectiveness in work.";
        skyTowerFitnessDescription[1] = "Czajownia's additional information";
        skyTowerFitnessDescription[2] = "Czajownia's fun fun fun facts";
        skyTowerFitnessDescription[3] = "Powstańców Śląskich 95";

        skyTowerFitness = new Event("Sky Tower Fitness Academy",
                skyTowerFitnessDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.FITNESS,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.JUICE,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(skyTowerFitness);
        /*
         ************************************************************************
         */
        String[] classicFitnessDescription;
        classicFitnessDescription = new String[4];
        classicFitnessDescription[0] = "Classic Fitness Club is located in Dominikanski Gallery Shopping Centre in the heart of the Wrocław. It was open over 10 years ago and since that day it succesively expands its offer. They promote move and health life style, which hardly influence on self confidence.";
        classicFitnessDescription[1] = "Czajownia's additional information";
        classicFitnessDescription[2] = "Czajownia's fun fun fun facts";
        classicFitnessDescription[3] = "pl. Dominikański 3";

        classicFitness = new Event("Classic Fitness",
                classicFitnessDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.FITNESS,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.JUICE,
                Cost.CHEAP,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(classicFitness);
        /*
         ************************************************************************
         */
        String[] pureJatomiFitnessRenomaDescription;
        pureJatomiFitnessRenomaDescription = new String[4];
        pureJatomiFitnessRenomaDescription[0] = "One of the Fitness Club of the world wide fitness clubs network, allows you to keep yourself in good shape without care about mundane issues - you don't care about the towel after the gym and carrying the shower gel with yourself. In pure jatomi fitness club you get your own locker for necessary staff and you can optionally get for every visit ready to use, fresh and fragrant towel.";
        pureJatomiFitnessRenomaDescription[1] = "Czajownia's additional information";
        pureJatomiFitnessRenomaDescription[2] = "Czajownia's fun fun fun facts";
        pureJatomiFitnessRenomaDescription[3] = "ul. Świdnicka 40";

        pureJatomiFitnessRenoma = new Event("Pure Jatomi Fitness Renoma",
                pureJatomiFitnessRenomaDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.FITNESS,
                PassiveActivities.IRRELEVANT,
                AgeCategories.KIDS,
                Beverages.ALCOHOL,
                Cost.CHEAP,
                Day.MONDAY,
                Daytime.MORNING,
                DressCode.OFFICIAL,
                EventTypes.PRIVATE,
                MusicLoudness.LOW,
                MusicTypes.ROCK,
                PeopleAmount.MODERATE,
                WeatherTypes.SUNNY,
                0.0);

        this.events.add(pureJatomiFitnessRenoma);
        /*
         ************************************************************************
         */
        String[] pureJatomiFitnessPasazGrundwaldzkiDescription;
        pureJatomiFitnessPasazGrundwaldzkiDescription = new String[4];
        pureJatomiFitnessPasazGrundwaldzkiDescription[0] = "Would you like be in good shape? Are you forgotfull and many times yo went out of your house without towel, shower gel or gym stuff? We have perfet solution for you! Come and check the Pure Jatomi Gym inside Pasaż Grunwaldzki, there will be waiting for you private locker to store all necessary thing to train on the gym - you won't care about it anymore. Moreover, you can have provided clern, fresh and fragrant towel for every your gym visit. Want more? Come one and check out...";
        pureJatomiFitnessPasazGrundwaldzkiDescription[1] = "Czajownia's additional information";
        pureJatomiFitnessPasazGrundwaldzkiDescription[2] = "Czajownia's fun fun fun facts";
        pureJatomiFitnessPasazGrundwaldzkiDescription[3] = "pl. Grunwaldzki 22 ";

        pureJatomiFitnessPasazGrundwaldzki = new Event("Pure Jatomi Fitness Pasaż Grunwaldzki",
                pureJatomiFitnessPasazGrundwaldzkiDescription,
                ActivityTypes.ACTIVE,
                ActiveActivities.FITNESS,
                PassiveActivities.IRRELEVANT,
                AgeCategories.IRRELEVANT,
                Beverages.JUICE,
                Cost.EXPENSIVE,
                Day.IRRELEVANT,
                Daytime.IRRELEVANT,
                DressCode.CASUAL,
                EventTypes.PUBLIC,
                MusicLoudness.MODERATE,
                MusicTypes.MODERN,
                PeopleAmount.MODERATE,
                WeatherTypes.IRRELEVANT,
                0.0);

        this.events.add(pureJatomiFitnessPasazGrundwaldzki);

    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    /*
     *   CUSTOM METHODS
     */
    public static void checkSimilarityForQuestion(String questionNumber) {
        switch (questionNumber) {
            case "1":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getEventType().equals(EventTypes.PUBLIC)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question2();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getEventType().equals(EventTypes.PRIVATE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question2();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getEventType().equals(EventTypes.OFFICIAL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question2();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    System.out.println("Chosen radio button 4");
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question2();
                }
                break;

            case "2":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDressCode().equals(DressCode.CASUAL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question3();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDressCode().equals(DressCode.OFFICIAL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question3();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDressCode().equals(DressCode.THEMATIC)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question3();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);
                        
                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        i++;
                    }
                    Question.question3();
                }
                break;
            case "3":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.MONDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.TUESDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.WEDNESDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.THURSDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.FRIDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton6") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.SATURDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton7") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDay().equals(Day.SUNDAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question4();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton8") {
                    System.out.println("Button8 chosen");
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        i++;
                    }
                    Question.question4();
                }
                break;
            case "4":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDaytime().equals(Daytime.MORNING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question5();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDaytime().equals(Daytime.NOON)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question5();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDaytime().equals(Daytime.EVENING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question5();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getDaytime().equals(Daytime.NIGHT)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question5();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question5();
                }
                break;
            case "5":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getWeatherType().equals(WeatherTypes.COLD) || e.getWeatherType().equals(WeatherTypes.RAINY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question6();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getWeatherType().equals(WeatherTypes.SUNNY) || e.getWeatherType().equals(WeatherTypes.WARM)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question6();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question6();
                }

                break;
            case "6":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getAgeCategory().equals(AgeCategories.KIDS)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question7();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getAgeCategory().equals(AgeCategories.TEENAGERS)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question7();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getAgeCategory().equals(AgeCategories.STUDENTS)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question7();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getAgeCategory().equals(AgeCategories.ADULTS)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question7();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question7();
                }
                break;
            case "7":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.ALCOHOL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.COFFEE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.TEA)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.JUICE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.DRINK)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton6") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.MANY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton7") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getBeverage().equals(Beverages.IRRELEVANT)) {
                            //double similarity = e.getSimilarity();
                            //e.setSimilarity(similarity);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question8();
                }

                break;
            case "8":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getCost().equals(Cost.CHEAP)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question9();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getCost().equals(Cost.MODERATE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question9();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getCost().equals(Cost.EXPENSIVE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question9();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question9();
                }
                break;
            case "9":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActivityType().equals(ActivityTypes.PASSIVE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question9a();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActivityType().equals(ActivityTypes.ACTIVE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question9b();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActivityType().equals(ActivityTypes.IRRELEVANT)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                break;
            case "9a":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.DATE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.POOL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.GAMING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.EATING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.THEATRE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton6") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.ENTERTAINMENT)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton7") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.SHOPPING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton8") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.BASKETBALL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton9") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.SOCCER)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton10") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.FOOTBALL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton11") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.GAMBLING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton12") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.SHISHA)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton13") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.SPEEDWAY)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton14") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPassiveActivity().equals(PassiveActivities.IRRELEVANT)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                break;
            case "9b":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.BOWLING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.FITNESS)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.SWIMMING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.SQUASH)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton5") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.CARTING)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton6") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getActiveActivity().equals(ActiveActivities.IRRELEVANT)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question10();
                }
                break;
            case "10":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPeopleAmount().equals(PeopleAmount.LOW)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question11();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPeopleAmount().equals(PeopleAmount.MODERATE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question11();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getPeopleAmount().equals(PeopleAmount.HIGH)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question11();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question11();
                }
                break;
            case "11":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicType().equals(MusicTypes.ROCK)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question12();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicType().equals(MusicTypes.CLASSICAL)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question12();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicType().equals(MusicTypes.MODERN)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.question12();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.question12();
                }
                break;
            case "12":
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton1") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicLoudness().equals(MusicLoudness.LOW)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.theEnd();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton2") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicLoudness().equals(MusicLoudness.MODERATE)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.theEnd();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton3") {
                    int i = 0;
                    for (Event e : events) {

                        if (e.getMusicLoudness().equals(MusicLoudness.HIGH)) {
                            double similarity = e.getSimilarity();
                            e.setSimilarity(similarity + 7.14);

                            MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));
                        }
                        i++;
                    }
                    Question.theEnd();
                }
                if (MainWindow.answersGroup.getSelection().getActionCommand() == "radioButton4") {
                    int i = 0;
                    for (Event e : events) {

                        double similarity = e.getSimilarity();
                        e.setSimilarity(similarity + 7.14);

                        MainWindow.buttons.get(i).setBorder(new TitledBorder(Double.toString(e.getSimilarity())));

                        i++;
                    }
                    Question.theEnd();
                }
                break;
        }

    }

}
