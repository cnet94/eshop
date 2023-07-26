package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turkovaleksey.eshop.repository.model.company.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
