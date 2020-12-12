package usantatecla.mastermind.views;

import usantatecla.mastermind.types.Error;
import usantatecla.utils.Console;

class ErrorView {

	public final String[] MESSAGES = {
			"Repeated colors",
			"Wrong colors, they must be: " + this.colorInitials(),
			"Wrong proposed combination length"};

	Error error;

	ErrorView() {
	}

	public ErrorView(Error error) {
		this.error = error;
	}

	public void writeln() {
		if (!this.error.isNull()) {
			Console.getInstance().writeln(new ErrorView().MESSAGES[this.error.ordinal()]);
		}
	}

	String colorInitials() {
		return new ColorView().allInitials();
	}
	
}
