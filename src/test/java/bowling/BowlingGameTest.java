package bowling;

import org.junit.Assert;

import org.junit.Test;

public class BowlingGameTest {

    @Test
        public void testGutterGame() throws Exception {
        BowlingGame g = new BowlingGame();
            for (int i = 0; i < 20; i++) {
                g.roll(0);
            }
        Assert.assertEquals(0, g.score());
        }

    @Test
        public void rollKnocksDownPins() {
        BowlingGame newGame = new BowlingGame();
        Assert.assertEquals(2, newGame.roll(2));
    }

    @Test
        public void keepsScore() {
        BowlingGame newGame = new BowlingGame();
        newGame.roll(1);
        newGame.roll(2);
        Assert.assertEquals(3, newGame.score());
    }
}
