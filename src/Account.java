/**
 *
 */
public abstract class Account {
    /**
     * specifies the owner of the account
     */
    public final Client owner;
    /**
     * whether the account is currently active.
     *
     * New accounts have to be reviewed by an Employee, only then will they be activated.
     * Accounts can be deactivated for various reasons.
     */
    public boolean active = false;
    /**
     * primary key of Account
     */
    private int id;

    public Account(Client owner) {
        this.owner = owner;

        // finally, save to DB
        this.save();
    }

    /**
     * save the account to the database
     */
    public void save() {
        // TODO
    }
}
