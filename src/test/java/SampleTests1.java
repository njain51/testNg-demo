/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 4/2/2022, Saturday
 **/

import org.testng.annotations.Test;

/**
 What this program snippet doing?
 **/
public class SampleTests1 {

    @Test(priority = 3)
    public void setup(){
        System.out.println("I am inside Test Setup");
    }

    @Test(priority = 2)
    public void testSteps(){
        System.out.println("I am inside TestSteps");
    }

    @Test(priority = 1)
    public void tearDown(){
        System.out.println("I am inside tearDown");
    }

}
