package io.jenkins.plugins;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

//Pseudo Code as a insight to where I think the project was heading, but ran out of time to continue.

public class BuildAnalyzer {
    
    public static void main(String[] args) {
        // Step 1: Get the current build number
        int currentBuildNumber = getCurrentBuildNumber();
        
        // Step 2: Get the latest console log file path
        String consoleLogFilePath = getLatestConsoleLogFile(currentBuildNumber);
        
        // Step 3: Parse the console log file and categorize the spark proof results
        HashMap<String, Integer> sparkProofResults = parseConsoleLogFile(consoleLogFilePath);
        
        // Step 4: Provide a summary of the build
        summarizeBuild(sparkProofResults);
    }
    
    private static int getCurrentBuildNumber() {
        // Read the current build number from a file
        // Return the build number as an integer
    	
    }
    
    private static String getLatestConsoleLogFile(int currentBuildNumber) {
        // Construct the directory path based on the current build number
        // List files in the directory and find the latest console log file
        // Return the path to the latest console log file
    	
    }
    
    private static HashMap<String, Integer> parseConsoleLogFile(String consoleLogFilePath) {
        HashMap<String, Integer> sparkProofResults = new HashMap<>();
        // Open and read the console log file
        // Parse the file line by line
        // Categorize the spark proof results and store them in the HashMap
        return sparkProofResults;
    }
    
    private static void summarizeBuild(HashMap<String, Integer> sparkProofResults) {
        // Print out a summary of the build based on the spark proof results
    }
}



