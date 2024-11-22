/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author user
 */
public class Event {
    private String name;
    private String loc;
    private int Time;

    public Event(String name, String loc, int Time) {
        this.name = name;
        this.loc = loc;
        this.Time = Time;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }

    public int getTime() {
        return Time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }
    
}
