package bif3.swe1.tdd.fighter;

import bif3.swe1.tdd.Lightsaber;
import bif3.swe1.tdd.LightsaberColor;
import lombok.Getter;

public abstract class AbstractFighter implements Fighter {
    @Getter
    private Lightsaber lightsaber;

    public AbstractFighter(String name){
        // determine Lightsaber with color by name

        if(name == "Yoda") {
            lightsaber = new Lightsaber(LightsaberColor.Blue);
        } else if(name == "DarthVader") {
            lightsaber = new Lightsaber(LightsaberColor.Red);
        } else if(name == "Luke") {
            lightsaber = new Lightsaber(LightsaberColor.Green);
        } else {
            lightsaber = new Lightsaber(LightsaberColor.Unknown);
        }
    }
}
