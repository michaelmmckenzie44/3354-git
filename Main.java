package adder;

public class Main {
	
	 public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } 
		catch(NumberFormatException ex){
			System.out.println("Invalid Character");
		}
		catch (Exception e) {
			if(args.length<1){
				System.err.println("Not enough arguments");
			}
        }
    }

    private static int addArguments(String[] args) {
		
			int firstArg = Integer.valueOf(args[0]);
			
		if(firstArg <=0){ 					// check if the first character is less than zero ie negative number, then we gonna subtract numbers
			
			int result  = firstArg;
			for(int i=1; i<args.length; i++){
				result = result  - Integer.valueOf(args[i]);
			}
			return result;
			
		}
		else{        						// if the first character is positive we gonna add number 
			
			int result = 0;
			for(int i=0; i<args.length; i++){
				result = result+Integer.valueOf(args[i]);
			}
			return result;
			
		}
    }
	

	
}