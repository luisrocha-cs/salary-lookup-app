package com.example.demo;

import java.util.Objects;

public class Coordinate
{
    private final String range;
    private final int year;

    public Coordinate (String range, int year)
    {
        this.range = range;
        this.year = year;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        return year == that.year &&
                Objects.equals(range, that.range);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(range, year);
    }
}
