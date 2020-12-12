package usantatecla.mastermind.models;

class Result {

	private int blacks;
	private int whites;

	Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;
		this.blacks = blacks;
		this.whites = whites;
	}

	boolean isWinner() {
		return this.blacks == Combination.getWidth();
	}

	int getBlacks() {
		return this.blacks;
	}

	int getWhites() {
		return this.whites;
	}

	Result copy() {
		return new Result(this.blacks, this.whites);
	}

}
