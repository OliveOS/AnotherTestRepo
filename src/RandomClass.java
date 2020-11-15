public class RandomClass {
    private int thing;
    private final String otherThing;
    private boolean yeah;

    public RandomClass(int thing, String otherThing, boolean yeah) {
        this.thing = thing;
        this.otherThing = otherThing;
        this.yeah = yeah;
    }

    public int getThing() {
        return thing;
    }

    public void setThing(int thing) {
        this.thing = thing;
    }

    public String getOtherThing() {
        return otherThing;
    }

    public boolean isYeah() {
        return yeah;
    }

    public void setYeah(boolean yeah) {
        this.yeah = yeah;
    }
}
