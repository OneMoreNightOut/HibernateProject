package avia.config.program;

import avia.config.dao.AircraftsDao;

public class Program {
    private static final AircraftsDao aircraftsDao = new AircraftsDao();

    public static void main(String[] args) {
        String model = "Airbus A320-200";
        System.out.println(aircraftsDao.findByModelName(model));

    }
}
