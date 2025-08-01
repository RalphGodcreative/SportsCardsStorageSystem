package RGcards.SportsCardProject.dao;

import RGcards.SportsCardProject.entity.SearchKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchKeywordRepository extends JpaRepository<SearchKeyword, Integer> {

    SearchKeyword findByKeyword(String keyword);
}
