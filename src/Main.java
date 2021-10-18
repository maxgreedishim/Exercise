public class Main {

    public static void main(String[] args) {
        ExerciseCharSequence exerciseCharSequence =
                new ExerciseCharSequence("Your implementation should return the string backwards.");
        System.out.println(exerciseCharSequence.getText());
        System.out.println("Колличество символов: " + exerciseCharSequence.length());
        System.out.println(exerciseCharSequence.subSequence(0,5));
        System.out.println("символ в позиции 11: " + exerciseCharSequence.charAt(4));
        System.out.println(exerciseCharSequence);
    }
}
