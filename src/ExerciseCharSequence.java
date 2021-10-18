public class ExerciseCharSequence implements CharSequence {
    private String text;

    public ExerciseCharSequence(String text) {this.text = text;}

    @Override
    public int length() {return text.length();}

    String viceVersa = "";

    @Override
    public char charAt(int index) {
        for (int i = 0; i < length(); i++) { // Почему он начинает с последнего?
            viceVersa = text.charAt(i) + viceVersa;
        }
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {return text;}

    @Override
    public String toString(){return "Это строка: " + viceVersa.toString();}
}
