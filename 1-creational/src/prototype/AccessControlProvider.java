package prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

    private static final Map<String,AccessControl>  map = new HashMap<>();

    private static void loadProvider() {
        AccessControl userAccessControl = new AccessControl("USER");
        map.put("USER",userAccessControl);
        AccessControl managerAccessCOntrol = new AccessControl("MANAGER");
        map.put("MANAGER",managerAccessCOntrol);
    }

    public static AccessControl getAccessControlObject(String controlLevel) {
        // TODO: use prototype access control objects (return clones based on the control level)
        if (map.isEmpty())
            loadProvider();

        return map.get(controlLevel).clone();
    }
}
