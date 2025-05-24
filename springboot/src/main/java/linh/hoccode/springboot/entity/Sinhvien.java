package linh.hoccode.springboot.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")

public class Sinhvien {

//    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ho_dem")
    private String ho_dem;

    @Column(name = "ten")
    private String ten;

    @Column(name = "email")
    private String email;

    public Sinhvien() {

    }

    public Sinhvien(int id, String ho_dem, String ten, String email) {
        this.id = id;
        this.ho_dem = ho_dem;
        this.ten = ten;
        this.email = email;
    }

    public Sinhvien(String ho_dem, String ten, String email) {
        this.ho_dem = ho_dem;
        this.ten = ten;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHo_dem() {
        return ho_dem;
    }

    public void setHoDem(String ho_dem) {
        this.ho_dem = ho_dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id=" + id +
                ", hoDem='" + ho_dem + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
