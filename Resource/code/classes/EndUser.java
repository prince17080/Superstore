package classes;

import java.io.Serializable;

public class EndUser extends RegisteredUser implements Serializable {
    public EndUser(Credential credential, String name, int id) {
        super(credential,name, id);
    }

    @Override
    public void update(RegisteredUser registeredUser) {

    }

    @Override
    public void runSession() {
        //TODO complete definition
    }

    @Override
    public void showMenu() {
        //TODO complete definition
    }
}
