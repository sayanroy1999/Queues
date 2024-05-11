public class StudentMarks implements Comparable<StudentMarks>{
    private int Maths;
    private int Physics;

    public StudentMarks(int maths, int physics) {
        Maths = maths;
        Physics = physics;
    }

    public StudentMarks() {
    }

    public int getMaths() {
        return Maths;
    }

    public int getPhysics() {
        return Physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "Maths=" + Maths +
                ", Physics=" + Physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        return o.Maths- this.Maths;
    }
}
