package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.models.Session;

public class RedoControllerImplementation extends Controller implements RedoController {

    public RedoControllerImplementation(Session session) {
        super(session);
    }

    public void redo() {
        this.session.redo();
    }

    public boolean redoable() {
        return this.session.redoable();
    }

}
