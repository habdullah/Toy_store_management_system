package toystopinventorymanagementsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fahad Satti
 */
public class ToyStopInventoryManagementSystem {
    ToyStopService tsService = new ToyStopService();
    public void init(){
        
        tsService.initEmployees();
        tsService.initStores();
        tsService.initToys();
        System.out.println("Init complete");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ToyStopInventoryManagementSystem tsims = new ToyStopInventoryManagementSystem();
        System.out.println("Welcome to Toy Stop Inventory Management System");
        System.out.println("Enter 1 to start fresh. Enter 2 to load old state");
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        switch(n){
         case 1 :
            
            tsims.init();
            break;
         case 2 :
             //tsims.loadData();
            System.out.println("old data loaded");
            break;
         default :
            System.out.println("Invalid input");
        }
        
       
        tsims.showMenu();
        
        
        //tsims.printAll();
        //tsims.saveData();
        //tsims.addStore();
        //tsims.addEmployee();
        //tsims.removeEmployee();
        //tsims.SearchEmployee();
        //tsims.addtoy();
        //tsims.searchToy();
        //tsims.runsim();
        //tsims.saveData();
        //tsims.loadData();
        n = reader.nextInt();
        switch(n){
         case 1 :
              System.out.println("printing all data!"); 
            tsims.printAll();
            break;
         case 2 :
             System.out.println("");
              //tsims.addStore();
            break;
          case 3 :
             //tsims.addEmployee();
            break;
           case 4 :
            //tsims.removeEmployee();   
           break;    
           case 5 :
            //tsims.SearchEmployee();  
           break;
            case 6 :
            //tsims.addtoy();
           break;
           case 7 :
            //tsims.searchToy();
           break; 
           case 8 :
            //tsims.runsim();
           break; 
           case 0 :
             //tsims.saveData();
           break; 
           
         default :
            System.out.println("Invalid input");
        }
        
    }
    private void savaData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showMenu() {
        System.out.println("Welcome to Toy Stop Inventory Management System");
        System.out.println("Enter 1 to show all data");
        System.out.println("*********STORES**********");
        System.out.println("Enter 2 to add a new Store");
        System.out.println("*********EMPLOYEES**********");
        System.out.println("Enter 3 to add a new Employee");
        System.out.println("Enter 4 to remove a new Employee");
        System.out.println("Enter 5 to search for an Employee");
        System.out.println("*********TOYS**********");
        System.out.println("Enter 6 to add a new Toy");
        System.out.println("Enter 7 to search for a Toy");
        System.out.println("*********60 DAYS SIMULATION**********");
        System.out.println("Enter 8 to run 60 day simulation");
        System.out.println("*********Save/load state**********");
        //System.out.println("Enter 9 to load state");
        System.out.println("Enter 0 to save state");
    }

    private void printAll() {
        System.out.println(this.tsService.stores);
    }
    
}
