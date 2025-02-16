 public int secondlargestDigit(int input1){
String inputString = Integer.toString(input1);

        if (inputString.length() < 2) {
            return -1; 
        }
        char secondLastChar = inputString.charAt(inputString.length() - 2);
        return Character.getNumericValue(secondLastChar);
    }
