package BCSD_Interview.enrollment.repository;

import BCSD_Interview.enrollment.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}