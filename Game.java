import java.util.Stack;

interface Game{
 Stack<GameState> states;

 private void pushState(GameState state);
 private void popState();
 private void changeState(GameState state);
 GameState peekState();

 private void gameLoop();

}
