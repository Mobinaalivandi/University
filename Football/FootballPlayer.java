package Model;

public class FootballPlayer {
    private String name;
    private String position;
    private int age;
    private int goals;

    public FootballPlayer(String name, String position, int age, int goals) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.goals = goals;
    }

    public String getname() {
        return name;
    }

    public String getposition() { 
        return position; 
    }

    public int getage() {
        return age;
    }

    public int getgoals() { 
        return goals; 
    }
}

