package linh.hoccode.springboot;

import linh.hoccode.springboot.entity.Sinhvien;
import linh.hoccode.springboot.repository.SinhvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private SinhvienRepository sinhvienRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Lấy tất cả sinh viên trong bảng "sinhvien"
		List<Sinhvien> danhSach = sinhvienRepository.findAll();

		// In ra console
		System.out.println("==== Danh sách sinh viên ====");
		for (Sinhvien sv : danhSach) {
			System.out.println(sv);
		}
	}
}
