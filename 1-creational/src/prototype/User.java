package prototype;

public class User {

    private String user,level;
    private AccessControl userAccessControl;


    public User(String user, String level, AccessControl userAccessControl) {
        this.user = user;
        this.level = level;
        this.userAccessControl = userAccessControl;
    }

    public String getUserName() {
        return this.user;
    }

    public String getLevel() {
        return this.level;
    }

    public AccessControl getAccessControl() {
        return this.userAccessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
            this.userAccessControl = accessControl;
    }
}