package linh.hoccode.springboot.repository;

import linh.hoccode.springboot.entity.Sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhvienRepository extends JpaRepository<Sinhvien, Integer> {
}
