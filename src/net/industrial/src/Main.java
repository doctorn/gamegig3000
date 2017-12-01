package net.industrial.src;

import net.industrial.grassland.Game;
import net.industrial.grassland.GrasslandException;

public class Main extends Game {
    public static final float BLOCK_SIZE = 0.05f;

    public Main() {
        super("Game Gig 3000", 1920, 1080, true);
    }

    @Override
    public void initStates() throws GrasslandException {
        addState(new IndustrialGames());
        GameWorld gameWorld = new GameWorld();
        addState(gameWorld);
        gameWorld.init(this);
        enterState(1);
    }

    public static void main(String args[]) throws GrasslandException {
        Game game = new Main();
        game.init();
    }
}
