package NewDreamTeam;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("run", 3);
        Course c2 = new Course("maze", 4);
        Course c3 = new Course("hedge", 6);
        Course c4 = new Course("rope", 7);


        Team p1 = new Team("Jack", 1, 5);
        Team p2 = new Team("Dean", 2,9);
        Team p3 = new Team("Helena", 3,4);
        Team p4 = new Team("Julia",4,8);
        Team[] team = {p1, p2, p3, p4};

        Team.teamInfo();
        for (int i = 0; i < team.length; i++) {
            team[i].teamPInfo();
        }
        Team.result();
        for (int i = 0; i < team.length; i++) {
            if ( c1.doIt(team[i]) == false || c2.doIt(team[i]) == false || c3.doIt(team[i]) == false || c4.doIt(team[i]) == false) {
                System.out.println("Участник " + team[i].getName() + " не прошел");
            } else System.out.println("Участник " + team[i].getName() + " прошел");
        }
    }
}
