/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;


/**
 *
 * @author yessi
 */
public class VehicleStorage {
    
    
    public VehicleStorage(String username, String nameOfVehicle, int dayBought, int monthBought, int yearBought, boolean fourWheelDrive) {
        this.username = username;
        this.nameOfVehicle = nameOfVehicle;
        this.dayBought = dayBought;
        this.monthBought = monthBought;
        this.yearBought = yearBought;
        this.fourWheelDrive = fourWheelDrive;
    }
    
    private ArrayList[] vehicleStorage;
    private String username;
    private String nameOfVehicle;
    private int dayBought;
    private int monthBought;
    private int yearBought;
    private boolean fourWheelDrive;

    public ArrayList[] getVehicleStorage() {
        return vehicleStorage;
    }

    public void setVehicleStorage(ArrayList[] vehicleStorage) {
        this.vehicleStorage = vehicleStorage;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public int getDayBought() {
        return dayBought;
    }

    public void setDayBought(int dayBought) {
        this.dayBought = dayBought;
    }

    public int getMonthBought() {
        return monthBought;
    }

    public void setMonthBought(int monthBought) {
        this.monthBought = monthBought;
    }

    public int getYearBought() {
        return yearBought;
    }

    public void setYearBought(int yearBought) {
        this.yearBought = yearBought;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
