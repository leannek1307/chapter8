/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UEmployee;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class Main {
    public static void main(String[] args) {
//      prompts user to input name, department name, job title, salary
//      returns in order: faculty - jobtitle - name - salary
        
        Scanner input = new Scanner(System.in);
        
        String name, departmentName, jobTitle;
        int salary;
        
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Department name: ");
        departmentName = input.nextLine();
        System.out.print("Job Title: ");
        jobTitle = input.nextLine();
        System.out.print("Salary: ");
        salary = input.nextInt();
        
        Faculty fac = new Faculty(departmentName, salary);
        System.out.println("\n\n" + fac);
        
        Staff sta = new Staff(jobTitle, salary);
        System.out.println(sta);
        
        UEmployee UE = new UEmployee(name, salary);
        System.out.println(UE);
    }
}
