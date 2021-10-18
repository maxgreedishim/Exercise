import java.lang.constant.Constable;

public class Main {

    public static void main(String[] args) {
        ExerciseCharSequence exerciseCharSequence =
                new ExerciseCharSequence("Your implementation should return the string backwards.");
        System.out.println("Колличество символов: " + exerciseCharSequence.length());
        System.out.println(exerciseCharSequence.subSequence(0,55));
        exerciseCharSequence.charAt(exerciseCharSequence.length());
        System.out.println("Это символы в обратном порядке: " + exerciseCharSequence.viceVersa);
        System.out.println(exerciseCharSequence.toString());
    }
}
