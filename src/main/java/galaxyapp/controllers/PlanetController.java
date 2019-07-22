package galaxyapp.controllers;


import galaxyapp.models.Planet;
import galaxyapp.services.PlanetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlanetController {

    PlanetService planetService;

    public PlanetController( PlanetService planetService){
        this.planetService=planetService;
    }


    @GetMapping(value = "/planet")
    public ResponseEntity<Planet> getPlanetByName(@RequestParam(value = "name") String planetName){
        return new ResponseEntity<> (planetService.getPlanetByName(planetName), HttpStatus.OK);
    }

}
