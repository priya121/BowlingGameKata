package bowling;

public class BowlingGame {
    int score = 0;

    public int roll(int pins) {
        score += pins;
        return pins;
    }

    public int score() {
        return score;
    }
}
