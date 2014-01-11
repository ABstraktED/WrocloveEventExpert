/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
import Enums.*;

/**
 *
 * @author ABstraktED
 */
public class Event {
    
    private String eventName;
    private String[] eventDescription;
    private AcitivityTypes activityType;
    private ActiveActivities activeActivity;
    private PassiveActivities passiveActivity;
    private AgeCategories ageCategory;
    private Beverages beverage;
    private Cost cost;
    private Day day;
    private Daytime daytime;
    private DressCode dressCode;
    private EventTypes eventType;
    private MusicLoudness musicLoudness;
    private MusicTypes musicType;
    private PeopleAmount peopleAmount;
    private WeatherTypes weatherType;

    public Event(String eventName, String[] eventDescription, AcitivityTypes activityType,ActiveActivities activeActivities, PassiveActivities passiveActivities, AgeCategories ageCategory, Beverages beverage, Cost cost, Day day, Daytime daytime, DressCode dressCode, EventTypes eventType, MusicLoudness musicLoudness, MusicTypes musicType, PeopleAmount peopleAmount, WeatherTypes weatherType) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.activityType = activityType;
        this.activeActivity = activeActivities;
        this.passiveActivity = passiveActivities;
        this.ageCategory = ageCategory;
        this.beverage = beverage;
        this.cost = cost;
        this.day = day;
        this.daytime = daytime;
        this.dressCode = dressCode;
        this.eventType = eventType;
        this.musicLoudness = musicLoudness;
        this.musicType = musicType;
        this.peopleAmount = peopleAmount;
        this.weatherType = weatherType;
    }
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * 
    *
    * SETTERS
    *
    */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDescription(String[] eventDescription) {
        
        this.eventDescription = eventDescription;
    }

    public void setActivityType(AcitivityTypes activityType) {
        this.activityType = activityType;
    }

    public void setActiveActivies(ActiveActivities activeActivies) {
        this.activeActivity = activeActivies;
    }

    public void setPassiveActivities(PassiveActivities passiveActivities) {
        this.passiveActivity = passiveActivities;
    }
    

    public void setAgeCategory(AgeCategories ageCategory) {
        this.ageCategory = ageCategory;
    }

    public void setBeverage(Beverages beverage) {
        this.beverage = beverage;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setDaytime(Daytime daytime) {
        this.daytime = daytime;
    }

    public void setDressCode(DressCode dressCode) {
        this.dressCode = dressCode;
    }

    public void setEventType(EventTypes eventType) {
        this.eventType = eventType;
    }

    public void setMusicLoudness(MusicLoudness musicLoudness) {
        this.musicLoudness = musicLoudness;
    }

    public void setMusicType(MusicTypes musicType) {
        this.musicType = musicType;
    }

    public void setPeopleAmount(PeopleAmount peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public void setWeatherType(WeatherTypes weatherType) {
        this.weatherType = weatherType;
    }
    
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * 
    *
    * GETTERS
    *
    */
    
    public String getEventName() {
        return eventName;
    }

    public String[] getEventDescription() {
        return eventDescription;
    }

    
    public AcitivityTypes getActivityType() {
        return activityType;
    }

    public ActiveActivities getActiveActivies() {
        return activeActivity;
    }

    public PassiveActivities getPassiveActivities() {
        return passiveActivity;
    }

    public AgeCategories getAgeCategory() {
        return ageCategory;
    }

    public Beverages getBeverage() {
        return beverage;
    }

    public Cost getCost() {
        return cost;
    }

    public Day getDay() {
        return day;
    }

    public Daytime getDaytime() {
        return daytime;
    }

    public DressCode getDressCode() {
        return dressCode;
    }

    public EventTypes getEventType() {
        return eventType;
    }

    public MusicLoudness getMusicLoudness() {
        return musicLoudness;
    }

    public MusicTypes getMusicType() {
        return musicType;
    }

    public PeopleAmount getPeopleAmount() {
        return peopleAmount;
    }

    public WeatherTypes getWeatherType() {
        return weatherType;
    }
    
    
    
    
    
}