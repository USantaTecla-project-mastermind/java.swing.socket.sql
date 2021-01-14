package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;

class PlayView extends WithGameView {

    PlayView(Game game) {
        super(game);
    }

    void interact() {
        do {
            this.game.addProposedCombination(new ProposedCombinationView(new ProposedCombination()).read());
            new BoardView(this.game).write();
        } while (!this.game.isFinished());

        if(this.game.isWinner()){
            Message.WINNER.writeln();
        } else {
            Message.LOOSER.writeln();
        }
    }

}