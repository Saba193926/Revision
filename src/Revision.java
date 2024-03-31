public class Revision {
    public void ValidateHeader(){
       //checking palindrome
        String str="madam";
        String newStr="";
        int strlen=str.length();
        //System.out.println(strlen);
        for (int i = strlen-1; i >= 0; i--) {
            char character= str.charAt(i);
            //System.out.println(i+" "+character);
            newStr+=character;
        }
        System.out.println(newStr);
        }
        }


