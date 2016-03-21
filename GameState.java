interface GameState {
  Game game;
  
  void draw(const float dt);
  void update(const float dt);
  void handleInput() = 0;
}

