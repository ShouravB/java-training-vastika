package assignments;

import static java.lang.Integer.parseInt;

public class StringSplitExample {

    public static void main(String[] args) {

        try{
            String input ="5 12  \n";
            String[] splitInput = input.trim().split(" ");
            StringBuilder outputString=new StringBuilder();
            //int count =0;


            for (int i = parseInt(splitInput[0]); i< parseInt(splitInput[splitInput.length-1]); i++){
                if(i % 5 == 0){
                    outputString.append(i);
                    outputString.append(" ");
                    i+=4;
                }
            }

            System.out.println(outputString);
        }catch(Exception e){
            System.out.println("Something went wrong. Please check the inputs");
        }

    }
}
