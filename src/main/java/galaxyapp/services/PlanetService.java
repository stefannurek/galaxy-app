package galaxyapp.services;

import org.springframework.stereotype.Service;
import galaxyapp.models.Planet;
import galaxyapp.repositories.PlanetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet getPlanetByName(String planetName) {
        return planetRepository.findPlanetByName(planetName).get();

    }

    public Optional<Planet> getOptionalPlanetByName(String planetName){
        return Optional.of(planetRepository
                .findPlanetByName(planetName))
                .orElse(Optional.empty());
    }

    public List<Planet> getPlanets() {
        return planetRepository.findAll();
    }

    public List<Planet> getPlanets(String param) {
        return planetRepository.findPlanetsByParam(param);
    }
}