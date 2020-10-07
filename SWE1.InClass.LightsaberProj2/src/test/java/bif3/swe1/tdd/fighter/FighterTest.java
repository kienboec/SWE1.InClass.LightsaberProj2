package bif3.swe1.tdd.fighter;

import bif3.swe1.tdd.LightsaberColor;
import bif3.swe1.tdd.fighter.Fighter;
import bif3.swe1.tdd.fighter.Yoda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FighterTest {
    @Test
    public void testYodaHasBlueLightsaber(){
        // Arrange
        Fighter fighter = new Yoda();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Blue, actual);
    }

    @Test
    public void testLukeHasGreenLightsaber(){
        // Arrange
        Fighter fighter = new Luke();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Green, actual);
    }

    @Test
    public void testDarthVaderHasRedLightsaber(){
        // Arrange
        Fighter fighter = new DarthVader();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Red, actual);
    }

    @Test
    public void testUnknownHasUnknownLightsaber(){
        // Arrange
        Fighter fighter = new UnknownFighter();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Unknown, actual);
    }
}
