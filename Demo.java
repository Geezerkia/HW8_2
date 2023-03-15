public class Demo {

    static Participant[] prtcp;
    static Obstacle[] obstc;
    static int y; // participants count
    static int i; // obstacles count
    static int count; // list count

    public static void main(String[] args) {

        prtcp = new Participant[9];

        prtcp[0] = new Human("John", 500, 0.5);
        prtcp[1] = new Human("Bob", 3200, 0.8);
        prtcp[2] = new Human("Sheila", 2950, 1.0);
        prtcp[3] = new Cat("Barsik", 100, 0.3);
        prtcp[4] = new Cat("Luna", 500, 0.5);
        prtcp[5] = new Cat("Casper", 3100, 1.1);
        prtcp[6] = new Robot("Robbie1", 900, 0.1);
        prtcp[7] = new Robot("Robbie2", 3000, 1.299);
        prtcp[8] = new Robot("Robbie3", 2900, 1.3);

        obstc = new Obstacle[12];

        obstc[0] = new RaceTrack(400);
        obstc[1] = new RaceTrack(600);
        obstc[2] = new RaceTrack(700);
        obstc[3] = new RaceTrack(900);
        obstc[4] = new RaceTrack(1400);
        obstc[5] = new RaceTrack(2800);
        obstc[6] = new Wall(0.2);
        obstc[7] = new Wall(0.5);
        obstc[8] = new Wall(0.6);
        obstc[9] = new Wall(0.7);
        obstc[10] = new Wall(1.1);
        obstc[11] = new Wall(1.3);

        allParticipantsResults();
    }

    static void allParticipantsResults() {
        count = 1;
        while (y < prtcp.length) {
            oneParticipantResult();
            y++;
        }
    }

    static void oneParticipantResult() {
        i = 0;
        while (i < obstc.length) {
            if (obstc[i].getType().equals("RaceTrack") && prtcp[y].getRunDist() >= obstc[i].getObstacleSize()) {
                System.out.println(count + ". " + prtcp[y].getType() + " " + prtcp[y].getName() + " overcame "
                        + obstc[i].getType() + " distance " + obstc[i].getObstacleSize() + " meters. Congratulations!");
            } else if (obstc[i].getType().equals("RaceTrack") && prtcp[y].getRunDist() < obstc[i].getObstacleSize()) {
                System.out.println(count + ". " + prtcp[y].getType() + " " + prtcp[y].getName() +
                        " could not overcome " + obstc[i].getType() + " distance " + obstc[i].getObstacleSize() +
                        " meters and showed only " + prtcp[y].getRunDist() + " meters results. Quit the competition!");
                count++;
                i++;
                return;
            } else if (obstc[i].getType().equals("Wall") && prtcp[y].getJumpHeight() >= obstc[i].getObstacleSize()) {
                System.out.println(count + ". " + prtcp[y].getType() + " " + prtcp[y].getName() +
                        " overcame " + obstc[i].getType() + " height " + obstc[i].getObstacleSize() +
                        " meters. Congratulations!");
            } else {
                System.out.println(count + ". " + prtcp[y].getType() + " " + prtcp[y].getName() +
                        " could not overcome " + obstc[i].getType() + " height " + obstc[i].getObstacleSize() +
                        " meters and showed only " + prtcp[y].getJumpHeight() + " meters results. Quit the competition!");
                count++;
                i++;
                return;
            }
            count++;
            i++;
        }
    }
}
