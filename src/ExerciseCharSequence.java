public class ExerciseCharSequence implements CharSequence {
    private String text;

    public String getText(){
        return text;
    }

    public ExerciseCharSequence(String text) {

        String viceVersa = "";
        /*for (int i = 0; i < length(); i++) {
            viceVersa = text.charAt(i) + viceVersa;
        }*/
        for (int i = text.length() -1; i > -1; i--){
            viceVersa += text.charAt(i);
        }
        this.text = viceVersa;
    }

    @Override
    public int length() {return text.length();}

   /* private String viceVersa = "";
    public String getViceVersa(){
        return viceVersa;
    }*/

    @Override
    public char charAt(int index) {

        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {return "subSequence: " + text.substring(0,5);}

    @Override
    public String toString(){return text;}
}
