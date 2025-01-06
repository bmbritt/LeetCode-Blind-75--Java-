class Solution {

    final int asciiOffset = 32;

    public boolean isPalindrome(String s) {

        int leftPointer = 0; 
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {

            char leftChar = lowerCase(s.charAt(leftPointer));
            char rightChar = lowerCase(s.charAt(rightPointer));

            if (!isAlphaNumeric(leftChar)) {
                leftPointer++;
                continue;
            }

            if (!isAlphaNumeric(rightChar)) {
                rightPointer--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char character) {
        return (isNumber(character) || isLetter(character));
    }

    private boolean isNumber(char character) {
        return (character >= '0' && character <= '9');
    }

    private boolean isLetter(char character) {
        return isCapital(character) || isLower(character);
    }

    private boolean isCapital(char character) {
        return (character >= 'A' && character <= 'Z');
    }

    private boolean isLower(char character) {
        return (character >= 'a' && character <= 'z');
    }

    private char lowerCase(char character) {
        return isCapital(character) ?  (char) (character + asciiOffset) : character;
    }
               
}

