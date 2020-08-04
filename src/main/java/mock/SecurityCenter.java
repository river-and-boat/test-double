package mock;

public class SecurityCenter {
    private final DoorPanel doorPanel;

    public SecurityCenter(DoorPanel doorPanel) {
        this.doorPanel = doorPanel;
    }

    public String switchOn() {
        return doorPanel.close();
    }
}
