package galaxyapp.repositories;


import galaxyapp.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

    @Query(value = "select p from Planet p where p.planetName =?1")
    Optional<Planet> findPlanetByName(String planetName);

    @Query(value = "select p from Planet p where p.planetName like %?1% " +
            "or p.planetInfo like %?1% " +
            "or p.planetType like %?1%")
    List<Planet> findPlanetsByParam(String param);
}