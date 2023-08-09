package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.company.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
