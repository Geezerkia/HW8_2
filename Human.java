public class Human implements Participant {

    String name;
    private final double runDist;
    private final double jumpHeight;

    public Human(String name, double runDist, double jumpHeight) {
        this.name = name;
        this.runDist = runDist;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRunDist() {
        return runDist;
    }

    @Override
    public double getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public String getType() {
        return "Human";
    }

    @Override
    public void run() {
        System.out.println(getType() + " " + getName() + "can run maximum " + getRunDist() + "meters.");
    }

    @Override
    public void jump() {
        System.out.println(getType() + " " + getName() + "can jump maximum " + getJumpHeight() + "meters.");
    }
}
