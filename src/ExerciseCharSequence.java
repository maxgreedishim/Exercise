public class ExerciseCharSequence implements CharSequence {
    private String text;

    public String getText(){
        return text;
    }

    public ExerciseCharSequence(String text) {this.text = text;}

    @Override
    public int length() {return text.length();}

    private String viceVersa = "";
    public String getViceVersa(){
        return viceVersa;
    }

    @Override
    public char charAt(int index) {
        for (int i = 0; i < length(); i++) {
            viceVersa = text.charAt(i) + getViceVersa();
        }
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {return "subSequence: " + text;}

    @Override
    public String toString(){return "Это строка в обратном порядке: " + viceVersa;}
}
