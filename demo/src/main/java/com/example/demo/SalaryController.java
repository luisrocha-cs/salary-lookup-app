package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SalaryController {

    private Spreadsheet spreadsheet;

    public SalaryController() {
        spreadsheet = new Spreadsheet();
        spreadsheet.setup();
    }

    @GetMapping("/salary")
    public Cell getSalary(
            @RequestParam String range,
            @RequestParam int year) {

        return spreadsheet.getCell(range, year);
    }
}