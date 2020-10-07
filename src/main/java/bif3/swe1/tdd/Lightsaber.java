package bif3.swe1.tdd;

import lombok.Getter;

public class Lightsaber {
    @Getter
    private LightsaberColor color;

    public Lightsaber(LightsaberColor color) {
        this.color = color;
    }
}
