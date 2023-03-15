public class RaceTrack implements Obstacle {

    private final double dist;

    public RaceTrack(double dist) {
        this.dist = dist;
    }

    @Override
    public double getObstacleSize() {
        return dist;
    }

    @Override
    public String getType() {
        return "RaceTrack";
    }

    @Override
    public void overcome() {
        System.out.println("To overcome this " + getType() + " you need to run more than " + getObstacleSize() +
                " meters");
    }
}
