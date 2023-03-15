public class Wall implements Obstacle {

    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getObstacleSize() {
        return height;
    }

    @Override
    public String getType() {
        return "Wall";
    }

    @Override
    public void overcome() {
        System.out.println("To overcome this " + getType() + " you need to jump at over " + getObstacleSize() +
                " meters");
    }
}
