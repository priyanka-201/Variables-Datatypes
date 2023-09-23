public class Stringassignment {
    public static void main(String[] args) {
        String sentence="I want to learn java";
        String lword=sentence.substring(10,16);
        System.out.println(lword);
        String lCapital=lword.toUpperCase();
        System.out.println(lCapital);
        String lletter=lCapital.substring(0,1);
        System.out.println(lletter);
        String eword=lCapital.substring(1,5);
        System.out.println(eword);
        String wordsmall=eword.toLowerCase();
        String finalword=lletter.concat(wordsmall);
        System.out.println(finalword);

    }
}
