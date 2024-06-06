package part2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BridgeTest {

    @Test
    public void testEnterBridge() {
        Bridge bridge = new Bridge();
        assertTrue(bridge.enterBridge());
        assertFalse(bridge.enterBridge()); // Ensure bridge is closed after the first entry
        bridge.leaveBridge(); // Open the bridge
        assertTrue(bridge.enterBridge()); // Ensure bridge can be entered again after leaving
    }

    @Test
    public void testLeaveBridge() {
        Bridge bridge = new Bridge();
        bridge.leaveBridge();
        assertTrue(bridge.enterBridge()); // Ensure bridge can be entered after leaving
    }
}
