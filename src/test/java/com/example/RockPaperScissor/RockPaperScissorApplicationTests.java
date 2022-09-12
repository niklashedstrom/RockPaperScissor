package com.example.RockPaperScissor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RockPaperScissorApplicationTests {

	@Autowired
	private RockPaperScissorController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	void testDraw(){
		Game game = new Game();
		game.setChoiceOne(Choice.ROCK);
		game.setChoiceTwo(Choice.ROCK);
		assertThat(game.getChoiceOne()).isEqualTo(game.getChoiceTwo());
		assertThat(game.whoWins(game.getChoiceOne(), game.getChoiceTwo())).isEqualTo("It's a draw");
	}

	@Test
	void testPlayerOneWin(){
		Game game = new Game();
		game.setChoiceOne(Choice.ROCK);
		game.setChoiceTwo(Choice.SCISSOR);
		assertThat(game.getChoiceOne()).isNotEqualTo(game.getChoiceTwo());
		assertThat(game.whoWins(game.getChoiceOne(), game.getChoiceTwo())).isEqualTo("Player 1 Won");

		game.setChoiceOne(Choice.PAPER);
		game.setChoiceTwo(Choice.ROCK);
		assertThat(game.getChoiceOne()).isNotEqualTo(game.getChoiceTwo());
		assertThat(game.whoWins(game.getChoiceOne(), game.getChoiceTwo())).isEqualTo("Player 1 Won");
	}

	@Test
	void testPlayerTwoWin(){
		Game game = new Game();
		game.setChoiceOne(Choice.SCISSOR);
		game.setChoiceTwo(Choice.ROCK);
		assertThat(game.getChoiceOne()).isNotEqualTo(game.getChoiceTwo());
		assertThat(game.whoWins(game.getChoiceOne(), game.getChoiceTwo())).isEqualTo("Player 2 Won");

		game.setChoiceOne(Choice.ROCK);
		game.setChoiceTwo(Choice.PAPER);
		assertThat(game.getChoiceOne()).isNotEqualTo(game.getChoiceTwo());
		assertThat(game.whoWins(game.getChoiceOne(), game.getChoiceTwo())).isEqualTo("Player 2 Won");
	}
}
