package structural.adapter;

/**
 * RoundPegs are compatible with RoundHoles.
 */
public class RoundHole implements Radius {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public boolean fits(Radius peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}