/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bostonmarathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map; //This code does

/**
 *
 * @author dell
 */
public class BostonMarathon {

    public static void main(String[] args) {
        // Create a map to store the runners' names and times
        Map<String, Integer> runners = new HashMap<>();
        runners.put("Elena", 341);
        runners.put("Thomas", 273);
        runners.put("Hamilton", 278);
        runners.put("Suzie", 329);
        runners.put("Phil", 445);
        runners.put("Matt", 402);
        runners.put("Alex", 388);
        runners.put("Emma", 275);
        runners.put("John", 243);
        runners.put("James", 334);
        runners.put("Jane", 412);
        runners.put("Emily", 393);
        runners.put("Daniel", 299);
        runners.put("Neda", 343);
        runners.put("Aaron", 317);
        runners.put("Kate", 265);

        // Create a list to store the runners' times
        List<Integer> times = new ArrayList<>(runners.values());

        // Sort the times in ascending order
        Collections.sort(times);

        // Find the fastest runner
        int fastestTime = times.get(0);
        String fastestRunner = "";
        for (Map.Entry<String, Integer> entry : runners.entrySet()) {
            if (entry.getValue() == fastestTime) {
                fastestRunner = entry.getKey();
                break;
            }
        }

        // Find the second fastest runner
        int secondFastestTime = times.get(1);
        String secondFastestRunner = "";
        for (Map.Entry<String, Integer> entry : runners.entrySet()) {
            if (entry.getValue() == secondFastestTime) {
                secondFastestRunner = entry.getKey();
                break;
            }
        }

        // Print the results
        System.out.println("Fastest runner: " + fastestRunner + " (" + fastestTime + " minutes)");
        System.out.println("Second fastest runner: " + secondFastestRunner + " (" + secondFastestTime + " minutes)");
    }

   
       }
        

        