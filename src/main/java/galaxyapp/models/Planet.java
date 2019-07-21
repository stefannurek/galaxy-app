package galaxyapp.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Planet {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String planetName;
    private int distanceFromSun;
    private double oneWayLightTimeToTheSun;
    private int lengthOfYear;
    private String planetType;
    private String planetInfo;
    private String planetImage;
}
