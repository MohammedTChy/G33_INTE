public class Man extends Player {

    public enum ManType {
        MEDIC, WARRIOR;
    }

    private ManType manType;

    public Man(String name, ManType manType) {
        super(name);
        super.setHitPoints(2000);
        this.manType = manType;
    }

    public ManType getManType() {
        return manType;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Type: " + manType;
    }
}
