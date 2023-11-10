package vn.edu.iuh.fit.week05_nguyenlemychau_20046631.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week05_nguyenlemychau_20046631.backend.models.Candidate;
import vn.edu.iuh.fit.week05_nguyenlemychau_20046631.backend.repositories.CandidateRepository;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                                   String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);//findFirst.../findTop...
    }
}
