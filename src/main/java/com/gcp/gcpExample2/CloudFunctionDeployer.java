package com.gcp.gcpExample2;

import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.sql.SQLOutput;

public class CloudFunctionDeployer {
    @Scheduled(cron="*/30 * * * * *")
    public void scheduledFunction() throws IOException{
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "deploy.sh");

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if(exitCode == 0){
                System.out.println("Function deployed successfully");
            } else{
                System.out.println("Failed to deploy function. Exit code: " + exitCode);
            }
        } catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
        }
    }

