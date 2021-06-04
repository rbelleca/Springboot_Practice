package controllers;

import models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HotelService;

import java.util.List;

@RestController
@RequestMapping(path="/main")
public class HotelController {

    private final HotelService hotelservice;

    @Autowired
    public HotelController(HotelService hotelservice){
        this.hotelservice = hotelservice;
    }

    @GetMapping
    public List<Room> getRooms(){
        return hotelservice.getRooms();
    }

}
