public class Second {
    public static void main(String[] args) {
        boolean is_Palindrom = isPalindrom("ababa");

        boolean is_Palindrom2 = isPalindrom("abssba");

        if (is_Palindrom){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Ne palindrom");
        }

    }
    public static boolean isPalindrom(String word ){

        char[] character_array = word.toCharArray();
        int ch_lenght = character_array.length;
        int max_index = ch_lenght-1;

        boolean is_Palindrom = true;

        for  (int i = 0;i<ch_lenght;i++){
            if (character_array[i] == character_array[max_index-i]){
                is_Palindrom= true;
            }else{
                is_Palindrom=false;
                break;
            }
        }

        return is_Palindrom;
    }


}
