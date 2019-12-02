package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> randNums = new ArrayList<Integer>();

        for (int i = 0; i < 12; i++) {
            randNums.add(rand.nextInt(1000));
        }

        ArrayList<Integer> copyNums = new ArrayList<Integer>(randNums);

        for (int i = 0; i < randNums.size(); i++) {
            randNums.remove(i);
        }

        Collections.sort(randNums);
        Collections.sort(copyNums);

        System.out.println("Initial: " + copyNums);
        System.out.println("Modified: " + randNums);