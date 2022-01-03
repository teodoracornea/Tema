package Tema8;

public class PasswordChecker {
    public static void main(String[] args) {
        String s1="H331lloWorldabc";
        String s2="!!";
        checker(s1);
        checker(s2);
    }

    public static void checker(String password ){
        System.out.println(password);
        int check = 0;
        int upperC = 0;
        int lowerC = 0;
        int onlyLetAndDig = 0;
        int dig = 0;
        char[] ch=password.toCharArray();
        if(ch.length<=12){
            System.out.println("at least 12 characters");
            check++;
        }
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                upperC++;
            }
            if(Character.isLowerCase(ch[i])){
                lowerC++;
            }
            if(Character.isDigit(ch[i])||Character.isLetter(ch[i])){
                onlyLetAndDig =0;
            }
            else onlyLetAndDig++;
            if(Character.isDigit(ch[i])){
                dig++;
            }
        }
        if(upperC==0||lowerC==0){
            check++;
            System.out.println("does not have both uppercase and lowercase");
        }
        if (onlyLetAndDig>0){
            check++;
            System.out.println("does not have only letters and digits");
        }
        if (dig<3){
            check++;
            System.out.println("does not have more than three digits");
        }
        if (check==0){
            System.out.println("is valid");
        }

    }
}
