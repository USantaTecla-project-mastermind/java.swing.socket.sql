package usantatecla.mastermind;

import usantatecla.utils.ColorCode;
import usantatecla.utils.Console;

import java.util.ArrayList;

class ProposedCombination extends Combination {

    void read() {
        Error error;
        do {
            Message.PROPOSED_COMBINATION.write();
            error = this.getColorsError(Console.getInstance().readString().toLowerCase());
            error.writeln();
            if (!error.isNull()) {
                this.colorCodes = new ArrayList<>();
            }
        } while (!error.isNull());
    }

    private Error getColorsError(String characters) {
        if (characters.length() != Result.WIDTH) {
            return Error.WRONG_LENGTH;
        }
        for (int i = 0; i < characters.length(); i++) {
            ColorCode colorCode = ColorFactory.getInstance().getColorByCharacter(characters.charAt(i));
            if (colorCode.isNull()) {
                return Error.WRONG_CHARACTERS;
            }
            for (int j = 0; j < i; j++) {
                if (this.colorCodes.get(j) == colorCode) {
                    return Error.DUPLICATED;
                }
            }
            this.colorCodes.add(colorCode);
        }
        return Error.NULL;
    }

    boolean contains(ColorCode colorCode, int position) {
        assert position < this.colorCodes.size();

        return this.colorCodes.get(position) == colorCode;
    }

    boolean contains(ColorCode colorCode) {
        return this.colorCodes.contains(colorCode);
    }

    void write() {
        for (ColorCode colorCode : this.colorCodes) {
            colorCode.write();
        }
    }

}
