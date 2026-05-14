package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Spreadsheet
{
    Map<Coordinate, Cell> sheet;
    HashSet<String> otherRanges;

    public Spreadsheet()
    {
        sheet = new HashMap<>();
        otherRanges = new HashSet<>();
    }

    public void setup()
    {
        //20a, 25a, 26a, 28a, 30a, 31a, 32a, 33a, 34a, 36a, 37a, 38a, 39a, 40a, 48a, 50a, 56a, 58a, 70a, 72a
        otherRanges.add("20a");
        otherRanges.add("25a");
        otherRanges.add("26a");
        otherRanges.add("28a");
        otherRanges.add("30a");
        otherRanges.add("31a");
        otherRanges.add("32a");
        otherRanges.add("33a");
        otherRanges.add("34a");
        otherRanges.add("36a");
        otherRanges.add("37a");
        otherRanges.add("38a");
        otherRanges.add("39a");
        otherRanges.add("40a");
        otherRanges.add("48a");
        otherRanges.add("50a");
        otherRanges.add("56a");
        otherRanges.add("58a");
        otherRanges.add("70a");
        otherRanges.add("72a");

        //Create an entry for all of the spreadsheet cells (over 1,200 individual cells)
        sheet.put(new Coordinate("16", 1), new Cell("Paraeducator CPD + Playground Supervisor", 19.59, 3395.60));
        sheet.put(new Coordinate("16", 2), new Cell("Paraeducator CPD + Playground Supervisor", 20.30, 3518.67));
        sheet.put(new Coordinate("16", 3), new Cell("Paraeducator CPD + Playground Supervisor", 21.03, 3645.20));
        sheet.put(new Coordinate("16", 4), new Cell("Paraeducator CPD + Playground Supervisor", 21.87, 3790.80));
        sheet.put(new Coordinate("16", 5), new Cell("Paraeducator CPD + Playground Supervisor", 22.67, 3929.47));
        sheet.put(new Coordinate("16", 6), new Cell("Paraeducator CPD + Playground Supervisor", 23.70, 4108.00));
        sheet.put(new Coordinate("16", 7), new Cell("Paraeducator CPD + Playground Supervisor", 23.70, 4108.00));
        sheet.put(new Coordinate("16", 8), new Cell("Paraeducator CPD + Playground Supervisor", 23.70, 4108.00));
        sheet.put(new Coordinate("16", 9), new Cell("Paraeducator CPD + Playground Supervisor", 24.28, 4208.53));
        sheet.put(new Coordinate("16", 10), new Cell("Paraeducator CPD + Playground Supervisor", 24.28, 4208.53));
        sheet.put(new Coordinate("16", 11), new Cell("Paraeducator CPD + Playground Supervisor", 24.28, 4208.53));
        sheet.put(new Coordinate("16", 12), new Cell("Paraeducator CPD + Playground Supervisor", 24.91, 4317.73));
        sheet.put(new Coordinate("16", 13), new Cell("Paraeducator CPD + Playground Supervisor", 24.91, 4317.73));
        sheet.put(new Coordinate("16", 14), new Cell("Paraeducator CPD + Playground Supervisor", 24.91, 4317.73));
        sheet.put(new Coordinate("16", 15), new Cell("Paraeducator CPD + Playground Supervisor", 25.53, 4425.20));
        sheet.put(new Coordinate("16", 16), new Cell("Paraeducator CPD + Playground Supervisor", 25.53, 4425.20));
        sheet.put(new Coordinate("16", 17), new Cell("Paraeducator CPD + Playground Supervisor", 25.53, 4425.20));
        sheet.put(new Coordinate("16", 18), new Cell("Paraeducator CPD + Playground Supervisor", 26.14, 4530.93));
        sheet.put(new Coordinate("16", 19), new Cell("Paraeducator CPD + Playground Supervisor", 26.14, 4530.93));
        sheet.put(new Coordinate("16", 20), new Cell("Paraeducator CPD + Playground Supervisor", 26.14, 4530.93));
        sheet.put(new Coordinate("16", 21), new Cell("Paraeducator CPD + Playground Supervisor", 27.19, 4712.93));

        sheet.put(new Coordinate("17", 1), new Cell("", 19.97, 3461.47));
        sheet.put(new Coordinate("17", 2), new Cell("", 20.70, 3588.00));
        sheet.put(new Coordinate("17", 3), new Cell("", 21.49, 3724.93));
        sheet.put(new Coordinate("17", 4), new Cell("", 22.32, 3868.80));
        sheet.put(new Coordinate("17", 5), new Cell("", 23.17, 4016.13));
        sheet.put(new Coordinate("17", 6), new Cell("", 24.23, 4199.87));
        sheet.put(new Coordinate("17", 7), new Cell("", 24.23, 4199.87));
        sheet.put(new Coordinate("17", 8), new Cell("", 24.23, 4199.87));
        sheet.put(new Coordinate("17", 9), new Cell("", 24.83, 4303.87));
        sheet.put(new Coordinate("17", 10), new Cell("", 24.83, 4303.87));
        sheet.put(new Coordinate("17", 11), new Cell("", 24.83, 4303.87));
        sheet.put(new Coordinate("17", 12), new Cell("", 25.46, 4413.07));
        sheet.put(new Coordinate("17", 13), new Cell("", 25.46, 4413.07));
        sheet.put(new Coordinate("17", 14), new Cell("", 25.46, 4413.07));
        sheet.put(new Coordinate("17", 15), new Cell("", 26.10, 4524.00));
        sheet.put(new Coordinate("17", 16), new Cell("", 26.10, 4524.00));
        sheet.put(new Coordinate("17", 17), new Cell("", 26.10, 4524.00));
        sheet.put(new Coordinate("17", 18), new Cell("", 26.73, 4633.20));
        sheet.put(new Coordinate("17", 19), new Cell("", 26.73, 4633.20));
        sheet.put(new Coordinate("17", 20), new Cell("", 26.73, 4633.20));
        sheet.put(new Coordinate("17", 21), new Cell("", 27.81, 4820.40));

        //sheet.put(new Coordinate("", ), new Cell("", , ));
    }

    public Map<Coordinate, Cell> getSpreadsheet()
    {
        return sheet;
    }

    public HashSet<String> getOtherRanges()
    {
        return otherRanges;
    }

    public void printSalaries(String range, int year)
    {
        Cell cell = sheet.get(new Coordinate(range, year));

        System.out.println(cell.getJobTitle());
        System.out.printf("Hourly Salary: %.2f\n", cell.getHourlySalary());
        System.out.printf("Monthly Salary: %.2f", cell.getMonthlySalary());
    }

    public Cell getCell(String range, int year)
    {
        return sheet.get(new Coordinate(range, year));
    }
}