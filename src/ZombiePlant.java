public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() { // Changed method name to follow Java naming conventions
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        // If treatmentsNeeded is greater than 0, apply normal treatment logic
        if (treatmentsNeeded > 0) {
            if (potency > 0 && potency <= maxPotency) {
                treatmentsNeeded--; // Successful treatment
            } else if (potency > maxPotency) {
                treatmentsNeeded++; // Unsuccessful treatment
            }
            // If potency is 0 or negative, do nothing
        } else {
            // If treatmentsNeeded is 0, any unsuccessful treatment should increment it to 1
            if (potency > maxPotency) {
                treatmentsNeeded = 1; // Set to 1 if unsuccessful treatment occurs
            }
            // If potency is 0 or negative, do nothing
        }
    }
}