package NewDreamTeam;

public class Team {
    private static String teamName = "DreamTeam";
    private String name;
    private int number;
    private int fitLvl;

    public Team(String name, int number, int fitLvl) {
        this.name = name;
        this.number = number;
        this.fitLvl = fitLvl;
    }


    public static void result() {
        System.out.println("Результаты прохождения полосы препятствий:");
    }

    public int getFitLvl() {
        return fitLvl;
    }


    public static String getTeamName() {
        return teamName;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static void teamInfo() {
        System.out.println("Состав команды \"" + getTeamName() + "\":");
    }
    public void teamPInfo() {
        System.out.println("Под номером " + getNumber() + " участник по имени " + getName());
    }

}
