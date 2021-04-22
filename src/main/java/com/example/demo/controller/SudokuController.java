package com.example.demo.controller;

import com.example.demo.sudokubasecode;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SudokuController {

    @GetMapping("/fetchAll")
    public String fetchAll() {
        return "This is working";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/data")
    public int[][] data(@RequestBody int[][] sdata) {
        System.out.println(sdata);
        sudokubasecode abcd = new sudokubasecode();
        int[][] ans = abcd.run(sdata);
        return ans;
    }


}
