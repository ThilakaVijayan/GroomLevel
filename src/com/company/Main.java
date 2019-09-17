package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        //Where the snake passed
        WhereTheSnakePassed whereTheSnakePassed = new WhereTheSnakePassed();
        whereTheSnakePassed.whereTheSnakePassed(input);

    }
}
