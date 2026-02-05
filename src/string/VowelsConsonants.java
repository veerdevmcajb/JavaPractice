package string;

public class VowelsConsonants {
    public static void main(String[] args) {
        String name="veerdevmca";
        int vowels=0,consonants=0;
        for(int i=0;i<=name.length()-1;i++){
            char ch=name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
