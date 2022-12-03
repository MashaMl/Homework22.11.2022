//Task 2
public class ClassRoom {
private Pupil[] pupils = new Pupil[4];

    ClassRoom(Pupil pupil1) {
        this.pupils[0] = pupil1;
    }
    ClassRoom(Pupil pupil1, Pupil pupil2) {
        this(pupil1);
        this.pupils[1] = pupil2;
    }
    ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        this.pupils[3] = pupil3;
    }
    public Pupil[] getPupils() {
        return pupils;
    }
    public Pupil getPupil(int index) {
        return pupils[index];
    }

    public void setPupils(Pupil pupils, int index) {
        this.pupils[index] = pupils;
    }
}
