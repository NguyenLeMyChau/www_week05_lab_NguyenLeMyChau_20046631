package vn.edu.iuh.fit.week05_nguyenlemychau_20046631.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.week05_nguyenlemychau_20046631.backend.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}