package org.example;

public class Main {
    public static void main(String[] args) {
        //Create job seekers
        JobSeeker JohnDoe = new JobSeeker("John Doe");
        JobSeeker JaneDoe = new JobSeeker("Jane Doe");
        //Create employment agency and register job seekers
        EmploymentAgency agency = new EmploymentAgency();
        agency.attach(JohnDoe);
        agency.attach(JaneDoe);
        //Post a new job and notify job seekers
        agency.addJob(new JobPost("Software Engineer"));
    }
}