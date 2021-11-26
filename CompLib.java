/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Q20no
 */
public class CompLib {
    public static Component [] parts = new Component[5];
    public static int count = 0;
    
    //frame screens
    public static main frMain;
    public static add frAdd = new add();
    public static information frinfo;
    
    
    public static String CompList(){
    if(count ==0){
    return("No components are in this application");
    }//end if
    
    String strComps = "Components in application\n";
    strComps += "Component count: "+ count + "\nComponent details:\n";
   
    for(int index=0; index < count; index++){
    strComps += parts[index].details();
    } // end for
    
    return strComps;
    } // complist
} // class
