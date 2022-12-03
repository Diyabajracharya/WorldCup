package model;

import java.util.ArrayList;

public class team {
    ArrayList<players> players;
    String Name;
    String Jersey_color;
    String fifa_position;

    public ArrayList<players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<players> players) {
        this.players = players;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJersey_color() {
        return Jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        Jersey_color = jersey_color;
    }

    public String getFifa_position() {
        return fifa_position;
    }

    public void setFifa_position(String fifa_position) {
        fifa_position = fifa_position;
    }

    public team(ArrayList<players> players, String name, String jersey_color, String fifa_position) {
        this.players = players;
        this.Name = name;
        this.Jersey_color = jersey_color;
        this.fifa_position = fifa_position;
    }
}