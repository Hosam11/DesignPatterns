package behavioral.template_method.game_exmaple;

/**
 * The Abstract Class declares methods that act as steps of an algorithm, as well as the actual template method
 * which calls these methods in a specific order.
 * The steps may either be declared abstract or have some default implementation.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();


    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
