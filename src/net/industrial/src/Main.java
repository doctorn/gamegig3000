package net.industrial.src;

import net.industrial.grassland.Game;
import net.industrial.grassland.GrasslandException;
import net.industrial.grassland.graphics.Vector3f;

public class Main extends Game {
    public static final float BLOCK_SIZE = 0.05f;
    public static final Vector3f ORIGIN = new Vector3f(-5 * BLOCK_SIZE,-BLOCK_SIZE,-5 * BLOCK_SIZE);

    public Main() {
        super("Game Gig 3000", 800, 600, true);
    }

    @Override
    public void initStates() throws GrasslandException {
        addState(new IndustrialGames());
        GameWorld gameWorld = new GameWorld();
        addState(gameWorld);
        gameWorld.init(this);
        enterState(0);
    }

    public static void main(String args[]) throws GrasslandException {
        Game game = new Main();
        game.init();
    }
}
