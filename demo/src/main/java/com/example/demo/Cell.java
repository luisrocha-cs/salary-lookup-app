package com.example.demo;

public class Cell
{
    private String jobTitle;
    private double hourlySalary;
    private double monthlySalary;

    public Cell(String jobTitle, double hourlySalary, double monthlySalary)
    {
        if (jobTitle.equals(""))
        {
            this.jobTitle = "(no job title)";
        }

        else
        {
            this.jobTitle = jobTitle;
        }

        this.hourlySalary = hourlySalary;
        this.monthlySalary = monthlySalary;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public double getHourlySalary()
    {
        return hourlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }
}
