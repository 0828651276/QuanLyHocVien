

class Student {
    private final String Id;
    private final String Name;
    private final int Age;
    private final String ClassroomId;
    private final String Email;

    public Student(String Id, String Name, int Age, String ClassroomId, String Email) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.ClassroomId = ClassroomId;
        this.Email = Email;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getClassroomId() {
        return ClassroomId;
    }

    public String getEmail() {
        return Email;
    }

    public double Payroll() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", ClassroomId='" + ClassroomId + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

class HocsinhGioi extends Student implements Comparable<HocsinhGioi> {
    private final double DiemThi;
    private final double DiemKiemTra;
    private final double DiemRenLuyen;

    public HocsinhGioi(String Id, String Name, int Age, String ClassroomId, String Email,
                       double DiemThi, double DiemKiemTra, double DiemRenLuyen) {
        super(Id, Name, Age, ClassroomId, Email);
        this.DiemThi = DiemThi;
        this.DiemKiemTra = DiemKiemTra;
        this.DiemRenLuyen = DiemRenLuyen;
    }

    public double getDiemThi() {
        return DiemThi;
    }

    public double getDiemKiemTra() {
        return DiemKiemTra;
    }

    public double getDiemRenLuyen() {
        return DiemRenLuyen;
    }

    public double getTotalScore() {
        return DiemThi + DiemKiemTra + DiemRenLuyen;
    }

    @Override
    public int compareTo(HocsinhGioi other) {
        return Double.compare(other.getTotalScore(), this.getTotalScore());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", DiemThi=" + DiemThi +
                ", DiemKiemTra=" + DiemKiemTra +
                ", DiemRenLuyen=" + DiemRenLuyen +
                '}';
    }
}
