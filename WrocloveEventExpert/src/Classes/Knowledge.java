/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import Enums.AcitivityTypes;
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

/**
 *
 * @author ABstraktED
 */
public class Knowledge {
    public ArrayList<Event> events;
    
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
    public Event kregielniaMiraz;
    public Event kregielniaCreator;
    public Event skyTowerFitness;
    public Event galeriaDominikanskaFitness;
    public Event renomaFitness;
    public Event pasazGrunwaldzki;
    public Event renoma;
    public Event galeriaDominikanska;
    public Event Magnolia;
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
    public Event kuchniaGruzinska;
    public Event kuchniaWloska;
    public Event kuchniaChinska;
    public Event mexixan;
    public Event rodeoBar;
    public Event hastaLaVista;
    public Event Sportwerk;
    public Event alladyn;
    public Event chopperBar;
    public Event przekret;
    public Event graciarnia;
    public Event schodyDoNikad;
    public Event torKartingowy;
    
    

    public Knowledge() {
        
        //ArrayList<Event> tempEvents = new ArrayList<>();
        //events = new ArrayList<>();
        /*
        ************************************************************************
        */
        String[] czajowniaDescription;
        czajowniaDescription = new String[4];
        czajowniaDescription[0] = "Czajownia's sample description";
        czajowniaDescription[1] = "Czajownia's additional information";
        czajowniaDescription[2] = "Czajownia's fun fun fun facts";
        czajowniaDescription[3] = "Czajownia's adress";
        
        czajownia = new Event("Czajownia", 
                czajowniaDescription,
                AcitivityTypes.ACTIVE,
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
                WeatherTypes.SUNNY);
        
        //this.events.add(czajownia);
        
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    
}
