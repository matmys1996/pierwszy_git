package com.newproject.springcoredemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DemoRestController {

    Coach myCoach;

    @Autowired
    public void setMyCoach(@Qualifier("footballCoach") Coach myCoach){ //wskazuje jakiej klasy ma uzyć
        this.myCoach = myCoach;
    }

//    public DemoRestController(Coach myCoach){
//        this.myCoach = myCoach;
//    }
//    // @Autowired //default constructor
//    public DemoRestController(FootballCoach footballCoach){
//        this.footballCoach = footballCoach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
