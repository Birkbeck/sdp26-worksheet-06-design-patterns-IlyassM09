package prototype;

public class AccessControl implements AccessControlPrototype {

    private String access;

    public AccessControl(String access) {
        this.access = access;
    }

    @Override
    public AccessControl clone() {

        try {
            AccessControl ac = (AccessControl) super.clone();
            return ac;

        } catch (CloneNotSupportedException e){
            throw new AssertionError("Impossible!");
        }
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
