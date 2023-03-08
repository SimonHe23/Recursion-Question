package gettingstarted;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class question {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{
		/*
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        /*System.out.println("Every recursive method could have at least one base case which halts the recursion, the base case is to use to stop the recursion. (T/F)");
		if(redButton.getState()){
			redLED.setState(true);
			System.out.println("Wrong Answer");
			Thread.sleep(150);
		}
		if(greenButton.getState()){
			greenLED.setState(true);
			System.out.println("Correct Answer");
			Thread.sleep(150);
		}
		redLED.setState(false);
		greenLED.setState(false);*/
		
		//boolean answer = true;
		
		/*while(true){

            if(answer==true){
				if(greenButton.getState()==true){
					greenLED.setState(true);
					System.out.println("Correct Answer!");
					Thread.sleep(150);
				}else if(redButton.getState()==true){
					redLED.setState(true);
					System.out.println("Incorrect Answer!");
					Thread.sleep(150);
				}
			}
			if(answer==false){
				if(greenButton.getState()==true){
					redLED.setState(true);
					System.out.println("Incorrect Answer!");
					Thread.sleep(150);
				}else if(redButton.getState()==true){
					greenLED.setState(true);
					System.out.println("Correct Answer!");
					Thread.sleep(150);
				}
			}
			
			greenLED.setState(false);
			redLED.setState(false);
        }*/
        
	}
	
	public void displayAns(boolean answer){
		boolean answer = true;
		this.answer=answer;
		DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
		
		
		while(true){

            if(answer==true){
				if(greenButton.getState()==true){
					greenLED.setState(true);
					System.out.println("Correct Answer!");
					Thread.sleep(150);
				}else if(redButton.getState()==true){
					redLED.setState(true);
					System.out.println("Incorrect Answer!");
					Thread.sleep(150);
				}
			}
			if(answer==false){
				if(greenButton.getState()==true){
					redLED.setState(true);
					System.out.println("Incorrect Answer!");
					Thread.sleep(150);
				}else if(redButton.getState()==true){
					greenLED.setState(true);
					System.out.println("Correct Answer!");
					Thread.sleep(150);
				}
			}
			
			greenLED.setState(false);
			redLED.setState(false);
        }
     }
	
	
}
